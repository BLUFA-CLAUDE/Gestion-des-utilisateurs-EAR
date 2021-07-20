package sn.isi.dao;

import java.sql.ResultSet;
import java.util.List;

import sn.isi.entities.Candidat;

public class CandidatImpl implements ICandidat {

	private DB db = new DB();
	@Override
	public int add(Candidat c) {
		String sql="INSERT INTO candidat VALUES(NULL,?,?,?,?)";
		int ok =0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, c.getCandidat_prenom());
			db.getPstm().setString(2, c.getCandidat_nom());
			db.getPstm().setString(3, c.getCandidat_email());
			db.getPstm().setString(4, c.getCandidat_pays());
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Candidat> getUser(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidat> lister() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Candidat getCandidat(int id) {
		String sql = "SELECT * FROM candidat WHERE candidat_id = ?";
		Candidat candidat = null;
		try {
			db.initPrepare(sql);
			db.getPstm().setInt(1, id);
			ResultSet rs = db.executSelect();
			if(rs.next()) {
				candidat = new Candidat();
				candidat.setCandidat_id(rs.getInt(1));
				candidat.setCandidat_prenom(rs.getString(2));
				candidat.setCandidat_nom(rs.getString(3));
				candidat.setCandidat_email(rs.getString(4));
				candidat.setCandidat_pays(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return candidat;
	}

}
