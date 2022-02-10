package com.backend.init.models.entity;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "codpro", nullable = false)
	private Long codpro;

	@Column(name = "nompro")
	private String nompro;

	@Column(name = "cospro")
	private String cospro;

	@Column(name = "prepro")
	private String prepro;

	@Column(name = "tippro")
	private String tippro;

	@Column(name = "tampro")
	private String tampro;

	@Column(name = "stockpro")
	private int stockpro;

	@Column(name = "estpro")
	private String estpro;

	@Transient
	private Integer port;

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}
}