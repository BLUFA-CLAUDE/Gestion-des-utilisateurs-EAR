package dao;

import java.sql.ResultSet;
import java.util.List;

import entities.Serveur;

public class ServiceImpl implements IServeur {
	
	private DB db;
	private ResultSet rs;
	private int ok;

	@Override
	public int add(Serveur serveur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int idServ) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Serveur serveur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Serveur getServeur(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Serveur> lister() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Serveur> getServeurMc(String mc) {
		// TODO Auto-generated method stub
		return null;
	}

}
