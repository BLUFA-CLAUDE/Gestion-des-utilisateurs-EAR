package sn.isi.entities;

public class Users {

	private int user_id;
	private String user_nom;
	private String user_prenom;
	private String user_email;
	private String user_pass;
	
	public Users() {
		super();
	}

	public Users(String user_nom,String user_prenom, String user_email, String user_pass) {
		super();
		this.user_nom = user_nom;
		this.user_nom = user_prenom;
		this.user_nom = user_email;
		this.user_pass = user_pass;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_nom() {
		return user_nom;
	}

	
	public String getUser_prenom() {
		return user_prenom;
	}

	public void setUser_prenom(String user_prenom) {
		this.user_prenom = user_prenom;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public void setUser_nom(String user_nom) {
		this.user_nom = user_nom;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", user_nom=" + user_nom + ", user_prenom=" + user_prenom + ", user_email="
				+ user_email + ", user_pass=" + user_pass + "]";
	}
	
	
}
