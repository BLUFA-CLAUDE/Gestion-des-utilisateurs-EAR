package sn.isi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sn.isi.entities.User;

public class UserImpl implements IUser{

	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	private DB db = new DB();
	@Override
	public int add(User u) {
		int ok = 0;
		String sql = "INSERT INTO user VALUES(NULL,?,?)";
		try {
			con=db.getConnexion();
			pstm = con.prepareStatement(sql);
			pstm.setString(1, u.getEmail());
			pstm.setString(2, u.getPassword());
			ok = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}

	@Override
	public List<User> getAll() {
		List<User> users = new ArrayList<User>();
		String sql = "SELECT * FROM user";
		try {
			con=db.getConnexion();
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();
			while(rs.next()) {
				User  u = new User();
				u.setId(rs.getInt(1));
				u.setEmail(rs.getString(2));
				u.setPassword(rs.getString(3));
				users.add(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return users;
	}

	
}
