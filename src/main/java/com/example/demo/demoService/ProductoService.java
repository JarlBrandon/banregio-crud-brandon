package com.example.demo.demoService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.demoFacade.CategoriaFacade;
import com.example.demo.demoFacade.ProductoFacade;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoFacade productoFacade;
	
	
	public List<Producto> findAllProducts(){
		return productoFacade.findAllProducts();
	}
	
	public Producto saveProducto(Producto producto) {
		return productoFacade.saveProducto(producto);
	}
	
	public void deleteProducto(Integer id) {
		productoFacade.deleteProducto(id);
	}

	public Optional<Producto> findById(Integer id) {
		return productoFacade.findById(id);
	}
	
	
}
