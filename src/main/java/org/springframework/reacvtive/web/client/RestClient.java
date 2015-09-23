package org.springframework.reacvtive.web.client;

import java.nio.charset.Charset;
import java.util.Arrays;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

/**
 * @author Spencer Gibb
 */
public class RestClient {

	private HttpMethod method;

	public BodyBuilder method(HttpMethod method, String uri) {
		return new DefaultBodyBuilder(method, uri);
	}

	public HeadersBuilder<?> get(String uri) {
		return method(HttpMethod.GET, uri);
	}

	public HeadersBuilder<?> head(String uri) {
		return method(HttpMethod.HEAD, uri);
	}

	public BodyBuilder<?> post(String uri) {
		return method(HttpMethod.POST, uri);
	}

	public BodyBuilder<?> put(String uri) {
		return method(HttpMethod.PUT, uri);
	}

	public BodyBuilder<?> patch(String uri) {
		return method(HttpMethod.PATCH, uri);
	}

	public HeadersBuilder<?> delete(String uri) {
		return method(HttpMethod.DELETE, uri);
	}

	public HeadersBuilder<?> options(String uri) {
		return method(HttpMethod.OPTIONS, uri);
	}

	public interface HeadersBuilder<B extends HeadersBuilder<B>> {

		B header(String headerName, String... headerValues);

		B accept(MediaType... acceptableMediaTypes);

		B acceptCharset(Charset... acceptableCharsets);

		B ifModifiedSince(long ifModifiedSince);

		B ifNoneMatch(String... ifNoneMatches);

		<T> Target<T> as(ParameterizedTypeReference<T> typeRef);

		<T> Target<T> as(Class<T> clazz);

		<T> Target<T> as(Target<T> target);
	}

	public interface BodyBuilder<T> extends HeadersBuilder<BodyBuilder<T>> {

		BodyBuilder contentLength(long contentLength);

		BodyBuilder contentType(MediaType contentType);

		BodyBuilder body(T body);
	}

	private static class DefaultBodyBuilder<T> implements BodyBuilder<T> {

		private final HttpMethod method;

		private final String uri;

		private final HttpHeaders headers = new HttpHeaders();

		private T body;

		public DefaultBodyBuilder(HttpMethod method, String uri) {
			this.method = method;
			this.uri = uri;
		}

		@Override
		public BodyBuilder<T> header(String headerName, String... headerValues) {
			for (String headerValue : headerValues) {
				this.headers.add(headerName, headerValue);
			}
			return this;
		}

		@Override
		public BodyBuilder<T> accept(MediaType... acceptableMediaTypes) {
			this.headers.setAccept(Arrays.asList(acceptableMediaTypes));
			return this;
		}

		@Override
		public BodyBuilder<T> acceptCharset(Charset... acceptableCharsets) {
			this.headers.setAcceptCharset(Arrays.asList(acceptableCharsets));
			return this;
		}

		@Override
		public BodyBuilder<T> contentLength(long contentLength) {
			this.headers.setContentLength(contentLength);
			return this;
		}

		@Override
		public BodyBuilder<T> contentType(MediaType contentType) {
			this.headers.setContentType(contentType);
			return this;
		}

		@Override
		public BodyBuilder<T> ifModifiedSince(long ifModifiedSince) {
			this.headers.setIfModifiedSince(ifModifiedSince);
			return this;
		}

		@Override
		public BodyBuilder<T> ifNoneMatch(String... ifNoneMatches) {
			this.headers.setIfNoneMatch(Arrays.asList(ifNoneMatches));
			return this;
		}

		@Override
		public BodyBuilder body(T body) {
			this.body = body;
			return this;
		}

		@Override
		public <T> Target<T> as(ParameterizedTypeReference<T> typeRef) {
			return null;
		}

		@Override
		public <T> Target<T> as(Class<T> clazz) {
			return null;
		}

		@Override
		public <T> Target<T> as(Target<T> target) {
			return null;
		}
	}

}
