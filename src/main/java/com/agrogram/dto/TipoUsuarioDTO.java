package com.agrogram.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuarioDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4236929413847062044L;

	private Integer idTipoUsuario;
	
	private String tipoUsuario;
}
