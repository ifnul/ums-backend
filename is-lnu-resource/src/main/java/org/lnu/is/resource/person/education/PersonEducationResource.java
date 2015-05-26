package org.lnu.is.resource.person.education;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Person Education resource.
 * @author ivanursul
 *
 */
public class PersonEducationResource extends ApiResource {

	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long educationTypeId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long personPaperId;
	
	@NotNull
	private Date begDate;
	
	@NotNull
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/educations/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/educations", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getEducationTypeId() {
		return educationTypeId;
	}

	public void setEducationTypeId(final Long educationTypeId) {
		this.educationTypeId = educationTypeId;
	}

	public Long getPersonPaperId() {
		return personPaperId;
	}

	public void setPersonPaperId(final Long personPaperId) {
		this.personPaperId = personPaperId;
	}

	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(final Date begDate) {
		this.begDate = begDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((educationTypeId == null) ? 0 : educationTypeId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
		result = prime * result
				+ ((personPaperId == null) ? 0 : personPaperId.hashCode());
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
		PersonEducationResource other = (PersonEducationResource) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (educationTypeId == null) {
			if (other.educationTypeId != null) {
				return false;
			}
		} else if (!educationTypeId.equals(other.educationTypeId)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
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
		return "PersonEducationResource [personId=" + personId
				+ ", educationTypeId=" + educationTypeId + ", personPaperId="
				+ personPaperId + ", begDate=" + begDate + ", endDate="
				+ endDate + "]";
	}

}
