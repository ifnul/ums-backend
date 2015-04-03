package org.lnu.is.domain.specoffer;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.wave.type.WaveType;

/**
 * SpecOffer Wave entity.
 * @author ivanursul
 *
 */
@OD
@Entity
@Table(name = "q_od_specofferwave")
public class SpecOfferWave extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "specoffer_id")
	private SpecOffer specOffer;

	@ManyToOne
	@JoinColumn(name = "wavetype_id")
	private WaveType waveType;
	
	@Column(name = "liccount")
	private Integer licCount;
	
	@Column(name = "statecount")
	private Integer stateCount;
	
	@Column(name = "benefitcount")
	private Integer benefitCount;
	
	@Column(name = "targetcount")
	private Integer targetCount;

	@Column(name = "begdate")
	private Date beginDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
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

	public WaveType getWaveType() {
		return waveType;
	}

	public void setWaveType(final WaveType waveType) {
		this.waveType = waveType;
	}

	public SpecOffer getSpecOffer() {
		return specOffer;
	}

	public void setSpecOffer(final SpecOffer specOffer) {
		this.specOffer = specOffer;
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
				+ ((stateCount == null) ? 0 : stateCount.hashCode());
		result = prime * result
				+ ((targetCount == null) ? 0 : targetCount.hashCode());
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
		SpecOfferWave other = (SpecOfferWave) obj;
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
		if (beginDate == null) {
			if (other.beginDate != null) {
				return false;
			}
		} else if (!beginDate.equals(other.beginDate)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferWave [licCount=" + licCount + ", stateCount="
				+ stateCount + ", benefitCount=" + benefitCount
				+ ", targetCount=" + targetCount + ", begDate=" + beginDate
				+ ", endDate=" + endDate + "]";
	}
	
}
