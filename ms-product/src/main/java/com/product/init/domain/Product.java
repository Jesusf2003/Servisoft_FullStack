package com.product.init.domain;

import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codpro", columnDefinition = "serial")
	private Long prod_id;

	@Column(name = "nompro")
	private String prod_name;

	@Column(name = "prepro")
	private BigDecimal prod_price;
	
	@Column(name = "cospro")
	private String prod_cos;

	@Column(name = "tippro")
	private String prod_type;

	@Column(name = "tampro")
	private String prod_tam;

	@Column(name = "stockpro")
	private Long prod_stock;

	@Column(name = "estpro")
	private String prod_est;

	public Product() {
		super();
	}

	public Product(Long prod_id, String prod_name, BigDecimal prod_price, String prod_cos, String prod_type,
			String prod_tam, Long prod_stock, String prod_est) {
		super();
		this.prod_id = prod_id;
		this.prod_name = prod_name;
		this.prod_price = prod_price;
		this.prod_cos = prod_cos;
		this.prod_type = prod_type;
		this.prod_tam = prod_tam;
		this.prod_stock = prod_stock;
		this.prod_est = prod_est;
	}

	public Long getProd_id() {
		return prod_id;
	}

	public void setProd_id(Long prod_id) {
		this.prod_id = prod_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public BigDecimal getProd_price() {
		return prod_price;
	}

	public void setProd_price(BigDecimal prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_cos() {
		return prod_cos;
	}

	public void setProd_cos(String prod_cos) {
		this.prod_cos = prod_cos;
	}

	public String getProd_type() {
		return prod_type;
	}

	public void setProd_type(String prod_type) {
		this.prod_type = prod_type;
	}

	public String getProd_tam() {
		return prod_tam;
	}

	public void setProd_tam(String prod_tam) {
		this.prod_tam = prod_tam;
	}

	public Long getProd_stock() {
		return prod_stock;
	}

	public void setProd_stock(Long prod_stock) {
		this.prod_stock = prod_stock;
	}

	public String getProd_est() {
		return prod_est;
	}

	public void setProd_est(String prod_est) {
		this.prod_est = prod_est;
	}
}