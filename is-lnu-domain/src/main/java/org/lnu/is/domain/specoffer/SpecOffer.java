package org.lnu.is.domain.specoffer;

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
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.timeperiod.TimePeriod;

/**
 * Entity, that describes specoffers table.
 * 
 * @author ivanursul
 *
 */
@OB
@Entity
@Table(name = "q_ob_specoffer")
public class SpecOffer extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private SpecOffer parent;

	@ManyToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialty;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "timeperiod_id")
	private TimePeriod timePeriod;
	
	@ManyToOne
	@JoinColumn(name = "timeperiodcourse_id")
	private TimePeriod timePeriodCourse;
	
	@ManyToOne
	@JoinColumn(name = "eduformtype_id")
	private EducationFormType educationFormType;

	@ManyToOne
	@JoinColumn(name = "specoffertype_id")
	private SpecOfferType specOfferType;
	
	@OneToMany(mappedBy = "specOffer")
	private List<SpecOfferBenefit> benefits;
	
	@OneToMany(mappedBy = "specOffer")
	private List<SpecOfferSubject> subjects;
	
	@OneToMany(mappedBy = "specOffer")
	private List<SpecOfferWave> waves;
	
	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;
	
	@Column(name = "liccount")
	private Integer licCount;
	
	@Column(name = "statecount")
	private Integer stateCount;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "duration")
	private String duration;
	
	public String getDuration() {
	    return duration;
	}

	public void setDuration(final String duration) {
	    this.duration = duration;
	}

	public TimePeriod getTimePeriodCourse() {
	    return timePeriodCourse;
	}

	public void setTimePeriodCourse(final TimePeriod timePeriodCourse) {
	    this.timePeriodCourse = timePeriodCourse;
	}

	public SpecOffer getParent() {
		return parent;
	}

	public void setParent(final SpecOffer parent) {
		this.parent = parent;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(final Specialty specialty) {
		this.specialty = specialty;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public TimePeriod getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(final TimePeriod timePeriod) {
		this.timePeriod = timePeriod;
	}

	public EducationFormType getEducationFormType() {
		return educationFormType;
	}

	public void setEducationFormType(final EducationFormType educationFormType) {
		this.educationFormType = educationFormType;
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

	public Integer getLicCount() {
		return licCount;
	}

	public void setLicCount(final Integer licCount) {
		this.licCount = licCount;
	}

	public Integer getStateCount() {
		return stateCount;
	}

	public void setStateCount(final Integer stateCount) {
		this.stateCount = stateCount;
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

	public SpecOfferType getSpecOfferType() {
		return specOfferType;
	}

	public void setSpecOfferType(final SpecOfferType specOfferType) {
		this.specOfferType = specOfferType;
	}

	public List<SpecOfferBenefit> getBenefits() {
		return benefits;
	}

	public void setBenefits(final List<SpecOfferBenefit> benefits) {
		this.benefits = benefits;
	}

	public List<SpecOfferSubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(final List<SpecOfferSubject> subjects) {
		this.subjects = subjects;
	}

	public List<SpecOfferWave> getWaves() {
		return waves;
	}

	public void setWaves(final List<SpecOfferWave> waves) {
		this.waves = waves;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((licCount == null) ? 0 : licCount.hashCode());
		result = prime * result
				+ ((stateCount == null) ? 0 : stateCount.hashCode());
		result = prime * result
			+ ((duration == null) ? 0 : duration.hashCode());
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
		SpecOffer other = (SpecOffer) obj;
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
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (licCount == null) {
			if (other.licCount != null) {
				return false;
			}
		} else if (!licCount.equals(other.licCount)) {
			return false;
		}
		if (stateCount == null) {
			if (other.stateCount != null) {
				return false;
			}
		} else if (!stateCount.equals(other.stateCount)) {
			return false;
		}
		if (duration == null) {
			if (other.duration != null) {
				return false;
			}
		} else if (!duration.equals(other.duration)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOffer [docSeries=" + docSeries + ", docNum=" + docNum
				+ ", licCount=" + licCount + ", stateCount=" + stateCount
				+ ", begDate=" + begDate + ", endDate=" + endDate
				+ ", duration=" + duration + "]";
	}

}
