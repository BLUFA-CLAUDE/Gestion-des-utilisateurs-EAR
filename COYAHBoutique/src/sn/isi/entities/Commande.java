package sn.isi.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCommande;
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	@OneToMany(mappedBy = "commande")
	private Collection<LigneCommande> lignes;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	public Commande()
	{
		super();
	}

	public Commande(Date dateCommande, Collection<LigneCommande> lignes, Client client) {
		super();
		this.dateCommande = dateCommande;
		this.lignes = lignes;
		this.client = client;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Collection<LigneCommande> getLignes() {
		return lignes;
	}

	public void setLignes(Collection<LigneCommande> lignes) {
		this.lignes = lignes;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
}
