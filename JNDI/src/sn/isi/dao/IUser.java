package sn.isi.dao;
import java.util.List;

import sn.isi.entities.User;
public interface IUser {

	public int add(User u);
	public List<User> getAll();
}
