package com.agrogram.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agrogram.domain.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer>{

	public Ciudad findByIdCiudad(Integer idCiudad);
}
