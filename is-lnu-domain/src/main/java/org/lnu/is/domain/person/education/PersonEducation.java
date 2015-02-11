package org.lnu.is.domain.person.education;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.paper.PersonPaper;
/**
 * Persoon Education entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_personeducation")
public class PersonEducation extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "educationtype_id")
	private EducationType educationType;
	
	@ManyToOne
	@JoinColumn(name = "personpaper_id")
	private PersonPaper personPaper;
	
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

	public EducationType getEducationType() {
		return educationType;
	}

	public void setEducationType(final EducationType educationType) {
		this.educationType = educationType;
	}

	public PersonPaper getPersonPaper() {
		return personPaper;
	}

	public void setPersonPaper(final PersonPaper personPaper) {
		this.personPaper = personPaper;
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
		PersonEducation other = (PersonEducation) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "PersoonEducation [begDate=" + begDate + ", endDate=" + endDate
				+ "]";
	}
}
