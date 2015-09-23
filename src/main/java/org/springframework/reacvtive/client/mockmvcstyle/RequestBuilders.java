/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.reacvtive.client.mockmvcstyle;

import java.net.URI;

import org.springframework.http.HttpMethod;

/**
 * Static factory methods for {@link RequestBuilder RequestBuilders}.
 *
 * <h3>Integration with the Spring TestContext Framework</h3>
 * <p>Methods in this class will reuse a
 * {@link org.springframework.mock.web.MockServletContext MockServletContext}
 * that was created by the Spring TestContext Framework.
 *
 * <h3>Eclipse Users</h3>
 * <p>Consider adding this class as a Java editor favorite. To navigate to
 * this setting, open the Preferences and type "favorites".
 *
 * @author Arjen Poutsma
 * @author Rossen Stoyanchev
 * @author Greg Turnquist
 * @author Sebastien Deleuze
 * @author Sam Brannen
 * @since 3.2
 */
public abstract class RequestBuilders {

	/**
	 * Create a {@link RequestBuilder} for a GET request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder get(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.GET, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a GET request.
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder get(URI uri) {
		return new RequestBuilder(HttpMethod.GET, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for a POST request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder post(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.POST, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a POST request.
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder post(URI uri) {
		return new RequestBuilder(HttpMethod.POST, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for a PUT request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder put(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.PUT, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a PUT request.
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder put(URI uri) {
		return new RequestBuilder(HttpMethod.PUT, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for a PATCH request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder patch(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.PATCH, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a PATCH request.
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder patch(URI uri) {
		return new RequestBuilder(HttpMethod.PATCH, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for a DELETE request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder delete(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.DELETE, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a DELETE request.
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder delete(URI uri) {
		return new RequestBuilder(HttpMethod.DELETE, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for an OPTIONS request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder options(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.OPTIONS, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for an OPTIONS request.
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder options(URI uri) {
		return new RequestBuilder(HttpMethod.OPTIONS, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for a HEAD request.
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 * @since 4.1
	 */
	public static RequestBuilder head(String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(HttpMethod.HEAD, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a HEAD request.
	 * @param uri the URL
	 * @since 4.1
	 */
	public static RequestBuilder head(URI uri) {
		return new RequestBuilder(HttpMethod.HEAD, uri);
	}

	/**
	 * Create a {@link RequestBuilder} for a request with the given HTTP method.
	 * @param httpMethod the HTTP method
	 * @param urlTemplate a URL template; the resulting URL will be encoded
	 * @param urlVariables zero or more URL variables
	 */
	public static RequestBuilder request(HttpMethod httpMethod, String urlTemplate, Object... urlVariables) {
		return new RequestBuilder(httpMethod, urlTemplate, urlVariables);
	}

	/**
	 * Create a {@link RequestBuilder} for a request with the given HTTP method.
	 * @param httpMethod the HTTP method (GET, POST, etc)
	 * @param uri the URL
	 * @since 4.0.3
	 */
	public static RequestBuilder request(HttpMethod httpMethod, URI uri) {
		return new RequestBuilder(httpMethod, uri);
	}


}
