package com.abraham.sistema.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Perfil generated by hbm2java
 */
@Entity
@Table(name = "perfil", schema = "public")
public class Perfil implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idperfil;
	private String perfil;
	private Boolean activo;
	private Set<Ejerce> ejerces = new HashSet<Ejerce>(0);

	public Perfil() {
	}

	public Perfil(int idperfil) {
		this.idperfil = idperfil;
	}

	public Perfil(int idperfil, String perfil, Boolean activo, Set<Ejerce> ejerces) {
		this.idperfil = idperfil;
		this.perfil = perfil;
		this.activo = activo;
		this.ejerces = ejerces;
	}

	@Id

	@Column(name = "idperfil", unique = true, nullable = false)
	public int getIdperfil() {
		return this.idperfil;
	}

	public void setIdperfil(int idperfil) {
		this.idperfil = idperfil;
	}

	@Column(name = "perfil", length = 25)
	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	@Column(name = "activo")
	public Boolean getActivo() {
		return this.activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perfil")
	public Set<Ejerce> getEjerces() {
		return this.ejerces;
	}

	public void setEjerces(Set<Ejerce> ejerces) {
		this.ejerces = ejerces;
	}

}