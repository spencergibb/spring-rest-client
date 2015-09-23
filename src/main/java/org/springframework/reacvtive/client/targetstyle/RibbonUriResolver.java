package org.springframework.reacvtive.client.targetstyle;

import lombok.Value;

import java.net.URL;

/**
 * @author Spencer Gibb
 */
@Value
public class RibbonUriResolver implements UriResolver {

	private final String name;

	@Override
	public URL resolve() {
		return null;
	}
}
