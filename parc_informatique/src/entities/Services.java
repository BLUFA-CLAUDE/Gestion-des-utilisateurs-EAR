package entities;

public class Services {

	private int idS;
	private String nomS;
	private int portS;
	private String etatS;
	private Serveur serveur;
	
	public Services() {
		super();
	}

	public Services(int idS, String nomS, int portS, String etatS, Serveur serveur) {
		super();
		this.idS = idS;
		this.nomS = nomS;
		this.portS = portS;
		this.etatS = etatS;
		this.serveur = serveur;
	}

	public int getIdS() {
		return idS;
	}

	public void setIdS(int idS) {
		this.idS = idS;
	}

	public String getNomS() {
		return nomS;
	}

	public void setNomS(String nomS) {
		this.nomS = nomS;
	}

	public int getPortS() {
		return portS;
	}

	public void setPortS(int portS) {
		this.portS = portS;
	}

	public String getEtatS() {
		return etatS;
	}

	public void setEtatS(String etatS) {
		this.etatS = etatS;
	}

	public Serveur getServeur() {
		return serveur;
	}

	public void setServeur(Serveur serveur) {
		this.serveur = serveur;
	}
	
	
}
