package com.utn.productos.api.dto;

import com.utn.productos.api.model.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "DTO de respuesta con información completa del producto")
public class ProductoResponseDTO {

    @Schema(description = "ID único del producto", example = "1")
    private Long id;

    @Schema(description = "Nombre del producto", example = "Laptop Dell XPS 15")
    private String nombre;

    @Schema(description = "Descripción del producto", example = "Laptop de alto rendimiento")
    private String descripcion;

    @Schema(description = "Precio del producto", example = "1299.99")
    private Double precio;

    @Schema(description = "Stock disponible", example = "50")
    private Integer stock;

    @Schema(description = "Categoría del producto", example = "ELECTRONICA")
    private Categoria categoria;
}