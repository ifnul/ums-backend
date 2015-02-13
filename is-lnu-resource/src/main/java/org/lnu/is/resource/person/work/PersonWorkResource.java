package org.lnu.is.resource.person.work;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Person Work Resource.
 * @author ivanursul
 *
 */
public class PersonWorkResource extends ApiResource {

	@NotNull
	private Long personId;
	
	@NotNull
	private Long jobTypeId;
	
	@NotNull
	private Long specStageTypeId;

	@NotNull
	private String postName;

	@NotNull
	private String organizationName;
	
	@NotNull
	private String description;
	
	@NotNull
	private Date begDate;
	
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/works/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/works", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getJobTypeId() {
		return jobTypeId;
	}

	public void setJobTypeId(final Long jobTypeId) {
		this.jobTypeId = jobTypeId;
	}

	public Long getSpecStageTypeId() {
		return specStageTypeId;
	}

	public void setSpecStageTypeId(final Long specStageTypeId) {
		this.specStageTypeId = specStageTypeId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(final String postName) {
		this.postName = postName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(final String organizationName) {
		this.organizationName = organizationName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
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
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((jobTypeId == null) ? 0 : jobTypeId.hashCode());
		result = prime
				* result
				+ ((organizationName == null) ? 0 : organizationName.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
		result = prime * result
				+ ((postName == null) ? 0 : postName.hashCode());
		result = prime * result
				+ ((specStageTypeId == null) ? 0 : specStageTypeId.hashCode());
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
		PersonWorkResource other = (PersonWorkResource) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (jobTypeId == null) {
			if (other.jobTypeId != null) {
				return false;
			}
		} else if (!jobTypeId.equals(other.jobTypeId)) {
			return false;
		}
		if (organizationName == null) {
			if (other.organizationName != null) {
				return false;
			}
		} else if (!organizationName.equals(other.organizationName)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		if (postName == null) {
			if (other.postName != null) {
				return false;
			}
		} else if (!postName.equals(other.postName)) {
			return false;
		}
		if (specStageTypeId == null) {
			if (other.specStageTypeId != null) {
				return false;
			}
		} else if (!specStageTypeId.equals(other.specStageTypeId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonWorkResource [personId=" + personId + ", jobTypeId="
				+ jobTypeId + ", specStageTypeId=" + specStageTypeId
				+ ", postName=" + postName + ", organizationName="
				+ organizationName + ", description=" + description
				+ ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}
