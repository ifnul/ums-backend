package org.lnu.is.resource.specoffer.benefit;

import java.text.MessageFormat;

import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Resource for spec offer benefit.
 * @author ivanursul
 *
 */
@CrudableResource
public class SpecOfferBenefitResource extends ApiResource {

	@NotNull(message = "Field required")
	private Long specOfferId;

	@NotNull(message = "Field required")
	private Long benefitId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}/benefits/{1}", specOfferId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/specoffers/{0}/benefits", specOfferId);
	}

	public Long getSpecOfferId() {
		return specOfferId;
	}

	public void setSpecOfferId(final Long specOfferId) {
		this.specOfferId = specOfferId;
	}

	public Long getBenefitId() {
		return benefitId;
	}

	public void setBenefitId(final Long benefitId) {
		this.benefitId = benefitId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((benefitId == null) ? 0 : benefitId.hashCode());
		result = prime * result
				+ ((specOfferId == null) ? 0 : specOfferId.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SpecOfferBenefitResource other = (SpecOfferBenefitResource) obj;
		if (benefitId == null) {
			if (other.benefitId != null) {
				return false;
			}
		} else if (!benefitId.equals(other.benefitId)) {
			return false;
		}
		if (specOfferId == null) {
			if (other.specOfferId != null) {
				return false;
			}
		} else if (!specOfferId.equals(other.specOfferId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferBenefitResource [specOfferId=" + specOfferId
				+ ", benefitId=" + benefitId + "]";
	}

}
