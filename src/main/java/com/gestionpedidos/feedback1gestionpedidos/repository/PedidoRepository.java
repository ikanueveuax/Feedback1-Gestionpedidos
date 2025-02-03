package com.gestionpedidos.feedback1gestionpedidos.repository;


import com.gestionpedidos.feedback1gestionpedidos.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // Métodos de consulta personalizados si son necesarios
}
