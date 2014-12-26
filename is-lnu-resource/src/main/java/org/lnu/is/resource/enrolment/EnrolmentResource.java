package org.lnu.is.resource.enrolment;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.resource.ApiResource;

/**
 * Enrolment Resource.
 * 
 * @author kushnir
 *
 */
public class EnrolmentResource extends ApiResource {

	private Long personId;

	private Long specofferId;

	private Long departmentId;

	private Long personPaperId;

	private Long enrolmentTypeId;

	private Long parentId;

	private Double mark;

	private String docSeries;

	private String docNum;

	private String docText;

	private Integer isState;

	private Integer isContract;

	private Integer isPrivilege;

	private Integer isHostel;

	private Date evDate;

	private Date begDate;

	private Date endDate;

	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/enrolments";
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getSpecofferId() {
		return specofferId;
	}

	public void setSpecofferId(final Long specofferId) {
		this.specofferId = specofferId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getPersonPaperId() {
		return personPaperId;
	}

	public void setPersonPaperId(final Long personPaperId) {
		this.personPaperId = personPaperId;
	}

	public Long getEnrolmentTypeId() {
		return enrolmentTypeId;
	}

	public void setEnrolmentTypeId(final Long enrolmentTypeId) {
		this.enrolmentTypeId = enrolmentTypeId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result + ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((docText == null) ? 0 : docText.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((enrolmentTypeId == null) ? 0 : enrolmentTypeId.hashCode());
		result = prime * result + ((evDate == null) ? 0 : evDate.hashCode());
		result = prime * result + ((isContract == null) ? 0 : isContract.hashCode());
		result = prime * result + ((isHostel == null) ? 0 : isHostel.hashCode());
		result = prime * result + ((isPrivilege == null) ? 0 : isPrivilege.hashCode());
		result = prime * result + ((isState == null) ? 0 : isState.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result + ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result + ((personId == null) ? 0 : personId.hashCode());
		result = prime * result + ((personPaperId == null) ? 0 : personPaperId.hashCode());
		result = prime * result + ((specofferId == null) ? 0 : specofferId.hashCode());
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
		EnrolmentResource other = (EnrolmentResource) obj;
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
		if (enrolmentTypeId == null) {
			if (other.enrolmentTypeId != null) {
				return false;
			}
		} else if (!enrolmentTypeId.equals(other.enrolmentTypeId)) {
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
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		if (personPaperId == null) {
			if (other.personPaperId != null) {
				return false;
			}
		} else if (!personPaperId.equals(other.personPaperId)) {
			return false;
		}
		if (specofferId == null) {
			if (other.specofferId != null) {
				return false;
			}
		} else if (!specofferId.equals(other.specofferId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentResource [personId=" + personId + ", specofferId=" + specofferId + ", departmentId=" + departmentId + ", personPaperId="
				+ personPaperId + ", enrolmentTypeId=" + enrolmentTypeId + ", parentId=" + parentId + ", mark=" + mark + ", docSeries=" + docSeries
				+ ", docNum=" + docNum + ", docText=" + docText + ", isState=" + isState + ", isContract=" + isContract + ", isPrivilege=" + isPrivilege
				+ ", isHostel=" + isHostel + ", evDate=" + evDate + ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}