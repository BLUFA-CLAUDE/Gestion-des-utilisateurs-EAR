package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Serveur;

public class ServeurImpl implements IServeur {
	
	private DB db;
	private ResultSet rs;
	private int ok;

	@Override
	public int add(Serveur serveur) {
		String sql= "INSERT INTO serveur VALUES(NULL, ?, ?)";
		ok = 0;
		try {
			db = new DB();
			db.initPrepare(sql);
			db.getPstm().setString(1, serveur.getNomServ());
			db.getPstm().setString(2, serveur.getAdripServ());
			ok = db.executMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int idServ) {
		String sql = "DELETE FROM seveur WHERE idServ= ?";
		ok = 0;
		try {
			db = new DB();
			db.initPrepare(sql);
			db.getPstm().setInt(1, idServ );
			ok = db.executMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int update(Serveur serveur) {
		String sql = "UPDATE serveur SET "
					+"nomServ =? ,"
					+"adripServ =? "
					+"WHERE idServ= ?";
		ok = 0;
		try {
			db = new DB();
			db.initPrepare(sql);
			db.getPstm().setString(1, serveur.getNomServ());
			db.getPstm().setString(2, serveur.getAdripServ());
			ok = db.executMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public Serveur getServeur(int id) {
		String sql = "SELECT * FROM serveur WHERE idServ=?";
		Serveur serveur = new Serveur();
		try {
			db = new DB();
			db.initPrepare(sql);
			db.getPstm().setInt(1, id);
			rs = db.executSelect();
			while (rs.next()) {
				serveur = new Serveur();
				serveur.setIdServ(rs.getInt("idServ"));
				serveur.setNomServ(rs.getString("nomServ"));
				serveur.setAdripServ(rs.getString("adripServ"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return serveur;
	}

	@Override
	public List<Serveur> lister() {
		String sql = "SELECT * FROM serveur";
		List<Serveur> servs = new ArrayList<Serveur>();
		try {
			db = new DB();
			db.initPrepare(sql);
			rs = db.executSelect();
			while (rs.next()) {
				Serveur serveur = new Serveur();
				serveur.setIdServ(rs.getInt(1));
				serveur.setNomServ(rs.getString(2));
				serveur.setAdripServ(rs.getString(3));
				servs.add(serveur);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return servs;
	}

	@Override
	public List<Serveur> getServeurMc(String mc) {
		String sql= "SELECT * FROM serveur WHERE nomServ like ?";
		List<Serveur> servs = new ArrayList<Serveur>();
		Serveur serveur = null;
		try {
			db = new DB();
			db.initPrepare(sql);
			rs = db.executSelect();
			while (rs.next()) {
				serveur = new Serveur();
				serveur.setIdServ(rs.getInt("idServ"));
				serveur.setNomServ(rs.getString("nomServ"));
				serveur.setAdripServ(rs.getString("adripServ"));
				servs.add(serveur);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return servs;
	}

}
