package org.springframework.reacvtive.web.client;

import com.netflix.hystrix.HystrixExecutable;
import org.springframework.http.ResponseEntity;

/**
 * @author Spencer Gibb
 */
public class HystrixTarget<T> implements Target<HystrixExecutable<T>> {

	@Override
	public HystrixExecutable<T> execute() {
		return null;
	}

	@Override
	public ResponseEntity<HystrixExecutable<T>> exchange() {
		return null;
	}
}
