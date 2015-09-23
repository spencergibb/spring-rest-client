package org.springframework.reacvtive.client.mockmvcstyle;

import rx.Observable;

/**
 * @author Spencer Gibb
 */
public class ObservableRestClient implements RestClient<ObservableRestClient.ObservableResultActions> {
	@Override
	public ObservableResultActions perform(RequestBuilder requestBuilder) {
		return null;
	}

	@Override
	public <T> ObservableResultActions<T> perform(RequestBuilder.TypedRequestBuilder<T> requestBuilder) {
		return null;
	}

	public interface ObservableResultActions<T> extends ResultActions<Observable<T>> {

	}
}
