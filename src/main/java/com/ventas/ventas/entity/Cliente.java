package com.ventas.ventas.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name="cliente")
public class Cliente  implements Serializable {
    @Id
    @Column(name = "idcliente")
    private int idCliente;

    @Column(name = "numero_documento")
    private String numeroDocumento;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "correo")
    private String correo;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "cliente", cascade={CascadeType.ALL})
    private List<Venta> ventas;
}
