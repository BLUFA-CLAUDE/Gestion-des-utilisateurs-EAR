package sn.isi.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import sn.isi.entities.Categorie;
import sn.isi.entities.Client;
import sn.isi.entities.Commande;
import sn.isi.entities.LigneCommande;
import sn.isi.entities.Panier;
import sn.isi.entities.Produit;
import sn.isi.entities.Role;
import sn.isi.entities.User;
import sn.isi.util.JPAUtil;

public class BoutiqueImpl implements IBoutique {
	
	private EntityManager em;

	private EntityManager entityManager = JPAUtil.getEntityManager("COYAHBoutique");
	@Override
	public Produit addProduit(Produit p, int idC) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		p.getIdProduit();
		p.setCategorie(getCategorie(idC));
		entityManager.persist(p);
		tx.commit();
		return p;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> listProduit() {
		List<Produit> prods = 
				entityManager.createQuery("select p from Produit p").getResultList();
		return prods;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> listProduitParmc(String mc) {
		List<Produit> prods = 
				entityManager.createQuery("select p from Produit p where p.designation like :mc").setParameter("mc", "%"+mc+"%").getResultList();
		return prods;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> listProduitSeletionner() {
		List<Produit> prods = 
				entityManager.createQuery("select p from Produit p where  p.selected = true").getResultList();
		return prods;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Produit> listProduitParcategorie(int idCat) {
		Query q = em.createQuery("select p from Produit p where  p.idCategorie = :x");
		  q.setParameter("x", idCat);
		return q.getResultList();
	}

	@Override
	public Produit getProduit(int id) {
		return entityManager.find(Produit.class, id);
	}

	@Override
	public void deleteProduit(int id) {
		if(getProduit(id) !=null) {
			Produit produit = entityManager.find(Produit.class, id);
			entityManager.getTransaction().begin();
			entityManager.remove(produit);
			entityManager.getTransaction().commit();
		}
		
	}

	@Override
	public Produit updateProduit(Produit p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();
		return p;
	}

	@Override
	public Categorie addCategorie(Categorie c) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(c);
		tx.commit();
		return c;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categorie> listCategorie() {
		List<Categorie> categories =
		entityManager.createQuery("select c from Categorie c").getResultList();
		return categories;
	}

	@Override
	public Categorie getCategorie(int idC) {
		
		return entityManager.find(Categorie.class, idC);
	}

	@Override
	public void deleteCategorie(int idC) {
		if(getCategorie(idC) !=null) {
			Categorie categorie = entityManager.find(Categorie.class, idC);
			entityManager.getTransaction().begin();
			entityManager.remove(categorie);
			entityManager.getTransaction().commit();
		}
		
	}

	@Override
	public Categorie updateCategorie(Categorie c) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(c);
		tx.commit();
		return c;
	}

	@Override
	public void addUser(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attribuerRole(User u, Role r) {
		Role role = entityManager.find(Role.class, r.getIdRole());
		if(role !=null) {
			entityManager.persist(r);
			u.getRoles().add(r);
			entityManager.persist(u);
		}
		
	}

	@Override
	public Commande enregistrerCommande(Panier p, Client c) {
		entityManager.persist(c);
		Commande co = new Commande();
		co.setClient(c);
		co.setLignes(p.getCommandes());
		co.setDateCommande(new Date());
		for(LigneCommande lc: p.getCommandes())
			entityManager.persist(lc);
		entityManager.persist(co);
		return co;
	}

}
