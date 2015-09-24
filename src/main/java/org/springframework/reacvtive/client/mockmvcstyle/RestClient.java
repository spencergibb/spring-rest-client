package org.springframework.reacvtive.client.mockmvcstyle;

/**
 * @author Spencer Gibb
 */
public interface RestClient<RA extends ResultActions> {
	<T> RA perform(RequestBuilder.TypedRequestBuilder<T> requestBuilder);
}
