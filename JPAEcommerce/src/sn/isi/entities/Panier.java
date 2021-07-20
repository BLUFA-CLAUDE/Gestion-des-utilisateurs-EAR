package sn.isi.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "panier")
public class Panier implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idP;
	@OneToMany(mappedBy = "panier")
	private Map<Integer, LignePanier> items = new HashMap<Integer, LignePanier>();
	
	public void addArticle(Article a, int quantite) {
		if(items.get(a.getIdA()) !=null) {
			items.get(a.getIdA()).setQuantite(quantite + items.get(a.getIdA()).getQuantite());
		}else {
			LignePanier lignePanier = new LignePanier();
			lignePanier.setArticle(a);
			lignePanier.setQuantite(quantite);
			lignePanier.setPrix(a.getPrix());
		}
	}
	
	public Collection<LignePanier> getCommande(){
		return items.values();
	}
	
	public double getTotal() {
		double total =0;
		for(LignePanier p: items.values()) {
			total += p.getPrix()*p.getQuantite();
		}
		return total;
	}
	
	public int getSize() {
		return items.size();
	}
	
	public void deleteArticle(int id) {
		items.remove(id);
	}
	
}
