package com.floreriamagnolia.magnolia.view.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.floreriamagnolia.magnolia.business.service.IClienteService;
import com.floreriamagnolia.magnolia.model.Cliente;
import com.floreriamagnolia.magnolia.view.dto.ClienteDTO;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private static final Logger LOGGER = Logger.getLogger(ClienteController.class.getName());

	@Autowired
	private IClienteService clienteService;
	
	@PostMapping
	public ResponseEntity<Cliente> crearCliente(@RequestBody ClienteDTO clienteDto){
		
		try {	
			return new ResponseEntity<Cliente>(this.clienteService.crearCliente(clienteDto),HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.info("NO SE HA CREADO EL PEDIDO....");
			return new ResponseEntity<Cliente>(HttpStatus.INTERNAL_SERVER_ERROR);
		}	
	}
	
	@PutMapping("/{idCliente}")
	public ResponseEntity<Cliente> updateCliente(@PathParam("idCliente") Long idCliente,@RequestBody ClienteDTO clienteDto){
		
		try {
			clienteDto.setIdCliente(idCliente);
				return new ResponseEntity<Cliente>(this.clienteService.updateCliente(clienteDto),HttpStatus.OK);
		
		} catch (Exception e) {
			LOGGER.info("Error: " + e);
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
			
		}		
	}
	
	@DeleteMapping("/{idCiiente}")
	public void deleteCliente(@PathParam("idCiiente")Long idCliente) {
		this.clienteService.delete(idCliente);
	}

	
	@GetMapping
	public ResponseEntity<List<Cliente>> findAll(){
		return ResponseEntity.ok(this.clienteService.findAll());

	}
	
	@GetMapping("apellido/{apellidoCli}")
	public ResponseEntity<Cliente> findApellidoCli(@PathParam("apellidoCli")String apellidoCli) {
		return  ResponseEntity.ok(this.clienteService.findByApellidoCli(apellidoCli));
		
	}
	
	
}
