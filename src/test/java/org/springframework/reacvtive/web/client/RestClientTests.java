package org.springframework.reacvtive.web.client;

import com.netflix.hystrix.HystrixExecutable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import rx.Observable;

import java.util.List;

/**
 * @author Spencer Gibb
 */
public class RestClientTests {

	public void test() {
		String resp1 = new RestClient()
				.get("http://example.com")
				.as(String.class)
				.execute();

		List<String> strings = new RestClient()
				.get("http://example.com")
				.as(new ParameterizedTypeReference<List<String>>() {
				})
				.execute();

		ResponseEntity<String> response1 = new RestClient()
				.get("http://example.com")
				.header("myheader", "myvalue")
				.as(String.class)
				.exchange();

		response1.getStatusCode();

		ListenableFuture<String> future = new RestClient()
				.get("http://example.com")
				.header("myheader", "myvalue")
				.as(new AsyncTarget<String>())
				.execute();

		future.addCallback(new ListenableFutureCallback<String>() {
			@Override
			public void onFailure(Throwable ex) {
				ex.printStackTrace();
			}

			@Override
			public void onSuccess(String result) {
				System.out.println(result);
			}
		});

		Observable<String> observable = new RestClient()
				.get("http://example.com")
				.as(new ObservableTarget<String>())
				.execute();

		observable.map(s -> s);

		HystrixExecutable<String> executable = new RestClient()
				.get("http://example.com")
				.as(new HystrixTarget<String>())
				.execute();

		executable.observe();

	}


}
