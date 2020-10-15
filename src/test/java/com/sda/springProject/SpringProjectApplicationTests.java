package com.sda.springProject;

import com.sda.springProject.service.TestService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringProjectApplicationTests {

	@Autowired
	TestService testService;

	@Test
	void contextLoads() {
		Assertions.assertThat(testService.toString()).isGreaterThan("Name w Test Serwisie");
	}

}
