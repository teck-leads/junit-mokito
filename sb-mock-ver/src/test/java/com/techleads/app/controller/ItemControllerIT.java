package com.techleads.app.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ItemControllerIT {
	
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() throws JSONException {
		String response = this.restTemplate.getForObject("/allitems", String.class);
		JSONAssert.assertEquals("[{id:10,name:Ball,qty:10,price:10},{id:2,name:pen,qty:10,price:10},{id:3,name:mouse,qty:10,price:10},{id:4,name:keyboard,qty:10,price:10}]", response,false);
	}

}
