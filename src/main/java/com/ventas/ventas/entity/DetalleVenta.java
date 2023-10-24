package com.ventas.ventas.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="detalleventa")
public class DetalleVenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddetalle")
    private int id;
    @Column(name="cantidad")
    private int cantidad;
    @Column(name="precio")
    private float precio;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "idproducto")
    private Producto producto;
    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name = "idventa")
    private Venta venta;

}
