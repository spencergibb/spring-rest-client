package org.springframework.reacvtive.client.mockmvcstyle;

/**
 * @author Spencer Gibb
 */
public class DefaultRestClient implements RestClient<ResultActions> {
	@Override
	public <T> ResultActions<T> perform(RequestBuilder.TypedRequestBuilder<T> requestBuilder) {
		return null;
	}
}
