
package com.ventas.ventas.service;

import com.ventas.ventas.entity.Producto;
import com.ventas.ventas.entity.Proveedor;
import com.ventas.ventas.repository.ProveedorRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProveedorService {

    ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }

    public List<Proveedor> list(){
        return proveedorRepository.findAll();
    }
   // public Optional<Proveedor> finById(int id){return proveedorRepository.findById(id);}

}

