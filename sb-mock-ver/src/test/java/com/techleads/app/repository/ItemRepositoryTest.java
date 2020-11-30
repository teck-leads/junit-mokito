package com.techleads.app.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
@DataJpaTest
class ItemRepositoryTest {

	@Autowired
	private ItemRepository repo;
	@Test
	void findAllSize() {
		Assertions.assertEquals(repo.findAll().size(), 4);
		
	}

}
