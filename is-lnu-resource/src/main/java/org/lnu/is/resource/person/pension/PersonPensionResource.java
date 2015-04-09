package org.lnu.is.resource.person.pension;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;

import org.lnu.is.resource.ApiResource;

/**
 * Person Pension Resource.
 * @author ivanursul
 *
 */
public class PersonPensionResource extends ApiResource {

	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long pensionTypeId;
	
	private Date begDate;
	
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/pensions/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/pensions", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getPensionTypeId() {
		return pensionTypeId;
	}

	public void setPensionTypeId(final Long pensionTypeId) {
		this.pensionTypeId = pensionTypeId;
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
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((pensionTypeId == null) ? 0 : pensionTypeId.hashCode());
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
		PersonPensionResource other = (PersonPensionResource) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (pensionTypeId == null) {
			if (other.pensionTypeId != null) {
				return false;
			}
		} else if (!pensionTypeId.equals(other.pensionTypeId)) {
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
		return "PersonPensionResource [personId=" + personId
				+ ", pensionTypeId=" + pensionTypeId + ", begDate=" + begDate
				+ ", endDate=" + endDate + "]";
	}

}
