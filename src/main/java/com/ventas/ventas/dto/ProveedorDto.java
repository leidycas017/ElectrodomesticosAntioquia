package com.ventas.ventas.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ventas.ventas.entity.Producto;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class ProveedorDto {

    private String numeroDocumento;

    private String nombre;

    private String correo;

    private String tipoProducto;

    private List<Producto> productos;
}
