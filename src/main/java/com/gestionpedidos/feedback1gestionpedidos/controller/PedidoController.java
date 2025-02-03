package com.gestionpedidos.feedback1gestionpedidos.controller;

import com.gestionpedidos.feedback1gestionpedidos.model.Pedido;
import com.gestionpedidos.feedback1gestionpedidos.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.obtenerTodos();
    }

    @PostMapping
    public Pedido crearPedido(@RequestBody Pedido pedido) {
        return pedidoService.crearPedido(pedido);
    }

    // Otros endpoints (actualización, eliminación, etc.)
}
