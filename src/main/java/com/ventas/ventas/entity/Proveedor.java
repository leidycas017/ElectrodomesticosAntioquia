package com.ventas.ventas.entity;

import com.fasterxml.jackson.annotation.*;
import com.ventas.ventas.dto.ProductoDto;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="proveedor")
public class Proveedor implements Serializable {

    @Id
    @Column(name = "idproveedor")
    private int idProveedor;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;


    @Column(name = "tipo_producto")
    private String tipoProducto;
    @JsonBackReference
    @OneToMany(mappedBy = "proveedor", cascade={CascadeType.ALL})
    private List<Producto> productos;


}
