package org.imooc.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class TestController {
	@Autowired
	WebApplicationContext context;

	MockMvc mockMvc;

	@Before
	public void initmockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}

	@Test
	public void testGetAll() throws Exception {
//		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/api/submitComment")).andReturn();
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post("/api/submitComment")).andReturn();
//		Object object = result.getRequest().getAttribute("value");
//		System.out.println("***********************************");
//		System.out.println(object);
	}

}
