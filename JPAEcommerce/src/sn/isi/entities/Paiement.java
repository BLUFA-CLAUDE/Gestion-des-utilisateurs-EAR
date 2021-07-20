package sn.isi.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Paiement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@ManyToOne
	@JoinColumn(name = "idCom")
	private Commande commande;
	
	
	public Paiement() {
		super();
	}


	public Paiement(Date date, Commande commande) {
		super();
		this.date = date;
		this.commande = commande;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Commande getCommande() {
		return commande;
	}


	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}
