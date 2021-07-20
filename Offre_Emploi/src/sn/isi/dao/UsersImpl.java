package sn.isi.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import sn.isi.entities.Users;

public class UsersImpl implements IUsers {

	private DB db = new DB();
	@Override
	public int add(Users u) {
		String sql = "INSERT INTO users VALUES(NULL, ?, ?, ?, ?)";
		int ok = 0;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, u.getUser_nom());
			db.getPstm().setString(2, u.getUser_prenom());
			db.getPstm().setString(3, u.getUser_email());
			db.getPstm().setString(4, u.getUser_pass());
			ok = db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public int delete(int id) {
		String sql="DELETE FROM users WHERE user_id= ?";
		int ok =0;
		try {
			db.initPrepare(sql);
			db.getPstm().setInt(1, id);
			ok= db.executeMAJ();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public List<Users> getUser(String mc) {
		String sql= "SELECT * FROM users WHERE user_prenom like ?";
		List<Users> users = new ArrayList<Users>();
		Users user = null;
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, "%"+mc+"%");
			ResultSet rs = db.executSelect();
			if(rs.next()) {
				user = new Users();
				user.setUser_id(rs.getInt(1));
				user.setUser_nom(rs.getString(2));
				user.setUser_prenom(rs.getString(3));
				user.setUser_email(rs.getString(4));
				user.setUser_pass(rs.getString(5));
				users.add(user);	
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public List<Users> lister() {
		String sql = "SELECT * FROM users";
		List<Users> users = new ArrayList<Users>();
		try {
			db.initPrepare(sql);
			ResultSet rs = db.executSelect();
			while(rs.next()) {
				Users user = new Users();
				user.setUser_id(rs.getInt(1));
				user.setUser_nom(rs.getString(2));
				user.setUser_prenom(rs.getString(3));
				user.setUser_email(rs.getString(4));
				user.setUser_pass(rs.getString(5));
				users.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public Users getUserByMail(String mc) {
		String sql= "SELECT * FROM users WHERE email like ?";
		Users user = new Users();
		try {
			db.initPrepare(sql);
			db.getPstm().setString(1, "%"+mc+"%");
			ResultSet rs = db.executSelect();
			if(rs.next()) {
				user = new Users();
				user.setUser_id(rs.getInt(1));
				user.setUser_nom(rs.getString(2));
				user.setUser_prenom(rs.getString(3));
				user.setUser_email(rs.getString(4));
				user.setUser_pass(rs.getString(5));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public boolean UserExiste(String email, String password) {
			String sql="SELECT * FROM users WHERE user_email=? AND user_pass=? ";
			boolean resultat= false;
			 try {
				db.initPrepare(sql);
				db.getPstm().setString(1,email );
				db.getPstm().setString(2, password);
				ResultSet rs = db.executSelect();
				resultat = rs.next();
			} catch (Exception e) {
				e.printStackTrace();
			}
		return resultat;
	}

}
