package com.agrogram.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agrogram.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	public Optional<Usuario> findByNitOrEmail(String nit, String email);
	
	public Usuario findByIdUsuario(Integer idUsuario);
}
