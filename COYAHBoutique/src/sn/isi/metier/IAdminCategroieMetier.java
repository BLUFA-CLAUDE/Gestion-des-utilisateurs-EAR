package sn.isi.metier;

import sn.isi.entities.Categorie;
import sn.isi.entities.Role;
import sn.isi.entities.User;

public interface IAdminCategroieMetier extends IAdminProduitMetier {

	public Categorie addCategorie(Categorie c);
	public Categorie updateCategorie(Categorie c);
	public void deleteCategorie(int idc);
	
	public void addUser(User u);
	public void attribueRole(User u, Role r);
}
