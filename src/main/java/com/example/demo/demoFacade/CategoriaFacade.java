package com.example.demo.demoFacade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaRepository;

@Component
public class CategoriaFacade {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Transactional
	public List<Categoria> findAllCategories(){
		List<Categoria> todascategorias = (List<Categoria>) categoriaRepository.findAll();
		return todascategorias;
	}
	
	@Transactional
	public Categoria saveCategoria(Categoria categoria) {
		Categoria caProducto = categoriaRepository.save(categoria);
		return caProducto;
	}
	
	@Transactional
	public void deleteCategoria(Integer id) {
		categoriaRepository.deleteById(id);
	}
}
