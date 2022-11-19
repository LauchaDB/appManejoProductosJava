package com.appManejoProductos.producto.controller;

import com.appManejoProductos.producto.model.Producto;
import com.appManejoProductos.producto.service.ProductoServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private ProductoServiceImp productoServiceImp;

    @GetMapping("/findAll")
    public ArrayList<Producto> findAllProducto(){
        return (ArrayList<Producto>) productoServiceImp.findAll();
    }

    @GetMapping("/findAllById/{idProd}")
    public Producto findAllByIdProducto(@PathVariable int idProd){
        return productoServiceImp.findAllById(idProd);
    }

    @PostMapping("/edit")
    public void editProducto(@RequestBody Producto producto){
    }

    @PostMapping("/create")
    public void createProducto(@RequestBody Producto producto){
        try {
            productoServiceImp.save(producto);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @DeleteMapping("/delete/{idProd}")
    public void deleteProducto(@PathVariable int idProd){
        productoServiceImp.deleteConId(idProd);
    }
}
