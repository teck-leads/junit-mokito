package com.techleads.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	private Integer id;
	private String name;
	private Integer qty;
	private Double price;

}
