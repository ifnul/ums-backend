package org.lnu.is.resource.enrolment.status;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
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
	@Min(value = 1, message = "Minimal value is 1")
	private Long enrolmentId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long specOfferWaveId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long enrolmentStatusTypeId;
	
	@NotNull
	private Integer isState;
	
	@NotNull
	private Integer isContract;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/{0}/statuses/{1}", enrolmentId, getId()); 
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/enrolments/{0}/statuses", enrolmentId);
	}

	public Integer getIsState() {
	    return isState;
	}

	public void setIsState(final Integer isState) {
	    this.isState = isState;
	}

	public Integer getIsContract() {
	    return isContract;
	}

	public void setIsContract(final Integer isContract) {
	    this.isContract = isContract;
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
		result = prime * result
			+ ((isContract == null) ? 0 : isContract.hashCode());
		result = prime * result
			+ ((isState == null) ? 0 : isState.hashCode());
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
		if (isState == null) {
			if (other.isState != null) {
				return false;
			}
		} else if (!isState.equals(other.isState)) {
			return false;
		}
		if (isContract == null) {
			if (other.isContract != null) {
				return false;
			}
		} else if (!isContract.equals(other.isContract)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
	    return "EnrolmentStatusResource [enrolmentId=" + enrolmentId
		    + ", specOfferWaveId=" + specOfferWaveId
		    + ", enrolmentStatusTypeId=" + enrolmentStatusTypeId
		    + ", isState=" + isState + ", isContract=" + isContract
		    + "]";
	}

	

}
