package sn.isi.entities;


import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idC;
	@Column(length = 100)
	private String nomCategorie;
	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;
	
	public Categorie()
	{
		super();
	}

	public Categorie(String nomCategorie) {
		super();
		this.nomCategorie = nomCategorie;
		
	}

	public int getIdC() {
		return idC;
	}

	public void setIdC(int idC) {
		this.idC = idC;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
