package sn.isi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IUser;
import sn.isi.dao.UserImpl;
import sn.isi.entities.User;
import sn.isi.entities.UserModele;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	private IUser userdao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        userdao = new UserImpl();
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
		if(page.equals("list")) {
			String action = request.getParameter("page").toString();
			List<User> users = userdao.lister();
			request.setAttribute("list_users", users);
			request.getRequestDispatcher("listUser.jsp").forward(request, response);
			if(action.equals("Rechercher")) {
				String motcle = request.getParameter("motcle");
				UserModele modelUser = new UserModele();
				modelUser.setMotCle(motcle);
				users = userdao.getUser(motcle);
				modelUser.setUsers(users);
				request.setAttribute("list_users",users );
				response.sendRedirect("User?page=list");
			}
		}else {
			request.getRequestDispatcher("profilUser.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom").toString();
		String prenom = request.getParameter("prenom").toString();
		String email = request.getParameter("email").toString();
		String password = request.getParameter("password").toString();
		int etat = 0;
		User user = new User();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setPassword(password);
		user.setEtat(etat);
		userdao.add(user);
		response.sendRedirect("User?page=list");
		
	}

}
