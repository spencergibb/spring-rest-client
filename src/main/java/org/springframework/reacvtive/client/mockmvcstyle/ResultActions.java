package org.springframework.reacvtive.client.mockmvcstyle;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;

/**
 * @author Spencer Gibb
 */
public interface ResultActions<T> {
	T getObject();
	ResponseEntity<T> getResponse();
}
