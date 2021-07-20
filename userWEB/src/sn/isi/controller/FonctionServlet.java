package sn.isi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IFonction;
import sn.isi.entities.Fonction;

/**
 * Servlet implementation class FonctionServlet
 */
@WebServlet("/Fonction")
public class FonctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private IFonction fonctiondao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FonctionServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		request.setAttribute("liste_fonctions", fonctiondao.lister());
		request.getRequestDispatcher("WEB-INF/fonction/fonction.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String nom = request.getParameter("nom").toString();
			
			Fonction f = new Fonction();
			f.setNom(nom);
			fonctiondao.add(f);
			response.sendRedirect("Fonction");
	}

}
