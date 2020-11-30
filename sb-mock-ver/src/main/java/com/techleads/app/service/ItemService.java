package com.techleads.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techleads.app.model.Item;
import com.techleads.app.repository.ItemRepository;
@Service
public class ItemService {
	@Autowired
	private ItemRepository repository;
	
	public Item retrieveItem() {
		return new Item(1, "Ball", 10, 100D);
	}
	
	
	public List<Item> findAll(){
		List<Item> findAll = repository.findAll();
		
		findAll.forEach(item->{item.setTotal(item.getQty()*item.getPrice());});
		
		return findAll;
	}

}
