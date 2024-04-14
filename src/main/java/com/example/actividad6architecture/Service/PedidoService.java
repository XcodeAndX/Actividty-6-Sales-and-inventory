package com.example.actividad6architecture.Service;

import com.example.actividad6architecture.Controller.PedidoNotFoundException;
import com.example.actividad6architecture.Entity.Pedido;
import com.example.actividad6architecture.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> obtenerTodosLosPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido obtenerPedidoPorId(Long id) {
        return pedidoRepository.findById(id)
                .orElseThrow(() -> new PedidoNotFoundException("Pedido no encontrado"));
    }

    public Pedido crearPedido(Pedido pedido) {
        // Aquí podrías agregar lógica adicional, como calcular el total del pedido
        pedido.setFecha(LocalDateTime.now());
        return pedidoRepository.save(pedido);
    }

    public void eliminarPedido(Long id) {
        Pedido pedido = obtenerPedidoPorId(id);
        pedidoRepository.delete(pedido);
    }

    // Otros métodos para actualizar el pedido, agregar productos al pedido, etc.
}
