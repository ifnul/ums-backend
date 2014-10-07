package org.lnu.is.facade.resources.specoffer;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.facade.resources.ApiResource;

/**
 * Resource for specoffer entity.
 * 
 * @author ivanursul
 *
 */
public class SpecOfferResource extends ApiResource {

	private Long id;
	
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
	
	private Long uid;
	
	private String utid;
	
	private String uapp;
	
	private Integer processing;
	
	private Integer actual;
	
	private String note;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}", id);
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
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
		return new Date(begDate.getTime());
	}

	public void setBegDate(final Date begDate) {
		this.begDate = new Date(begDate.getTime());
	}

	public Date getEndDate() {
		return new Date(endDate.getTime());
	}

	public void setEndDate(final Date endDate) {
		this.endDate = new Date(endDate.getTime());
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(final Long uid) {
		this.uid = uid;
	}

	public String getUtid() {
		return utid;
	}

	public void setUtid(final String utid) {
		this.utid = utid;
	}

	public String getUapp() {
		return uapp;
	}

	public void setUapp(final String uapp) {
		this.uapp = uapp;
	}

	public Integer getProcessing() {
		return processing;
	}

	public void setProcessing(final Integer processing) {
		this.processing = processing;
	}

	public Integer getActual() {
		return actual;
	}

	public void setActual(final Integer actual) {
		this.actual = actual;
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
		result = prime * result + ((actual == null) ? 0 : actual.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result
				+ ((eduFormTypeId == null) ? 0 : eduFormTypeId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((licCount == null) ? 0 : licCount.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result
				+ ((processing == null) ? 0 : processing.hashCode());
		result = prime * result
				+ ((specialtyId == null) ? 0 : specialtyId.hashCode());
		result = prime * result
				+ ((specofferTypeId == null) ? 0 : specofferTypeId.hashCode());
		result = prime * result
				+ ((stateCount == null) ? 0 : stateCount.hashCode());
		result = prime * result
				+ ((timePeriodId == null) ? 0 : timePeriodId.hashCode());
		result = prime * result + ((uapp == null) ? 0 : uapp.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((utid == null) ? 0 : utid.hashCode());
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
		if (actual == null) {
			if (other.actual != null) {
				return false;
			}
		} else if (!actual.equals(other.actual)) {
			return false;
		}
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
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
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
		if (processing == null) {
			if (other.processing != null) {
				return false;
			}
		} else if (!processing.equals(other.processing)) {
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
		if (uapp == null) {
			if (other.uapp != null) {
				return false;
			}
		} else if (!uapp.equals(other.uapp)) {
			return false;
		}
		if (uid == null) {
			if (other.uid != null) {
				return false;
			}
		} else if (!uid.equals(other.uid)) {
			return false;
		}
		if (utid == null) {
			if (other.utid != null) {
				return false;
			}
		} else if (!utid.equals(other.utid)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferResource [id=" + id + ", specialtyId=" + specialtyId
				+ ", departmentId=" + departmentId + ", timePeriodId="
				+ timePeriodId + ", specofferTypeId=" + specofferTypeId
				+ ", docSeries=" + docSeries + ", docNum=" + docNum
				+ ", eduFormTypeId=" + eduFormTypeId + ", licCount=" + licCount
				+ ", stateCount=" + stateCount + ", begDate=" + begDate
				+ ", endDate=" + endDate + ", uid=" + uid + ", utid=" + utid
				+ ", uapp=" + uapp + ", processing=" + processing + ", actual="
				+ actual + ", note=" + note + "]";
	}

}
