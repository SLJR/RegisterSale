package com.floreriamagnolia.magnolia.business.service;

import java.sql.Date;
import java.util.List;

import com.floreriamagnolia.magnolia.model.Pedido;
import com.floreriamagnolia.magnolia.view.dto.PedidoDTO;

public interface IPedidoService {
	
	public Pedido createPedido(PedidoDTO pedidoaDto);
	public Pedido updatePedido(Long idPedido, PedidoDTO pedidoDto);
	public void deletePedido(Long idPedido);
	public Pedido findByIdPedido(Long idPedido);
	public Pedido findByFechaEntraga(Date fechaEntraga);
	public List<Pedido> findAll();
	
	

}
