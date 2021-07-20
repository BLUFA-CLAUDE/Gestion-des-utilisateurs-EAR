package sn.isi.controller;

import java.io.IOException;
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
 * Servlet implementation class ListeAnnonces
 */
@WebServlet("/Liste")
public class ListeAnnonces extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private IAnnonce annoncedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListeAnnonces() {
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
		String page = request.getParameter("page").toString();
		if(page.equals("liste")) {
			List<Annonce> anonnces = annoncedao.lister();
			request.setAttribute("list_annonce",anonnces );
			request.getRequestDispatcher("listannonces.jsp").forward(request, response);
		}else if(page.equals("description")) {
			List<Annonce> anonnces = annoncedao.lister();
			request.setAttribute("list_annonce",anonnces );
			request.getRequestDispatcher("descriptionAnonnce.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
