package sn.isi.metier;

import java.util.List;

import sn.isi.entities.Categorie;
import sn.isi.entities.Client;
import sn.isi.entities.Commande;
import sn.isi.entities.Panier;
import sn.isi.entities.Produit;

public interface InternauteMetier {

	public List<Produit> listProduit();
	public List<Produit> listProduitParmc(String mc);
	public List<Produit> listProduitSeletionner();
	public List<Produit> listProduitParcategorie(int idCat);
	public Produit getProduit(int id);
	public List<Categorie> listCategorie();
	public Categorie getCategorie(int idC);
	public Commande enregistrerCommande(Panier p, Client c);
}
