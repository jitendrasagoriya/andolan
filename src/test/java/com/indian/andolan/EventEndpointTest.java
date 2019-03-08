package com.indian.andolan;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.indian.andolan.endpoint.EventEndpoint;
import com.indian.andolan.service.impl.EventServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EventEndpoint.class, secure = false)
public class EventEndpointTest {
	
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EventServiceImpl eventServiceImpl;

}
