package sn.isi.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import sn.isi.entities.Fonction;

@Stateless
public class FonctionImpl implements IFonction {

	@PersistenceContext(unitName = "userEJB")
	private EntityManager em;
	
	
	@Override
	public int add(Fonction f) {
		try {
			em.persist(f);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(int id) {
		try {
			em.remove(em.find(Fonction.class, id));
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int update(Fonction f) {
		try {
			em.merge(f);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Fonction getFonction(int id) {
		
		return em.find(Fonction.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Fonction> lister() {
		try {
			return em.createQuery("select f from Fonction f").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
