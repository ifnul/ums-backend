package org.lnu.is.facade.resource.adminunit;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Admin unit resource.
 * @author ivanursul
 *
 */
public class AdminUnitResource extends ApiResource {
	
	private Long adminUnitTypeId;
	
	private Long parentId;
	
	private String identifier;
	
	private String identifier1;
	
	private String identifier2;

	private String identifier3;
	
	private String name;
	
	private Date begDate;
	
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/adminunits/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/admiunits";
	}

	public Long getAdminUnitTypeId() {
		return adminUnitTypeId;
	}

	public void setAdminUnitTypeId(final Long adminUnitTypeId) {
		this.adminUnitTypeId = adminUnitTypeId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(final String identifier) {
		this.identifier = identifier;
	}

	public String getIdentifier1() {
		return identifier1;
	}

	public void setIdentifier1(final String identifier1) {
		this.identifier1 = identifier1;
	}

	public String getIdentifier2() {
		return identifier2;
	}

	public void setIdentifier2(final String identifier2) {
		this.identifier2 = identifier2;
	}

	public String getIdentifier3() {
		return identifier3;
	}

	public void setIdentifier3(final String identifier3) {
		this.identifier3 = identifier3;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
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
		int result = super.hashCode();
		result = prime * result
				+ ((adminUnitTypeId == null) ? 0 : adminUnitTypeId.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result
				+ ((identifier1 == null) ? 0 : identifier1.hashCode());
		result = prime * result
				+ ((identifier2 == null) ? 0 : identifier2.hashCode());
		result = prime * result
				+ ((identifier3 == null) ? 0 : identifier3.hashCode());
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
		AdminUnitResource other = (AdminUnitResource) obj;
		if (adminUnitTypeId == null) {
			if (other.adminUnitTypeId != null) {
				return false;
			}
		} else if (!adminUnitTypeId.equals(other.adminUnitTypeId)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (identifier == null) {
			if (other.identifier != null) {
				return false;
			}
		} else if (!identifier.equals(other.identifier)) {
			return false;
		}
		if (identifier1 == null) {
			if (other.identifier1 != null) {
				return false;
			}
		} else if (!identifier1.equals(other.identifier1)) {
			return false;
		}
		if (identifier2 == null) {
			if (other.identifier2 != null) {
				return false;
			}
		} else if (!identifier2.equals(other.identifier2)) {
			return false;
		}
		if (identifier3 == null) {
			if (other.identifier3 != null) {
				return false;
			}
		} else if (!identifier3.equals(other.identifier3)) {
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
		return "AdminUnitResource [adminUnitTypeId=" + adminUnitTypeId
				+ ", parentId=" + parentId + ", identifier=" + identifier
				+ ", identifier1=" + identifier1 + ", identifier2="
				+ identifier2 + ", identifier3=" + identifier3 + ", name="
				+ name + ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}
