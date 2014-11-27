package org.lnu.is.facade.resource.enrolment.subject;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Enrolment Subject Resource.
 * @author ivanursul
 *
 */
public class EnrolmentSubjectResource extends ApiResource {

	private Long parentId;
	
	private String abbrName;
	
	private String name;
	
	private Integer isTesting;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/subjects/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/enrolments/subjects";
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getIsTesting() {
		return isTesting;
	}

	public void setIsTesting(final Integer isTesting) {
		this.isTesting = isTesting;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result
				+ ((isTesting == null) ? 0 : isTesting.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		EnrolmentSubjectResource other = (EnrolmentSubjectResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (isTesting == null) {
			if (other.isTesting != null) {
				return false;
			}
		} else if (!isTesting.equals(other.isTesting)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentSubjectResource [parentId=" + parentId
				+ ", abbrName=" + abbrName + ", name=" + name + ", isTesting="
				+ isTesting + "]";
	}

}
