package com.floreriamagnolia.magnolia.business.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floreriamagnolia.magnolia.model.Cliente;

@Repository
public interface IClienteRepository extends JpaRepository<Cliente, Long>{
	
	public Cliente findByNombreCli(String nombreCli);
	public Cliente findByApellidoCli(String apellidoCli);
	public Cliente findByCorreoCli(String correo);
	public Cliente findByIdCliente(Long idCliente);
	public List<Cliente> findAll();


	


}
