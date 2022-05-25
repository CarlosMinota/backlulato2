package com.agrogram.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartamentosDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7517840047387689070L;

	private Integer idDepartamento;
	
	private String nombreDepartamento;
}
