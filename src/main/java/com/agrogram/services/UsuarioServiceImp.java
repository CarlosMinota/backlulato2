package com.agrogram.services;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.agrogram.domain.Ciudad;
import com.agrogram.domain.Usuario;
import com.agrogram.dto.UsuarioDTO;
import com.agrogram.repository.CiudadRepository;
import com.agrogram.repository.UsuarioRepository;
import com.agrogram.utils.Utilities;

@Service
@Scope("singleton")
public class UsuarioServiceImp implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private CiudadRepository ciudadRepository;
	
	@Override
	public UsuarioDTO addUsuario(UsuarioDTO usuarioDTO) throws SQLException {
		
		Usuario usuario = new Usuario();
		Ciudad ciudad = null;
		
		Optional<Usuario> usuarioValidar = usuarioRepository.findByNitOrEmail(usuarioDTO.getNit(), usuarioDTO.getEmail());
		
		if(usuarioValidar.isPresent()) {
			throw new SQLException("Ya exise un usuario registrado con el mismo nit o mismo email");
		}
		
		usuario.setNombreEmpresa(usuarioDTO.getNombreEmpresa());
		usuario.setEmail(usuarioDTO.getEmail());
		usuario.setNit(usuarioDTO.getNit());
		ciudad = ciudadRepository.findByIdCiudad(usuarioDTO.getIdCiudad());
		usuario.setIdCiudad(ciudad);
		
		usuarioRepository.save(usuario);
		
		return usuarioDTO;
	}

	@Override
	public UsuarioDTO editarUsuario(UsuarioDTO usuarioDTO) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
