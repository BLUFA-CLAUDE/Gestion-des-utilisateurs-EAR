package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.Produit;

public class ProduitImpl implements IProduit {

	private DB db = new DB();
	@Override
	public int add(Produit p) {
		String sql = "INSERT INTO produit VALUES(NULL, ?,?,?)";
		int ok = 0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, p.getNom());
			db.getPstm().setDouble(2, p.getQteStock());
			db.getPstm().setObject(3, p.getId());
			ok = db.executeMAJ();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int update(Produit p) {
		String sql ="UPDATE produit SET "
				+"nom= ? ,"
				+"qteStock= ? "
				+"WHERE ref = ?";
		int ok =0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, p.getNom());
			db.getPstm().setDouble(2, p.getQteStock());
			//db.getPstm().setInt(3, p.getId().getId());
			db.getPstm().setInt(3, p.getRef());
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM produit WHERE ref= ?";
		int ok= 0;
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
	public List<Produit> getProduit(String mc) {
		String sql= "SELECT * FROM produit WHERE nom like ?";
		List<Produit> prods = new ArrayList<Produit>();
		Produit p = null;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, "%"+mc+"%");
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				p = new Produit();
				p.setRef(rs.getInt("ref"));
				p.setNom(rs.getString("nom"));
				p.setQteStock(rs.getDouble("qteStock"));
				prods.add(p);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public List<Produit> lister() {
		String sql = "SELECT * FROM produit";
		List<Produit> prods = new ArrayList<Produit>();
		Produit p = null;
		try {
			db.initPrepare(sql);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				p = new Produit();
				p.setRef(rs.getInt("ref"));
				p.setNom(rs.getString("nom"));
				p.setQteStock(rs.getDouble("qteStock"));
				prods.add(p);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public Produit getProduitById(int id) {
		String sql= "SELECT * FROM produit WHERE ref= ?";
		Produit p = new Produit();
		try {
			db.initPrepare(sql);
			db.getPstm().setInt(1, id);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				p.setRef(rs.getInt("ref"));
				p.setNom(rs.getString("nom"));
				p.setQteStock(rs.getDouble("qteStock"));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}

}
