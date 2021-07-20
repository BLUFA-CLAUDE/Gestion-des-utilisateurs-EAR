package sn.isi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import sn.isi.entities.Produit;
import sn.isi.utils.JpaUtils;

public class ProduitImpl implements IProduit {
	private EntityManager entityManager = JpaUtils.getEntityManager("TP_JPA");

	@Override
	public Produit add(Produit p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(p);
		tx.commit();
		return p;
	}

	@Override
	public Produit update(Produit p) {
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.merge(p);
		tx.commit();
		return p;
	}

	@Override
	public void delete(int id) {
		Produit produit = entityManager.find(Produit.class, id);
		entityManager.getTransaction().begin();
		entityManager.remove(produit);
		entityManager.getTransaction().commit();
		
	}

	@Override
	public List<Produit> getProduitmc(String mc) {
		List<Produit> prods = 
				entityManager.createQuery("SELECT p FROM Produit p WHERE p.NOM like :mc").setParameter("mc", "%"+mc+"%").getResultList();
		return prods;
	}

	@Override
	public Produit getProduit(int id) {
		return entityManager.find(Produit.class, id);
	}

	
}
