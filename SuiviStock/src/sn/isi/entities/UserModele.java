package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

public class UserModele {
	
	private String motCle;
	List<User> users = new ArrayList<User>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	
}
