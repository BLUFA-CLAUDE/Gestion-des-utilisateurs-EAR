package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Appareil implements IAppareil {

	private List<Contact> contacts = new ArrayList<Contact>();
	private Map<Integer, Appel> appels = new HashMap<Integer, Appel>();
	@Override
	public void enregistrer(Contact c) {
		contacts.add(c);
		
	}

	@Override
	public void enregistrer(Appel a, String numTel) {
		Contact c1= null;
		for(Contact c: contacts) {
			if(c.getNumeroTel().equals(numTel)) {
				c1=c;
				break;
			}
			a.setContact(c1);
			appels.put(a.getNumero(), a);
		}
		
	}

	@Override
	public Contact consulter(int numero) throws Exception {
		for(Contact c: contacts) {
			if(c.getNumero()==numero) {
				return c;
			}
		}
		throw new Exception("Contact "+numero+" Introuvable");
	}

	@Override
	public List<Contact> consulter(String mc) {
		List<Contact> cts = new ArrayList<Contact>();
		for(Contact c: contacts) {
			if(c.getNom().contains(mc)) {
				cts.add(c);
			}
		}
		return cts;
	}

	@Override
	public double coutTotal() {
		double total =0;
		for(Appel a: appels.values()) {
			total = total+a.cout();
		}
		return total;
	}

	@Override
	public double coutParDate(Date d1, Date d2) {
		double total =0;
		for(Appel a: appels.values()) {
			if((a.getDateAppel().getTime()>d1.getTime()) && (a.getDateAppel().getTime()<d2.getTime()))
			total = total+a.cout();
		}
		return total;
	}

	@Override
	public double coutAppel(int numeroContact) {
		double total =0;
		for(Appel a: appels.values()) {
			if(a.getContact().getNumero()==numeroContact)
			total = total+a.cout();
		}
		return total;
	}

}
