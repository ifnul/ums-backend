package org.lnu.is.facade.resource.eduformtype;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Edu Form Type resource.
 * @author ivanursul
 *
 */
public class EduFormTypeResource extends ApiResource {

	private String name;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/eduformtypes/{0}", getId());
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
		EduFormTypeResource other = (EduFormTypeResource) obj;
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
		return "EduFormTypeResource [name=" + name + "]";
	}

}
