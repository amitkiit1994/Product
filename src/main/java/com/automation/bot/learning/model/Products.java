package com.automation.bot.learning.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
	
	@Id
	@Column (name = "ProdId")
	private UUID prodId;
	@Column (name = "ProdName")
	private String prodName;
	@Column (name = "ProdDesc")
	private String prodDesc;
	@Column (name = "CategoryItem")
	private int categoryItem;
	public Products(UUID prodId, String prodName, String prodDesc, int categoryItem) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.categoryItem = categoryItem;
	}
	public Products() {
	}
	public UUID getProdId() {
		return prodId;
	}
	public void setProdId(UUID prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public int getCategoryItem() {
		return categoryItem;
	}
	public void setCategoryItem(int categoryItem) {
		this.categoryItem = categoryItem;
	}
	

}
