package org.lnu.is.domain.specoffer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.wavetype.WaveType;

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
	@JoinColumn(name = "wavetype_id")
	private WaveType waveType;
	
	@ManyToOne
	@JoinColumn(name = "specoffer_id")
	private SpecOffer specOffer;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@Column(name = "liccount")
	private Integer licCount;
	
	@Column(name = "statecount")
	private Integer stateCount;
	
	@Column(name = "benefitcount")
	private Integer benefitCount;
	
	@Column(name = "targetcount")
	private Integer targetCount;

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

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
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
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferWave [licCount=" + licCount + ", stateCount="
				+ stateCount + ", benefitCount=" + benefitCount
				+ ", targetCount=" + targetCount + "]";
	}
	
}
