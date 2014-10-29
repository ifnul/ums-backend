package org.lnu.is.domain.timeperiod;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.timeperiodtype.TimePeriodType;

/**
 * Entity, that describes time period.
 * @author ivanursul
 *
 */
@Entity(name = "q_ob_timeperiod")
@Table
public class TimePeriod extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private TimePeriod parent;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "timeperiodtype_id")
	private TimePeriodType timePeriodType;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "numvalue")
	private Integer numValue;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;

	public TimePeriod getParent() {
		return parent;
	}

	public void setParent(final TimePeriod parent) {
		this.parent = parent;
	}

	public TimePeriodType getTimePeriodType() {
		return timePeriodType;
	}

	public void setTimePeriodType(final TimePeriodType timePeriodType) {
		this.timePeriodType = timePeriodType;
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
		return new Date(begDate.getTime());
	}

	public void setBegDate(final Date begDate) {
		this.begDate = new Date(begDate.getTime());
	}

	public Date getEndDate() {
		return new Date(endDate.getTime());
	}

	public void setEndDate(final Date endDate) {
		this.endDate = new Date(endDate.getTime());
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
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
				+ ((timePeriodType == null) ? 0 : timePeriodType.hashCode());
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
		TimePeriod other = (TimePeriod) obj;
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
		if (timePeriodType != other.timePeriodType) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "TimePeriod [timePeriodType=" + timePeriodType + ", name="
				+ name + ", numValue=" + numValue + ", begDate=" + begDate
				+ ", endDate=" + endDate + "]";
	}
	
}
