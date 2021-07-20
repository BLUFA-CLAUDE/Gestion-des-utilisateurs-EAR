package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int ref;
	@Column(length = 100) 
	private String nom;
	@Column
	private double qteStock;
	@Column
	private double prix;
	
	public Produit() {
		super();
	}

	public Produit(int ref, String nom, double qteStock, double prix) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.qteStock = qteStock;
		this.prix = prix;
	}

	public int getRef() {
		return ref;
	}

	public void setRef(int ref) {
		this.ref = ref;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getQteStock() {
		return qteStock;
	}

	public void setQteStock(double qteStock) {
		this.qteStock = qteStock;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
}
