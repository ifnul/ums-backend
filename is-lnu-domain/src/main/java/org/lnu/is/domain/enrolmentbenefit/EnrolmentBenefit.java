package org.lnu.is.domain.enrolmentbenefit;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;

/**
 * Enrolment benefit entity.
 * @author ivanursul
 *
 */
@DT
@Entity
@Table(name = "q_dt_enrolmentbenefit")
public class EnrolmentBenefit extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "enrolment_id")
	private Enrolment enrolment;
	
	@ManyToOne
	@JoinColumn(name = "benefit_id")
	private Benefit benefit;

	public Enrolment getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(final Enrolment enrolment) {
		this.enrolment = enrolment;
	}

	public Benefit getBenefit() {
		return benefit;
	}

	public void setBenefit(final Benefit benefit) {
		this.benefit = benefit;
	}
	
}
