package org.lnu.is.resource.enrolment.enrolment.subject;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;

/**
 * Enrolment Enrolment Subject Resource.
 * @author illay
 *
 */
@ReferenceResource
public class EnrolmentEnrolmentSubjectResource extends ApiResource {
    
    @NotNull
    @Min(value = 1, message = "Minimal value is 1")
    private Long enrolmentId;
    
    @NotNull
    @Min(value = 1, message = "Minimal value is 1")
    private Long enrolmentSubjectId;
    
    @NotNull
    @Min(value = 1, message = "Minimal value is 1")
    private Long personEnrolmentSubjectId;
    
    @NotNull
    private Double mark;
    
    @Override
    public String getUri() {
	return MessageFormat.format("/enrolments/{0}/enrolmentsubjects/{1}", enrolmentId, getId());
    }

    @Override
    public String getRootUri() {
	return MessageFormat.format("/enrolments/{0}/enrolmentsubjects", enrolmentId);
    }

    public Long getEnrolmentId() {
        return enrolmentId;
    }

    public void setEnrolmentId(final Long enrolmentId) {
        this.enrolmentId = enrolmentId;
    }

    public Long getEnrolmentSubjectId() {
        return enrolmentSubjectId;
    }

    public void setEnrolmentSubjectId(final Long enrolmentSubjectId) {
        this.enrolmentSubjectId = enrolmentSubjectId;
    }

    public Long getPersonEnrolmentSubjectId() {
        return personEnrolmentSubjectId;
    }

    public void setPersonEnrolmentSubjectId(final Long personEnrolmentSubjectId) {
        this.personEnrolmentSubjectId = personEnrolmentSubjectId;
    }

    public Double getMark() {
        return mark;
    }

    public void setMark(final Double mark) {
        this.mark = mark;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result
		+ ((enrolmentId == null) ? 0 : enrolmentId.hashCode());
	result = prime
		* result
		+ ((enrolmentSubjectId == null) ? 0 : enrolmentSubjectId
			.hashCode());
	result = prime * result + ((mark == null) ? 0 : mark.hashCode());
	result = prime
		* result
		+ ((personEnrolmentSubjectId == null) ? 0
			: personEnrolmentSubjectId.hashCode());
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
	EnrolmentEnrolmentSubjectResource other = (EnrolmentEnrolmentSubjectResource) obj;
	if (enrolmentId == null) {
	    if (other.enrolmentId != null) {
		return false;
	    }
	} else if (!enrolmentId.equals(other.enrolmentId)) {
	    return false;
	}
	if (enrolmentSubjectId == null) {
	    if (other.enrolmentSubjectId != null) {
		return false;
	    }
	} else if (!enrolmentSubjectId.equals(other.enrolmentSubjectId)) {
	    return false;
	}
	if (mark == null) {
	    if (other.mark != null) {
		return false;
	    }
	} else if (!mark.equals(other.mark)) {
	    return false;
	}
	if (personEnrolmentSubjectId == null) {
	    if (other.personEnrolmentSubjectId != null) {
		return false;
	    }
	} else if (!personEnrolmentSubjectId
		.equals(other.personEnrolmentSubjectId)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "EnrolmentEnrolmentSubjectResource [enrolmentId=" + enrolmentId
		+ ", enrolmentSubjectId=" + enrolmentSubjectId
		+ ", personEnrolmentSubjectId=" + personEnrolmentSubjectId
		+ ", mark=" + mark + "]";
    }
    
    
}
