package com.techleads.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techleads.app.model.Item;
import com.techleads.app.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	private ItemService service;
	@GetMapping(value = "/items")
	public Item items() {
		return new Item(1, "Ball", 10, 100D);
		
	}
	
	@GetMapping(value = "/serviceitems")
	public Item itemsFromService() {
		return service.retrieveItem();
		
	}
	

}
