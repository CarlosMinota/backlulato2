package com.agrogram.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ciudad")
public class Ciudad implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7034164100275458932L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_ciudad")
	private Integer idCiudad;
	
	@Column(name = "nombre_ciudad")
	private String nombreCiudad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "departamento_id_departamento")
	private Departamentos idDepartamento;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idCiudad")
	private List<Usuario> listaUsuario = new ArrayList<>();
	
}
