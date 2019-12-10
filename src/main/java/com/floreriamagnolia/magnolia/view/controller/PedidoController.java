package com.floreriamagnolia.magnolia.view.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

import com.floreriamagnolia.magnolia.business.service.IPedidoService;
import com.floreriamagnolia.magnolia.model.Pedido;
import com.floreriamagnolia.magnolia.view.dto.PedidoDTO;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
	
    private static final Logger LOGGER = Logger.getLogger(PedidoController.class.getName());

	@Autowired
	private IPedidoService pedidoService;

	@PostMapping
	public ResponseEntity<Pedido> crearPedido(@RequestBody PedidoDTO pedidoDto){
		
		try {
			return new ResponseEntity<Pedido>(this.pedidoService.createPedido(pedidoDto),HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info("NO SE HA CREADO EL PEDIDO....");
			return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update/{idPedido}")
	public ResponseEntity<Pedido> updatePedido(@PathVariable("idPedido")Long idPedido,@RequestBody PedidoDTO pedidoDto){
		
		try {
			pedidoDto.setIdPedido(idPedido);
			return new ResponseEntity<Pedido>(this.pedidoService.findByIdPedido(idPedido),HttpStatus.OK);
			
		}catch (Exception e) {

			LOGGER.info("ERROR: "+ e);
			return new ResponseEntity<Pedido>(HttpStatus.NOT_FOUND);
		}
	
	}

	@DeleteMapping("/delete/{idPedido}")
	public void deletePedido(@PathVariable("idPedido")Long idPedido){
		Pedido pedido = new Pedido();
		pedido = this.pedidoService.findByIdPedido(idPedido);
		
		if(pedido != null) {
			this.pedidoService.deletePedido(idPedido);
		}
	}
	
	
	@GetMapping
	public ResponseEntity<List<Pedido>> findAll(){
		LOGGER.info("Tamaño: "+ResponseEntity.ok(this.pedidoService.encotrarPedidos().size()));
		return ResponseEntity.ok(this.pedidoService.encotrarPedidos());
	}

	
}
