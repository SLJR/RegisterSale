package com.floreriamagnolia.magnolia.model;


import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;


@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="idCliente")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCliente;
	@Column(name="nombreCli")
	private String nombreCli;
	@Column(name="apellidoCli")
	private String apellidoCli;
	@Column(name="direccionCli")
	private String direccionCli;
	@Column(name="telefonoCli")
	private String telefonoCli;
	@Column(name="correoCli")
	@Email
	private String correoCli;
	@OneToMany(mappedBy="cliente") 	
	 
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCli() {
		return nombreCli;
	}
	public void setNombreCli(String nombreCli) {
		this.nombreCli = nombreCli;
	}
	public String getApellidoCli() {
		return apellidoCli;
	}
	public void setApellidoCli(String apellidoCli) {
		this.apellidoCli = apellidoCli;
	}
	public String getDireccionCli() {
		return direccionCli;
	}
	public void setDireccionCli(String direccionCli) {
		this.direccionCli = direccionCli;
	}
	public String getTelefonoCli() {
		return telefonoCli;
	}
	public void setTelefonoCli(String telefonoCli) {
		this.telefonoCli = telefonoCli;
	}
	public String getCorreoCli() {
		return correoCli;
	}
	public void setCorreoCli(String correoCli) {
		this.correoCli = correoCli;
	}

	

}
