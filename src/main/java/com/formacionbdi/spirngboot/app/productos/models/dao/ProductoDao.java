package com.formacionbdi.spirngboot.app.productos.models.dao;

import com.formacionbdi.spirngboot.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto, Long> {
}