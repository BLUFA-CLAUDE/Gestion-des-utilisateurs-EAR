package sn.isi.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100)
	private String nom;
	@Column(length = 100)
	private String prenom;
	@Column(length = 100)
	private String email;
	@Column(length = 100)
	private String password;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Role> roles = new ArrayList<Role>();
	@ManyToOne
	private Fonction fonction = new Fonction();
	
	public User() {
		super();
	}

	public User(String nom, String prenom, String email, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setIdUser(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Fonction getFonction() {
		return fonction;
	}

	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}
}
