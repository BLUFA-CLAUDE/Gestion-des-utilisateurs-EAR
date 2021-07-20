package entities;

public class Serveur {

	private int idServ;
	private String nomServ;
	private String adripServ;
	
	public Serveur() {
		super();
	}

	public Serveur(int idServ, String nomServ, String adripServ) {
		super();
		this.idServ = idServ;
		this.nomServ = nomServ;
		this.adripServ = adripServ;
	}

	public int getIdServ() {
		return idServ;
	}

	public void setIdServ(int idServ) {
		this.idServ = idServ;
	}

	public String getNomServ() {
		return nomServ;
	}

	public void setNomServ(String nomServ) {
		this.nomServ = nomServ;
	}

	public String getAdripServ() {
		return adripServ;
	}

	public void setAdripServ(String adripServ) {
		this.adripServ = adripServ;
	}

	@Override
	public String toString() {
		return "Serveur [idServ=" + idServ + ", nomServ=" + nomServ + ", adripServ=" + adripServ + "]";
	}
	
	
}
