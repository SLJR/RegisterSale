package com.floreriamagnolia.magnolia.business.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.floreriamagnolia.magnolia.business.repository.IClienteRepository;
import com.floreriamagnolia.magnolia.model.Cliente;
import com.floreriamagnolia.magnolia.view.dto.ClienteDTO;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository repository;

	
	@Transactional
	@Override
	public Cliente crearCliente(ClienteDTO clienteDto) {

		Cliente cliente= new Cliente();
		
		cliente.setNombreCli(clienteDto.getNombreCli());
		cliente.setApellidoCli(clienteDto.getApellidoCli());
		cliente.setDireccionCli(clienteDto.getDireccionCli());
		cliente.setCorreoCli(clienteDto.getCorreoCli());
		cliente.setTelefonoCli(clienteDto.getTelefonoCli());
		
		return this.repository.save(cliente);
	}
	
	
	@Transactional
	@Override
	public Cliente updateCliente(ClienteDTO clienteDto) {

		Cliente cliente = this.repository.findByIdCliente(clienteDto.getIdCliente());
			cliente.setNombreCli(clienteDto.getNombreCli());
			cliente.setApellidoCli(clienteDto.getApellidoCli());
			cliente.setDireccionCli(clienteDto.getDireccionCli());
			cliente.setCorreoCli(clienteDto.getCorreoCli());
			cliente.setTelefonoCli(cliente.getTelefonoCli());
			return this.repository.save(cliente);
	
	}


	@Transactional
	@Override
	public void delete(Long idCliente) {
		Cliente cliente = this.repository.findByIdCliente(idCliente);
		if(cliente  != null) {
			this.repository.delete(cliente);
		}
	}
	
	@Transactional(readOnly = true)
	@Override
	public Cliente findByIdCliente(Long idCliente) {
		return this.repository.findByIdCliente(idCliente);
	}

	
	@Transactional(readOnly = true)
	@Override
	public List<Cliente> findAll() {
		return this.repository.findAll();
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente findByNombreCli(String nombreCli) {
		return this.repository.findByNombreCli(nombreCli);
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente findByApellidoCli(String apellidoCli) {
		return this.repository.findByApellidoCli(apellidoCli);
	}

	@Transactional(readOnly = true)
	@Override
	public Cliente findByCorreoCli(String correo) {
		return this.repository.findByCorreoCli(correo);
	}
	
}
