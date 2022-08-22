package com.example.demo.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="piezas_proveedores")//en caso que la tabala sea diferente
public class PiezasProveedores {

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne//(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "pieza_id")
    Pieza pieza;
 
    @ManyToOne//(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "proveedor_id")
    Proveedor proveedor;
	
	
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	//Constructores
	
	public PiezasProveedores() {
	
	}

	/**
	 * @param id
	 * @param pieza
	 * @param proveedor
	 * @param precio
	 */
	public PiezasProveedores(int id, Pieza pieza, Proveedor proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
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
	 * @return the pieza
	 */
	public Pieza getPieza() {
		return pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	/**
	 * @return the proveedor
	 */
	public Proveedor getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PiezasProveedores [id=" + id + ", pieza=" + pieza + ", proveedor=" + proveedor + ", precio=" + precio
				+ "]";
	}

	
}












	

