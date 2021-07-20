package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DB;
import dao.ServeurImpl;
import entities.Serveur;

/**
 * Servlet implementation class ServeurServlet
 */
@WebServlet("/Serveur")
public class ServeurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	private ServeurImpl serveurdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeurServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		serveurdao = new ServeurImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("page") !=null) {
			String page = request.getParameter("page").toString();
			if(page.equals("list")) {
				List<Serveur> serveurs = serveurdao.lister();
				request.setAttribute("list_serveurs",serveurs);
				request.getRequestDispatcher("serveur/liste.jsp").forward(request, response);
			}else if(page.equals("add")) {
				request.getRequestDispatcher("serveur/add.jsp").forward(request, response);
			}
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
