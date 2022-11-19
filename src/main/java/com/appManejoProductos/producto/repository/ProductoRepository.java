package com.appManejoProductos.producto.repository;

import com.appManejoProductos.producto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{

    //@Query(" UPDATE producto SET name_prod = ':name_prod', description_prod = ':description_prod', precio_prod = ':precio_prod' WHERE id_prod = 'id_prod';")
    //void edit(String name_prod, String descriptionProd, double precioProd, int id);

    //void editProducto(Producto producto);
}
