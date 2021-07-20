package sn.isi.Gestionetudiant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import sn.isi.Gestionetudiant.entities.Role;

@Repository
public interface IRole extends JpaRepository<Role, Integer> {

}
