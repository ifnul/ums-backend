package org.lnu.is.domain.personwork;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.specstagetype.SpecStageType;
/**
 * Person Work entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_personwork")
public class PersonWork extends Model {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name  = "person_id")
	private Person person;
	
	@Column(name = "organizationname")
	private String organizationName;
	
	@Column(name = "postname")
	private String postName;
	
	@ManyToOne()
	@JoinColumn(name = "jobtype_id")
	private JobType jobType;
	
	@ManyToOne
	@JoinColumn(name = "specstagetype_id")
	private SpecStageType specStageType;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(final String organizationName) {
		this.organizationName = organizationName;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(final String postName) {
		this.postName = postName;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(final JobType jobType) {
		this.jobType = jobType;
	}

	public SpecStageType getSpecStageType() {
		return specStageType;
	}

	public void setSpecStageType(final SpecStageType specStageType) {
		this.specStageType = specStageType;
	}

	public String getDiscription() {
		return description;
	}

	public void setDiscription(final String description) {
		this.description = description;
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
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime
				* result
				+ ((organizationName == null) ? 0 : organizationName.hashCode());
		result = prime * result
				+ ((postName == null) ? 0 : postName.hashCode());
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
		PersonWork other = (PersonWork) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (organizationName == null) {
			if (other.organizationName != null) {
				return false;
			}
		} else if (!organizationName.equals(other.organizationName)) {
			return false;
		}
		if (postName == null) {
			if (other.postName != null) {
				return false;
			}
		} else if (!postName.equals(other.postName)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonWork [organizationName=" + organizationName
				+ ", postName=" + postName + ", discription=" + description
				+ ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}
	
}
