package org.codegeeks.jdbctest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		assertEquals(2, 1+1l);
	}
	
	/*@BeforeAll
	public void beforeAll() {
		System.out.println("Starting testing");
	}*/

}
