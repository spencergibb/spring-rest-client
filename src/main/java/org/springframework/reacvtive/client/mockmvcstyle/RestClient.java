package org.springframework.reacvtive.client.mockmvcstyle;

/**
 * @author Spencer Gibb
 */
public interface RestClient<RA extends ResultActions> {
	RA perform(RequestBuilder requestBuilder);
	//FIXME: get rid of having two perform methods
	<T> RA perform(RequestBuilder.TypedRequestBuilder<T> requestBuilder);
}
