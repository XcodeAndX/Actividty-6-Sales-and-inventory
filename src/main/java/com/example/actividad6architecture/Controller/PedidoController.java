package com.example.actividad6architecture.Controller;

import com.example.actividad6architecture.Entity.Pedido;
import com.example.actividad6architecture.Repository.PedidoRepository;
import com.example.actividad6architecture.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/")
    public String mostrarPedidos(Model model) {
        List<Pedido> pedidos = pedidoService.obtenerTodosLosPedidos();
        model.addAttribute("pedidos", pedidos);
        return "pedidos/lista";
    }

    @GetMapping("/{id}")
    public String mostrarDetallePedido(@PathVariable Long id, Model model) {
        Pedido pedido = pedidoService.obtenerPedidoPorId(id);
        model.addAttribute("pedido", pedido);
        return "pedidos/detalle";
    }

    @PostMapping("/crear")
    public String crearPedido(@ModelAttribute("pedido") Pedido pedido) {
        pedidoService.crearPedido(pedido);
        return "redirect:/pedidos/";
    }

    @DeleteMapping("/{id}")
    public String eliminarPedido(@PathVariable Long id) {
        pedidoService.eliminarPedido(id);
        return "redirect:/pedidos/";
    }


}
