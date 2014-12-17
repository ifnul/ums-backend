package org.lnu.is.facade.resource.asset.status;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Asset state resource.
 * @author ivanursul
 *
 */
public class AssetStatusResource extends ApiResource {

	private String name;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/assets/states/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/assets/statuses";
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
		AssetStatusResource other = (AssetStatusResource) obj;
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
		return "AssetStateResource [name=" + name + "]";
	}

}
