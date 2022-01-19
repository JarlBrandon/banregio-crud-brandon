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

import com.example.demo.demoService.CategoriaService;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Producto;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	CategoriaService categoriaService;
	
	@CrossOrigin
	@ApiOperation(value="Consulta de todas las categorias.",notes="Regresa la lista de todas las"
			+ "categorias que existen en el sistema.")
	@GetMapping("/")
	@ResponseBody
	public List<Categoria> findAllCategorias(){
		return categoriaService.findAllCategories();
	}
	
	@CrossOrigin
	@ApiOperation(value="Guarda una nueva categoria.",notes="Guarda una categoria y guardala en la"
			+ "lista para poder consultarla despues o hacer uso de ella.")
	@PostMapping("/")
	public Categoria saveCategoria(@RequestBody Categoria categoria){
		return categoriaService.saveCategoria(categoria);
	}
	
	@CrossOrigin
	@ApiOperation(value="Actualizar valores de una categoria.",notes="Actualiza los valores de una"
			+ "categoria existente.")
	@PutMapping("/")
	public Categoria updateCategoria(@RequestBody Categoria categoria){
		return categoriaService.saveCategoria(categoria);
	}
	
	@CrossOrigin
	@ApiOperation(value="Eliminar categoria",notes="Busca por id una categoria y si existe, esta"
			+ "sera eliminada de la base de datos.")
	@DeleteMapping(value = "/{id}")
	public void deleteCategoria(@PathVariable("id")int id) {
		categoriaService.deleteCategoria(id);
	}
	
}
