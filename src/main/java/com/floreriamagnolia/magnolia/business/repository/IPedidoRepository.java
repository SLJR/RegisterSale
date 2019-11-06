package com.floreriamagnolia.magnolia.business.repository;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.floreriamagnolia.magnolia.model.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Long>{
	
	public Pedido findByIdPedido(Long idPedido);
	public Pedido findByFechaEntraga(Date fechaEntraga);

}
