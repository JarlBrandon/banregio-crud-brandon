package com.example.demo.demoController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demoService.ProductoService;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	
	@CrossOrigin
	@ApiOperation(value="Consulta de todos los productos.",notes="Regresa la lista de todos los"
			+ "productos que existen en el sistema.")
	@GetMapping
	@ResponseBody
	public List<Producto> findAllProductos(){
		return productoService.findAllProducts();
	}
		
	@CrossOrigin
	@ApiOperation(value="Guarda un nuevo producto.",notes="Guarda un producto y guardalo en la"
			+ "lista para poder consultarlo despues o hacer uso de el.")
	@PostMapping
	public Producto saveProducto(@RequestBody Producto producto){
		return productoService.saveProducto(producto);
	}
	
	@CrossOrigin
	@ApiOperation(value="Actualizar valores de un producto",notes="Actualiza los valores de un"
			+ "producto existente.")
	@PutMapping("/")
	public Producto updateProducto(@RequestBody Producto producto){
		return productoService.saveProducto(producto);
	}
	
	@CrossOrigin
	@ApiOperation(value="Eliminar producto",notes="Busca por id un producto y si existe, este"
			+ "sera eliminado de la base de datos.")
	@DeleteMapping(value = "/{id}")
	public void deleteProducto(@PathVariable("id")int id) {
		productoService.deleteProducto(id);
	}
}
