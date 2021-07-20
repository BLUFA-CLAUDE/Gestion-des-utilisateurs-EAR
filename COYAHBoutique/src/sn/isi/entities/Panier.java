package sn.isi.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "panier")
public class Panier implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPanier;
	private Map<Integer, LigneCommande> items = new HashMap<Integer, LigneCommande>();
	
	public void addArticle(Produit p, int quantite) {
		if(items.get(p.getIdProduit()) !=null) {
			items.get(p.getIdProduit()).setQuantite(quantite + items.get(p.getIdProduit()).getQuantite());
		}else {
			LigneCommande ligneCommande = new LigneCommande();
			ligneCommande.setProduit(p);
			ligneCommande.setQuantite(quantite);
			ligneCommande.setPrix(p.getPrix());
		}
	}
	
	public Collection<LigneCommande> getCommandes(){
		return items.values();
	}
	
	public double getTota() {
		double total =0;
		for(LigneCommande l: items.values()) {
			total += l.getPrix()*l.getQuantite();
		}
		return total;
	}
	
	public int getSize() {
		return items.size();
	}
	
	public void deleteProduit(int idPrduit) {
		items.remove(idPrduit);
	}
	
}
