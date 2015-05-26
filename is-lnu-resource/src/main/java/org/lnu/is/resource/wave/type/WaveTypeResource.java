package org.lnu.is.resource.wave.type;

import java.text.MessageFormat;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;
/**
 * Wave Type Resource.
 * @author illay
 *
 */
@ReferenceResource
public class WaveTypeResource  extends ApiResource {
	
	private String name;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/wave/types/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/wave/types";
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
		WaveTypeResource other = (WaveTypeResource) obj;
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
		return "WaveTypeResource [name=" + name + "]";
	}
	
}
