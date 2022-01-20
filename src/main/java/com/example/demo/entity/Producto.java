package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity 
@Table(name = "brproduc", schema = "public")
public class Producto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "pro_idprod")
	private int pro_idprod;
	
	@Column(name = "pro_nombre")
	private String pro_nombre;
	
	public Producto(int pro_idprod, String pro_nombre, double pro_precio, String pro_descri) {
		this.pro_idprod = pro_idprod;
		this.pro_nombre = pro_nombre;
		this.pro_precio = pro_precio;
		this.pro_descri = pro_descri;
	}
	public Producto() {
		
	}

	@Column(name = "pro_precio")
	private double pro_precio;
	
//	@Column(name = "pro_catego")
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "brcatego", joinColumns=@JoinColumn(name = "pro_idprod"),
//	inverseJoinColumns = @JoinColumn(name="cat_idcate"))
//	private Set<Categoria> pro_catego;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name ="idCat",referencedColumnName = "id")
//	private Categoria pro_catego;
	
//	public Categoria getPro_catego() {
//		return pro_catego;
//	}
//
//	public void setPro_catego(Categoria pro_catego) {
//		this.pro_catego = pro_catego;
//	}

	@Column(name = "pro_descri")
	private String pro_descri;

	public long getPro_IdProd() {
		return pro_idprod;
	}

	public void setPro_IdProd(int pro_IdProd) {
		pro_idprod = pro_IdProd;
	}

	public String getPro_Nombre() {
		return pro_nombre;
	}

	public void setPro_Nombre(String pro_Nombre) {
		pro_nombre = pro_Nombre;
	}

	public double getPro_Precio() {
		return pro_precio;
	}

	public void setPro_Precio(double pro_Precio) {
		pro_precio = pro_Precio;
	}

//	public Set<Categoria> getPro_Catego() {
//		return pro_catego;
//	}
//
//	public void setPro_Catego(Set<Categoria> pro_Catego) {
//		pro_catego = pro_Catego;
//	}

	public String getPro_Descri() {
		return pro_descri;
	}

	public void setPro_Descri(String pro_Descri) {
		pro_descri = pro_Descri;
	}
	
}
