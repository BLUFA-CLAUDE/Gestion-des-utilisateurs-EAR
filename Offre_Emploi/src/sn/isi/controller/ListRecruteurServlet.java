package sn.isi.controller;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class ListRecruteurServlet
 */
@WebServlet("/ListRecruteur")
public class ListRecruteurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IRecruteur recruteurdao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListRecruteurServlet() {
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
		String page =request.getParameter("page").toString();
		if(page.equals("recruteur")) {
			List<Recruteur> recruteurs = recruteurdao.lister();
			request.setAttribute("list_recruteurs", recruteurs);
			request.getRequestDispatcher("listeRecruteur.jsp").forward(request, response);
		}
		request.getRequestDispatcher("listeRecruteur.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
