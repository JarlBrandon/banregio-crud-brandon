package com.example.demo.demoFacade;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;

@Component
public class ProductoFacade {
	@Autowired
	private ProductoRepository productoRepository;
	
	@Transactional
	public List<Producto> findAllProducts(){
		List<Producto> todosproductos = (List<Producto>) productoRepository.findAll();
		return todosproductos;
	}
	
	@Transactional
	public Producto saveProducto(Producto producto) {
		Producto productosave = productoRepository.save(producto);
		return productosave;
	}
	
	@Transactional
	public void deleteProducto(Integer id) {
		productoRepository.deleteById(id);
	}

	@Transactional
	public Optional<Producto> findById(Integer id) {
		Optional<Producto> productoPorId = productoRepository.findById(id);
		return productoPorId;
		
	}
}
