package com.durga.todoapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nisum.todo.TodoAppApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TodoAppApplication.class)
@WebAppConfiguration
public class TodoAppApplicationTests {

	@Test
	public void contextLoads() {
	}

}
