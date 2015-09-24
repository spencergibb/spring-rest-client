package org.springframework.reacvtive.client.mockmvcstyle;

import lombok.Data;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import rx.Observable;

import static org.springframework.reacvtive.client.mockmvcstyle.RequestBuilders.*;

/**
 * @author Spencer Gibb
 */
public class MockMvcStyleTests {

	public void test() throws Exception {
		DefaultRestClient defaultRestClient = new DefaultRestClient();

		String result = defaultRestClient.perform(
				get("http://example.com")
						.as(String.class)
		).getObject();

		ResponseEntity<User> response = defaultRestClient.perform(
				get("/users/{userid}", 1)
						.header("myheader", "myvalue")
						.as(User.class)
		).getResponse();

		ResponseEntity response1 = defaultRestClient.perform(
				post("http://example.com/users")
						.contentType(MediaType.APPLICATION_JSON)
						.content(new User("username", "name"))
						.as(Void.class) //this vs. two perform methods in RestClient
		).getResponse();

		Observable<User> observable = new ObservableRestClient().perform(
				get("/users/{userid}", 1)
						.header("myheader", "myvalue")
						.as(User.class)
		).getObject();
	}


	@Data
	class User {
		final String username;
		final String name;
	}
}
