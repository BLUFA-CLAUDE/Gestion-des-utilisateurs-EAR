package sn.isi.entities;

import java.io.Serializable;

public class Produit implements Serializable {

	private int ref;
	private String nom;
	private double qteStock;
	private User id;
	
	public Produit() {
		
	}

	public Produit(int ref, String nom, double qteStock, User id) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.qteStock = qteStock;
		this.id = id;
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

	public User getId() {
		return id;
	}

	public void setId(User id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produit [ref=" + ref + ", nom=" + nom + ", qteStock=" + qteStock + ", id=" + id + "]";
	}
	
	
	
}
