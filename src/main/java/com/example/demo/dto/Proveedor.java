package com.example.demo.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="proveedor")//en caso que la tabala sea diferente
public class Proveedor {

	//Atributos de entidad proveedor
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<PiezasProveedores> piezasProveedores;
	
	//Constructores
	
	public Proveedor() {
	
	}


	/**
	 * @param id
	 * @param nombre
	 * @param piezasProveedores
	 */
	public Proveedor(int id, String nombre, List<PiezasProveedores> piezasProveedores) {
		this.id = id;
		this.nombre = nombre;
		this.piezasProveedores = piezasProveedores;
	}


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the piezasProveedores
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "PiezasProveedores")
	public List<PiezasProveedores> getPiezasProveedores() {
		return piezasProveedores;
	}


	/**
	 * @param piezasProveedores the piezasProveedores to set
	 */
	public void setPiezasProveedores(List<PiezasProveedores> piezasProveedores) {
		this.piezasProveedores = piezasProveedores;
	}


	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + "]";
	}


	
}
