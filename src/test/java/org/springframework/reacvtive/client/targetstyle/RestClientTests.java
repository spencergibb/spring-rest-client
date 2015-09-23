package org.springframework.reacvtive.client.targetstyle;

import com.netflix.hystrix.HystrixExecutable;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import rx.Observable;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author Spencer Gibb
 */
public class RestClientTests {

	public void test() throws Exception {
		// Synchronous examples ----------------------------
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

		// Spring ListenableFuture example ----------------------------
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

		// Java CompletableFutureTarget example ----------------------------
		CompletableFuture<String> completableFuture = new RestClient()
				.get("http://example.com")
				.header("myheader", "myvalue")
				.as(new CompletableFutureTarget<String>())
				.execute();

		System.out.println(completableFuture.get(1, TimeUnit.SECONDS));

		// RxJava Observable example ----------------------------
		Observable<String> observable = new RestClient()
				.get("http://example.com")
				.as(new ObservableTarget<String>())
				.execute();

		observable.map(s -> s);

		// HystrixExecutable example ----------------------------
		HystrixExecutable<String> executable = new RestClient()
				.get("http://example.com")
				.as(new HystrixTarget<String>())
				.execute();

		executable.observe();

	}


}
