package org.lnu.is.domain.enrolment;

import org.lnu.is.annotation.NativeQueryResultColumn;
import org.lnu.is.annotation.NativeQueryResultEntity;

import java.util.Objects;

/**
 * Enrolment entity.
 * @author ivanursul
 *
 */
@NativeQueryResultEntity
public class EnrolmentRating {
	private static final long serialVersionUID = 1L;

	@NativeQueryResultColumn(index = 0)
	private long id;

	@NativeQueryResultColumn(index = 1)
	private double kb;

	@NativeQueryResultColumn(index = 2)
	private int ratingPriority;

	@NativeQueryResultColumn(index = 3)
	private Long personId;

	@NativeQueryResultColumn(index = 4)
	private String docSeries;

	@NativeQueryResultColumn(index = 5)
	private String docNum;

	@NativeQueryResultColumn(index = 6)
	private String docText;

	@NativeQueryResultColumn(index = 7)
	private Integer isState;

	@NativeQueryResultColumn(index = 8)
	private Integer isContract;

	@NativeQueryResultColumn(index = 9)
	private Long specOfferId;

	@NativeQueryResultColumn(index = 10)
	private Long departmentId;

	@NativeQueryResultColumn(index = 11)
	private Long personPaperId;

	@NativeQueryResultColumn(index = 12)
	private Double mark;

	@NativeQueryResultColumn(index = 13)
	private Integer isPrivilege;

	@NativeQueryResultColumn(index = 14)
	private Integer isHostel;

	@NativeQueryResultColumn(index = 15)
	private Long enrolmentTypeId;

	@NativeQueryResultColumn(index = 16)
	private Long uid;

	@NativeQueryResultColumn(index = 17)
	private String utid;

	@NativeQueryResultColumn(index = 18)
	private String uapp;

	@NativeQueryResultColumn(index = 19)
	private Long markScaleId;

	@NativeQueryResultColumn(index = 20)
	private Integer isEducationState;

	@NativeQueryResultColumn(index = 21)
	private Integer isInterview;

	@NativeQueryResultColumn(index = 22)
	private Integer isOriginal;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUtid() {
		return utid;
	}

	public void setUtid(String utid) {
		this.utid = utid;
	}

	public String getUapp() {
		return uapp;
	}

	public void setUapp(String uapp) {
		this.uapp = uapp;
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

	public Long getEnrolmentTypeId() {
		return enrolmentTypeId;
	}

	public void setEnrolmentTypeId(Long enrolmentTypeId) {
		this.enrolmentTypeId = enrolmentTypeId;
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
				Objects.equals(getIsEducationState(), that.getIsEducationState()) &&
				Objects.equals(getIsInterview(), that.getIsInterview()) &&
				Objects.equals(getIsOriginal(), that.getIsOriginal());
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), getKb(), getRatingPriority(), getPersonId(), getSpecOfferId(), getDepartmentId(), getPersonPaperId(), getEnrolmentTypeId(), getMarkScaleId(), getMark(), getDocSeries(), getDocNum(), getDocText(), getIsState(), getIsContract(), getIsPrivilege(), getIsHostel(), getIsEducationState(), getIsInterview(), getIsOriginal());
	}

	@Override
	public String toString() {
		return "EnrolmentRating{" +
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
				", isEducationState=" + isEducationState +
				", isInterview=" + isInterview +
				", isOriginal=" + isOriginal +
				"} " + super.toString();
	}
}
