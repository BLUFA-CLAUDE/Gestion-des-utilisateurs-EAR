package dao;

import java.util.List;

import entities.Serveur;

public interface IServeur {

	public int add(Serveur serveur);
	public int delete(int idServ);
	public int update(Serveur serveur);
	public Serveur getServeur(int id);
	public List<Serveur> lister();
	public List<Serveur> getServeurMc(String mc);
}
