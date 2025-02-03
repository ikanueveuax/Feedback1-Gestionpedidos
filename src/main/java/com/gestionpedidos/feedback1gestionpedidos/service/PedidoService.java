package com.gestionpedidos.feedback1gestionpedidos.service;

import com.gestionpedidos.feedback1gestionpedidos.exception.PedidoException;
import com.gestionpedidos.feedback1gestionpedidos.model.Pedido;
import com.gestionpedidos.feedback1gestionpedidos.repository.PedidoRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> obtenerTodos() {
        return pedidoRepository.findAll();
    }

    @SneakyThrows
    @Transactional
    public Pedido crearPedido(Pedido pedido) {
        try {
            // Your code that might throw PedidoException
            if (pedido == null) {
                throw new PedidoException("An error occurred");
            }
        } catch (PedidoException e) {
            // Handle the exception
            e.printStackTrace();
        }        return pedidoRepository.save(pedido);
    }
}