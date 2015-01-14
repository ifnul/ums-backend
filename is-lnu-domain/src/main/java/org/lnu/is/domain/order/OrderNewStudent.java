package org.lnu.is.domain.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.coursetype.CourseType;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.specialty.Specialty;

/**
 * Order new student entity.
 * @author ivanursul
 *
 */
@DT
@Entity
@Table(name = "q_dt_ordernewstudent")
public class OrderNewStudent extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "enrolment_id")
	private Enrolment enrolment;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

	@ManyToOne
	@JoinColumn(name = "coursetype_id")
	private CourseType courseType;
	
	@ManyToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialty;
	
	@ManyToOne
	@JoinColumn(name = "eduformtype_id")
	private EduFormType eduFormType;
	
	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;
	
	@Column(name = "iscontract")
	private Integer isContract;

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}

	public Enrolment getEnrolment() {
		return enrolment;
	}

	public void setEnrolment(final Enrolment enrolment) {
		this.enrolment = enrolment;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public CourseType getCourseType() {
		return courseType;
	}

	public void setCourseType(final CourseType courseType) {
		this.courseType = courseType;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(final Specialty specialty) {
		this.specialty = specialty;
	}

	public EduFormType getEduFormType() {
		return eduFormType;
	}

	public void setEduFormType(final EduFormType eduFormType) {
		this.eduFormType = eduFormType;
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

	public Integer getIsContract() {
		return isContract;
	}

	public void setIsContract(final Integer isContract) {
		this.isContract = isContract;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((courseType == null) ? 0 : courseType.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result
				+ ((isContract == null) ? 0 : isContract.hashCode());
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
		OrderNewStudent other = (OrderNewStudent) obj;
		if (courseType == null) {
			if (other.courseType != null) {
				return false;
			}
		} else if (!courseType.equals(other.courseType)) {
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
		if (isContract == null) {
			if (other.isContract != null) {
				return false;
			}
		} else if (!isContract.equals(other.isContract)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "OrderNewStudent [docSeries=" + docSeries + ", docNum=" + docNum
				+ ", isContract=" + isContract + "]";
	}
	
}
