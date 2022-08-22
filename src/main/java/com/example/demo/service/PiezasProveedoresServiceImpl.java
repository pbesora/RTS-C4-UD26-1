package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPiezasProveedoresDAO;
import com.example.demo.dto.PiezasProveedores;

@Service
public class PiezasProveedoresServiceImpl implements IPiezasProveedoresService {
	
	@Autowired
	IPiezasProveedoresDAO iPiezasProveedoresDAO;

	@Override
	public List<PiezasProveedores> listarPiezasProveedores() {
		return iPiezasProveedoresDAO.findAll();
	}

	@Override
	public PiezasProveedores guardarPiezasProveedores(PiezasProveedores piezasProveedores) {
		return iPiezasProveedoresDAO.save(piezasProveedores);
	}

	@Override
	public PiezasProveedores piezasProveedoresXID(int id) {
		return iPiezasProveedoresDAO.findById(id).get();
	}

	@Override
	public PiezasProveedores actualizarPiezasProveedores(PiezasProveedores piezasProveedores) {
		return iPiezasProveedoresDAO.save(piezasProveedores);
	}

	@Override
	public void eliminarPiezasProveedores(int id) {
		iPiezasProveedoresDAO.deleteById(id);
	}

}
