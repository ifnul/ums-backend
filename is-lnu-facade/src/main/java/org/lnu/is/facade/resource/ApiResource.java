package org.lnu.is.facade.resource;

/**
 * Abstract class, that all resources need to implement.
 * @author ivanursul
 *
 */
public abstract class ApiResource {

	private Long id;
	
	/**
	 * Method for getting unique uri for all resources.
	 * @return uri of string representation.
	 */
	public abstract String getUri();

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		ApiResource other = (ApiResource) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ApiResource [id=" + id + "]";
	}
	
}
