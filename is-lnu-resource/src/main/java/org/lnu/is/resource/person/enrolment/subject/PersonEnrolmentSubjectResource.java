package org.lnu.is.resource.person.enrolment.subject;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Person Enrolment Subject Resource.
 * 
 * @author kushnir
 *
 */
public class PersonEnrolmentSubjectResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long personPaperId;

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long enrolmentSubjectId;

	@NotNull(message = "Field required")
	private Double mark;

	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/enrolmentsubjects/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/enrolmentsubjects", getId());
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getPersonPaperId() {
		return personPaperId;
	}

	public void setPersonPaperId(final Long personPaperId) {
		this.personPaperId = personPaperId;
	}

	public Long getEnrolmentSubjectId() {
		return enrolmentSubjectId;
	}

	public void setEnrolmentSubjectId(final Long enrolmentSubjectId) {
		this.enrolmentSubjectId = enrolmentSubjectId;
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
		result = prime * result + ((enrolmentSubjectId == null) ? 0 : enrolmentSubjectId.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((personId == null) ? 0 : personId.hashCode());
		result = prime * result + ((personPaperId == null) ? 0 : personPaperId.hashCode());
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
		PersonEnrolmentSubjectResource other = (PersonEnrolmentSubjectResource) obj;
		if (enrolmentSubjectId == null) {
			if (other.enrolmentSubjectId != null) {
				return false;
			}
		} else if (!enrolmentSubjectId.equals(other.enrolmentSubjectId)) {
			return false;
		}
		if (mark == null) {
			if (other.mark != null) {
				return false;
			}
		} else if (!mark.equals(other.mark)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		if (personPaperId == null) {
			if (other.personPaperId != null) {
				return false;
			}
		} else if (!personPaperId.equals(other.personPaperId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonEnrolmentSubjectResource [personId=" + personId + ", personPaperId=" + personPaperId + ", enrolmentSubjectId="
				+ enrolmentSubjectId + ", mark=" + mark + "]";
	}

}
