package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Categoria;


public interface CategoriaRepository extends CrudRepository<Categoria,Integer>{
	//public List<Categoria> busquedaCategorias(@Param("Cat_Nombre") String Cat_Nombre);
}

