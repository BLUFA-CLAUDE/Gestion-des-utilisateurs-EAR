package dao;

import java.util.List;

import entities.Services;

public interface IServices {

	public int add(Services services);
	public int delete(int idS);
	public int update(Services services);
	public Services getServices(int id);
	public List<Services> lister();
	public List<Services> ServicesByServeur(int idServ);
}
