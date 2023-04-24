package com.ust.rest.resource;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	
	//soap is always try to give extension to the existing methods..
	//rest is diffrent representation to the resource
	
	@Id
	
	//generation-type  is the stratergy to generate primary key values
	//auto is the default generation type ie when a stratergy is not specified jpa
	//uses auto stratergy. when the underlined database is my sql generation type .auto means
	//the jpa will create a hibernate sequence in the database for the generation of primary keys
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long productId;
	private String name;
	private String description;
  private BigDecimal price;
  private int qty;
  
public long getProductId() {
	return productId;
}
public void setProductId(long productId) {
	this.productId = productId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public BigDecimal getPrice() {
	return price;
}
public void setPrice(BigDecimal price) {
	this.price = price;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
  
//Hibernate: select next_val as id_val from hibernate_sequence for update
//Hibernate: update hibernate_sequence set next_val= ? where next_val=?
//Hibernate: insert into product (description, name, price, qty, product_id) values (?, ?, ?, ?, ?)
  
  
  
  
}
