package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Produit;

public interface IProduit {

	public Produit add(Produit p);
	public Produit update(Produit p);
	public void delete(int id);
	public List<Produit>getProduitmc(String mc);
	public Produit getProduit(int id);
}
