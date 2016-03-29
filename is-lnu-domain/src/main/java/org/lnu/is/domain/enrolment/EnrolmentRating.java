package org.lnu.is.domain.enrolment;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.NativeQueryResultColumn;
import org.lnu.is.annotation.NativeQueryResultEntity;

import java.util.Objects;

/**
 * Enrolment entity.
 * @author ivanursul
 *
 */
@NativeQueryResultEntity
public class EnrolmentRating {
	private static final long serialVersionUID = 1L;

	@NativeQueryResultColumn(index = 0)
	private long enrolmentId;

	@NativeQueryResultColumn(index = 1)
	private double kb;

	@NativeQueryResultColumn(index = 2)
	private int ratingPriority;

	@NativeQueryResultColumn(index = 3)
	private Long personId;

	@NativeQueryResultColumn(index = 4)
	private String firstname;

	@NativeQueryResultColumn(index = 5)
	private String fathername;

	@NativeQueryResultColumn(index = 6)
	private String surname;

	public long getEnrolmentId() {
		return enrolmentId;
	}

	public void setEnrolmentId(long enrolmentId) {
		this.enrolmentId = enrolmentId;
	}

	public double getKb() {
		return kb;
	}

	public void setKb(double kb) {
		this.kb = kb;
	}

	public int getRatingPriority() {
		return ratingPriority;
	}

	public void setRatingPriority(int ratingPriority) {
		this.ratingPriority = ratingPriority;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		EnrolmentRating rating = (EnrolmentRating) o;
		return enrolmentId == rating.enrolmentId &&
				Double.compare(rating.kb, kb) == 0 &&
				ratingPriority == rating.ratingPriority &&
				Objects.equals(personId, rating.personId) &&
				Objects.equals(firstname, rating.firstname) &&
				Objects.equals(fathername, rating.fathername) &&
				Objects.equals(surname, rating.surname);
	}

	@Override
	public int hashCode() {
		return Objects.hash(enrolmentId, kb, ratingPriority, personId, firstname, fathername, surname);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("enrolmentId", enrolmentId)
				.append("kb", kb)
				.append("ratingPriority", ratingPriority)
				.append("personId", personId)
				.append("firstname", firstname)
				.append("fathername", fathername)
				.append("surname", surname)
				.toString();
	}
}
