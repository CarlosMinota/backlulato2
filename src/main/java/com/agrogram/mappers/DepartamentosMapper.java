package com.agrogram.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.agrogram.domain.Departamentos;
import com.agrogram.dto.DepartamentosDTO;

@Mapper(componentModel = "spring")
public interface DepartamentosMapper {

	public Departamentos departamentoDTOToDepartamento(DepartamentosDTO departamentosDTO);
	
	public DepartamentosDTO departamentoToDepartamentoDTO(Departamentos departamentos);
	
	public List<Departamentos> listaDepartamentoDTOToListaDepartamento(List<DepartamentosDTO> listaDepartamentosDTO);
	
	public List<DepartamentosDTO> listaDepartamentoToListaDepartamentoDTO(List<Departamentos> listaDepartamentos);
}
