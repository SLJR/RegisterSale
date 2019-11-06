package com.floreriamagnolia.magnolia.model;

import java.sql.Date;

public class LevantarPedido {
	
	private Long idCliente;
	private String nombreCli;
	private String apellidoCli;
	private String direccionCli;
	private String telefonoCli;
	private String correoCli;
	private Long idPedido;
	private String direcionPedido;
	private String descripcionPedido;
//	private String diaPedido;
//	private String mesPedido;
	private String horaPedido;
	private Date fechaEntraga;
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
	public String getDirecionPedido() {
		return direcionPedido;
	}
	public void setDirecionPedido(String direcionPedido) {
		this.direcionPedido = direcionPedido;
	}
	public String getDescripcionPedido() {
		return descripcionPedido;
	}
	public void setDescripcionPedido(String descripcionPedido) {
		this.descripcionPedido = descripcionPedido;
	}
	public String getHoraPedido() {
		return horaPedido;
	}
	public void setHoraPedido(String horaPedido) {
		this.horaPedido = horaPedido;
	}
	public Date getFechaEntraga() {
		return fechaEntraga;
	}
	public void setFechaEntraga(Date fechaEntraga) {
		this.fechaEntraga = fechaEntraga;
	}
	public Long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidoCli == null) ? 0 : apellidoCli.hashCode());
		result = prime * result + ((correoCli == null) ? 0 : correoCli.hashCode());
		result = prime * result + ((descripcionPedido == null) ? 0 : descripcionPedido.hashCode());
		result = prime * result + ((direccionCli == null) ? 0 : direccionCli.hashCode());
		result = prime * result + ((direcionPedido == null) ? 0 : direcionPedido.hashCode());
		result = prime * result + ((fechaEntraga == null) ? 0 : fechaEntraga.hashCode());
		result = prime * result + ((horaPedido == null) ? 0 : horaPedido.hashCode());
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		result = prime * result + ((idPedido == null) ? 0 : idPedido.hashCode());
		result = prime * result + ((nombreCli == null) ? 0 : nombreCli.hashCode());
		result = prime * result + ((telefonoCli == null) ? 0 : telefonoCli.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LevantarPedido other = (LevantarPedido) obj;
		if (apellidoCli == null) {
			if (other.apellidoCli != null)
				return false;
		} else if (!apellidoCli.equals(other.apellidoCli))
			return false;
		if (correoCli == null) {
			if (other.correoCli != null)
				return false;
		} else if (!correoCli.equals(other.correoCli))
			return false;
		if (descripcionPedido == null) {
			if (other.descripcionPedido != null)
				return false;
		} else if (!descripcionPedido.equals(other.descripcionPedido))
			return false;
		if (direccionCli == null) {
			if (other.direccionCli != null)
				return false;
		} else if (!direccionCli.equals(other.direccionCli))
			return false;
		if (direcionPedido == null) {
			if (other.direcionPedido != null)
				return false;
		} else if (!direcionPedido.equals(other.direcionPedido))
			return false;
		if (fechaEntraga == null) {
			if (other.fechaEntraga != null)
				return false;
		} else if (!fechaEntraga.equals(other.fechaEntraga))
			return false;
		if (horaPedido == null) {
			if (other.horaPedido != null)
				return false;
		} else if (!horaPedido.equals(other.horaPedido))
			return false;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		if (idPedido == null) {
			if (other.idPedido != null)
				return false;
		} else if (!idPedido.equals(other.idPedido))
			return false;
		if (nombreCli == null) {
			if (other.nombreCli != null)
				return false;
		} else if (!nombreCli.equals(other.nombreCli))
			return false;
		if (telefonoCli == null) {
			if (other.telefonoCli != null)
				return false;
		} else if (!telefonoCli.equals(other.telefonoCli))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "LevantarPedido [idCliente=" + idCliente + ", nombreCli=" + nombreCli + ", apellidoCli=" + apellidoCli
				+ ", direccionCli=" + direccionCli + ", telefonoCli=" + telefonoCli + ", correoCli=" + correoCli
				+ ", idPedido=" + idPedido + ", direcionPedido=" + direcionPedido + ", descripcionPedido="
				+ descripcionPedido + ", horaPedido=" + horaPedido + ", fechaEntraga=" + fechaEntraga + "]";
	}
}
