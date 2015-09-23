package org.springframework.reacvtive.web.client;

/**
 * @author Spencer Gibb
 */
public class RestClientTests {

	public void test() {
		new RestClient<>()
				.get("http://example.com");

	}
}
