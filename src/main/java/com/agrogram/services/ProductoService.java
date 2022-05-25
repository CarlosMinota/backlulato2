package com.agrogram.services;

import java.sql.SQLException;

import com.agrogram.dto.ProductosDTO;

public interface ProductoService {

	public ProductosDTO addProducto(ProductosDTO productosDTO) throws SQLException;
	
	public ProductosDTO updateProducto(ProductosDTO productosDTO) throws SQLException;
	
	public void eliminarProducto(Integer idProducto);
}
