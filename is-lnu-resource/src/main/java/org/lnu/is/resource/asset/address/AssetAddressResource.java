package org.lnu.is.resource.asset.address;

import java.text.MessageFormat;

import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Asset Address Resource.
 * @author ivanursul
 *
 */
public class AssetAddressResource extends ApiResource {

	@NotNull(message = "Field required")
	private Long adminUnitId;

	@NotNull(message = "Field required")
	private Long assetId;

	@NotNull(message = "Field required")
	private Long addressTypeId;

	@NotNull(message = "Field required")
	private Long streetTypeId;

	private String zipCode;

	private String street;

	private String house;

	private String apartment;

	@Override
	public String getUri() {
		return MessageFormat.format("/assets/{0}/addresses/{1}", assetId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/assets/{0}/addresses", assetId);
	}

	public Long getAdminUnitId() {
		return adminUnitId;
	}

	public void setAdminUnitId(final Long adminUnitId) {
		this.adminUnitId = adminUnitId;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(final Long assetId) {
		this.assetId = assetId;
	}

	public Long getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(final Long addressTypeId) {
		this.addressTypeId = addressTypeId;
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
		result = prime * result + ((assetId == null) ? 0 : assetId.hashCode());
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
		AssetAddressResource other = (AssetAddressResource) obj;
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
		if (assetId == null) {
			if (other.assetId != null) {
				return false;
			}
		} else if (!assetId.equals(other.assetId)) {
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
		return "AssetAddressResource [adminUnitId=" + adminUnitId
				+ ", assetId=" + assetId + ", addressTypeId=" + addressTypeId
				+ ", streetTypeId=" + streetTypeId + ", zipCode=" + zipCode
				+ ", street=" + street + ", house=" + house + ", apartment="
				+ apartment + "]";
	}
	
}
