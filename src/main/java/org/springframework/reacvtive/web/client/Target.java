package org.springframework.reacvtive.web.client;

import org.springframework.http.ResponseEntity;

/**
 * @author Spencer Gibb
 */
public interface Target<T> {
	T execute();

	ResponseEntity<T> exchange();
}
