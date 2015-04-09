package org.lnu.is.resource.department;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Resource for Web layer, that describes Department.
 * @author ivanursul
 *
 */
@CrudableResource
public class DepartmentResource extends ApiResource {

	@Min(value = 1, message = "Minimal value is 1")
	private Long parentId;

	@Min(value = 1, message = "Minimal value is 1")
	private Long orderId;

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentTypeId;

	@NotNull(message = "Field required")
	private String abbrName;
	
	@NotNull(message = "Field required")
	private String name;
	
	@NotNull(message = "Field required")
	private String manager;
	
	@NotNull(message = "Field required")
	private String identifir;
	
	@NotNull(message = "Field required")
	private Date begDate;
	
	@NotNull(message = "Field required")
	private Date endDate;

	@Override
	public String getUri() {
		return MessageFormat.format("/departments/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/departments";
	}
	
	public String getIdentifir() {
		return identifir;
	}

	public void setIdentifir(final String indetifir) {
		this.identifir = indetifir;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public Long getDepartmentTypeId() {
		return departmentTypeId;
	}

	public void setDepartmentTypeId(final Long departmentTypeId) {
		this.departmentTypeId = departmentTypeId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(final Long orderId) {
		this.orderId = orderId;
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

	public String getManager() {
		return manager;
	}

	public void setManager(final String manager) {
		this.manager = manager;
	}
	
	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(final Date begDate) {
		this.begDate = begDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime
				* result
				+ ((departmentTypeId == null) ? 0 : departmentTypeId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((identifir == null) ? 0 : identifir.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
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
		DepartmentResource other = (DepartmentResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (departmentTypeId == null) {
			if (other.departmentTypeId != null) {
				return false;
			}
		} else if (!departmentTypeId.equals(other.departmentTypeId)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (manager == null) {
			if (other.manager != null) {
				return false;
			}
		} else if (!manager.equals(other.manager)) {
			return false;
		}		
		if (identifir == null) {
			if (other.identifir != null) {
				return false;
			}
		} else if (!identifir.equals(other.identifir)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (orderId == null) {
			if (other.orderId != null) {
				return false;
			}
		} else if (!orderId.equals(other.orderId)) {
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
		return "DepartmentResource [parentId=" + parentId
				+ ", departmentTypeId=" + departmentTypeId + ", orderId="
				+ orderId + ", abbrName=" + abbrName + ", name=" + name
				+ ", manager=" + manager + ", begDate=" + begDate + ", endDate=" + endDate
				+ ", identifir=" + identifir + "]";
	}

}
