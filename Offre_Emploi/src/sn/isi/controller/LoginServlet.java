package sn.isi.controller;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IUsers;
import sn.isi.dao.UsersImpl;




/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IUsers userdao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        userdao = new UsersImpl();
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
		
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String email = request.getParameter("email").toString();
			String password = request.getParameter("password").toString();
			if(userdao.UserExiste(email, password)) {
				request.getRequestDispatcher("annonce.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		
    }
	

}
