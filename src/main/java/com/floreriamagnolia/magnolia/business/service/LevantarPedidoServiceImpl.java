package com.floreriamagnolia.magnolia.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floreriamagnolia.magnolia.business.repository.IClienteRepository;
import com.floreriamagnolia.magnolia.business.repository.IPedidoRepository;
import com.floreriamagnolia.magnolia.model.Cliente;
import com.floreriamagnolia.magnolia.model.LevantarPedido;
import com.floreriamagnolia.magnolia.model.Pedido;
import com.floreriamagnolia.magnolia.view.dto.LevantarPedidoDTO;

@Service
public class LevantarPedidoServiceImpl implements ILevantarPedidoService {

	
	@Autowired
	private IClienteRepository clienteRepo;
	
	@Autowired
	private IPedidoRepository pedidoRepo;
	
	
	@Override
	public void crearLevantarPedido(LevantarPedidoDTO levantarPedidoDTO) {

		Pedido pedido = new Pedido();
		Cliente cliente= new Cliente();
		cliente.setNombreCli(levantarPedidoDTO.getNombreCli());
		cliente.setApellidoCli(levantarPedidoDTO.getApellidoCli());
		cliente.setDireccionCli(levantarPedidoDTO.getDireccionCli());
		cliente.setCorreoCli(levantarPedidoDTO.getCorreoCli());
		cliente.setTelefonoCli(levantarPedidoDTO.getTelefonoCli());
		pedido.setDirecionPedido(levantarPedidoDTO.getDirecionPedido());
		pedido.setDescripcionPedido(levantarPedidoDTO.getDescripcionPedido());
		pedido.setHoraPedido(levantarPedidoDTO.getHoraPedido());
		pedido.setFechaEntraga(levantarPedidoDTO.getFechaEntraga());
		pedido.setCliente(cliente);
		this.clienteRepo.save(cliente);
		this.pedidoRepo.save(pedido);
		
		
	}	
	
	@Override
	public List<LevantarPedido> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
