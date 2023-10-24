package com.ventas.ventas.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
    @Id
    @Column(name = "idempleado")
    private int idEmpleado;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @OneToOne(mappedBy="empleado")
    @PrimaryKeyJoinColumn
    private Usuario usuario;
}
