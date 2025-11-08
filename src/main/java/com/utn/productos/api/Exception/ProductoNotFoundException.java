package com.utn.productos.api.Exception;

public class ProductoNotFoundException extends RuntimeException {

    public ProductoNotFoundException(Long id) {
        super("No se encontró el producto con ID: " + id);
    }

    public ProductoNotFoundException(String mensaje) {
        super(mensaje);
    }
}