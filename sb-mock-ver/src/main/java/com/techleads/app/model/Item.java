package com.techleads.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
	@Id
	private Integer id;
	private String name;
	private Integer qty;
	private Double price;
	@Transient
	private Double total;
	public Item(Integer id, String name, Integer qty, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}
	

}
