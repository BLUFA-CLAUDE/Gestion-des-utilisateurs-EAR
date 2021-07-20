package sn.isi.test;

import java.util.List;

import sn.isi.dao.BoutiqueImpl;
import sn.isi.dao.IBoutique;
import sn.isi.entities.Categorie;
import sn.isi.entities.Produit;
import sn.isi.metier.BoutiqueMetierImpl;
import sn.isi.metier.IAdminCategroieMetier;

public class Test {

	public static void main(String[] args) {
		/*
		//IAdminCategroieMetier metier = new BoutiqueMetierImpl();
		IBoutique metier2 = new BoutiqueImpl();
		//metier2.addCategorie(new Categorie("Ordinateurs", "ord", null, "image1.jpg"));
		//metier2.addCategorie(new Categorie("Imprimantes", "imp", null, "image2.jpg"));
		//metier2.addCategorie(new Categorie("Telephone", "tele", null, "image3.jpg"));
		//metier2.addCategorie(new Categorie("Vetement", "vete", null, "image4.jpg"));
		List<Categorie> cat1 = metier2.listCategorie();
		for(Categorie ca: cat1) {
			System.out.println(ca.getIdCategorie()+" "+ca.getNomCategorie()+" "+ca.getDescription()+" "+ca.getNomPhoto());
		}
		*/
		
		IBoutique metier = new BoutiqueImpl();
		//metier.addProduit(new Produit("HP","HP eliteBook",10,3,true,"image1.jpg"),1);
		//metier.addProduit(new Produit("LENOVO","YAGA",15,3,true,"image1.jpg"),1);
		//metier.addProduit(new Produit("Pantalon","kaki chinois",20,4,false,"image1.jpg"),1);
		//metier.addProduit(new Produit("Robe","Robe de mariage",1500,45,false,"image2.jpg"),6);
		//Produit p = metier.getProduit(1);
		
		//System.out.println(p.getDesignation()+" "+p.getDescription()+" "+p.getCategorie());
		//metier.deleteProduit(8);
		
		List<Produit> prods = metier.listProduitParcategorie(1);
		for(Produit p: prods) {
			System.out.println(p.getDesignation()+" "+p.getDescription()+" "+p.getCategorie());
		}
		
	}

}
