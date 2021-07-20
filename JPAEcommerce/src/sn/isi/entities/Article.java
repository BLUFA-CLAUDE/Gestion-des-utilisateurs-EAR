package sn.isi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "article")
public class Article implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idA;
	@Column(length = 100)
	private String nom;
	private int quantite;
	private double prix;
	@ManyToOne
	@JoinColumn(name = "idC")
	private Categorie categorie;
	
	public Article()
	{
		super();
	}

	public Article(String nom, int quantite, double prix) {
		super();
		this.nom = nom;
		this.quantite = quantite;
		this.prix = prix;
	}

	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
}
