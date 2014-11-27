package org.lnu.is.facade.resource.enrolment.statustype;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Enrolment Status Type Resource.
 * 
 * @author kushnir
 *
 */

public class EnrolmentStatusTypeResource extends ApiResource {

	private String abbrName;

	private String name;

	private String description;

	@Override
	public String getUri() {
		return MessageFormat.format("/enrolments/statustypes/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/enrolments/statustypes";
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

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		EnrolmentStatusTypeResource other = (EnrolmentStatusTypeResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EnrolmentStatusTypeResource [abbrName=" + abbrName + ", name=" + name + ", description=" + description + "]";
	}

}
