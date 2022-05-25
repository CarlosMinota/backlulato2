package com.agrogram.services;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.agrogram.domain.Productos;
import com.agrogram.domain.Usuario;
import com.agrogram.dto.ProductosDTO;
import com.agrogram.repository.ProductosRepository;
import com.agrogram.repository.UsuarioRepository;
import com.agrogram.utils.Utilities;

@Service
@Scope("singleton")
public class ProductoServiceImp implements ProductoService{
	
	@Autowired
	private ProductosRepository productosRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public ProductosDTO addProducto(ProductosDTO productosDTO) {
		
		Productos productos = new Productos();
		Usuario usuario = null;
		
		productos.setNombreProdcuto(productosDTO.getNombreProdcuto());
		productos.setDescripcion(productosDTO.getDescripcion());
		productos.setFechaLanzamiento(productosDTO.getFechaLanzamiento());
		productos.setCantidadProducto(productosDTO.getCantidadProducto());
		productos.setValorProducto(productosDTO.getValorProducto());
		productos.setArancelProducto(productosDTO.getArancelProducto());
		usuario = usuarioRepository.findByIdUsuario(productosDTO.getIdUsuario());
		
		productosRepository.save(productos);
		
		return productosDTO;
	}
	
	public Optional<Productos> findById(Integer idProducto) throws SQLException{
		
		if(idProducto == null) {
			throw new SQLException("Debe ingresar un ID de destino");
		}
		return productosRepository.findById(idProducto);
	}

	@Override
	public ProductosDTO updateProducto(ProductosDTO productosDTO) throws SQLException{
		
		Optional<Productos> productos = null;
		Usuario usuario = null;
		
		productos = findById(productosDTO.getIdProducto());
		
		if(!productos.isPresent()) {
			throw new SQLException("Ya existe el producto");
		}
		
		productos.get().setNombreProdcuto(productosDTO.getNombreProdcuto());
		productos.get().setDescripcion(productosDTO.getDescripcion());
		productos.get().setFechaLanzamiento(productosDTO.getFechaLanzamiento());
		productos.get().setCantidadProducto(productosDTO.getCantidadProducto());
		productos.get().setValorProducto(productosDTO.getValorProducto());
		productos.get().setArancelProducto(productosDTO.getArancelProducto());
		usuario = usuarioRepository.findByIdUsuario(productosDTO.getIdUsuario());
		
		productosRepository.save(productos.get());
		
		return productosDTO;
	}

	@Override
	public void eliminarProducto(Integer idProducto) {
		
		if(Utilities.isNull(idProducto)) {
			throw new RuntimeException("EL ID del producto es obligatorio");
		}
		
		productosRepository.deleteById(idProducto);
		
	}

}
