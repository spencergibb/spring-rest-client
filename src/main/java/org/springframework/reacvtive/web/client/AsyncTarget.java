package org.springframework.reacvtive.web.client;

import org.springframework.http.ResponseEntity;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @author Spencer Gibb
 */
public class AsyncTarget<T> implements Target<ListenableFuture<T>> {
	@Override
	public ListenableFuture<T> execute() {
		return null;
	}

	@Override
	public ResponseEntity<ListenableFuture<T>> exchange() {
		return null;
	}
}
