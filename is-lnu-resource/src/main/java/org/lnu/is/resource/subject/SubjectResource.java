package org.lnu.is.resource.subject;

import java.text.MessageFormat;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;

/**
 * Subject resource.
 * @author ivanursul
 *
 */
@ReferenceResource
public class SubjectResource extends ApiResource {

	private Long subjectTypeId;

	private String name;

	@Override
	public String getUri() {
		return MessageFormat.format("/subjects/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/subjects";
	}

	public Long getSubjectTypeId() {
		return subjectTypeId;
	}

	public void setSubjectTypeId(final Long subjectTypeId) {
		this.subjectTypeId = subjectTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((subjectTypeId == null) ? 0 : subjectTypeId.hashCode());
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
		SubjectResource other = (SubjectResource) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (subjectTypeId == null) {
			if (other.subjectTypeId != null) {
				return false;
			}
		} else if (!subjectTypeId.equals(other.subjectTypeId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SubjectResource [subjectTypeId=" + subjectTypeId + ", name="
				+ name + "]";
	}
	
}
