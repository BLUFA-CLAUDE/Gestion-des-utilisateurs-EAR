package sn.isi.Gestionetudiant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.isi.Gestionetudiant.entities.Lieu;

@Repository
public interface ILieu extends JpaRepository<Lieu, Integer> {

}
