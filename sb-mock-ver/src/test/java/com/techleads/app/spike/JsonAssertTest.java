package com.techleads.app.spike;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

class JsonAssertTest {

	String actualResponse="{\"id\":1,\"name\":\"Ball\",\"qty\":10,\"price\":100.0}";
	@Test
	void jsonAssertTest() throws JSONException {
		String expectedResponse="{\"id\":1,\"name\":\"Ball\",\"qty\":10,\"price\":100.0}";
		JSONAssert.assertEquals(expectedResponse, actualResponse, true);
	}

}
