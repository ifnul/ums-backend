package org.lnu.is.resource.specoffer;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.text.MessageFormat;
import java.util.Date;
import java.util.Objects;


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
	
	private String docSeries;
	
	private String docNum;

	private Double weightCertificate;

	private Double weightAward;
	
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
	private String duration;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/specoffers";
	}
	
	public String getDuration() {
	    return duration;
	}

	public void setDuration(final String duration) {
	    this.duration = duration;
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

	public Double getWeightCertificate() {
		return weightCertificate;
	}

	public void setWeightCertificate(Double weightCertificate) {
		this.weightCertificate = weightCertificate;
	}

	public Double getWeightAward() {
		return weightAward;
	}

	public void setWeightAward(Double weightAward) {
		this.weightAward = weightAward;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		SpecOfferResource that = (SpecOfferResource) o;
		return Objects.equals(specialtyId, that.specialtyId) &&
				Objects.equals(departmentId, that.departmentId) &&
				Objects.equals(timePeriodId, that.timePeriodId) &&
				Objects.equals(timePeriodCourseId, that.timePeriodCourseId) &&
				Objects.equals(specofferTypeId, that.specofferTypeId) &&
				Objects.equals(docSeries, that.docSeries) &&
				Objects.equals(docNum, that.docNum) &&
				Objects.equals(weightCertificate, that.weightCertificate) &&
				Objects.equals(weightAward, that.weightAward) &&
				Objects.equals(educationFormTypeId, that.educationFormTypeId) &&
				Objects.equals(licCount, that.licCount) &&
				Objects.equals(stateCount, that.stateCount) &&
				Objects.equals(begDate, that.begDate) &&
				Objects.equals(endDate, that.endDate) &&
				Objects.equals(duration, that.duration);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), specialtyId, departmentId, timePeriodId, timePeriodCourseId, specofferTypeId, docSeries, docNum, weightCertificate, weightAward, educationFormTypeId, licCount, stateCount, begDate, endDate, duration);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("specialtyId", specialtyId)
				.append("departmentId", departmentId)
				.append("timePeriodId", timePeriodId)
				.append("timePeriodCourseId", timePeriodCourseId)
				.append("specofferTypeId", specofferTypeId)
				.append("docSeries", docSeries)
				.append("docNum", docNum)
				.append("weightCertificate", weightCertificate)
				.append("weightAward", weightAward)
				.append("educationFormTypeId", educationFormTypeId)
				.append("licCount", licCount)
				.append("stateCount", stateCount)
				.append("begDate", begDate)
				.append("endDate", endDate)
				.append("duration", duration)
				.toString();
	}
}
