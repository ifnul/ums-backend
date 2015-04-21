package org.lnu.is.domain.specoffer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
/**
 * Specoffer Subject entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_specoffersubject")
public class SpecOfferSubject extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "specoffer_id")
	private SpecOffer specOffer;
	
	@ManyToOne
	@JoinColumn(name = "enrolsubject_id")
	private EnrolmentSubject enrolmentSubject;
	
	@Column(name = "ismajor")
	private Boolean isMajor;
	
	@Column(name = "alternative")
	private Boolean alternative;
	
	@Column(name = "mark")
	private Double mark;

	@Column(name = "weightsubject")
	private Double weightSubject;
		
	@Column(name = "istrainingcourses")
	private Integer isTrainingCourses;
	
	public Integer getIsTrainingCourses() {
		return isTrainingCourses;
	}

	public void setIsTrainingCourses(final Integer isTrainingCourses) {
		this.isTrainingCourses = isTrainingCourses;
	}

	public SpecOffer getSpecOffer() {
		return specOffer;
	}

	public void setSpecOffer(final SpecOffer specOffer) {
		this.specOffer = specOffer;
	}

	public EnrolmentSubject getEnrolmentSubject() {
		return enrolmentSubject;
	}

	public void setEnrolmentSubject(final EnrolmentSubject enrolmentSubject) {
		this.enrolmentSubject = enrolmentSubject;
	}

	public Boolean getIsMajor() {
		return isMajor;
	}

	public void setIsMajor(final Boolean isMajor) {
		this.isMajor = isMajor;
	}

	public Boolean getAlternative() {
		return alternative;
	}

	public void setAlternative(final Boolean alternative) {
		this.alternative = alternative;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(final Double mark) {
		this.mark = mark;
	}
	
	public Double getWeightSubject() {
		return weightSubject;
	}

	public void setWeightSubject(final Double weightSubject) {
		this.weightSubject = weightSubject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((alternative == null) ? 0 : alternative.hashCode());
		result = prime * result + ((isMajor == null) ? 0 : isMajor.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((isTrainingCourses == null) ? 0 : isTrainingCourses.hashCode());
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
		SpecOfferSubject other = (SpecOfferSubject) obj;
		if (alternative == null) {
			if (other.alternative != null) {
				return false;
			}
		} else if (!alternative.equals(other.alternative)) {
			return false;
		}
		if (isMajor == null) {
			if (other.isMajor != null) {
				return false;
			}
		} else if (!isMajor.equals(other.isMajor)) {
			return false;
		}
		if (mark == null) {
			if (other.mark != null) {
				return false;
			}
		} else if (!mark.equals(other.mark)) {
			return false;
		}
		if (isTrainingCourses == null) {
			if (other.isTrainingCourses != null) {
				return false;
			}
		} else if (!isTrainingCourses.equals(other.isTrainingCourses)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecofferSubject [isMajor=" + isMajor + ", alternative="
				+ alternative + ", mark=" + mark + ", isTrainingCourses=" + isTrainingCourses + "]";
	}
	
	
}
