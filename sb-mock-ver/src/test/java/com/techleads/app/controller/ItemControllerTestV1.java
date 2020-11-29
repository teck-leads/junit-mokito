package com.techleads.app.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.techleads.app.model.Item;
import com.techleads.app.service.ItemService;

@WebMvcTest(ItemController.class)
class ItemControllerTestV1 {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ItemService service;

	@Test
	void testItems() throws Exception {

		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/items").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Ball\",\"qty\":10,\"price\":100.0}")).andReturn();
	}

	@Test
	void itemsFromService() throws Exception {

		when(service.retrieveItem()).thenReturn(new Item(10, "laptop", 1, 20000D));
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/serviceitems")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("{\"id\":10,\"name\":\"laptop\",\"qty\":1,\"price\":20000.0}")).andReturn();
	}

}
