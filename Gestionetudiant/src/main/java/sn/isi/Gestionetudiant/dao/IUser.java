package sn.isi.Gestionetudiant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import sn.isi.Gestionetudiant.entities.User;

@Repository
public interface IUser extends JpaRepository<User, Integer> {

	//@Query(name = "SELECT u FROM User u WHERE u.email=:em AND u.password=:pass")
	//public User getUserByemailAndpassword(@Param("em") String email,@Param("pass") String password);
}
