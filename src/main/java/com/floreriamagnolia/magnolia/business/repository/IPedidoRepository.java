package com.floreriamagnolia.magnolia.business.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.floreriamagnolia.magnolia.model.Pedido;

@Repository
public interface IPedidoRepository extends JpaRepository<Pedido, Long>{
	
	public Pedido findByIdPedido(Long idPedido);
	public Pedido findByFechaEntraga(Date fechaEntraga);
	@Query(value="select * from pedido", nativeQuery = true)
	public List<Pedido> encotrarPedidos();

}
