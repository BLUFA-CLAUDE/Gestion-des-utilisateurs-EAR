package app;

import java.util.Date;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		IAppareil appareil = new Appareil();
		appareil.enregistrer(new Contact(1, "CAMARA", "776361783"));
		appareil.enregistrer(new Contact(2, "KABA", "776364587"));
		appareil.enregistrer(new AppelEmie(1, new Date(), 66), "776361783");
		appareil.enregistrer(new AppelEmie(2, new Date(), 1234), "776361783");
		appareil.enregistrer(new AppelEmie(3, new Date(), 789), "776364587");
		appareil.enregistrer(new AppelRecue(4, new Date(), 98), "776361783");
		
		System.out.println("--------------------------------");
		System.out.println("Consulter un contact sachant son numero");
		try {
			Contact c =appareil.consulter(1);
			System.out.println("Numero: "+c.getNumero());
			System.out.println("Nom: "+c.getNom());
			System.out.println("Tel: "+c.getNumeroTel());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("--------------------------------");
		System.out.println("Consulter les contacts par mot clé:");
		List<Contact> contacts = appareil.consulter("C");
		for(Contact c: contacts) {
			System.out.println("*************************");
			System.out.println("Nom: "+c.getNom());
			System.out.println("Tel: "+c.getNumeroTel());
		}
		
		System.out.println("--------------------------------");
		System.out.println("Consulter le cout total des appels:");
		System.out.println("Cout total: "+appareil.coutTotal());
		
		System.out.println("--------------------------------");
		System.out.println("Consulter le cout total d'appel d'un contact:");
		System.out.println("Cout: "+appareil.coutAppel(2));
	}

}
