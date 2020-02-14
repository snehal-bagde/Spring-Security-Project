package com.snehal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.snehal.service.TaskService;
import com.snehal.service.UserService;

@SpringBootTest
class SpringProjectApplicationTests {

	@Autowired
	private UserService userService;
	@Autowired
	private TaskService taskService;
	
	@Test
	void contextLoads() {
	}

}
