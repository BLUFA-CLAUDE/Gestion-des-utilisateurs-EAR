package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Recruteur;

public interface IRecruteur {

	public int add(Recruteur r);
	public int delete(int id);
	public List<Recruteur> getUser(String mc);
	public List<Recruteur> lister();
	public Recruteur getRecruteur(int id);
}
