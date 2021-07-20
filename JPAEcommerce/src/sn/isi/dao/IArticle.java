package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Article;



public interface IArticle {

	public int add(Article a);
	public int update(Article a);
	public int delete(int id);
	public List<Article> getProduit(String mc);
	public Article getProduitById(int id);
	public List<Article> lister();
}
