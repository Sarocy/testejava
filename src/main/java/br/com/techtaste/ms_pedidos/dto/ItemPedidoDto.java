package br.com.techtaste.ms_pedidos.dto;

import java.math.BigDecimal;

public record ItemPedidoDto(String descricao, BigDecimal valorUnitario, Integer quantidade) {
}
