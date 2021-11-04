package com.formacionbdi.spirngboot.app.productos.models.service;

import com.formacionbdi.spirngboot.app.productos.models.entity.Producto;

import java.util.List;

public interface IProductoService {

	List<Producto> findAll();

	Producto findById(Long id);

}