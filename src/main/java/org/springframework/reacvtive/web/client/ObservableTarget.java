package org.springframework.reacvtive.web.client;

import org.springframework.http.ResponseEntity;
import rx.Observable;

/**
 * @author Spencer Gibb
 */
public class ObservableTarget<T> implements Target<Observable<T>> {
	@Override
	public Observable<T> execute() {
		return null;
	}

	@Override
	public ResponseEntity<Observable<T>> exchange() {
		return null;
	}
}
