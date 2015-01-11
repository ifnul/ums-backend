package org.lnu.is.resource.familytype;

import java.text.MessageFormat;

import org.lnu.is.resource.ApiResource;


/**
 * Family Type Resource.
 * @author ivanursul
 *
 */
public class FamilyTypeResource extends ApiResource {

	private String abbrName;
	private String name;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/families/types/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/families/types";
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		FamilyTypeResource other = (FamilyTypeResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
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
		return "FamilyTypeResource [abbrName=" + abbrName + ", name=" + name
				+ "]";
	}
	
}
