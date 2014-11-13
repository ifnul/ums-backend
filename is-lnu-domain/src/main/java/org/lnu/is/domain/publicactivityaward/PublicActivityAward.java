package org.lnu.is.domain.publicactivityaward;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.domain.publicactivity.PublicActivity;
/**
 * Public Activity Award entity.
 * @author illay
 *
 */
@Entity
@Table(name = "q_od_publicactivityaward")
public class PublicActivityAward extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "publicactivity_id")
	private PublicActivity publicActivity;
	
	@ManyToOne
	@JoinColumn(name = "enrolsubject_id")
	private EnrolmentSubject enrolmentSubject;
	
	@Column(name = "awardname")
	private String awardname;
	
	@Column(name = "bonus")
	private Double bonus;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;

	public PublicActivity getPublicActivity() {
		return publicActivity;
	}

	public void setPublicActivity(final PublicActivity publicActivity) {
		this.publicActivity = publicActivity;
	}

	public EnrolmentSubject getEnrolmentSubject() {
		return enrolmentSubject;
	}

	public void setEnrolmentSubject(final EnrolmentSubject enrolmentSubject) {
		this.enrolmentSubject = enrolmentSubject;
	}

	public String getAwardname() {
		return awardname;
	}

	public void setAwardname(final String awardname) {
		this.awardname = awardname;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(final Double bonus) {
		this.bonus = bonus;
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
		result = prime * result
				+ ((awardname == null) ? 0 : awardname.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
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
		PublicActivityAward other = (PublicActivityAward) obj;
		if (awardname == null) {
			if (other.awardname != null) {
				return false;
			}
		} else if (!awardname.equals(other.awardname)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (bonus == null) {
			if (other.bonus != null) {
				return false;
			}
		} else if (!bonus.equals(other.bonus)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PublicActivityAward [awardname=" + awardname + ", bonus="
				+ bonus + ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}
	
	
}
