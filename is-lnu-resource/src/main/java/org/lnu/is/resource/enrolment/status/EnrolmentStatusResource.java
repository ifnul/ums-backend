package org.lnu.is.resource.enrolment.status;

import java.text.MessageFormat;

import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Enrolment Status Resource.
 * @author ivanursul
 *
 */
@CrudableResource
public class EnrolmentStatusResource extends ApiResource {
	
	@NotNull
	private Long enrolmentId;
	
	@NotNull
	private Long specOfferWaveId;
	
	@NotNull
	private Long enrolmentStatusTypeId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/{0}/statuses/{1}", enrolmentId, getId()); 
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/enrolments/{0}/statuses", enrolmentId);
	}

	public Long getEnrolmentId() {
		return enrolmentId;
	}

	public void setEnrolmentId(final Long enrolmentId) {
		this.enrolmentId = enrolmentId;
	}

	public Long getSpecOfferWaveId() {
		return specOfferWaveId;
	}

	public void setSpecOfferWaveId(final Long specOfferWaveId) {
		this.specOfferWaveId = specOfferWaveId;
	}

	public Long getEnrolmentStatusTypeId() {
		return enrolmentStatusTypeId;
	}

	public void setEnrolmentStatusTypeId(final Long enrolmentStatusTypeId) {
		this.enrolmentStatusTypeId = enrolmentStatusTypeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((enrolmentId == null) ? 0 : enrolmentId.hashCode());
		result = prime
				* result
				+ ((enrolmentStatusTypeId == null) ? 0 : enrolmentStatusTypeId
						.hashCode());
		result = prime * result
				+ ((specOfferWaveId == null) ? 0 : specOfferWaveId.hashCode());
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
		EnrolmentStatusResource other = (EnrolmentStatusResource) obj;
		if (enrolmentId == null) {
			if (other.enrolmentId != null) {
				return false;
			}
		} else if (!enrolmentId.equals(other.enrolmentId)) {
			return false;
		}
		if (enrolmentStatusTypeId == null) {
			if (other.enrolmentStatusTypeId != null) {
				return false;
			}
		} else if (!enrolmentStatusTypeId.equals(other.enrolmentStatusTypeId)) {
			return false;
		}
		if (specOfferWaveId == null) {
			if (other.specOfferWaveId != null) {
				return false;
			}
		} else if (!specOfferWaveId.equals(other.specOfferWaveId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentStatusResource [enrolmentId=" + enrolmentId
				+ ", specOfferWaveId=" + specOfferWaveId
				+ ", enrolmentStatusTypeId=" + enrolmentStatusTypeId + "]";
	}

}
