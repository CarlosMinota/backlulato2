package com.agrogram.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CiudadDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6342161344122702435L;

	private Integer idCiudad;
	
	private String nombreCiudad;
	
	private Integer idDepartamento;
}
