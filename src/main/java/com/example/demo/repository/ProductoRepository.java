package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface ProductoRepository extends CrudRepository<Producto,Integer>{
	//public List<Producto> busquedaProducto(@Param("Pro_Nombre") String Pro_Nombre);
}
