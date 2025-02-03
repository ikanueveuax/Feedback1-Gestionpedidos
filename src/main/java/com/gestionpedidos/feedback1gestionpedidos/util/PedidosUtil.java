package com.gestionpedidos.feedback1gestionpedidos.util;

import com.gestionpedidos.feedback1gestionpedidos.model.DetallePedido;
import java.math.BigDecimal;
import java.util.List;

public final class PedidosUtil {

    // Constructor privado para evitar instanciación
    private PedidosUtil() {
    }

    /**
     * Calcula el total de un pedido sumando el subtotal de cada uno de sus detalles.
     *
     * @param detalles Lista de detalles del pedido.
     * @return Total del pedido. Si la lista es nula o vacía, retorna BigDecimal.ZERO.
     */
    public static BigDecimal calcularTotalPedido(List<DetallePedido> detalles) {
        if (detalles == null || detalles.isEmpty()) {
            return BigDecimal.ZERO;
        }
        return detalles.stream()
                .map(DetallePedido::getSubtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    // Se pueden agregar otros métodos utilitarios, por ejemplo, validaciones o formateos.
}
