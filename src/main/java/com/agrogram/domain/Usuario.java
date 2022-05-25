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
@Table(name = "usuario")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5101359742622756403L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Integer idUsuario;
	
	@Column(name = "nombre_empresa")
	private String nombreEmpresa;
	
	@Column(name = "correoele")
	private String email;
	
	@Column(name = "nit")
	private String nit;
	
	@Column(name = "contrasena")
	private String password;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciudad_id_ciudad")
	private Ciudad idCiudad;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_usuario_id_tipoclie")
	private TipoUsuario idTipoUsuario;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "idUsuario")
	private List<Productos> listaProductos = new ArrayList<>();
}
