package com.techleads.app.service;

import org.springframework.stereotype.Service;

import com.techleads.app.model.Item;
@Service
public class ItemService {
	
	public Item retrieveItem() {
		return new Item(1, "Ball", 10, 100D);
	}

}
