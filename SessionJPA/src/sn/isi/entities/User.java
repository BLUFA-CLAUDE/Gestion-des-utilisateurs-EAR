package sn.isi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	@Column(length = 100)
	private String nom;
	@Column(length = 100)
	private String prenom;
	@Column(length = 100)
	private String email;
	@Column(length = 100)
	private String password;
	@Column
	private int etat;
	@OneToMany
	@JoinColumn(name = "idRole")
	private List<Role> roles;
	
	public User() {
		super();
	}

	public User(String nom, String prenom, String email, String password, int etat, List<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.etat = etat;
		this.roles = roles;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
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

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
