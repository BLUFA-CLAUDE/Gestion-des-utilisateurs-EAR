package sn.isi.entities;

public class Annonce {

	private int ref;
	private String poste;
	private double salaire;
	private String localisation;
	private String dateAnonce;
	private String description;
	
	
	public Annonce() {
		super();
	}


	public Annonce(int ref, String poste, double salaire, String localisation, String dateAnonce, String description) {
		super();
		this.ref = ref;
		this.poste = poste;
		this.salaire = salaire;
		this.localisation = localisation;
		this.dateAnonce = dateAnonce;
		this.description = description;
		
	}


	public int getRef() {
		return ref;
	}


	public void setRef(int ref) {
		this.ref = ref;
	}


	public double getSalaire() {
		return salaire;
	}


	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public String getDateAnonce() {
		return dateAnonce;
	}


	public void setDateAnonce(String dateAnonce) {
		this.dateAnonce = dateAnonce;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPoste() {
		return poste;
	}


	public void setPoste(String poste) {
		this.poste = poste;
	}
	
		
}
