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
import sn.isi.dao.IUsers;
import sn.isi.dao.RecruteurImpl;
import sn.isi.dao.UsersImpl;
import sn.isi.entities.Recruteur;
import sn.isi.entities.Users;
import sn.isi.entities.UsersModele;

/**
 * Servlet implementation class AdministrateurServlet
 */
@WebServlet("/Administrateur")
public class AdministrateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IUsers userdao;
	private IRecruteur recruteurdao;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministrateurServlet() {
        super();
        userdao = new UsersImpl();
        
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page =request.getParameter("page").toString();
		if(page.equals("administrateur")) {
			List<Users> users = userdao.lister();
			request.setAttribute("list_users", users);
			request.getRequestDispatcher("administrateur.jsp").forward(request, response);
		}else if(page.equals("Rechercher")) {
			String motCle = request.getParameter("motCle").toString();
			UsersModele model = new UsersModele();
			model.setMotCle(motCle);
			List<Users> users = userdao.getUser(motCle);
			model.setUsers(users);
			request.setAttribute("list_users", users);
			request.getRequestDispatcher("administrateur.jsp").forward(request, response);
		}else if(page.equals("Supprimer")){
			int user_id = Integer.parseInt(request.getParameter("user_id"));
			userdao.delete(user_id);
			response.sendRedirect("Administrateur?page=administrateur");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equals("Envoyer")) {
		String nom = request.getParameter("nom").toString();
		String prenom = request.getParameter("prenom").toString();
		String email = request.getParameter("email").toString();
		String password = request.getParameter("password").toString();
		Users u = new Users();
		u.setUser_nom(nom);
		u.setUser_prenom(prenom);
		u.setUser_email(email);
		u.setUser_pass(password);
		userdao.add(u);
		response.sendRedirect("Administrateur?page=administrateur");
		}else if(action.equals("Enregistrer")) {
			String nom = request.getParameter("nom").toString();
			String prenom = request.getParameter("prenom").toString();
			String email = request.getParameter("email").toString();
			String password = request.getParameter("password").toString();
			Users u = new Users();
			u.setUser_nom(nom);
			u.setUser_prenom(prenom);
			u.setUser_email(email);
			u.setUser_pass(password);
			userdao.add(u);
			response.sendRedirect("Accueil?page=candidat");
		}else if(action.equals("S'enregistrer")) {
			String nomchef = request.getParameter("nomchef").toString();
			String password = request.getParameter("password").toString();
			String passwordconfirme = request.getParameter("passwordconfirme").toString();
			String typestructure = request.getParameter("typestructure").toString();
			String nomStructure = request.getParameter("nomStructure").toString();
			String pays = request.getParameter("ville").toString();
			String ville = request.getParameter("page").toString();
			String adresseexacte = request.getParameter("adresseexacte").toString();
			String description = request.getParameter("description").toString();
			String telephonebureau = request.getParameter("telephonebureau").toString();
			String url = request.getParameter("url").toString();
			String email = request.getParameter("email").toString();
			String prenomrepondant = request.getParameter("prenomrepondant").toString();
			String nomrepondant = request.getParameter("nomrepondant").toString();
			String telephonerepondant = request.getParameter("telephonerepondant").toString();
			String fonctionrepondant = request.getParameter("fonctionrepondant").toString();
			recruteurdao = new RecruteurImpl();
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
			re.setEmail(email);
			re.setUrl_site(url);
			re.setPrenom(prenomrepondant);
			re.setNom(nomrepondant);
			re.setPhone_perso(telephonerepondant);
			re.setFonction(fonctionrepondant);
			recruteurdao.add(re);
			response.sendRedirect("Recruteur?page=recruteur");
		}
		
	}

}
