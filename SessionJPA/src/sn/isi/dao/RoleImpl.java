package sn.isi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import sn.isi.entities.Role;

public class RoleImpl implements IRole {

	private EntityManager em;
	
	public RoleImpl()
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("SessionJPA");
		em = emf.createEntityManager();
	}
	
	@Override
	public int add(Role r) {
		try {
			em.getTransaction().begin();
			em.persist(r);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int update(Role r) {
		try {
			em.getTransaction().begin();
			em.merge(r);
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	@Override
	public int delete(int id) {
		try {
			em.getTransaction().begin();
			em.remove(em.find(Role.class, id));
			em.getTransaction().commit();
			return 1;
		} catch (Exception e) {
			return 0;
		}
		
	}

	@Override
	public Role getUserById(int id) {
		
		return em.find(Role.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> lister() {
		try {
			return em.createQuery("SELECT r FROM Role r").getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
