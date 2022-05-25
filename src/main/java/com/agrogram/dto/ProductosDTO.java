package com.agrogram.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductosDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8142719175113660699L;
	
	private Integer idProducto;
	
	private String nombreProdcuto;
	
	private String descripcion;
	
	private Date fechaLanzamiento;
	
	private Integer cantidadProducto;
	
	private Double valorProducto;
	
	private String arancelProducto;
	
	private Integer idUsuario;

}
