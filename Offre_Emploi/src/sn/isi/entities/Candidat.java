package sn.isi.entities;

public class Candidat {

	private int candidat_id;
	private String candidat_prenom;
	private String candidat_nom;
	private String candidat_email;
	private String candidat_pays;
	
	public Candidat() {}

	public Candidat(String candidat_prenom, String candidat_nom, String candidat_email,
			String candidat_pays) {
		super();
		this.candidat_prenom = candidat_prenom;
		this.candidat_nom = candidat_nom;
		this.candidat_email = candidat_email;
		this.candidat_pays = candidat_pays;
	}

	

	public int getCandidat_id() {
		return candidat_id;
	}

	public void setCandidat_id(int candidat_id) {
		this.candidat_id = candidat_id;
	}

	public String getCandidat_prenom() {
		return candidat_prenom;
	}

	public void setCandidat_prenom(String candidat_prenom) {
		this.candidat_prenom = candidat_prenom;
	}

	public String getCandidat_nom() {
		return candidat_nom;
	}

	public void setCandidat_nom(String candidat_nom) {
		this.candidat_nom = candidat_nom;
	}

	public String getCandidat_email() {
		return candidat_email;
	}

	public void setCandidat_email(String candidat_email) {
		this.candidat_email = candidat_email;
	}

	
	public String getCandidat_pays() {
		return candidat_pays;
	}

	public void setCandidat_pays(String candidat_pays) {
		this.candidat_pays = candidat_pays;
	}
	
	
	
}
