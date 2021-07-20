package sn.isi.metier;

import sn.isi.entities.Produit;

public interface IAdminProduitMetier extends InternauteMetier {

	public Produit addProduit(Produit p, int idc);
	public Produit updateProduit(Produit p);
	public void deleteProduit(int idP);
}
