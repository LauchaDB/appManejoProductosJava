package com.appManejoProductos.producto.service;

import com.appManejoProductos.producto.model.Producto;
import com.appManejoProductos.producto.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImp implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public void save(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public void delete(Producto producto) {
        productoRepository.delete(producto);
    }

    @Override
    public void deleteConId(int id) {
        productoRepository.deleteById(id);
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public List<Producto> findAllByEmailUser(String email) {
        return null;
    }

    @Override
    public Producto findAllById(int id) {
        Optional<Producto> optionalProducto = productoRepository.findById(id);
        return optionalProducto.isEmpty() ? null : optionalProducto.get();
    }

    @Override
    public void edit(Producto producto) {
        //productoRepository.editProducto(producto);
    }
}
