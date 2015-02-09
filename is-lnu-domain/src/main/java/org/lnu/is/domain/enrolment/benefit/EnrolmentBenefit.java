package org.lnu.is.domain.enrolment.benefit;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.person.PersonPaper;

/**
 * Enrolment benefit entity.
 * @author ivanursul
 *
 */
@DT
@Entity
@Table(name = "q_dt_enrolmentbenefit")
public class EnrolmentBenefit extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "enrolment_id")
	private Enrolment enrolment;
	
	@ManyToOne
	@JoinColumn(name = "benefit_id")
	private Benefit benefit;
	
	@ManyToOne
	@JoinColumn(name = "personpaper_id")
	private PersonPaper personPaper;
	
	public PersonPaper getPersonPaper() {
		return personPaper;
	}

	public void setPersonPaper(final PersonPaper personpaper) {
		this.personPaper = personpaper;
	}

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
