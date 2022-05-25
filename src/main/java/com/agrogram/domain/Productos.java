package com.agrogram.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "productos")
public class Productos implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 5227694632908846637L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Integer idProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProdcuto;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_lanzamieno")
	private Date fechaLanzamiento;
	
	@Column(name = "cantidad_producto")
	private Integer cantidadProducto;
	
	@Column(name = "valor_producto")
	private Double valorProducto;
	
	@Column(name = "arancel_producto")
	private String arancelProducto;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id_usuario")
	private Usuario idUsuario;
}
