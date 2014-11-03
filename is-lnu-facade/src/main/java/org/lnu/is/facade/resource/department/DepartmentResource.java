package org.lnu.is.facade.resource.department;

import java.util.Date;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Resource for Web layer, that describes Department.
 * @author ivanursul
 *
 */
public class DepartmentResource extends ApiResource {

	private Long id;
	
	private Long parentId;

	private Long departmentTypeId;
	
	private Long orderId;
	
	private String abbrName;
	
	private String name;
	
	private String manager;
	
	private String phone;
	
	private String email;
	
	private Date begDate;
	
	private Date endDate;

	private String note;
	
	@Override
	public String getUri() {
		return null;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public Date getBegDate() {
		return new Date(begDate.getTime());
	}

	public void setBegDate(final Date begDate) {
		this.begDate = new Date(begDate.getTime());
	}

	public Date getEndDate() {
		return new Date(endDate.getTime());
	}

	public void setEndDate(final Date endDate) {
		this.endDate = new Date(endDate.getTime());
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(final String note) {
		this.note = note;
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
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
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
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (manager == null) {
			if (other.manager != null) {
				return false;
			}
		} else if (!manager.equals(other.manager)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (note == null) {
			if (other.note != null) {
				return false;
			}
		} else if (!note.equals(other.note)) {
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
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "DepartmentResource [id=" + id + ", parentId=" + parentId
				+ ", departmentTypeId=" + departmentTypeId + ", orderId="
				+ orderId + ", abbrName=" + abbrName + ", name=" + name
				+ ", manager=" + manager + ", phone=" + phone + ", email="
				+ email + ", begDate=" + begDate + ", endDate=" + endDate
				+ ", note=" + note + "]";
	}

}
