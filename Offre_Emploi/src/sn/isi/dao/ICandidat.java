package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Candidat;


public interface ICandidat {

	public int add(Candidat c);
	public int delete(int id);
	public List<Candidat> getUser(String mc);
	public List<Candidat> lister();
	public Candidat getCandidat(int id);
}
