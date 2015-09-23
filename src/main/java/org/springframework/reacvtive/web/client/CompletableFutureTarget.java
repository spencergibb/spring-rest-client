package org.springframework.reacvtive.web.client;

import org.springframework.http.ResponseEntity;

import java.util.concurrent.CompletableFuture;

/**
 * @author Spencer Gibb
 */
public class CompletableFutureTarget<T> implements Target<CompletableFuture<T>> {
	@Override
	public CompletableFuture<T> execute() {
		return null;
	}

	@Override
	public ResponseEntity<CompletableFuture<T>> exchange() {
		return null;
	}
}
