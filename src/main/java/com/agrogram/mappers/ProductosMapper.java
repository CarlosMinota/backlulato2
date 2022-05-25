package com.agrogram.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agrogram.domain.Productos;
import com.agrogram.dto.ProductosDTO;

@Mapper(componentModel = "spring")
public interface ProductosMapper {

	@Mapping(source = "idUsuario", target = "idUsuario.idUsuario")
	public Productos productoDTOToProductos(ProductosDTO productoDTO);
	
	@Mapping(source = "idUsuario.idUsuario", target = "idUsuario")
	public ProductosDTO productoToProductosDTO(Productos producto);
	
	public List<Productos> listaProductoDTOToListaProducto(List<ProductosDTO> listaProductoDTO);
	
	public List<ProductosDTO> listaProductoToListaProductoDTO(List<Productos> listaProducto);
}
