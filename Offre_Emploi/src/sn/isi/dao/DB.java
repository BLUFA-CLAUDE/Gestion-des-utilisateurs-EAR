package sn.isi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB {

	private Connection cnx;
	private ResultSet rs;
	private PreparedStatement pstm;
	private int ok;
	
	public void getConnexion() {
		String url="jdbc:mysql://localhost:3306/offre_emploi";
		String user="root";
		String password="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url,user,password);
			//System.out.println("connexion reussie");
		} catch (Exception e) {
			//System.out.println("connexion non reussie");
			e.printStackTrace();
		}
	}
	
	public void initPrepare(String sql) {
		try {
			getConnexion();
			pstm = cnx.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executSelect() {
		try {
			rs = pstm.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public int executeMAJ() {
		try {
			ok = pstm.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ok;
	}
	
	public void closeConnexion() {
		try {
			if(cnx !=null) {
				cnx.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public PreparedStatement getPstm()throws SQLException{
		return pstm;
	}
}
