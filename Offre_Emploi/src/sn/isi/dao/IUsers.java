package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Users;

public interface IUsers {

	public int add(Users u);
	public int delete(int id);
	public List<Users> getUser(String mc);
	public List<Users> lister();
	public Users getUserByMail(String mc);
	public boolean UserExiste(String email, String password);
}
