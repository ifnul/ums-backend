package org.lnu.is.domain.personenrolmentsubject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.personpaper.PersonPaper;

/**
 * Person Enrolment Subject entity.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "q_od_personenrolsubject")
public class PersonEnrolmentSubject extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "personpaper_id")
	private PersonPaper personPaper;
	
	@ManyToOne
	@JoinColumn(name = "enrolsubject_id")
	private EnrolmentSubject enrolmentSubject;
	
	@Column(name = "mark")
	private Double mark;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public PersonPaper getPersonPaper() {
		return personPaper;
	}

	public void setPersonPaper(final PersonPaper personPaper) {
		this.personPaper = personPaper;
	}

	public EnrolmentSubject getEnrolmentSubject() {
		return enrolmentSubject;
	}

	public void setEnrolmentSubject(final EnrolmentSubject enrolmentSubject) {
		this.enrolmentSubject = enrolmentSubject;
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
		PersonEnrolmentSubject other = (PersonEnrolmentSubject) obj;
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
		return "PersonEnrolmentSubject [mark=" + mark + "]";
	}
	
}
