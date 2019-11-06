package com.floreriamagnolia.magnolia.view.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floreriamagnolia.magnolia.business.service.ILevantarPedidoService;
import com.floreriamagnolia.magnolia.view.dto.LevantarPedidoDTO;

@RestController
@RequestMapping("/api/realizaPedido")

public class LevantarPedidoController {

	
    private static final Logger LOGGER = Logger.getLogger(PedidoController.class.getName());
	
	@Autowired
	private ILevantarPedidoService service;
	
	@PostMapping
	public boolean crearLevantarPedido(@RequestBody LevantarPedidoDTO levantarPedidoDTO) {
		
		try {
			this.service.crearLevantarPedido(levantarPedidoDTO);
			return true;
		} catch (Exception e) {
			LOGGER.info("ERROR: "+ e);
			LOGGER.info("NO SE HA CREADO EL PEDIDO....");
			return false ;
		}

	}

	
}
