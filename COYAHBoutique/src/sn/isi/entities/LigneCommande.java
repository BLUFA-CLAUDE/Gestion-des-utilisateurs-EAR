package sn.isi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "lignecommande")
public class LigneCommande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLigne;
	@ManyToOne
	@JoinColumn(name = "idCommande")
	private Commande commande;
	@ManyToOne
	@JoinColumn(name = "idProduit")
	private Produit produit;
	@Column
	private int quantite;
	@Column
	private double prix;
	
	public LigneCommande() {
		super();
	}

	public LigneCommande(Commande commande, Produit produit, int quantite, double prix) {
		super();
		this.commande = commande;
		this.produit = produit;
		this.quantite = quantite;
		this.prix = prix;
	}

	public int getIdLigne() {
		return idLigne;
	}

	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
