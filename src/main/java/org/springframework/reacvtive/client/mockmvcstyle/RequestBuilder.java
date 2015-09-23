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
import java.security.Principal;
import java.util.Locale;

import lombok.Data;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

public class RequestBuilder {

	RequestBuilder(){}

	RequestBuilder(HttpMethod httpMethod, String urlTemplate, Object... urlVariables) {
	}

	RequestBuilder(HttpMethod httpMethod, URI uri) {
	}


	public RequestBuilder param(String name, String... values) {
		return this;
	}

	public RequestBuilder header(String name, Object... values) {
		return this;
	}

	public RequestBuilder headers(HttpHeaders httpHeaders) {
		return this;
	}

	public RequestBuilder contentType(MediaType contentType) {
		return this;
	}

	public RequestBuilder contentType(String contentType) {
		return this;
	}

	public RequestBuilder accept(MediaType... mediaTypes) {
		return this;
	}

	public RequestBuilder accept(String... mediaTypes) {
		return this;
	}

	public RequestBuilder content(Object content) {
		return this;
	}

	/*public RequestBuilder cookie(Cookie... cookies) {
		return this;
	}*/

	public RequestBuilder locale(Locale locale) {
		return this;
	}

	public RequestBuilder characterEncoding(String encoding) {
		return this;
	}

	/*public RequestBuilder requestAttr(String name, Object value) {
		return this;
	}

	public RequestBuilder sessionAttr(String name, Object value) {
		return this;
	}

	public RequestBuilder sessionAttrs(Map<String, Object> sessionAttributes) {
		return this;
	}

	public RequestBuilder flashAttrs(Map<String, Object> flashAttributes) {
		return this;
	}

	public RequestBuilder session(MockHttpSession session) {
		return this;
	}*/

	public RequestBuilder principal(Principal principal) {
		return this;
	}

	public RequestBuilder contextPath(String contextPath) {
		return this;
	}

	public RequestBuilder pathInfo(String pathInfo) {
		return this;
	}

	public RequestBuilder secure(boolean secure){
		return this;
	}

	public <T> TypedRequestBuilder<T> as(ParameterizedTypeReference<T> typeRef) {
		return new TypedRequestBuilder<>(this, typeRef);
	}

	public <T> TypedRequestBuilder<T> as(Class<T> clazz) {
		return new TypedRequestBuilder<>(this, clazz);
	}

	/*public RequestBuilder with(RequestPostProcessor postProcessor) {
		Assert.notNull(postProcessor, "postProcessor is required");
		this.postProcessors.add(postProcessor);
		return this;
	}*/

	@Data
	class TypedRequestBuilder<T> extends RequestBuilder {
		RequestBuilder builder;
		Class<T> clazz;
		ParameterizedTypeReference<T> typeRef;

		public TypedRequestBuilder(RequestBuilder builder, Class<T> clazz) {
			this.builder = builder;
			this.clazz = clazz;
		}

		public TypedRequestBuilder(RequestBuilder builder, ParameterizedTypeReference<T> typeRef) {
			this.builder = builder;
			this.typeRef = typeRef;
		}
	}


}
