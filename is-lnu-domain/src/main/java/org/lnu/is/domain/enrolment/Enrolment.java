package org.lnu.is.domain.enrolment;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DC;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.domain.specoffer.SpecOffer;

/**
 * Enrolment entity.
 * @author ivanursul
 *
 */
@DC
@Entity
@Table(name = "q_dc_enrolment")
public class Enrolment extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "specoffer_id")
	private SpecOffer specOffer;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "personpapper_id")
	private PersonPaper personPaper;
	
	@ManyToOne
	@JoinColumn(name = "enrolmenttype_id")
	private EnrolmentType enrolmentType;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Enrolment parent;
	
	@OneToMany(mappedBy = "enrolment")
	private List<EnrolmentBenefit> benefits;
	
	@OneToMany(mappedBy = "enrolment")
	private List<EnrolmentEnrolSubject> enrolmentSubjects;
	
	@OneToMany(mappedBy = "enrolment")
	private List<EnrolmentStatus> statuses;
	
	@Column(name = "mark")
	private Double mark;

	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;
	
	@Column(name = "doctext")
	private String docText;
	
	@Column(name = "issate")
	private Integer isState;
	
	@Column(name = "iscontract")
	private Integer isContract;
	
	@Column(name = "isprivilege")
	private Integer isPrivilege;
	
	@Column(name = "ishostel")
	private Integer isHostel;
	
	@Column(name = "evdate")
	private Date evDate;
	
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

	public SpecOffer getSpecOffer() {
		return specOffer;
	}

	public void setSpecOffer(final SpecOffer specOffer) {
		this.specOffer = specOffer;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public PersonPaper getPersonPaper() {
		return personPaper;
	}

	public void setPersonPaper(final PersonPaper personPaper) {
		this.personPaper = personPaper;
	}

	public EnrolmentType getEnrolmentType() {
		return enrolmentType;
	}

	public void setEnrolmentType(final EnrolmentType enrolmentType) {
		this.enrolmentType = enrolmentType;
	}

	public Enrolment getParent() {
		return parent;
	}

	public void setParent(final Enrolment parent) {
		this.parent = parent;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(final Double mark) {
		this.mark = mark;
	}

	public String getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(final String docSeries) {
		this.docSeries = docSeries;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(final String docNum) {
		this.docNum = docNum;
	}

	public String getDocText() {
		return docText;
	}

	public void setDocText(final String docText) {
		this.docText = docText;
	}

	public Integer getIsState() {
		return isState;
	}

	public void setIsState(final Integer isState) {
		this.isState = isState;
	}

	public Integer getIsContract() {
		return isContract;
	}

	public void setIsContract(final Integer isContract) {
		this.isContract = isContract;
	}

	public Integer getIsPrivilege() {
		return isPrivilege;
	}

	public void setIsPrivilege(final Integer isPrivilege) {
		this.isPrivilege = isPrivilege;
	}

	public Integer getIsHostel() {
		return isHostel;
	}

	public void setIsHostel(final Integer isHostel) {
		this.isHostel = isHostel;
	}

	public Date getEvDate() {
		return evDate;
	}

	public void setEvDate(final Date evDate) {
		this.evDate = evDate;
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

	public List<EnrolmentBenefit> getBenefits() {
		return benefits;
	}

	public void setBenefits(final List<EnrolmentBenefit> benefits) {
		this.benefits = benefits;
	}

	public List<EnrolmentEnrolSubject> getEnrolmentSubjects() {
		return enrolmentSubjects;
	}

	public void setEnrolmentSubjects(final List<EnrolmentEnrolSubject> enrolmentSubjects) {
		this.enrolmentSubjects = enrolmentSubjects;
	}

	public List<EnrolmentStatus> getStatuses() {
		return statuses;
	}

	public void setStatuses(final List<EnrolmentStatus> statuses) {
		this.statuses = statuses;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((docText == null) ? 0 : docText.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((evDate == null) ? 0 : evDate.hashCode());
		result = prime * result
				+ ((isContract == null) ? 0 : isContract.hashCode());
		result = prime * result
				+ ((isHostel == null) ? 0 : isHostel.hashCode());
		result = prime * result
				+ ((isPrivilege == null) ? 0 : isPrivilege.hashCode());
		result = prime * result + ((isState == null) ? 0 : isState.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
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
		Enrolment other = (Enrolment) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (docNum == null) {
			if (other.docNum != null) {
				return false;
			}
		} else if (!docNum.equals(other.docNum)) {
			return false;
		}
		if (docSeries == null) {
			if (other.docSeries != null) {
				return false;
			}
		} else if (!docSeries.equals(other.docSeries)) {
			return false;
		}
		if (docText == null) {
			if (other.docText != null) {
				return false;
			}
		} else if (!docText.equals(other.docText)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (evDate == null) {
			if (other.evDate != null) {
				return false;
			}
		} else if (!evDate.equals(other.evDate)) {
			return false;
		}
		if (isContract == null) {
			if (other.isContract != null) {
				return false;
			}
		} else if (!isContract.equals(other.isContract)) {
			return false;
		}
		if (isHostel == null) {
			if (other.isHostel != null) {
				return false;
			}
		} else if (!isHostel.equals(other.isHostel)) {
			return false;
		}
		if (isPrivilege == null) {
			if (other.isPrivilege != null) {
				return false;
			}
		} else if (!isPrivilege.equals(other.isPrivilege)) {
			return false;
		}
		if (isState == null) {
			if (other.isState != null) {
				return false;
			}
		} else if (!isState.equals(other.isState)) {
			return false;
		}
		if (mark == null) {
			if (other.mark != null) {
				return false;
			}
		} else if (!mark.equals(other.mark)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Enrolment [mark=" + mark + ", docSeries=" + docSeries
				+ ", docNum=" + docNum + ", docText=" + docText + ", isState="
				+ isState + ", isContract=" + isContract + ", isPrivilege="
				+ isPrivilege + ", isHostel=" + isHostel + ", evDate=" + evDate
				+ ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}
	
}
