package org.lnu.is.resource.department.address;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Department Address Resource.
 * @author ivanursul
 *
 */
public class DepartmentAddressResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long addressTypeId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long adminUnitId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long streetTypeId;
	
	@NotNull(message = "Field required")
	private String zipCode;
	
	@NotNull(message = "Field required")
	private String street;
	
	@NotNull(message = "Field required")
	private String house;
	
	@NotNull(message = "Field required")
	private String apartment;

	@Override
	public String getUri() {
		return MessageFormat.format("/departments/{0}/addresses/{1}", departmentId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/departments/{0}/addresses", departmentId);
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(final Long addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public Long getAdminUnitId() {
		return adminUnitId;
	}

	public void setAdminUnitId(final Long adminUnitId) {
		this.adminUnitId = adminUnitId;
	}

	public Long getStreetTypeId() {
		return streetTypeId;
	}

	public void setStreetTypeId(final Long streetTypeId) {
		this.streetTypeId = streetTypeId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(final String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(final String house) {
		this.house = house;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(final String apartment) {
		this.apartment = apartment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((addressTypeId == null) ? 0 : addressTypeId.hashCode());
		result = prime * result
				+ ((adminUnitId == null) ? 0 : adminUnitId.hashCode());
		result = prime * result
				+ ((apartment == null) ? 0 : apartment.hashCode());
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result
				+ ((streetTypeId == null) ? 0 : streetTypeId.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		DepartmentAddressResource other = (DepartmentAddressResource) obj;
		if (addressTypeId == null) {
			if (other.addressTypeId != null) {
				return false;
			}
		} else if (!addressTypeId.equals(other.addressTypeId)) {
			return false;
		}
		if (adminUnitId == null) {
			if (other.adminUnitId != null) {
				return false;
			}
		} else if (!adminUnitId.equals(other.adminUnitId)) {
			return false;
		}
		if (apartment == null) {
			if (other.apartment != null) {
				return false;
			}
		} else if (!apartment.equals(other.apartment)) {
			return false;
		}
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
			return false;
		}
		if (house == null) {
			if (other.house != null) {
				return false;
			}
		} else if (!house.equals(other.house)) {
			return false;
		}
		if (street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!street.equals(other.street)) {
			return false;
		}
		if (streetTypeId == null) {
			if (other.streetTypeId != null) {
				return false;
			}
		} else if (!streetTypeId.equals(other.streetTypeId)) {
			return false;
		}
		if (zipCode == null) {
			if (other.zipCode != null) {
				return false;
			}
		} else if (!zipCode.equals(other.zipCode)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentAddressResource [departmentId=" + departmentId
				+ ", addressTypeId=" + addressTypeId + ", adminUnitId="
				+ adminUnitId + ", streetTypeId=" + streetTypeId + ", zipCode="
				+ zipCode + ", street=" + street + ", house=" + house
				+ ", apartment=" + apartment + "]";
	}
	
}
