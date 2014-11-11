package org.lnu.is.facade.resource.timeperiod;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Time Period Resource.
 * @author ivanursul
 *
 */
public class TimePeriodResource extends ApiResource {

	private Long parentId;

	private Long timePeriodTypeId;
	
	private String name;
	
	private Integer numValue;
	
	private Date begDate;
	
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/timeperiods/{0}", getId());
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public Long getTimePeriodTypeId() {
		return timePeriodTypeId;
	}

	public void setTimePeriodTypeId(final Long timePeriodTypeId) {
		this.timePeriodTypeId = timePeriodTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getNumValue() {
		return numValue;
	}

	public void setNumValue(final Integer numValue) {
		this.numValue = numValue;
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
		result = prime * result
				+ ((numValue == null) ? 0 : numValue.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		result = prime
				* result
				+ ((timePeriodTypeId == null) ? 0 : timePeriodTypeId.hashCode());
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
		TimePeriodResource other = (TimePeriodResource) obj;
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
		if (numValue == null) {
			if (other.numValue != null) {
				return false;
			}
		} else if (!numValue.equals(other.numValue)) {
			return false;
		}
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		if (timePeriodTypeId == null) {
			if (other.timePeriodTypeId != null) {
				return false;
			}
		} else if (!timePeriodTypeId.equals(other.timePeriodTypeId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TimePeriodResource [parentId=" + parentId
				+ ", timePeriodTypeId=" + timePeriodTypeId + ", name=" + name
				+ ", numValue=" + numValue + ", begDate=" + begDate
				+ ", endDate=" + endDate + "]";
	}

}
