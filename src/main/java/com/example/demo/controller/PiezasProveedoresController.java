package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PiezasProveedores;
import com.example.demo.service.PiezasProveedoresServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasProveedoresController {
	
	@Autowired
	PiezasProveedoresServiceImpl piezasProveedoresServiceImpl;
	
	@GetMapping("/piezasProveedores")
	public List<PiezasProveedores> listarPiezasProveedores(){
		return piezasProveedoresServiceImpl.listarPiezasProveedores();
	}
	
	
	@PostMapping("/piezasProveedores")
	public PiezasProveedores salvarPiezasProveedores(@RequestBody PiezasProveedores piezasProveedores) {
		
		return piezasProveedoresServiceImpl.guardarPiezasProveedores(piezasProveedores);
	}
	
	
	@GetMapping("/piezasProveedores/{id}")
	public PiezasProveedores PiezasProveedoresXID(@PathVariable(name="id") int id) {
		
		PiezasProveedores PiezasProveedores_xid= new PiezasProveedores();
		
		PiezasProveedores_xid=piezasProveedoresServiceImpl.piezasProveedoresXID(id);
		
		System.out.println("PiezasProveedores XID: "+PiezasProveedores_xid);
		
		return PiezasProveedores_xid;
	}
	
	@PutMapping("/piezasProveedores/{id}")
	public PiezasProveedores actualizarPiezasProveedores(@PathVariable(name="id")int id,@RequestBody PiezasProveedores PiezasProveedores) {
		
		PiezasProveedores PiezasProveedores_seleccionado= new PiezasProveedores();
		PiezasProveedores PiezasProveedores_actualizado= new PiezasProveedores();
		
		PiezasProveedores_seleccionado= piezasProveedoresServiceImpl.piezasProveedoresXID(id);
		
		
		PiezasProveedores_seleccionado.setPieza(PiezasProveedores.getPieza());
		PiezasProveedores_seleccionado.setProveedor(PiezasProveedores.getProveedor());
		PiezasProveedores_seleccionado.setPrecio(PiezasProveedores.getPrecio());
		
		PiezasProveedores_actualizado = piezasProveedoresServiceImpl.actualizarPiezasProveedores(PiezasProveedores_seleccionado);
		
		System.out.println("El PiezasProveedores actualizado es: "+ PiezasProveedores_actualizado);
		
		return PiezasProveedores_actualizado;
	}
	
	@DeleteMapping("/piezasProveedores/{id}")
	public void eleiminarPiezasProveedores(@PathVariable(name="id")int id) {
		piezasProveedoresServiceImpl.eliminarPiezasProveedores(id);
	}
	
	
}
