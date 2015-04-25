package org.lnu.is.domain.enrolment.status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.domain.specoffer.SpecOfferWave;

/**
 * Enrolment Status entity.
 * @author ivanursul
 *
 */
@DT
@Entity
@Table(name = "q_dt_enrolmentstatus")
public class EnrolmentStatus extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "enrolment_id")
	private Enrolment enrolment;
	
	@ManyToOne
	@JoinColumn(name = "specofferwave_id")
	private SpecOfferWave specOfferWave;
	
	@ManyToOne
	@JoinColumn(name = "enrolmentstatustype_id")
	private EnrolmentStatusType enrolmentStatusType;

	@Column(name = "isstate")
	private Integer isState;
	
	@Column(name = "iscontract")
	private Integer isContract;
	
	public Enrolment getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(final Enrolment enrolment) {
		this.enrolment = enrolment;
	}

	public SpecOfferWave getSpecOfferWave() {
		return specOfferWave;
	}

	public void setSpecOfferWave(final SpecOfferWave specOfferWave) {
		this.specOfferWave = specOfferWave;
	}

	public EnrolmentStatusType getEnrolmentStatusType() {
		return enrolmentStatusType;
	}

	public void setEnrolmentStatusType(final EnrolmentStatusType enrolmentStatusType) {
		this.enrolmentStatusType = enrolmentStatusType;
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

	@Override
	public int hashCode() {
	    final int prime = 31;
	    int result = super.hashCode();
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
	    EnrolmentStatus other = (EnrolmentStatus) obj;
	    if (isContract == null) {
		if (other.isContract != null) {
		    return false;
		}
	    } else if (!isContract.equals(other.isContract)) {
		return false;
	    }
	    if (isState == null) {
		if (other.isState != null) {
		    return false;
		}
	    } else if (!isState.equals(other.isState)) {
		return false;
	    }
	    return true;
	}

	@Override
	public String toString() {
	    return "EnrolmentStatus [isState=" + isState + ", isContract="
		    + isContract + "]";
	}
	
	
}
