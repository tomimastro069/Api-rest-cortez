package com.utn.productos.api.Exception;

public class StockInsuficienteException extends RuntimeException {

    public StockInsuficienteException(String mensaje) {
        super(mensaje);
    }

    public StockInsuficienteException(Long id, Integer stockActual, Integer stockSolicitado) {
        super(String.format("Stock insuficiente para el producto ID %d. Stock actual: %d, solicitado: %d",
                id, stockActual, stockSolicitado));
    }
}