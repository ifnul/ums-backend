package org.lnu.is.resource.publicactivity;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.resource.ApiResource;

/**
 * Public Activity Resource.
 * @author ivanursul
 *
 */
public class PublicActivityResource extends ApiResource {

	private Long publicActivityTypeId;
	
	private Long timePeriodId;
	
	private String name;
	
	private Date begDate;
	
	private Date endDate;

	@Override
	public String getUri() {
		return MessageFormat.format("/publicactivities/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/publicactivities";
	}

	public Long getPublicActivityTypeId() {
		return publicActivityTypeId;
	}

	public void setPublicActivityTypeId(final Long publicActiveTypeId) {
		this.publicActivityTypeId = publicActiveTypeId;
	}

	public Long getTimePeriodId() {
		return timePeriodId;
	}

	public void setTimePeriodId(final Long timePeriodId) {
		this.timePeriodId = timePeriodId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime
				* result
				+ ((publicActivityTypeId == null) ? 0 : publicActivityTypeId
						.hashCode());
		result = prime * result
				+ ((timePeriodId == null) ? 0 : timePeriodId.hashCode());
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
		PublicActivityResource other = (PublicActivityResource) obj;
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
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (publicActivityTypeId == null) {
			if (other.publicActivityTypeId != null) {
				return false;
			}
		} else if (!publicActivityTypeId.equals(other.publicActivityTypeId)) {
			return false;
		}
		if (timePeriodId == null) {
			if (other.timePeriodId != null) {
				return false;
			}
		} else if (!timePeriodId.equals(other.timePeriodId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PublicActivityResource [publicActiveTypeId="
				+ publicActivityTypeId + ", timePeriodId=" + timePeriodId
				+ ", name=" + name + ", begDate=" + begDate + ", endDate="
				+ endDate + "]";
	}
	
}
