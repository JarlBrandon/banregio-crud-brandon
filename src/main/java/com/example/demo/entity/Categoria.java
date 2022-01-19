package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumns;

@Component
@Entity 
@Table(name = "brcatego", schema = "public")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cat_idcate")
	private int cat_idcate;
	
	@Column(name = "cat_nombre")
	private String cat_nombre;

	@Column(name = "cat_descri")
	private String cat_descri;

	public long getCat_IdCate() {
		return cat_idcate;
	}

	public void setCat_IdCate(int cat_IdCate) {
		cat_idcate = cat_IdCate;
	}

	public String getCat_Nombre() {
		return cat_nombre;
	}

	public void setCat_Nombre(String cat_Nombre) {
		cat_nombre = cat_Nombre;
	}

	public String getCat_Descri() {
		return cat_descri;
	}

	public void setCat_Descri(String cat_Descri) {
		cat_descri = cat_Descri;
	}
	
	
	
}
