package sn.isi.dao;

import java.util.List;

import sn.isi.entities.Role;



public interface IRole {

	public int add(Role r);
	public int update(Role r);
	public int delete(int id);
	public Role getUserById(int id);
	public List<Role> lister();
}
