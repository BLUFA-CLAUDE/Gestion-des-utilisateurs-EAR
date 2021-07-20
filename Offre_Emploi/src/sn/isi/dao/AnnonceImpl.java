package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.Annonce;

public class AnnonceImpl implements IAnnonce {

	DB db = new DB();
	@Override
	public int add(Annonce a) {
		String sql= "INSERT INTO annonce VALUES(NULL, ?, ?, ?, ?, ?)";
		int ok=0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, a.getPoste());
			db.getPstm().setDouble(2, a.getSalaire());
			db.getPstm().setString(3, a.getLocalisation());
			db.getPstm().setString(4, a.getDateAnonce());
			db.getPstm().setString(5, a.getDescription());
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
	public int update(Annonce a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Annonce> getUser(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Annonce> lister() {
		String sql= "SELECT * FROM annonce";
		List<Annonce> annonces = new ArrayList<Annonce>();
		try {
			db.initPrepare(sql);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				Annonce an = new Annonce();
				an.setRef(rs.getInt(1));
				an.setPoste(rs.getString(2));
				an.setSalaire(rs.getDouble(3));
				an.setLocalisation(rs.getString(4));
				an.setDateAnonce(rs.getString(5));
				an.setDescription(rs.getString(6));
				annonces.add(an);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return annonces;
	}

	@Override
	public Annonce getCandidat(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
