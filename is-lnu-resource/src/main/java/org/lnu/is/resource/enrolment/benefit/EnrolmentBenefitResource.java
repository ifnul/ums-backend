package org.lnu.is.resource.enrolment.benefit;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Enrolment Benefit Resource.
 * @author ivanursul
 *
 */
public class EnrolmentBenefitResource extends ApiResource {

	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long enrolmentId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long benefitId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long personPaperId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/{0}/benefits/{1}", enrolmentId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/enrolments/{0}/benefits", enrolmentId);
	}

	public Long getEnrolmentId() {
		return enrolmentId;
	}

	public void setEnrolmentId(final Long enrolmentId) {
		this.enrolmentId = enrolmentId;
	}

	public Long getBenefitId() {
		return benefitId;
	}

	public void setBenefitId(final Long benefitId) {
		this.benefitId = benefitId;
	}

	public Long getPersonPaperId() {
		return personPaperId;
	}

	public void setPersonPaperId(final Long personPaperId) {
		this.personPaperId = personPaperId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((benefitId == null) ? 0 : benefitId.hashCode());
		result = prime * result
				+ ((enrolmentId == null) ? 0 : enrolmentId.hashCode());
		result = prime * result
				+ ((personPaperId == null) ? 0 : personPaperId.hashCode());
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
		EnrolmentBenefitResource other = (EnrolmentBenefitResource) obj;
		if (benefitId == null) {
			if (other.benefitId != null) {
				return false;
			}
		} else if (!benefitId.equals(other.benefitId)) {
			return false;
		}
		if (enrolmentId == null) {
			if (other.enrolmentId != null) {
				return false;
			}
		} else if (!enrolmentId.equals(other.enrolmentId)) {
			return false;
		}
		if (personPaperId == null) {
			if (other.personPaperId != null) {
				return false;
			}
		} else if (!personPaperId.equals(other.personPaperId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentBenefitResource [enrolmentId=" + enrolmentId
				+ ", benefitId=" + benefitId + ", personPaperId="
				+ personPaperId + "]";
	}

}
