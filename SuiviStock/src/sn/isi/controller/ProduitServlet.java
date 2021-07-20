package sn.isi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IProduit;
import sn.isi.dao.ProduitImpl;
import sn.isi.entities.Produit;
import sn.isi.entities.ProduitModele;

/**
 * Servlet implementation class ProduitServlet
 */
@WebServlet("/Produit")
public class ProduitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private IProduit produitdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProduitServlet() {
        super();
        produitdao = new ProduitImpl();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action").toString();
		if(action.equals("list")) {
			List<Produit> prods = produitdao.lister();
			request.setAttribute("list_produit", prods);
			request.getRequestDispatcher("listProduit.jsp").forward(request, response);
				
		}
		else if(action.equals("Rechercher")) {
			String motCle = request.getParameter("motCle").toString();
			ProduitModele model = new ProduitModele();
			model.setMotCle(motCle);
			List<Produit> prods = produitdao.getProduit(motCle);
			model.setProduits(prods);
			request.setAttribute("list_produit", prods);
			request.getRequestDispatcher("listProduit.jsp").forward(request, response);
		}
		else if(action.equals("Supprimer")) {
			int ref = Integer.parseInt(request.getParameter("ref"));
			produitdao.delete(ref);
			response.sendRedirect("Produit?action=list");
		}
		else if(action.equals("Update")) {
			int ref = Integer.parseInt(request.getParameter("ref"));
			Produit p = produitdao.getProduitById(ref);
			request.setAttribute("list_produit",p );
			request.getRequestDispatcher("editeProduit.jsp").forward(request, response);
			}
		
			
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action").toString();
		if(action.equals("Enregistrer")) {
		String nom = request.getParameter("nom").toString();
		double quantite =Double.parseDouble(request.getParameter("quantite").toString()); 
		Produit p = new Produit();
		p.setNom(nom);
		p.setQteStock(quantite);
		produitdao.add(p);
		response.sendRedirect("Produit?action=list");
		}
		else if(action.equals("Modifer")) {
		int ref = Integer.parseInt(request.getParameter("ref"));
		String nom = request.getParameter("nom").toString();
		double quantite =Double.parseDouble(request.getParameter("qteStock").toString());
		Produit p = new Produit();
		p.setRef(ref);
		p.setNom(nom);
		p.setQteStock(quantite);
		produitdao.update(p);
		request.setAttribute("list_produit", p);
		response.sendRedirect("Produit?action=list");
		}
	}

}
