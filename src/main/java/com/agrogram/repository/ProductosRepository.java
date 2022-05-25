package com.agrogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agrogram.domain.Productos;
import com.agrogram.domain.Usuario;

public interface ProductosRepository extends JpaRepository<Productos, Integer>{

	public Usuario findByIdUsuario(Integer idUsuario);
}
