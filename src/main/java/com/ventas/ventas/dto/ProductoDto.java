package com.ventas.ventas.dto;

import com.ventas.ventas.entity.DetalleVenta;
import com.ventas.ventas.entity.Proveedor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

@Data
public class ProductoDto {
    private String ean;
    private int cantidad;
    @NotBlank
    private String nombre;
    private String fecha;
    @Min(0)
    private Float precio;
    private int idProveedor;
    private List<DetalleVenta> detalleVentas;
}