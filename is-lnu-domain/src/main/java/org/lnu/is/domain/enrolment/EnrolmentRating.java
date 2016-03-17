package org.lnu.is.domain.enrolment;

import org.lnu.is.annotation.dbtable.DC;
import org.lnu.is.domain.InformationModel;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Objects;

/**
 * Enrolment entity.
 * @author ivanursul
 *
 */
@DC
@Entity
@Table(name = "q_dc_enrolment")
public class EnrolmentRating extends InformationModel {
	private static final long serialVersionUID = 1L;

	private double kb;

	private int ratingPriority;

	private Long personId;

	private Long specOfferId;

	private Long departmentId;

	private Long personPaperId;

	private Long enrolmentTypeId;

	private Long markScaleId;

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

	private Integer priority;

	private Integer isEducationState;

	private Integer isInterview;

	private Integer isOriginal;

	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(Date begDate) {
		this.begDate = begDate;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(String docNum) {
		this.docNum = docNum;
	}

	public String getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(String docSeries) {
		this.docSeries = docSeries;
	}

	public String getDocText() {
		return docText;
	}

	public void setDocText(String docText) {
		this.docText = docText;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Long getEnrolmentTypeId() {
		return enrolmentTypeId;
	}

	public void setEnrolmentTypeId(Long enrolmentTypeId) {
		this.enrolmentTypeId = enrolmentTypeId;
	}

	public Date getEvDate() {
		return evDate;
	}

	public void setEvDate(Date evDate) {
		this.evDate = evDate;
	}

	public Integer getIsContract() {
		return isContract;
	}

	public void setIsContract(Integer isContract) {
		this.isContract = isContract;
	}

	public Integer getIsEducationState() {
		return isEducationState;
	}

	public void setIsEducationState(Integer isEducationState) {
		this.isEducationState = isEducationState;
	}

	public Integer getIsHostel() {
		return isHostel;
	}

	public void setIsHostel(Integer isHostel) {
		this.isHostel = isHostel;
	}

	public Integer getIsInterview() {
		return isInterview;
	}

	public void setIsInterview(Integer isInterview) {
		this.isInterview = isInterview;
	}

	public Integer getIsOriginal() {
		return isOriginal;
	}

	public void setIsOriginal(Integer isOriginal) {
		this.isOriginal = isOriginal;
	}

	public Integer getIsPrivilege() {
		return isPrivilege;
	}

	public void setIsPrivilege(Integer isPrivilege) {
		this.isPrivilege = isPrivilege;
	}

	public Integer getIsState() {
		return isState;
	}

	public void setIsState(Integer isState) {
		this.isState = isState;
	}

	public double getKb() {
		return kb;
	}

	public void setKb(double kb) {
		this.kb = kb;
	}

	public Double getMark() {
		return mark;
	}

	public void setMark(Double mark) {
		this.mark = mark;
	}

	public Long getMarkScaleId() {
		return markScaleId;
	}

	public void setMarkScaleId(Long markScaleId) {
		this.markScaleId = markScaleId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getPersonPaperId() {
		return personPaperId;
	}

	public void setPersonPaperId(Long personPaperId) {
		this.personPaperId = personPaperId;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public int getRatingPriority() {
		return ratingPriority;
	}

	public void setRatingPriority(int ratingPriority) {
		this.ratingPriority = ratingPriority;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getSpecOfferId() {
		return specOfferId;
	}

	public void setSpecOfferId(Long specOfferId) {
		this.specOfferId = specOfferId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		EnrolmentRating that = (EnrolmentRating) o;
		return Objects.equals(getKb(), that.getKb()) &&
				Objects.equals(getRatingPriority(), that.getRatingPriority()) &&
				Objects.equals(getPersonId(), that.getPersonId()) &&
				Objects.equals(getSpecOfferId(), that.getSpecOfferId()) &&
				Objects.equals(getDepartmentId(), that.getDepartmentId()) &&
				Objects.equals(getPersonPaperId(), that.getPersonPaperId()) &&
				Objects.equals(getEnrolmentTypeId(), that.getEnrolmentTypeId()) &&
				Objects.equals(getMarkScaleId(), that.getMarkScaleId()) &&
				Objects.equals(getMark(), that.getMark()) &&
				Objects.equals(getDocSeries(), that.getDocSeries()) &&
				Objects.equals(getDocNum(), that.getDocNum()) &&
				Objects.equals(getDocText(), that.getDocText()) &&
				Objects.equals(getIsState(), that.getIsState()) &&
				Objects.equals(getIsContract(), that.getIsContract()) &&
				Objects.equals(getIsPrivilege(), that.getIsPrivilege()) &&
				Objects.equals(getIsHostel(), that.getIsHostel()) &&
				Objects.equals(getEvDate(), that.getEvDate()) &&
				Objects.equals(getBegDate(), that.getBegDate()) &&
				Objects.equals(getEndDate(), that.getEndDate()) &&
				Objects.equals(getPriority(), that.getPriority()) &&
				Objects.equals(getIsEducationState(), that.getIsEducationState()) &&
				Objects.equals(getIsInterview(), that.getIsInterview()) &&
				Objects.equals(getIsOriginal(), that.getIsOriginal());
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getKb(), getRatingPriority(), getPersonId(), getSpecOfferId(), getDepartmentId(), getPersonPaperId(), getEnrolmentTypeId(), getMarkScaleId(), getMark(), getDocSeries(), getDocNum(), getDocText(), getIsState(), getIsContract(), getIsPrivilege(), getIsHostel(), getEvDate(), getBegDate(), getEndDate(), getPriority(), getIsEducationState(), getIsInterview(), getIsOriginal());
	}

	@Override
	public String toString() {
		return "EnrolmentRating{" +
				"begDate=" + begDate +
				", kb=" + kb +
				", ratingPriority=" + ratingPriority +
				", personId=" + personId +
				", specOfferId=" + specOfferId +
				", departmentId=" + departmentId +
				", personPaperId=" + personPaperId +
				", enrolmentTypeId=" + enrolmentTypeId +
				", markScaleId=" + markScaleId +
				", mark=" + mark +
				", docSeries='" + docSeries + '\'' +
				", docNum='" + docNum + '\'' +
				", docText='" + docText + '\'' +
				", isState=" + isState +
				", isContract=" + isContract +
				", isPrivilege=" + isPrivilege +
				", isHostel=" + isHostel +
				", evDate=" + evDate +
				", endDate=" + endDate +
				", priority=" + priority +
				", isEducationState=" + isEducationState +
				", isInterview=" + isInterview +
				", isOriginal=" + isOriginal +
				"} " + super.toString();
	}
}
