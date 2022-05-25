package com.agrogram.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 464274309435803108L;
	
	private Integer idUsuario;
	
	private String nombreEmpresa;
	
	private String email;
	
	private String nit;
	
	private String password;
	
	private Integer idCiudad;
	
	private Integer idTipoUsuario;

}
