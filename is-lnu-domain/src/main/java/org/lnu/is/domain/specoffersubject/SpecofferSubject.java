package org.lnu.is.domain.specoffersubject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.domain.specoffer.SpecOffer;
/**
 * Specoffer Subject entity.
 * @author illay
 *
 */
@Entity
@Table(name = "q_ob_specoffersubject")
public class SpecofferSubject extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "specoffer_id")
	private SpecOffer spacOffer;
	
	@ManyToOne
	@JoinColumn(name = "enrolsubject_id")
	private EnrolmentSubject enrolmentSubject;
	
	@Column(name = "ismajor")
	private Boolean isMajor;
	
	@Column(name = "alternative")
	private Boolean alternative;
	
	@Column(name = "mark")
	private Double mark;

	public SpecOffer getSpacOffer() {
		return spacOffer;
	}

	public void setSpacOffer(final SpecOffer spacOffer) {
		this.spacOffer = spacOffer;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((alternative == null) ? 0 : alternative.hashCode());
		result = prime * result + ((isMajor == null) ? 0 : isMajor.hashCode());
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
		SpecofferSubject other = (SpecofferSubject) obj;
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
		return true;
	}

	@Override
	public String toString() {
		return "SpecofferSubject [isMajor=" + isMajor + ", alternative="
				+ alternative + ", mark=" + mark + "]";
	}
	
	
}
