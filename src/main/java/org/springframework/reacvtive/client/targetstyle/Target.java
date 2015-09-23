package org.springframework.reacvtive.client.targetstyle;

import org.springframework.http.ResponseEntity;

/**
 * @author Spencer Gibb
 */
public interface Target<T> {
	T execute();

	ResponseEntity<T> exchange();
}
