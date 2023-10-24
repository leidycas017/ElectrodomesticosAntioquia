package com.ventas.ventas.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    @Id
    @Column(name="id_empleado")
    private int id;

    @Column(name="nombre_usuario")
    private String nombreUsuario;

    @Column(name="clave")
    private String clave;

    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @MapsId
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
}
