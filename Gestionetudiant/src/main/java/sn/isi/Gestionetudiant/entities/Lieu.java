package sn.isi.Gestionetudiant.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lieu implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	private double longitude;
	@Column
	private double latittude;
	@OneToMany(mappedBy = "lieu", fetch = FetchType.LAZY)
	private List<Formation> formations = new ArrayList<Formation>();
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user = new User();
	
	public Lieu() {
		super();
	}

	public Lieu(String nom, double longitude, double latittude) {
		super();
		this.nom = nom;
		this.longitude = longitude;
		this.latittude = latittude;
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

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatittude() {
		return latittude;
	}

	public void setLatittude(double latittude) {
		this.latittude = latittude;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
