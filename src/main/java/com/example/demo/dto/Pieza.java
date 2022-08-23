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
@Table(name="pieza")
public class Pieza {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<PiezasProveedores> piezasProveedores;
	
	//Constructors
	
	public Pieza() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param piezasProveedores
	 */
	public Pieza(int id, String nombre, List<PiezasProveedores> piezasProveedores) {
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
		return "Pieza [id=" + id + ", nombre=" + nombre + "]";
	}

	
}
