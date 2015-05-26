package org.lnu.is.domain.employee.profession;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;
import org.lnu.is.domain.profession.Profession;

/**
 * Employee Profession entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_employeeprofession") 
public class EmployeeProfession extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "profession_id")
	private Profession profession;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(final Profession profession) {
		this.profession = profession;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(final Post post) {
		this.post = post;
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
		EmployeeProfession other = (EmployeeProfession) obj;
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
		return "EmployeeProfession [begDate=" + begDate + ", endDate="
				+ endDate + "]";
	}
}
