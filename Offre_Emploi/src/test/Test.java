package test;

import java.util.ArrayList;
import java.util.List;

import sn.isi.dao.CandidatImpl;
import sn.isi.dao.DB;
import sn.isi.dao.ICandidat;
import sn.isi.dao.IRecruteur;
import sn.isi.dao.IUsers;
import sn.isi.dao.RecruteurImpl;
import sn.isi.dao.UsersImpl;
import sn.isi.entities.Candidat;
import sn.isi.entities.Recruteur;
import sn.isi.entities.Users;

public class Test {

	public static void main(String[] args) {
		
		//DB db = new DB();
		//db.getConnexion();
		/*
		ICandidat cadao = new CandidatImpl();
		Candidat ca = new Candidat();
		ca.setCandidat_prenom("claude");
		ca.setCandidat_nom("camara");
		ca.setCandidat_email("jeccam38@gmail.com");
		ca.setCandidat_pays("Senega");
		int resul = cadao.add(ca);
		
		Users user = new Users();
		user.setUser_nom("KABA");
		user.setUser_prenom("Mamady");
		user.setUser_email("madi2004@gmail.com");
		user.setUser_pass("passer");
		IUsers userdao = new UsersImpl();
		int po= userdao.add(user);
		List<Users> us = userdao.lister();
		for(Users u: us) {
			System.out.println(u.getUser_nom()+" "+u.getUser_prenom());
		}
		
		IRecruteur redao = new RecruteurImpl();
		Recruteur re = new Recruteur();
		re.setRecruteur_nom("Idriss SALL");
		re.setRecruteur_pass("passer");
		re.setRecruteur_passConfirme("passer");
		re.setType_structure("Association");
		re.setNom_structure("BLUFA");
		re.setPays_etablissement("senegal");
		re.setVille("Dakar");
		re.setAdresse_exact("Thiaroye sur mer");
		re.setDescription_structure("une association d'aide");
		re.setPhone_bureau("779085643");
		re.setEmail("jeccam38@gmail.com");
		re.setUrl_site("senjob.com");
		re.setPrenom("jean claude");
		re.setNom("Camara");
		re.setPhone_perso("776361783");
		re.setFonction("Gestionnaire");
		int rsultata= redao.add(re);
		
		//System.out.println(rsultata);
		IRecruteur redao = new RecruteurImpl();
		
		List<Recruteur> red= redao.lister();
		for(Recruteur recr: red) {
			System.out.println(recr.getRecruteur_nom()+" "+recr.getNom_structure());
		}
		*/
	
		IUsers userdao = new UsersImpl();
		System.out.println(userdao.UserExiste("jeccam38@gmail.com", "passer"));
	}

}
