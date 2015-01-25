package org.lnu.is.resource.system;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMethod;

/**
 * System resource.
 * @author ivanursul
 *
 */
public class SystemResource {

	private Integer methodsCount;
	private Boolean enabled;
	private Map<RequestMethod, Integer> methods;
	private String version;
	private List<String> developers;
	
	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(final Boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getMethodsCount() {
		return methodsCount;
	}

	public void setMethodsCount(final Integer methodsCount) {
		this.methodsCount = methodsCount;
	}

	public List<String> getDevelopers() {
		return developers;
	}

	public void setDevelopers(final List<String> developers) {
		this.developers = developers;
	}

	public Map<RequestMethod, Integer> getMethods() {
		return methods;
	}
	
	public void setMethods(final Map<RequestMethod, Integer> methods) {
		this.methods = methods;
	}
	
	public String getVersion() {
		return version;
	}
	
	public void setVersion(final String version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((developers == null) ? 0 : developers.hashCode());
		result = prime * result + ((enabled == null) ? 0 : enabled.hashCode());
		result = prime * result + ((methods == null) ? 0 : methods.hashCode());
		result = prime * result
				+ ((methodsCount == null) ? 0 : methodsCount.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SystemResource other = (SystemResource) obj;
		if (developers == null) {
			if (other.developers != null) {
				return false;
			}
		} else if (!developers.equals(other.developers)) {
			return false;
		}
		if (enabled == null) {
			if (other.enabled != null) {
				return false;
			}
		} else if (!enabled.equals(other.enabled)) {
			return false;
		}
		if (methods == null) {
			if (other.methods != null) {
				return false;
			}
		} else if (!methods.equals(other.methods)) {
			return false;
		}
		if (methodsCount == null) {
			if (other.methodsCount != null) {
				return false;
			}
		} else if (!methodsCount.equals(other.methodsCount)) {
			return false;
		}
		if (version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!version.equals(other.version)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SystemResource [methodsCount=" + methodsCount + ", enabled="
				+ enabled + ", methods=" + methods + ", version=" + version
				+ ", developers=" + developers + "]";
	}

}
