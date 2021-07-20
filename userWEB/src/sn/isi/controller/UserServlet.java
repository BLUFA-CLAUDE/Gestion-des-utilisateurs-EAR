package sn.isi.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.isi.dao.IFonction;
import sn.isi.dao.IRole;
import sn.isi.dao.IUser;
import sn.isi.entities.Fonction;
import sn.isi.entities.Role;
import sn.isi.entities.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/User")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private IUser userdao;
	@EJB
	private IFonction fonctiondao;
	@EJB
	private IRole roledao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		String page = request.getParameter("page").toString();
		if(page.equals("liste"))
		{
			request.setAttribute("list_users", userdao.lister());
			request.setAttribute("liste_fonctions", fonctiondao.lister());
			request.setAttribute("liste_roles", roledao.lister());
			request.getRequestDispatcher("WEB-INF/user/user.jsp").forward(request, response);
			if(page.equals("edit")) {
				int id =Integer.parseInt(request.getParameter("id"));
				request.setAttribute("user", userdao.getUser(id));
				
				response.sendRedirect("User?page=liste");
			}
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
			int Idfonction = Integer.parseInt(request.getParameter("Idfonction").toString());
			int Idrole = Integer.parseInt(request.getParameter("Idrole").toString());
			
			Role role = roledao.getRole(Idrole);
			List<Role> roles = new ArrayList<Role>();
			roles.add(role);
			Fonction fonction = fonctiondao.getFonction(Idfonction);
			
			User user = new User();
			user.setNom(nom);
			user.setPrenom(prenom);
			user.setEmail(email);
			user.setPassword(password);
			user.setFonction(fonction);
			user.setRoles(roles);
			userdao.add(user);
			response.sendRedirect("User?page=liste");
		
	}

}
