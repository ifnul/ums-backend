package org.lnu.is.facade.resource.person.address;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Person Address resource.
 * @author ivanursul
 *
 */
public class PersonAddressResource extends ApiResource {

	private Long personId;

	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/addresses/{1}", personId, getId());
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

}
