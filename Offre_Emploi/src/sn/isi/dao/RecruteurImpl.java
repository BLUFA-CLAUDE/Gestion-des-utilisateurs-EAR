package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sn.isi.entities.Recruteur;

public class RecruteurImpl implements IRecruteur {

	DB db = new DB();
	@Override
	public int add(Recruteur r) {
		String sql = "INSERT INTO recruteur VALUES(NULL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int ok=0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, r.getRecruteur_nom());
			db.getPstm().setString(2, r.getRecruteur_pass());
			db.getPstm().setString(3, r.getRecruteur_passConfirme());
			db.getPstm().setString(4, r.getType_structure());
			db.getPstm().setString(5, r.getNom_structure());
			db.getPstm().setString(6, r.getPays_etablissement());
			db.getPstm().setString(7, r.getVille());
			db.getPstm().setString(8, r.getAdresse_exact());
			db.getPstm().setString(9, r.getDescription_structure());
			db.getPstm().setString(10, r.getPhone_bureau());
			db.getPstm().setString(11, r.getEmail());
			db.getPstm().setString(12, r.getUrl_site());
			db.getPstm().setString(13, r.getPrenom());
			db.getPstm().setString(14, r.getNom());
			db.getPstm().setString(15, r.getPhone_perso());
			db.getPstm().setString(16, r.getFonction());
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int id) {
		String sql ="DELETE FROM recruteur WHERE recruteur_id= ? ";
		int ok=0;
		try {
			db.initPrepare(sql);
			db.getPstm().setInt(1, id);
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public List<Recruteur> getUser(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Recruteur> lister() {
		
		String sql = "SELECT * FROM recruteur";
		List<Recruteur> recruteurs = new ArrayList<Recruteur>();
		
		try {
			db.initPrepare(sql);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				Recruteur recruteur = new Recruteur();
				recruteur.setRecruteur_id(rs.getInt(1));
				recruteur.setRecruteur_nom(rs.getString(2));
				recruteur.setRecruteur_pass(rs.getString(3));
				recruteur.setRecruteur_passConfirme(rs.getString(4));
				recruteur.setType_structure(rs.getString(5));
				recruteur.setNom_structure(rs.getString(6));
				recruteur.setPays_etablissement(rs.getString(7));
				recruteur.setVille(rs.getString(8));
				recruteur.setAdresse_exact(rs.getString(9));
				recruteur.setDescription_structure(rs.getString(10));
				recruteur.setPhone_bureau(rs.getString(11));
				recruteur.setEmail(rs.getString(12));
				recruteur.setUrl_site(rs.getString(13));
				recruteur.setPrenom(rs.getString(14));
				recruteur.setNom(rs.getString(15));
				recruteur.setPhone_perso(rs.getString(16));
				recruteur.setFonction(rs.getString(17));
				recruteurs.add(recruteur);
					}
			} catch (Exception e) {
			e.printStackTrace();
		}
		return recruteurs;
	}

	@Override
	public Recruteur getRecruteur(int id) {
		String sql = "SELECT * FROM recruteur WHERE recruteur_id = ?";
		Recruteur recruteur = new Recruteur();
		try {
			db.initPrepare(sql);
			db.getPstm().setInt(1, id);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				recruteur = new Recruteur();
				recruteur.setRecruteur_id(rs.getInt(1));
				recruteur.setRecruteur_nom(rs.getString(2));
				recruteur.setRecruteur_pass(rs.getString(3));
				recruteur.setRecruteur_passConfirme(rs.getString(4));
				recruteur.setType_structure(rs.getString(5));
				recruteur.setNom_structure(rs.getString(6));
				recruteur.setPays_etablissement(rs.getString(7));
				recruteur.setVille(rs.getString(8));
				recruteur.setAdresse_exact(rs.getString(9));
				recruteur.setDescription_structure(rs.getString(10));
				recruteur.setPhone_bureau(rs.getString(11));
				recruteur.setEmail(rs.getString(12));
				recruteur.setUrl_site(rs.getString(13));
				recruteur.setPrenom(rs.getString(14));
				recruteur.setNom(rs.getString(15));
				recruteur.setPhone_perso(rs.getString(16));
				recruteur.setFonction(rs.getString(17));
				
					}
			} catch (Exception e) {
			e.printStackTrace();
		}
		return recruteur;
	}

}
