package org.lnu.is.resource.department.contact;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Department Contact resource.
 * @author ivanursul
 *
 */
public class DepartmentContactResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long contactTypeId;
	
	@NotNull(message = "Field required")
	private String value;

	@Override
	public String getUri() {
		return MessageFormat.format("/departments/{0}/contacts/{1}", departmentId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/departments/{0}/contacts", departmentId);
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getContactTypeId() {
		return contactTypeId;
	}

	public void setContactTypeId(final Long contactTypeId) {
		this.contactTypeId = contactTypeId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(final String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((contactTypeId == null) ? 0 : contactTypeId.hashCode());
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		DepartmentContactResource other = (DepartmentContactResource) obj;
		if (contactTypeId == null) {
			if (other.contactTypeId != null) {
				return false;
			}
		} else if (!contactTypeId.equals(other.contactTypeId)) {
			return false;
		}
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
			return false;
		}
		if (value == null) {
			if (other.value != null) {
				return false;
			}
		} else if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentContactResource [departmentId=" + departmentId
				+ ", contactTypeId=" + contactTypeId + ", value=" + value + "]";
	}
	
}
