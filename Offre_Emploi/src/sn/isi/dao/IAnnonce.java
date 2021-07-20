package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Annonce;



public interface IAnnonce {

	public int add(Annonce a);
	public int delete(int id);
	public int update(Annonce a);
	public List<Annonce> getUser(String mc);
	public List<Annonce> lister();
	public Annonce getCandidat(int id);
}
