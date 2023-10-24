package com.ventas.ventas.controller;

import com.ventas.ventas.entity.Producto;
import com.ventas.ventas.entity.Proveedor;
import com.ventas.ventas.service.ProveedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/proveedor")
@CrossOrigin(origins = "http://localhost:4200")
public class ProveedorController {

    ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping("/lista")
    public ResponseEntity<List<Proveedor>> list() {
        List<Proveedor> list = proveedorService.list();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }


}
