package org.springframework.reacvtive.client.targetstyle;

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
