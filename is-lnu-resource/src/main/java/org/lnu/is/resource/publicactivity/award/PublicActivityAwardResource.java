package org.lnu.is.resource.publicactivity.award;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;

/**
 * Public Activity Award resource.
 * @author ivanursul
 *
 */
@ReferenceResource
public class PublicActivityAwardResource extends ApiResource {

	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long publicActivityId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long enrolmentSubjectId;
	
	@NotNull
	private String awardName;
	
	@NotNull
	private Double bonus;
	
	@NotNull
	private Date begDate;
	
	@NotNull
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/publicactivities/{0}/awards/{1}", publicActivityId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/publicactivities/{0}/awards", publicActivityId);
	}

	public Long getPublicActivityId() {
		return publicActivityId;
	}

	public void setPublicActivityId(final Long publicActivityId) {
		this.publicActivityId = publicActivityId;
	}

	public Long getEnrolmentSubjectId() {
		return enrolmentSubjectId;
	}

	public void setEnrolmentSubjectId(final Long enrolmentSubjectId) {
		this.enrolmentSubjectId = enrolmentSubjectId;
	}

	public String getAwardName() {
		return awardName;
	}

	public void setAwardName(final String awardName) {
		this.awardName = awardName;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(final Double bonus) {
		this.bonus = bonus;
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
		result = prime * result
				+ ((awardName == null) ? 0 : awardName.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime
				* result
				+ ((enrolmentSubjectId == null) ? 0 : enrolmentSubjectId
						.hashCode());
		result = prime
				* result
				+ ((publicActivityId == null) ? 0 : publicActivityId.hashCode());
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
		PublicActivityAwardResource other = (PublicActivityAwardResource) obj;
		if (awardName == null) {
			if (other.awardName != null) {
				return false;
			}
		} else if (!awardName.equals(other.awardName)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (bonus == null) {
			if (other.bonus != null) {
				return false;
			}
		} else if (!bonus.equals(other.bonus)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (enrolmentSubjectId == null) {
			if (other.enrolmentSubjectId != null) {
				return false;
			}
		} else if (!enrolmentSubjectId.equals(other.enrolmentSubjectId)) {
			return false;
		}
		if (publicActivityId == null) {
			if (other.publicActivityId != null) {
				return false;
			}
		} else if (!publicActivityId.equals(other.publicActivityId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PublicActivityAwardResource [publicActivityId="
				+ publicActivityId + ", enrolmentSubjectId="
				+ enrolmentSubjectId + ", awardName=" + awardName + ", bonus="
				+ bonus + ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}
