package sn.isi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.AnnonceImpl;
import sn.isi.dao.IAnnonce;
import sn.isi.entities.Annonce;

/**
 * Servlet implementation class AnnonceServlet
 */
@WebServlet("/Annonce")
public class AnnonceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IAnnonce annoncedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnonceServlet() {
    	 super();
    	annoncedao = new AnnonceImpl();  
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
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action").toString();
		if(action.equals("Envoyer")) {
			String poste = request.getParameter("poste").toString();
			double salaire = Double.parseDouble(request.getParameter("salaire"));
			String localisation = request.getParameter("localisation").toString();
			String dateannonce = request.getParameter("dateannonce").toString();
			String description = request.getParameter("description").toString();
			Annonce an = new Annonce();
			an.setPoste(poste);
			an.setSalaire(salaire);
			an.setLocalisation(localisation);
			an.setDateAnonce(dateannonce);
			an.setDescription(description);
			annoncedao.add(an);
			response.sendRedirect("Liste?page=liste");
		}
	}

}
