package org.lnu.is.facade.resource.specoffer.subject;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Spec Offer Subject Resource.
 * @author ivanursul
 *
 */
public class SpecOfferSubjectResource extends ApiResource {

	private Long specOfferId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}/subjects/{1}", specOfferId, getId());
	}

	public Long getSpecOfferId() {
		return specOfferId;
	}

	public void setSpecOfferId(final Long specOfferId) {
		this.specOfferId = specOfferId;
	}

}
