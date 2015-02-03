package org.lnu.is.domain.publicactivity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.timeperiod.TimePeriod;

/**
 * Public Active entity. 
 * @author illay
 *
 */
@OB
@Entity
@Table(name = "q_ob_publicactivity")
public class PublicActivity extends InformationModel {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "publicactivitytype_id")
	private PublicActivityType publicActiveType;
	
	@ManyToOne
	@JoinColumn(name = "timeperiod_id")
	private TimePeriod timePeriod;
	
	@OneToMany(mappedBy = "publicActivity")
	private List<PublicActivityAward> awards;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "begdate") 
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;

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

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public List<PublicActivityAward> getAwards() {
		return awards;
	}

	public void setAwards(final List<PublicActivityAward> awards) {
		this.awards = awards;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
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
		return true;
	}

	@Override
	public String toString() {
		return "PublicActivity [name=" + name + ", begDate=" + begDate
				+ ", enbDate=" + endDate + "]";
	}
	
}
