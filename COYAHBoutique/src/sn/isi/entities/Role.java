package sn.isi.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRole;
	@Column(length = 100)
	private String nomRole;
	
	
	public Role()
	{
		super();
	}

	public Role(String nomRole) {
		super();
		this.nomRole = nomRole;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNomRole() {
		return nomRole;
	}

	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}
	
	
}
