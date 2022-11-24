package com.appManejoProductos.producto.service;

import com.appManejoProductos.producto.model.Producto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductoService {

     void save(Producto materia);
     void delete(Producto materia);
     void deleteConId(int id);
     List<Producto> findAll();
     List<Producto> findAllByEmailUser(String email);
     Producto findAllById(int id);

}
