package sn.isi.Gestionetudiant;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import sn.isi.Gestionetudiant.dao.IRole;
import sn.isi.Gestionetudiant.dao.IUser;
import sn.isi.Gestionetudiant.entities.Role;
import sn.isi.Gestionetudiant.entities.User;

@SpringBootApplication
public class GestionetudiantApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GestionetudiantApplication.class, args);
		
		IUser iuser = ctx.getBean(IUser.class);
		
		User user = new User();
		user.setNom("camara");
		user.setPrenom("Jean Claude");
		user.setEmail("jeccam38@gmail.com");
		user.setPassword("passer");
		user.setEtat(1);
		
		Role role = new Role();
		role.setNom("ROLE_USER");
		List<User> users = new ArrayList<User>();
		users.add(user);
		role.setUsers(users);
		
		IRole irole = ctx.getBean(IRole.class);
		try {
			irole.save(role);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		/*
		IUser iuser = ctx.getBean(IUser.class);
		
			User user = new User();
			user.setNom("camara");
			user.setPrenom("Jean Claude");
			user.setEmail("jeccam38@gmail.com");
			user.setPassword("passer");
			user.setEtat(1);
		try {
			iuser.save(user);
			System.out.println("ok");
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
	}

}
