package org.springframework.reacvtive.client.targetstyle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringRestClientApplicationTests.Config.class)
@WebAppConfiguration
public class SpringRestClientApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Configuration
	public static class Config {

	}
}
