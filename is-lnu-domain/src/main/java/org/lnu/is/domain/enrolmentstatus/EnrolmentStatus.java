package org.lnu.is.domain.enrolmentstatus;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolmentstatustype.EnrolmentStatusType;
import org.lnu.is.domain.specofferwave.SpecOfferWave;

/**
 * Enrolment Status entity.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "q_dt_enrolmentstatus")
public class EnrolmentStatus extends Model {
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
	
}
