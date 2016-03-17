package org.lnu.is.resource.enrolment;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Objects;

/**
 * Enrolment Resource.
 * 
 * @author kushnir
 *
 */
@CrudableResource
public class EnrolmentRatingResource extends ApiResource {

	private double kb;

	private int ratingPriority;

	private Long parentId;

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
	
	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/enrolments";
	}
	
	public Integer getIsEducationState() {
	    return isEducationState;
	}

	public void setIsEducationState(final Integer isEducationState) {
	    this.isEducationState = isEducationState;
	}

	public Integer getIsInterview() {
	    return isInterview;
	}

	public void setIsInterview(final Integer isInterview) {
	    this.isInterview = isInterview;
	}

	public Integer getIsOriginal() {
	    return isOriginal;
	}

	public void setIsOriginal(final Integer isOriginal) {
	    this.isOriginal = isOriginal;
	}

	public Long getMarkScaleId() {
		return markScaleId;
	}

	public void setMarkScaleId(final Long markScaleId) {
		this.markScaleId = markScaleId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getSpecOfferId() {
		return specOfferId;
	}

	public void setSpecOfferId(final Long specofferId) {
		this.specOfferId = specofferId;
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
	
	public Integer getPriority() {
		return priority;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}

	public double getKb() {
		return kb;
	}

	public void setKb(double kb) {
		this.kb = kb;
	}

	public int getRatingPriority() {
		return ratingPriority;
	}

	public void setRatingPriority(int ratingPriority) {
		this.ratingPriority = ratingPriority;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		EnrolmentRatingResource that = (EnrolmentRatingResource) o;
		return Double.compare(that.kb, kb) == 0 &&
				ratingPriority == that.ratingPriority &&
				Objects.equals(parentId, that.parentId) &&
				Objects.equals(personId, that.personId) &&
				Objects.equals(specOfferId, that.specOfferId) &&
				Objects.equals(departmentId, that.departmentId) &&
				Objects.equals(personPaperId, that.personPaperId) &&
				Objects.equals(enrolmentTypeId, that.enrolmentTypeId) &&
				Objects.equals(markScaleId, that.markScaleId) &&
				Objects.equals(mark, that.mark) &&
				Objects.equals(docSeries, that.docSeries) &&
				Objects.equals(docNum, that.docNum) &&
				Objects.equals(docText, that.docText) &&
				Objects.equals(isState, that.isState) &&
				Objects.equals(isContract, that.isContract) &&
				Objects.equals(isPrivilege, that.isPrivilege) &&
				Objects.equals(isHostel, that.isHostel) &&
				Objects.equals(evDate, that.evDate) &&
				Objects.equals(begDate, that.begDate) &&
				Objects.equals(endDate, that.endDate) &&
				Objects.equals(priority, that.priority) &&
				Objects.equals(isEducationState, that.isEducationState) &&
				Objects.equals(isInterview, that.isInterview) &&
				Objects.equals(isOriginal, that.isOriginal);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), kb, ratingPriority, parentId, personId, specOfferId, departmentId, personPaperId, enrolmentTypeId, markScaleId, mark, docSeries, docNum, docText, isState, isContract, isPrivilege, isHostel, evDate, begDate, endDate, priority, isEducationState, isInterview, isOriginal);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("kb", kb)
				.append("ratingPriority", ratingPriority)
				.append("parentId", parentId)
				.append("personId", personId)
				.append("specOfferId", specOfferId)
				.append("departmentId", departmentId)
				.append("personPaperId", personPaperId)
				.append("enrolmentTypeId", enrolmentTypeId)
				.append("markScaleId", markScaleId)
				.append("mark", mark)
				.append("docSeries", docSeries)
				.append("docNum", docNum)
				.append("docText", docText)
				.append("isState", isState)
				.append("isContract", isContract)
				.append("isPrivilege", isPrivilege)
				.append("isHostel", isHostel)
				.append("evDate", evDate)
				.append("begDate", begDate)
				.append("endDate", endDate)
				.append("priority", priority)
				.append("isEducationState", isEducationState)
				.append("isInterview", isInterview)
				.append("isOriginal", isOriginal)
				.toString();
	}
}
