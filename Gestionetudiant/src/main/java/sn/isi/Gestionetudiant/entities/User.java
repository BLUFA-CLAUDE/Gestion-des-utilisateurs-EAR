package sn.isi.Gestionetudiant.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private int etat;
	@OneToMany(mappedBy = "user")
	private List<Lieu> lieu = new ArrayList<Lieu>();
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "user_roles",
			joinColumns = {@JoinColumn(name="idU", nullable = false, updatable = false)},
			inverseJoinColumns = {@JoinColumn(name="idR", nullable = false, updatable = false)}
			)
	private List<Role> roles = new ArrayList<Role>();
	
	public User() {
		super();
	}

	public User(String nom, String prenom, String email, String password, int etat, List<Lieu> lieu, List<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.etat = etat;
		this.lieu = lieu;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public List<Lieu> getLieu() {
		return lieu;
	}

	public void setLieu(List<Lieu> lieu) {
		this.lieu = lieu;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
