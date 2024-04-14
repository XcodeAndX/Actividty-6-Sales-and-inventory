package com.example.actividad6architecture.Repository;

import com.example.actividad6architecture.Entity.Cliente;
import com.example.actividad6architecture.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    // Método para buscar pedidos por cliente
    List<Pedido> findByCliente(Cliente cliente);

    // Método para buscar pedidos por fecha
    List<Pedido> findByFecha(LocalDate fecha);

    // Método para buscar pedidos por cliente y fecha
    List<Pedido> findByClienteAndFecha(Cliente cliente, LocalDate fecha);
}
