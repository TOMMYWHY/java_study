package com.tommy.why;

import com.tommy.why.pojo.Dog;
import com.tommy.why.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01HelloWorldApplicationTests {

	@Autowired
	private Person person;
	@Test
	void contextLoads() {
		System.out.println(person);
	}

}
