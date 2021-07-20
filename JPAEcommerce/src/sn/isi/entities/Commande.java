package sn.isi.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCom;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column
	private int etat;
	@OneToMany(mappedBy = "commande")
	private Collection<LignePanier> lignes;
	
	public Commande() {
		super();
	}

	public Commande(Date date, int etat) {
		super();
		this.date = date;
		this.etat = etat;
	}

	public int getIdCom() {
		return idCom;
	}

	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
	}

	public Collection<LignePanier> getLignes() {
		return lignes;
	}

	public void setLignes(Collection<LignePanier> lignes) {
		this.lignes = lignes;
	}

	
}
