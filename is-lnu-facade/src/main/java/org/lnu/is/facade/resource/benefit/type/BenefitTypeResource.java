package org.lnu.is.facade.resource.benefit.type;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Benefit Type resouce.
 * @author ivanursul
 *
 */
public class BenefitTypeResource extends ApiResource {

	private String name;
	
	private Integer priority;
	
	@Override
	public String getUri() {
		return "/benefits/types/";
	}

	@Override
	public String getRootUri() {
		return "/benefits/types";
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((priority == null) ? 0 : priority.hashCode());
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
		BenefitTypeResource other = (BenefitTypeResource) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (priority == null) {
			if (other.priority != null) {
				return false;
			}
		} else if (!priority.equals(other.priority)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "BenefitTypeResource [name=" + name + ", priority=" + priority
				+ "]";
	}

}
