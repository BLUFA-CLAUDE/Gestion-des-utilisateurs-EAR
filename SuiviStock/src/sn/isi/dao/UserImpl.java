package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.Produit;
import sn.isi.entities.User;

public class UserImpl implements IUser {

	private DB db = new DB();
	@Override
	public int add(User u) {
		String sql = "INSERT INTO user VALUES(NULL,?,?,?,?,?)";
		int ok = 0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, u.getNom());
			db.getPstm().setString(2, u.getPrenom());
			db.getPstm().setString(3, u.getEmail());
			db.getPstm().setString(4, u.getPassword());
			db.getPstm().setInt(5, u.getEtat());
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int update(User u) {
		String sql= "UPDATE user SET "
				+"nom ? ,"
				+"prenom ? ,"
				+"email ? ,"
				+"password ? ,"
				+"WHERE id = ?";
		int ok = 0;
		try {
			db.initPrepare(sql);
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int id) {
		String sql = "DELETE FROM user WHERE id =?";
		int ok =0;
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
	public List<User> getUser(String mc) {
		String sql= "SELECT * FROM user WHERE prenom like ?";
		List<User> users = new ArrayList<User>();
		User user = null;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, "%"+mc+"%");
			ResultSet rs = db.executSelect();
			if(rs.next()) {
				user = new User();
				user.setId(rs.getInt("id"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setEtat(rs.getInt("etat"));
				users.add(user);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<User> lister() {
		String sql = "SELECT * FROM user";
		List<User> users = new ArrayList<User>();
		try {
			db.initPrepare(sql);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setNom(rs.getString("nom"));
				user.setPrenom(rs.getString("prenom"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				user.setEtat(rs.getInt("etat"));
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}
	
}
