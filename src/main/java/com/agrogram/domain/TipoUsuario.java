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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7971267352827232070L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipoclie")
	private Integer idTipoUsuario;
	
	@Column(name = "nombre_tipoclie")
	private String tipoUsuario;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idTipoUsuario")
	private List<Usuario> listaUsuario = new ArrayList<>();

}
