package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.PiezasProveedores;

public interface IPiezasProveedoresService {

	//Metodos del CRUD
		public List<PiezasProveedores> listarPiezasProveedores(); //Listar All 
		
		public PiezasProveedores guardarPiezasProveedores(PiezasProveedores piezasProveedores);	//Guarda un PiezasProveedores CREATE
		
		public PiezasProveedores piezasProveedoresXID(int id); //Leer datos de un PiezasProveedores READ
		
		public PiezasProveedores actualizarPiezasProveedores(PiezasProveedores piezasProveedores); //Actualiza datos del PiezasProveedores UPDATE
		
		public void eliminarPiezasProveedores(int id);// Elimina el PiezasProveedores DELETE
	
}


