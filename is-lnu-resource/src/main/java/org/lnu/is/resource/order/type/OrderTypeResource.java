package org.lnu.is.resource.order.type;

import java.text.MessageFormat;

import javax.validation.constraints.Min;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;

/**
 * Resource for order type.
 * @author ivanursul
 *
 */
@ReferenceResource
public class OrderTypeResource extends ApiResource {

	private String abbrName;

	private String name;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long parentId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/orders/types/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/orders/types";
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

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
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
		OrderTypeResource other = (OrderTypeResource) obj;
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
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "OrderTypeResource [abbrName=" + abbrName + ", name=" + name
				+ ", parentId=" + parentId + "]";
	}

}
