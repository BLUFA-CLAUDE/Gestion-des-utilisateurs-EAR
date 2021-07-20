package sn.isi.dao;

import java.util.List;

import javax.ejb.Local;

import sn.isi.entities.Fonction;

@Local
public interface IFonction {

	public int add(Fonction f);
	public int delete(int id);
	public int update(Fonction f);
	public Fonction getFonction(int id);
	public List<Fonction> lister();
}
