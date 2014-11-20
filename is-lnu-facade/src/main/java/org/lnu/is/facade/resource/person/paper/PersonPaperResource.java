package org.lnu.is.facade.resource.person.paper;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Person paper resource.
 * @author ivanursul
 *
 */
public class PersonPaperResource extends ApiResource {

	private String personId;

	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/papers/{1}", personId, getId());
	}

}
