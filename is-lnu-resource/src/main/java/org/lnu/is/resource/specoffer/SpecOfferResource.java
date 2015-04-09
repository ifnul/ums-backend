package org.lnu.is.resource.specoffer;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;



/**
 * Resource for specoffer entity.
 * 
 * @author ivanursul
 *
 */
@CrudableResource
public class SpecOfferResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long specialtyId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long timePeriodId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long timePeriodCourseId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long specofferTypeId;
	
	@NotNull(message = "Field required")
	private String docSeries;
	
	@NotNull(message = "Field required")
	private String docNum;
	
	@NotNull(message = "Field required")
	private Long educationFormTypeId;
	
	@NotNull(message = "Field required")
	private Integer licCount;
	
	@NotNull(message = "Field required")
	private Integer stateCount;
	
	@NotNull(message = "Field required")
	private Date begDate;
	
	@NotNull(message = "Field required")
	private Date endDate;
	
	@NotNull(message = "Field required")
	private String note;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/specoffers";
	}
	
	public Long getTimePeriodCourseId() {
	    return timePeriodCourseId;
	}

	public void setTimePeriodCourseId(final Long timePeriodCourseId) {
	    this.timePeriodCourseId = timePeriodCourseId;
	}

	public Long getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(final Long specialtyId) {
		this.specialtyId = specialtyId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getTimePeriodId() {
		return timePeriodId;
	}

	public void setTimePeriodId(final Long timePeriodId) {
		this.timePeriodId = timePeriodId;
	}

	public Long getSpecofferTypeId() {
		return specofferTypeId;
	}

	public void setSpecofferTypeId(final Long specofferTypeId) {
		this.specofferTypeId = specofferTypeId;
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

	public Long getEducationFormTypeId() {
		return educationFormTypeId;
	}

	public void setEducationFormTypeId(final Long educationFormTypeId) {
		this.educationFormTypeId = educationFormTypeId;
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

	@Override
	public String getNote() {
		return note;
	}

	@Override
	public void setNote(final String note) {
		this.note = note;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result
				+ ((educationFormTypeId == null) ? 0 : educationFormTypeId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((licCount == null) ? 0 : licCount.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result
				+ ((specialtyId == null) ? 0 : specialtyId.hashCode());
		result = prime * result
				+ ((specofferTypeId == null) ? 0 : specofferTypeId.hashCode());
		result = prime * result
				+ ((stateCount == null) ? 0 : stateCount.hashCode());
		result = prime * result
				+ ((timePeriodId == null) ? 0 : timePeriodId.hashCode());
		result = prime * result
			+ ((timePeriodCourseId == null) ? 0 : timePeriodCourseId.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SpecOfferResource other = (SpecOfferResource) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
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
		if (educationFormTypeId == null) {
			if (other.educationFormTypeId != null) {
				return false;
			}
		} else if (!educationFormTypeId.equals(other.educationFormTypeId)) {
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
		if (note == null) {
			if (other.note != null) {
				return false;
			}
		} else if (!note.equals(other.note)) {
			return false;
		}
		if (specialtyId == null) {
			if (other.specialtyId != null) {
				return false;
			}
		} else if (!specialtyId.equals(other.specialtyId)) {
			return false;
		}
		if (specofferTypeId == null) {
			if (other.specofferTypeId != null) {
				return false;
			}
		} else if (!specofferTypeId.equals(other.specofferTypeId)) {
			return false;
		}
		if (stateCount == null) {
			if (other.stateCount != null) {
				return false;
			}
		} else if (!stateCount.equals(other.stateCount)) {
			return false;
		}
		if (timePeriodId == null) {
			if (other.timePeriodId != null) {
				return false;
			}
		} else if (!timePeriodId.equals(other.timePeriodId)) {
			return false;
		}
		if (timePeriodCourseId == null) {
			if (other.timePeriodCourseId != null) {
				return false;
			}
		} else if (!timePeriodCourseId.equals(other.timePeriodCourseId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferResource [specialtyId=" + specialtyId
				+ ", departmentId=" + departmentId + ", timePeriodId="
				+ timePeriodId + ", specofferTypeId=" + specofferTypeId
				+ ", docSeries=" + docSeries + ", docNum=" + docNum
				+ ", educationFormTypeId=" + educationFormTypeId + ", licCount=" + licCount
				+ ", stateCount=" + stateCount + ", begDate=" + begDate
				+ ", endDate=" + endDate + ", note=" + note + ", timePeriodCourseId="
					+ timePeriodCourseId + "]";
	}
	
}
