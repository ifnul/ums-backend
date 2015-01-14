package org.lnu.is.domain.person;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.honorstype.HonorType;
import org.lnu.is.domain.papertype.PaperType;

/**
 * Person Paper entity.
 * @author ivanursul
 *
 */
@OD
@Entity
@Table(name = "q_od_personpaper")
public class PersonPaper extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "papertype_id")
	private PaperType paperType;
	
	@ManyToOne
	@JoinColumn(name = "honorstype_id")
	private HonorType honorsType;
	
	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;

	@Column(name = "docdate")
	private Date docDate;
	
	@Column(name = "docissued")
	private String docIssued;
	
	@Column(name = "docpin")
	private String docPin;
	
	@Column(name = "mark")
	private Double mark;
	
	@Column(name = "ischecked")
	private Integer isChecked;
	
	@Column(name = "isforeign")
	private Integer isForeign;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public PaperType getPaperType() {
		return paperType;
	}

	public void setPaperType(final PaperType paperType) {
		this.paperType = paperType;
	}

	public HonorType getHonorsType() {
		return honorsType;
	}

	public void setHonorsType(final HonorType honorsType) {
		this.honorsType = honorsType;
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
				+ ((isChecked == null) ? 0 : isChecked.hashCode());
		result = prime * result
				+ ((isForeign == null) ? 0 : isForeign.hashCode());
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
		PersonPaper other = (PersonPaper) obj;
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
		return true;
	}
	
}
