package org.lnu.is.resource.department.name;

import java.text.MessageFormat;

import javax.validation.constraints.Min;

import org.lnu.is.resource.ApiResource;

/**
 * Department Name Resource.
 * @author ivanursul
 *
 */
public class DepartmentNameResource extends ApiResource {

	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long languageId;
	
	private String abbrName;
	
	private String name;

	@Override
	public String getUri() {
		return MessageFormat.format("/departments/{0}/names/{1}", departmentId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/departments/{0}/names", departmentId);
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(final Long languageId) {
		this.languageId = languageId;
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
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result
				+ ((languageId == null) ? 0 : languageId.hashCode());
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
		DepartmentNameResource other = (DepartmentNameResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
			return false;
		}
		if (languageId == null) {
			if (other.languageId != null) {
				return false;
			}
		} else if (!languageId.equals(other.languageId)) {
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
		return "DepartmentNameResource [departmentId=" + departmentId
				+ ", languageId=" + languageId + ", abbrName=" + abbrName
				+ ", name=" + name + "]";
	}
	
}
