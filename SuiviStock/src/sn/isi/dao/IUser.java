package sn.isi.dao;

import java.util.List;

import sn.isi.entities.User;

public interface IUser {

	public int add(User u);
	public int update(User u);
	public int delete(int id);
	public List<User> getUser(String mc);
	public List<User> lister();
}
