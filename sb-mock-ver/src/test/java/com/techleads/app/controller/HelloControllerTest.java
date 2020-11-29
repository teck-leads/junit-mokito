package com.techleads.app.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
@WebMvcTest(HelloController.class)
class HelloControllerTest {

	@Autowired
	private MockMvc mockMvc;
	@Test
	void testHelloWorld() throws Exception {
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders.get("/hello").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andExpect(content().string("hello World"))
				.andReturn();
		//Assertions.assertEquals("hello World", result.getResponse().getContentAsString());
	}

}
