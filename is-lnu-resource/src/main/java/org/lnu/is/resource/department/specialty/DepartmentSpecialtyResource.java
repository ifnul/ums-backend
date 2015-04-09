package org.lnu.is.resource.department.specialty;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Department Specialty Resource.
 * @author ivanursul
 *
 */
public class DepartmentSpecialtyResource extends ApiResource {

	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long specialtyId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/departments/{0}/specialties/{1}", departmentId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/departments/{0}/specialties", departmentId);
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(final Long specialtyId) {
		this.specialtyId = specialtyId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result
				+ ((specialtyId == null) ? 0 : specialtyId.hashCode());
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
		DepartmentSpecialtyResource other = (DepartmentSpecialtyResource) obj;
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
			return false;
		}
		if (specialtyId == null) {
			if (other.specialtyId != null) {
				return false;
			}
		} else if (!specialtyId.equals(other.specialtyId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentSpecialtyResource [departmentId=" + departmentId
				+ ", specialtyId=" + specialtyId + "]";
	}

}
