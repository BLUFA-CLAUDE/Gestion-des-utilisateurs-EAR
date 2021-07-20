package test;

import java.util.List;

import dao.DB;
import dao.IServeur;
import dao.ServeurImpl;
import entities.Serveur;

public class Main {

	public static void main(String[] args) {
		
		//DB db = new DB();
		//db.getConnexion();
		IServeur serveurdao = new ServeurImpl();
		Serveur serveur = new Serveur();
		serveur.setNomServ("ISI Mere");
		serveur.setAdripServ("192.168.1.1");
		int rsult= serveurdao.add(serveur);
		System.out.println(rsult);
		List<Serveur> listS = serveurdao.lister();
		for(Serveur ser: listS) {
			System.out.println(ser.getNomServ()+" "+ser.getAdripServ());
		}
		
	}

}
