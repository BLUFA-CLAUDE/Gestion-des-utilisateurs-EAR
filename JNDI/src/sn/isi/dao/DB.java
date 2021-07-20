package sn.isi.dao;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class DB {

	public Connection getConnexion()
	{
		Context envContext = null;
		Connection con = null;
        try {
            envContext = new InitialContext();
            Context initContext  = (Context)envContext.lookup("java:/comp/env");
            DataSource ds = (DataSource)initContext.lookup("jdbc/BacDB");
 
             con = ds.getConnection();
            
        }catch (Exception e) {
			e.printStackTrace();
		}
        return con;
	}
}
