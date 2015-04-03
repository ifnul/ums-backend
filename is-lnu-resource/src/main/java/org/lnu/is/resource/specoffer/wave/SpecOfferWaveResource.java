package org.lnu.is.resource.specoffer.wave;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Spec Offer Wave Resource.
 * @author ivanursul
 *
 */
public class SpecOfferWaveResource extends ApiResource {

	@NotNull
	private Long specOfferId;

	@NotNull
	private Long waveTypeId;
	
	@NotNull
	private Integer licCount;
	
	@NotNull
	private Integer stateCount;
	
	@NotNull
	private Integer benefitCount;
	
	@NotNull
	private Integer targetCount;
	
	@NotNull(message = "Field required")
	private Date beginDate;
	
	@NotNull(message = "Field required")
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}/waves/{1}", specOfferId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/specoffers/{0}/waves", specOfferId);
	}
	
	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(final Date beginDate) {
		this.beginDate = beginDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public Long getSpecOfferId() {
		return specOfferId;
	}

	public void setSpecOfferId(final Long specOfferId) {
		this.specOfferId = specOfferId;
	}

	public Long getWaveTypeId() {
		return waveTypeId;
	}

	public void setWaveTypeId(final Long waveTypeId) {
		this.waveTypeId = waveTypeId;
	}

	public Integer getLicCount() {
		return licCount;
	}

	public void setLicCount(final Integer licCount) {
		this.licCount = licCount;
	}

	public Integer getStateCount() {
		return stateCount;
	}

	public void setStateCount(final Integer stateCount) {
		this.stateCount = stateCount;
	}

	public Integer getBenefitCount() {
		return benefitCount;
	}

	public void setBenefitCount(final Integer benefitCount) {
		this.benefitCount = benefitCount;
	}

	public Integer getTargetCount() {
		return targetCount;
	}

	public void setTargetCount(final Integer targetCount) {
		this.targetCount = targetCount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((benefitCount == null) ? 0 : benefitCount.hashCode());
		result = prime * result
				+ ((licCount == null) ? 0 : licCount.hashCode());
		result = prime * result
				+ ((specOfferId == null) ? 0 : specOfferId.hashCode());
		result = prime * result
				+ ((stateCount == null) ? 0 : stateCount.hashCode());
		result = prime * result
				+ ((targetCount == null) ? 0 : targetCount.hashCode());
		result = prime * result
				+ ((waveTypeId == null) ? 0 : waveTypeId.hashCode());
		result = prime * result
				+ ((beginDate == null) ? 0 : beginDate.hashCode());
		result = prime * result
				+ ((endDate == null) ? 0 : endDate.hashCode());
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
		SpecOfferWaveResource other = (SpecOfferWaveResource) obj;
		if (benefitCount == null) {
			if (other.benefitCount != null) {
				return false;
			}
		} else if (!benefitCount.equals(other.benefitCount)) {
			return false;
		}
		if (licCount == null) {
			if (other.licCount != null) {
				return false;
			}
		} else if (!licCount.equals(other.licCount)) {
			return false;
		}
		if (specOfferId == null) {
			if (other.specOfferId != null) {
				return false;
			}
		} else if (!specOfferId.equals(other.specOfferId)) {
			return false;
		}
		if (stateCount == null) {
			if (other.stateCount != null) {
				return false;
			}
		} else if (!stateCount.equals(other.stateCount)) {
			return false;
		}
		if (targetCount == null) {
			if (other.targetCount != null) {
				return false;
			}
		} else if (!targetCount.equals(other.targetCount)) {
			return false;
		}
		if (waveTypeId == null) {
			if (other.waveTypeId != null) {
				return false;
			}
		} else if (!waveTypeId.equals(other.waveTypeId)) {
			return false;
		}
		if (beginDate == null) {
			if (other.beginDate != null) {
				return false;
			}
		} else if (!beginDate.equals(other.beginDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferWaveResource [specOfferId=" + specOfferId
				+ ", waveTypeId=" + waveTypeId + ", licCount=" + licCount
				+ ", stateCount=" + stateCount + ", benefitCount="
				+ benefitCount + ", targetCount=" + targetCount + ", begDate="
				+ beginDate + ", endDate=" + endDate + "]";
	}

}
