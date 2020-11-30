package com.techleads.app.service;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.techleads.app.model.Item;
import com.techleads.app.repository.ItemRepository;
@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {
	@InjectMocks
	private ItemService itemService;
	@Mock
	private ItemRepository repository;

	@Test
	void testFindAll() {
		when(repository.findAll()).thenReturn(Arrays.asList(new Item(10, "laptop", 1, 20000D),new Item(11, "desktop", 2, 30000D)));
		List<Item> findAll = itemService.findAll();
		Assertions.assertEquals(findAll.get(0).getTotal(), 20000);
		Assertions.assertEquals(findAll.get(1).getTotal(), 60000);
		Assertions.assertEquals(findAll.size(), 2);
		
	}

}
