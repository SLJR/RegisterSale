package com.floreriamagnolia.magnolia.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="idPedido")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPedido;
	@Column(name="direcionPedido")
	private String direcionPedido;
	@Column(name="descripcionPedido")
	private String descripcionPedido;
//	private String diaPedido;
//	private String mesPedido;
	@Column(name="horaPedido")
	private String horaPedido;
	@Temporal(TemporalType.DATE)
	@Column(name="fechaEntraga")
	private Date fechaEntraga;
	@Column(name="status")
	private String status;
	//@Column(name="idCliente")
	//@ManyToOne(targetEntity = Cliente.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	//@JoinColumn(name="idCliente")
	@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;
	
	
	public Long getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	


}
