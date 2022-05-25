package com.agrogram.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agrogram.domain.Ciudad;
import com.agrogram.dto.CiudadDTO;

@Mapper(componentModel = "spring")
public interface CiudadMapper {

	@Mapping(source = "idDepartamento", target = "idDepartamento.idDepartamento")
	public Ciudad ciudadDTOToCiudad(CiudadDTO ciudadDTO);
	
	@Mapping(source = "idDepartamento.idDepartamento", target = "idDepartamento")
	public CiudadDTO ciudadToCiudadDTO(Ciudad ciudad);
	
	public List<Ciudad> listaCiudadDTOToListaCiudad(List<CiudadDTO> listaCiudadDTO);
	
	public List<CiudadDTO> listaCiudadToListaCiudadDTO(List<Ciudad> listaCiudad);
}
