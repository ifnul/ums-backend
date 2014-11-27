package org.lnu.is.facade.resource.specoffer;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Resource for specoffer entity.
 * 
 * @author ivanursul
 *
 */
public class SpecOfferResource extends ApiResource {

	private Long specialtyId;
	
	private Long departmentId;
	
	private Long timePeriodId;
	
	private Long specofferTypeId;
	
	private String docSeries;
	
	private String docNum;
	
	private Long eduFormTypeId;
	
	private Integer licCount;
	
	private Integer stateCount;
	
	private Date begDate;
	
	private Date endDate;
	
	private String note;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/specoffers";
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

	public Long getEduFormTypeId() {
		return eduFormTypeId;
	}

	public void setEduFormTypeId(final Long eduFormTypeId) {
		this.eduFormTypeId = eduFormTypeId;
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

	public String getNote() {
		return note;
	}

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
				+ ((eduFormTypeId == null) ? 0 : eduFormTypeId.hashCode());
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
		if (eduFormTypeId == null) {
			if (other.eduFormTypeId != null) {
				return false;
			}
		} else if (!eduFormTypeId.equals(other.eduFormTypeId)) {
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
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferResource [specialtyId=" + specialtyId
				+ ", departmentId=" + departmentId + ", timePeriodId="
				+ timePeriodId + ", specofferTypeId=" + specofferTypeId
				+ ", docSeries=" + docSeries + ", docNum=" + docNum
				+ ", eduFormTypeId=" + eduFormTypeId + ", licCount=" + licCount
				+ ", stateCount=" + stateCount + ", begDate=" + begDate
				+ ", endDate=" + endDate + ", note=" + note + "]";
	}
	
}
