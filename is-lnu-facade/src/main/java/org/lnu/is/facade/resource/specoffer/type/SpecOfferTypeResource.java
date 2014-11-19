package org.lnu.is.facade.resource.specoffer.type;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Spec Offer Type Resource.
 * @author ivanursul
 *
 */
public class SpecOfferTypeResource extends ApiResource {
	
	private Long specialtyTypeId;
	
	private String abbrName;
	
	private String name;

	@Override
	public String getUri() {
		return MessageFormat.format("/specoffertypes/{0}", getId());
	}

	public Long getSpecialtyTypeId() {
		return specialtyTypeId;
	}

	public void setSpecialtyTypeId(final Long specialtyTypeId) {
		this.specialtyTypeId = specialtyTypeId;
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
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((specialtyTypeId == null) ? 0 : specialtyTypeId.hashCode());
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
		SpecOfferTypeResource other = (SpecOfferTypeResource) obj;
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
		if (specialtyTypeId == null) {
			if (other.specialtyTypeId != null) {
				return false;
			}
		} else if (!specialtyTypeId.equals(other.specialtyTypeId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferTypeResource [specialtyTypeId=" + specialtyTypeId
				+ ", abbrName=" + abbrName + ", name=" + name + "]";
	}

}
