package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Pieza;

public interface IPiezaService {

	//Metodos del CRUD
		public List<Pieza> listarPiezas(); //Listar All 
		
		public Pieza guardarPieza(Pieza pieza);	//Guarda un Pieza CREATE
		
		public Pieza piezaXID(int id); //Leer datos de un Pieza READ
		
		public Pieza actualizarPieza(Pieza pieza); //Actualiza datos del pieza UPDATE
		
		public void eliminarPieza(int id);// Elimina el pieza DELETE
	
}


