package sn.isi.Gestionetudiant.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Formation implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nom;
	@Column
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Column
	private int duree;
	@ManyToOne()
	@JoinColumn(name = "lieu_id")
	private Lieu lieu = new Lieu();
	
	
	public Formation() {
		super();
	}


	public Formation(String nom, Date dateDebut, int duree, Lieu lieu) {
		super();
		this.nom = nom;
		this.dateDebut = dateDebut;
		this.duree = duree;
		this.lieu = lieu;
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


	public Date getDateDebut() {
		return dateDebut;
	}


	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}


	public int getDuree() {
		return duree;
	}


	public void setDuree(int duree) {
		this.duree = duree;
	}


	public Lieu getLieu() {
		return lieu;
	}


	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}
	
	
}
