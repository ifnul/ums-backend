package org.lnu.is.resource.degree;

import java.text.MessageFormat;

import javax.validation.constraints.Min;

import org.lnu.is.resource.ApiResource;

/**
 * Degree Resource.
 * @author ivanursul
 *
 */
public class DegreeResource extends ApiResource {

	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;

	@Min(value = 1, message = "Minimal value is 1")
	private Long degreeTypeId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/degrees/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/degrees";
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getDegreeTypeId() {
		return degreeTypeId;
	}

	public void setDegreeTypeId(final Long degreeTypeId) {
		this.degreeTypeId = degreeTypeId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((degreeTypeId == null) ? 0 : degreeTypeId.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
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
		DegreeResource other = (DegreeResource) obj;
		if (degreeTypeId == null) {
			if (other.degreeTypeId != null) {
				return false;
			}
		} else if (!degreeTypeId.equals(other.degreeTypeId)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DegreeResource [personId=" + personId + ", degreeTypeId="
				+ degreeTypeId + "]";
	}

}
