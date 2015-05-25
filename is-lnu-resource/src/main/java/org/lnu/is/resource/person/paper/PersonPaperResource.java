package org.lnu.is.resource.person.paper;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Person paper resource.
 * @author ivanursul
 *
 */
@CrudableResource
public class PersonPaperResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long paperTypeId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long honorsTypeId;
	
	@NotNull(message = "Field required")
	private String docSeries;
	
	@NotNull(message = "Field required")
	private String docNum;

	@NotNull(message = "Field required")
	private Date docDate;
	
	@NotNull(message = "Field required")
	private String docIssued;
	
	private String docPin;
	
	private Double mark;
	
	@NotNull(message = "Field required")
	private Integer isChecked;
	
	@NotNull(message = "Field required")
	private Integer isForeign;

	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/papers/{1}", personId, getId());
	}
	
	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/papers", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getPaperTypeId() {
		return paperTypeId;
	}

	public void setPaperTypeId(final Long paperTypeId) {
		this.paperTypeId = paperTypeId;
	}

	public Long getHonorsTypeId() {
		return honorsTypeId;
	}

	public void setHonorsTypeId(final Long honorsTypeId) {
		this.honorsTypeId = honorsTypeId;
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

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(final Date docDate) {
		this.docDate = docDate;
	}

	public String getDocIssued() {
		return docIssued;
	}

	public void setDocIssued(final String docIssued) {
		this.docIssued = docIssued;
	}

	public String getDocPin() {
		return docPin;
	}

	public void setDocPin(final String docPin) {
		this.docPin = docPin;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(final Double mark) {
		this.mark = mark;
	}

	public Integer getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(final Integer isChecked) {
		this.isChecked = isChecked;
	}

	public Integer getIsForeign() {
		return isForeign;
	}

	public void setIsForeign(final Integer isForeign) {
		this.isForeign = isForeign;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((docDate == null) ? 0 : docDate.hashCode());
		result = prime * result
				+ ((docIssued == null) ? 0 : docIssued.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result + ((docPin == null) ? 0 : docPin.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result
				+ ((honorsTypeId == null) ? 0 : honorsTypeId.hashCode());
		result = prime * result
				+ ((isChecked == null) ? 0 : isChecked.hashCode());
		result = prime * result
				+ ((isForeign == null) ? 0 : isForeign.hashCode());
		result = prime * result + ((mark == null) ? 0 : mark.hashCode());
		result = prime * result
				+ ((paperTypeId == null) ? 0 : paperTypeId.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
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
		PersonPaperResource other = (PersonPaperResource) obj;
		if (docDate == null) {
			if (other.docDate != null) {
				return false;
			}
		} else if (!docDate.equals(other.docDate)) {
			return false;
		}
		if (docIssued == null) {
			if (other.docIssued != null) {
				return false;
			}
		} else if (!docIssued.equals(other.docIssued)) {
			return false;
		}
		if (docNum == null) {
			if (other.docNum != null) {
				return false;
			}
		} else if (!docNum.equals(other.docNum)) {
			return false;
		}
		if (docPin == null) {
			if (other.docPin != null) {
				return false;
			}
		} else if (!docPin.equals(other.docPin)) {
			return false;
		}
		if (docSeries == null) {
			if (other.docSeries != null) {
				return false;
			}
		} else if (!docSeries.equals(other.docSeries)) {
			return false;
		}
		if (honorsTypeId == null) {
			if (other.honorsTypeId != null) {
				return false;
			}
		} else if (!honorsTypeId.equals(other.honorsTypeId)) {
			return false;
		}
		if (isChecked == null) {
			if (other.isChecked != null) {
				return false;
			}
		} else if (!isChecked.equals(other.isChecked)) {
			return false;
		}
		if (isForeign == null) {
			if (other.isForeign != null) {
				return false;
			}
		} else if (!isForeign.equals(other.isForeign)) {
			return false;
		}
		if (mark == null) {
			if (other.mark != null) {
				return false;
			}
		} else if (!mark.equals(other.mark)) {
			return false;
		}
		if (paperTypeId == null) {
			if (other.paperTypeId != null) {
				return false;
			}
		} else if (!paperTypeId.equals(other.paperTypeId)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonPaperResource [personId=" + personId + ", paperTypeId="
				+ paperTypeId + ", honorsTypeId=" + honorsTypeId
				+ ", docSeries=" + docSeries + ", docNum=" + docNum
				+ ", docDate=" + docDate + ", docIssued=" + docIssued
				+ ", docPin=" + docPin + ", mark=" + mark + ", isChecked="
				+ isChecked + ", isForeign=" + isForeign + "]";
	}

}
