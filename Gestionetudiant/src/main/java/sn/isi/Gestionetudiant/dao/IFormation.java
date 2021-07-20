package sn.isi.Gestionetudiant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.isi.Gestionetudiant.entities.Formation;

@Repository
public interface IFormation extends JpaRepository<Formation, Integer> {

}
