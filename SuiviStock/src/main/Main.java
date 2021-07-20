package main;

import java.util.List;

import sn.isi.dao.DB;
import sn.isi.dao.IProduit;
import sn.isi.dao.IUser;
import sn.isi.dao.ProduitImpl;
import sn.isi.dao.UserImpl;
import sn.isi.entities.Produit;
import sn.isi.entities.User;

public class Main {

	public static void main(String[] args) {
		
		IUser userdao = new UserImpl();
		User u = new User();
		u.setNom("SALL");
		u.setPrenom("Amadou");
		u.setEmail("Idriss@gmail.com");
		u.setPassword("passer");
		u.setEtat(0);
		//int resul = userdao.add(u);
		
		 
		 
		/*
		IProduit userdao = new ProduitImpl();
		Produit p = new Produit();
		p.setRef(1);
		p.setNom("Pulovaire de KABA");
		p.setQteStock(2500);
		//p.setId(p.getId());
		int result = userdao.update(p);
		//int result = userdao.delete(4);
		  */
		 
		
		List<User> user = userdao.lister();
		for(User use: user) {
			System.out.println(use.getId()+""
					+ " "+use.getNom()+""
					+ " "+use.getPrenom());
		}
		

	}

}
