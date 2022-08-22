package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Proveedor;



public interface IProveedorService {

	//Metodos del CRUD
		public List<Proveedor> listarProveedores(); //Listar All 
		
		public Proveedor guardarProveedor(Proveedor proveedor);	//Guarda un Proveedor CREATE
		
		public Proveedor proveedorXID(int id); //Leer datos de un Proveedor READ
		
		public Proveedor actualizarProveedor(Proveedor proveedor); //Actualiza datos del Proveedor UPDATE
		
		public void eliminarProveedor(int id);// Elimina el Proveedor DELETE
	

}


