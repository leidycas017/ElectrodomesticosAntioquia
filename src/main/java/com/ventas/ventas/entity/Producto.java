package com.ventas.ventas.entity;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name="producto")
public class Producto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idproducto")
    private int id;
    @Column(name="ean")
    private String ean;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="descripcion_producto")
    private String nombre;
    @Column(name="fecha_ingreso_producto")
    private String fecha;
    @Column(name="valor_venta")
    private float precio;

    @JsonManagedReference
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "idproveedor")
    private Proveedor proveedor;
    @OneToMany(mappedBy = "producto", cascade={CascadeType.ALL})
    private List<DetalleVenta> detalleVentas;
}