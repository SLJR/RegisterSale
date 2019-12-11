package com.floreriamagnolia.magnolia.view.dto;

import java.sql.Date;

import com.floreriamagnolia.magnolia.model.Cliente;

public class PedidoDTO {
	
	
	
	private Long idPedido;
	private String direcionPedido;
	private String descripcionPedido;
//	private String diaPedido;
//	private String mesPedido;
	private String horaPedido;
	private Date fechaEntraga;
	private String status;
	private Cliente idCliente;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
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
	public Cliente getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}
	

}
