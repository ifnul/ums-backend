package org.lnu.is.domain.enrolment.enrolment.subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;

/**
 * Enrolment Subject entity.
 * @author ivanursul
 *
 */
@DT
@Entity
@Table(name = "q_dt_enrolmentenrolsubject")
public class EnrolmentEnrolmentSubject extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "enrolment_id")
	private Enrolment enrolment;
	
	@ManyToOne
	@JoinColumn(name = "enrolsubject_id")
	private EnrolmentSubject enrolmentSubject;
	
	@ManyToOne
	@JoinColumn(name = "personenrolsubject_id")
	private PersonEnrolmentSubject personEnrolmentSubject;
	
	@Column(name = "mark")
	private Double mark;

	public Enrolment getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(final Enrolment enrolment) {
		this.enrolment = enrolment;
	}

	public EnrolmentSubject getEnrolmentSubject() {
		return enrolmentSubject;
	}

	public void setEnrolmentSubject(final EnrolmentSubject enrolmentSubject) {
		this.enrolmentSubject = enrolmentSubject;
	}

	public PersonEnrolmentSubject getPersonEnrolmentSubject() {
		return personEnrolmentSubject;
	}

	public void setPersonEnrolmentSubject(
			final PersonEnrolmentSubject personEnrolmentSubject) {
		this.personEnrolmentSubject = personEnrolmentSubject;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(final Double mark) {
		this.mark = mark;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
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
		EnrolmentEnrolmentSubject other = (EnrolmentEnrolmentSubject) obj;
		if (mark == null) {
			if (other.mark != null) {
				return false;
			}
		} else if (!mark.equals(other.mark)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentEnrolSubject [mark=" + mark + "]";
	}
	
}
