package sn.isi.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
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
	private int idCategorie;
	@Column(length = 100)
	private String nomCategorie;
	@Column(length = 100)
	private String description;
	@Column
	private Byte[] photo;
	@Column(length = 100)
	private String nomPhoto;
	@OneToMany(mappedBy = "categorie")
	private Collection<Produit> produits;
	
	public Categorie()
	{
		super();
	}

	public Categorie(String nomCategorie, String description, Byte[] photo, String nomPhoto) {
		super();
		this.nomCategorie = nomCategorie;
		this.description = description;
		this.photo = photo;
		this.nomPhoto = nomPhoto;
		
	}

	public int getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(Byte[] photo) {
		this.photo = photo;
	}

	public String getNomPhoto() {
		return nomPhoto;
	}

	public void setNomPhoto(String nomPhoto) {
		this.nomPhoto = nomPhoto;
	}

	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", description="
				+ description + ", photo=" + Arrays.toString(photo) + ", nomPhoto=" + nomPhoto + ", produits="
				+ produits + "]";
	}
	
	
}
