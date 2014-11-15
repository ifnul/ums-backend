package org.lnu.is.domain.publicactivity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.publicactivitytype.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;

/**
 * Public Active entity. 
 * @author illay
 *
 */
@OB
@Entity
@Table(name = "q_ob_publicactivity")
public class PublicActivity extends Model {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "publicactivitytype_id")
	private PublicActivityType publicActiveType;
	
	@ManyToOne
	@JoinColumn(name = "timeperiod_id")
	private TimePeriod timePeriod;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "begdate") 
	private Date begDate;
	
	@Column(name = "enddate")
	private Date enbDate;

	public PublicActivityType getPublicActiveType() {
		return publicActiveType;
	}

	public void setPublicActiveType(final PublicActivityType publicActiveType) {
		this.publicActiveType = publicActiveType;
	}

	public TimePeriod getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(final TimePeriod timePeriod) {
		this.timePeriod = timePeriod;
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

	public Date getEnbDate() {
		return enbDate;
	}

	public void setEnbDate(final Date enbDate) {
		this.enbDate = enbDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((enbDate == null) ? 0 : enbDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		PublicActivity other = (PublicActivity) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (enbDate == null) {
			if (other.enbDate != null) {
				return false;
			}
		} else if (!enbDate.equals(other.enbDate)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PublicActivity [name=" + name + ", begDate=" + begDate
				+ ", enbDate=" + enbDate + "]";
	}
	
}
