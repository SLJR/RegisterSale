package com.floreriamagnolia.magnolia.business.service;

import java.util.List;

import com.floreriamagnolia.magnolia.model.Cliente;
import com.floreriamagnolia.magnolia.view.dto.ClienteDTO;

public interface IClienteService {
		
	public void delete(Long idCliente);
	public Cliente findByIdCliente(Long idCliente);
	public Cliente updateCliente(ClienteDTO clienteDto);
	public Cliente crearCliente(ClienteDTO clienteDto);
	public List<Cliente> findAll();
	public Cliente findByNombreCli(String nombreCli);
	public Cliente findByApellidoCli(String apellidoCli);
	public Cliente findByCorreoCli(String correo);
	
	
}
