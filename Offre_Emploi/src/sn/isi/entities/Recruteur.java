package sn.isi.entities;

public class Recruteur {

	private int recruteur_id;
	private String recruteur_nom;
	private String recruteur_pass;
	private String recruteur_passConfirme;
	private String type_structure;
	private String nom_structure;
	private String pays_etablissement;
	private String ville;
	private String adresse_exact;
	private String description_structure;
	private String phone_bureau;
	private String email;
	private String url_site;
	private String prenom;
	private String nom;
	private String phone_perso;
	private String fonction;
	
	
	public Recruteur() {}


	public Recruteur(int recruteur_id, String recruteur_nom, String recruteur_pass, String recruteur_passConfirme,
			String type_structure, String nom_structure, String pays_etablissement, String ville, String adresse_exact,
			String description_structure, String phone_bureau, String email, String url_site, String prenom, String nom,
			String phone_perso, String fonction) {
		super();
		this.recruteur_id = recruteur_id;
		this.recruteur_nom = recruteur_nom;
		this.recruteur_pass = recruteur_pass;
		this.recruteur_passConfirme = recruteur_passConfirme;
		this.type_structure = type_structure;
		this.nom_structure = nom_structure;
		this.pays_etablissement = pays_etablissement;
		this.ville = ville;
		this.adresse_exact = adresse_exact;
		this.description_structure = description_structure;
		this.phone_bureau = phone_bureau;
		this.email = email;
		this.url_site = url_site;
		this.prenom = prenom;
		this.nom = nom;
		this.phone_perso = phone_perso;
		this.fonction = fonction;
	}


	public int getRecruteur_id() {
		return recruteur_id;
	}


	public void setRecruteur_id(int recruteur_id) {
		this.recruteur_id = recruteur_id;
	}


	public String getRecruteur_nom() {
		return recruteur_nom;
	}


	public void setRecruteur_nom(String recruteur_nom) {
		this.recruteur_nom = recruteur_nom;
	}


	public String getRecruteur_pass() {
		return recruteur_pass;
	}


	public void setRecruteur_pass(String recruteur_pass) {
		this.recruteur_pass = recruteur_pass;
	}


	public String getRecruteur_passConfirme() {
		return recruteur_passConfirme;
	}


	public void setRecruteur_passConfirme(String recruteur_passConfirme) {
		this.recruteur_passConfirme = recruteur_passConfirme;
	}


	public String getType_structure() {
		return type_structure;
	}


	public void setType_structure(String type_structure) {
		this.type_structure = type_structure;
	}


	public String getNom_structure() {
		return nom_structure;
	}


	public void setNom_structure(String nom_structure) {
		this.nom_structure = nom_structure;
	}


	public String getPays_etablissement() {
		return pays_etablissement;
	}


	public void setPays_etablissement(String pays_etablissement) {
		this.pays_etablissement = pays_etablissement;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getAdresse_exact() {
		return adresse_exact;
	}


	public void setAdresse_exact(String adresse_exact) {
		this.adresse_exact = adresse_exact;
	}


	public String getDescription_structure() {
		return description_structure;
	}


	public void setDescription_structure(String description_structure) {
		this.description_structure = description_structure;
	}


	public String getPhone_bureau() {
		return phone_bureau;
	}


	public void setPhone_bureau(String phone_bureau) {
		this.phone_bureau = phone_bureau;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUrl_site() {
		return url_site;
	}


	public void setUrl_site(String url_site) {
		this.url_site = url_site;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPhone_perso() {
		return phone_perso;
	}


	public void setPhone_perso(String phone_perso) {
		this.phone_perso = phone_perso;
	}
	
	public String getFonction() {
		return fonction;
	}


	public void setFonction(String fonction) {
		this.fonction = fonction;
	}


	@Override
	public String toString() {
		return "Recruteur [recruteur_id=" + recruteur_id + ", recruteur_nom=" + recruteur_nom + ", recruteur_pass="
				+ recruteur_pass + ", recruteur_passConfirme=" + recruteur_passConfirme + ", type_structure="
				+ type_structure + ", nom_structure=" + nom_structure + ", pays_etablissement=" + pays_etablissement
				+ ", ville=" + ville + ", adresse_exact=" + adresse_exact + ", description_structure="
				+ description_structure + ", phone_bureau=" + phone_bureau + ", email=" + email + ", url_site="
				+ url_site + ", prenom=" + prenom + ", nom=" + nom + ", phone_perso=" + phone_perso + ", fonction="
				+ fonction + "]";
	}

	
}
