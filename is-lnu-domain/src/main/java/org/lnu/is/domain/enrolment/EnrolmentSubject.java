package org.lnu.is.domain.enrolment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.InformationModel;

/**
 * Enrolment Subject.
 * @author ivanursul
 *
 */
@RF
@Entity
@Table(name = "q_rf_enrolsubject")
public class EnrolmentSubject extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private EnrolmentSubject parent;
	
	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "istesting")
	private Integer isTesting;

	public EnrolmentSubject getParent() {
		return parent;
	}

	public void setParent(final EnrolmentSubject parent) {
		this.parent = parent;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getIsTesting() {
		return isTesting;
	}

	public void setIsTesting(final Integer isTesting) {
		this.isTesting = isTesting;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result
				+ ((isTesting == null) ? 0 : isTesting.hashCode());
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
		EnrolmentSubject other = (EnrolmentSubject) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (isTesting == null) {
			if (other.isTesting != null) {
				return false;
			}
		} else if (!isTesting.equals(other.isTesting)) {
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
		return "EnrolmentSubject [abbrName=" + abbrName + ", name=" + name
				+ ", isTesting=" + isTesting + "]";
	}
	
}
