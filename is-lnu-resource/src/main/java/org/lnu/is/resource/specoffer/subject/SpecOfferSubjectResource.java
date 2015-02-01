package org.lnu.is.resource.specoffer.subject;

import java.text.MessageFormat;

import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Spec Offer Subject Resource.
 * @author ivanursul
 *
 */
@CrudableResource
public class SpecOfferSubjectResource extends ApiResource {

	@NotNull(message = "Field required")
	private Long specOfferId;
	
	@NotNull(message = "Field required")
	private Long enrolmentSubjectId;
	
	@NotNull(message = "Field required")
	private Boolean isMajor;
	
	@NotNull(message = "Field required")
	private Boolean alternative;
	
	@NotNull(message = "Field required")
	private Double mark;
	
	@NotNull(message = "Field required")
	private Double weightSubject;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}/subjects/{1}", specOfferId, getId());
	}
	
	@Override
	public String getRootUri() {
		return MessageFormat.format("/specoffers/{0}/subjects", specOfferId);
	}

	public Long getSpecOfferId() {
		return specOfferId;
	}

	public void setSpecOfferId(final Long specOfferId) {
		this.specOfferId = specOfferId;
	}

	public Long getEnrolmentSubjectId() {
		return enrolmentSubjectId;
	}

	public void setEnrolmentSubjectId(final Long enrolmentSubjectId) {
		this.enrolmentSubjectId = enrolmentSubjectId;
	}

	public Boolean getIsMajor() {
		return isMajor;
	}

	public void setIsMajor(final Boolean isMajor) {
		this.isMajor = isMajor;
	}

	public Boolean getAlternative() {
		return alternative;
	}

	public void setAlternative(final Boolean alternative) {
		this.alternative = alternative;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(final Double mark) {
		this.mark = mark;
	}

	public Double getWeightSubject() {
		return weightSubject;
	}

	public void setWeightSubject(final Double weightSubject) {
		this.weightSubject = weightSubject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((alternative == null) ? 0 : alternative.hashCode());
		result = prime
				* result
				+ ((enrolmentSubjectId == null) ? 0 : enrolmentSubjectId
						.hashCode());
		result = prime * result + ((isMajor == null) ? 0 : isMajor.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result
				+ ((specOfferId == null) ? 0 : specOfferId.hashCode());
		result = prime * result + ((weightSubject == null) ? 0 : weightSubject.hashCode());
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
		SpecOfferSubjectResource other = (SpecOfferSubjectResource) obj;
		if (alternative == null) {
			if (other.alternative != null) {
				return false;
			}
		} else if (!alternative.equals(other.alternative)) {
			return false;
		}
		if (enrolmentSubjectId == null) {
			if (other.enrolmentSubjectId != null) {
				return false;
			}
		} else if (!enrolmentSubjectId.equals(other.enrolmentSubjectId)) {
			return false;
		}
		if (isMajor == null) {
			if (other.isMajor != null) {
				return false;
			}
		} else if (!isMajor.equals(other.isMajor)) {
			return false;
		}
		if (mark == null) {
			if (other.mark != null) {
				return false;
			}
		} else if (!mark.equals(other.mark)) {
			return false;
		}
		if (specOfferId == null) {
			if (other.specOfferId != null) {
				return false;
			}
		} else if (!specOfferId.equals(other.specOfferId)) {
			return false;
		}
		if (weightSubject == null) {
			if (other.weightSubject != null) {
				return false;
			}
		} else if (!weightSubject.equals(other.weightSubject)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferSubjectResource [specOfferId=" + specOfferId
				+ ", enrolmentSubjectId=" + enrolmentSubjectId + ", isMajor="
				+ isMajor + ", alternative=" + alternative + ", mark=" + mark
				+ ", weightSubject=" + weightSubject + "]";
	}

}
