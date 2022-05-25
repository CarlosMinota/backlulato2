package com.agrogram.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agrogram.domain.Usuario;
import com.agrogram.dto.UsuarioDTO;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

	@Mapping(source = "idCiudad", target = "idCiudad.idCiudad")
	@Mapping(source = "idTipoUsuario", target = "idTipoUsuario.idTipoUsuario")
	public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);
	
	@Mapping(source = "idCiudad.idCiudad", target = "idCiudad")
	@Mapping(source = "idTipoUsuario.idTipoUsuario", target = "idTipoUsuario")
	public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);
	
	public List<Usuario> listaUsuarioDTOToListaUsuario(List<UsuarioDTO> listaUsuarioDTO);
	
	public List<UsuarioDTO> listaUsuarioToListaUsuarioDTO(List<Usuario> listaUsuario);
}
