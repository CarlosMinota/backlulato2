package com.agrogram.services;

import java.sql.SQLException;

import com.agrogram.dto.UsuarioDTO;

public interface UsuarioService {

	public UsuarioDTO addUsuario(UsuarioDTO usuarioDTO) throws SQLException;
	
	public UsuarioDTO editarUsuario(UsuarioDTO usuarioDTO) throws SQLException;
}
