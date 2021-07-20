package sn.isi.metier;

import java.util.List;

import sn.isi.dao.IBoutique;
import sn.isi.entities.Categorie;
import sn.isi.entities.Client;
import sn.isi.entities.Commande;
import sn.isi.entities.Panier;
import sn.isi.entities.Produit;
import sn.isi.entities.Role;
import sn.isi.entities.User;

public class BoutiqueMetierImpl implements IAdminCategroieMetier {

	private IBoutique dao;
	
	
	public void setDao(IBoutique dao) {
		this.dao = dao;
	}

	@Override
	public Produit addProduit(Produit p, int idc) {
		return dao.addProduit(p, idc);
	}

	@Override
	public Produit updateProduit(Produit p) {
		return dao.updateProduit(p);
		
	}

	@Override
	public void deleteProduit(int idP) {
		dao.deleteProduit(idP);
		
	}

	@Override
	public List<Produit> listProduit() {
		return dao.listProduit();
	}

	@Override
	public List<Produit> listProduitParmc(String mc) {
		return dao.listProduitParmc(mc);
	}

	@Override
	public List<Produit> listProduitSeletionner() {
		return dao.listProduitSeletionner();
	}

	@Override
	public List<Produit> listProduitParcategorie(int idCat) {
		return dao.listProduitParcategorie(idCat);
	}

	@Override
	public Produit getProduit(int id) {
		return dao.getProduit(id);
	}

	@Override
	public List<Categorie> listCategorie() {
		return dao.listCategorie();
	}

	@Override
	public Categorie getCategorie(int idC) {
		return dao.getCategorie(idC);
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		return dao.enregistrerCommande(p, c);
	}

	@Override
	public Categorie addCategorie(Categorie c) {
		return dao.addCategorie(c);
	}

	@Override
	public Categorie updateCategorie(Categorie c) {
		return dao.updateCategorie(c);
	}

	@Override
	public void deleteCategorie(int idc) {
		dao.deleteCategorie(idc);
		
	}

	@Override
	public void addUser(User u) {
		dao.addUser(u);
	}

	@Override
	public void attribueRole(User u, Role r) {
		dao.attribuerRole(u, r);
	}

}
