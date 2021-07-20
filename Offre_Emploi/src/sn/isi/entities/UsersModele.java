package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class UsersModele {
	
	private String motCle;
	List<Users> users = new ArrayList<Users>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Users> getUsers() {
		return users;
	}
	public void setUsers(List<Users> users) {
		this.users = users;
	}
	
	
}
