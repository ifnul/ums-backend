package org.lnu.is.resource.enrolment;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.CrudableResource;

import java.util.Objects;

/**
 * Enrolment Resource.
 * 
 * @author kushnir
 *
 */
@CrudableResource
public class EnrolmentRatingResource {

	private long enrolmentId;

	private double kb;

	private int ratingPriority;

	private Long personId;

	private String firstname;

	private String fathername;

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
		EnrolmentRatingResource that = (EnrolmentRatingResource) o;
		return enrolmentId == that.enrolmentId &&
				Double.compare(that.kb, kb) == 0 &&
				ratingPriority == that.ratingPriority &&
				Objects.equals(personId, that.personId) &&
				Objects.equals(firstname, that.firstname) &&
				Objects.equals(fathername, that.fathername) &&
				Objects.equals(surname, that.surname);
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
