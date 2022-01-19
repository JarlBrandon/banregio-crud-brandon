package com.example.demo.demoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.demoFacade.CategoriaFacade;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaFacade categoriaFacade;
	
	
	public List<Categoria> findAllCategories(){
		return categoriaFacade.findAllCategories();
	}
	
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaFacade.saveCategoria(categoria);
	}
	
	public void deleteCategoria(Integer id) {
		categoriaFacade.deleteCategoria(id);
	}
	
}
