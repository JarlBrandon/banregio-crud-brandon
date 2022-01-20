package com.example.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.demoController.ProductoController;
import com.example.demo.entity.Producto;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ProductoController productoController;
	
	@Test
	void contextLoads() {
		int a=1;
		int b=2;
		assertEquals(3, a+b);
	}
	
	@Test
	public void buscarProductos() {
		List<Producto> p;
		p = productoController.findAllProductos();
		assertNotNull(p);
	}
	
	@Test
	public void ingresarProducto() {
		Producto aux=new Producto();
		aux.setPro_IdProd(6);
		aux.setPro_Nombre("manguera por metro");
		aux.setPro_Precio(669.50);
		aux.setPro_Descri("manguera verde para agua");
		productoController.saveProducto(aux);
		assertEquals(aux.getPro_IdProd(), productoController.findById(6).get().getPro_IdProd());
		assertEquals(aux.getPro_Nombre(), productoController.findById(6).get().getPro_Nombre());
		assertEquals(aux.getPro_Precio(), productoController.findById(6).get().getPro_Precio());
		assertEquals(aux.getPro_Descri(), productoController.findById(6).get().getPro_Descri());
	}
	
	@Test
	public void modificarProducto() {
		Producto aux=new Producto();
		aux.setPro_IdProd(5);
		aux.setPro_Nombre("Pala");
		aux.setPro_Precio(560);
		aux.setPro_Descri("Pala de contruccion");
		productoController.updateProducto(aux);
		assertEquals(aux.getPro_IdProd(), productoController.findById(5).get().getPro_IdProd());
		assertEquals(aux.getPro_Nombre(), productoController.findById(5).get().getPro_Nombre());
		assertEquals(aux.getPro_Precio(), productoController.findById(5).get().getPro_Precio());
		assertEquals(aux.getPro_Descri(), productoController.findById(5).get().getPro_Descri());
	}
	
	@Test
	public void deleteProducto() {
		productoController.deleteProducto(2);
		assertEquals(Optional.empty(), productoController.findById(2));
	}
	
	
	
	
	

}
