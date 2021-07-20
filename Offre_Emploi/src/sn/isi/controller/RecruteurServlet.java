package sn.isi.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IRecruteur;
import sn.isi.dao.RecruteurImpl;
import sn.isi.entities.Recruteur;

/**
 * Servlet implementation class RecruteurServlet
 */
@WebServlet("/Recruteur")
public class RecruteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IRecruteur recruteurdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecruteurServlet() {
        super();
        recruteurdao = new RecruteurImpl();
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
		String page = request.getParameter("page").toString();
		if(page.equals("recruteur")) {
			request.getRequestDispatcher("recruteur.jsp").forward(request, response);
		}else if(page.equals("Supprimer")) {
				int recruteur_id = Integer.parseInt(request.getParameter("recruteur_id"));
				recruteurdao.delete(recruteur_id);
				response.sendRedirect("ListRecruteur?page=recruteur");
			} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action").toString();
		if(action.equals("Envoyer")) {
			String nomchef = request.getParameter("nomchef").toString();
			String password = request.getParameter("password").toString();
			String passwordconfirme = request.getParameter("passwordconfirme").toString();
			String typestructure = request.getParameter("typestructure").toString();
			String nomStructure = request.getParameter("nomStructure").toString();
			String pays = request.getParameter("pays").toString();
			String ville = request.getParameter("ville").toString();
			String adresseexacte = request.getParameter("adresseexacte").toString();
			String description = request.getParameter("description").toString();
			String telephonebureau = request.getParameter("telephonebureau").toString();
			String url = request.getParameter("url").toString();
			String email = request.getParameter("email").toString();
			String prenomrepondant = request.getParameter("prenomrepondant").toString();
			String nomrepondant = request.getParameter("nomrepondant").toString();
			String telephonerepondant = request.getParameter("telephonerepondant").toString();
			String fonctionrepondant = request.getParameter("fonctionrepondant").toString();
			Recruteur re = new Recruteur();
			re.setRecruteur_nom(nomchef);
			re.setRecruteur_pass(password);
			re.setRecruteur_passConfirme(passwordconfirme);
			re.setType_structure(typestructure);
			re.setNom_structure(nomStructure);
			re.setPays_etablissement(pays);
			re.setVille(ville);
			re.setAdresse_exact(adresseexacte);
			re.setDescription_structure(description);
			re.setPhone_bureau(telephonebureau);
			re.setUrl_site(url);
			re.setEmail(email);
			re.setPrenom(prenomrepondant);
			re.setNom(nomrepondant);
			re.setPhone_perso(telephonerepondant);
			re.setFonction(fonctionrepondant);
			recruteurdao.add(re);
			response.sendRedirect("Recruteur?page=recruteur");
		}
		
	}

}
