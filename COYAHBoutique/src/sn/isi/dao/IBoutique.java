package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Categorie;
import sn.isi.entities.Client;
import sn.isi.entities.Commande;
import sn.isi.entities.Panier;
import sn.isi.entities.Produit;
import sn.isi.entities.Role;
import sn.isi.entities.User;

public interface IBoutique {

	/*Produit*/
	public Produit addProduit(Produit p, int idC);
	public List<Produit> listProduit();
	public List<Produit> listProduitParmc(String mc);
	public List<Produit> listProduitSeletionner();
	public List<Produit> listProduitParcategorie(int idCat);
	public Produit getProduit(int id);
	public void deleteProduit(int id);
	public Produit updateProduit(Produit p);
	
	/*Categorie*/
	public Categorie addCategorie(Categorie c);
	public List<Categorie> listCategorie();
	public Categorie getCategorie(int idC);
	public void deleteCategorie(int idC);
	public Categorie updateCategorie(Categorie c);
	
	/* User*/
	public void addUser(User u);
	public void attribuerRole(User u, Role r);
	public Commande enregistrerCommande(Panier p, Client c);
}
