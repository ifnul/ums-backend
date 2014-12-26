package org.lnu.is.resource.addresstype;

import java.text.MessageFormat;

import org.lnu.is.resource.ApiResource;

/**
 * Address Type Resource.
 * 
 * @author ROMA
 *
 */
public class AddressTypeResource extends ApiResource {

	private String name;

	private String abbrName;

	@Override
	public String getUri() {
		return MessageFormat.format("/addresstypes/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/addresstypes";
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
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
		if (!super.equals(obj)) {

			return false;
		}
		if (getClass() != obj.getClass()) {

			return false;
		}
		AddressTypeResource other = (AddressTypeResource) obj;
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
		return "AddressTypeResource [name=" + name + ", abbrName=" + abbrName
				+ "]";
	}

}
