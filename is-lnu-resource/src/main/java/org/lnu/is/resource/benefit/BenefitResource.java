package org.lnu.is.resource.benefit;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Benefit Resource converter.
 * @author ivanursul
 *
 */
@CrudableResource
public class BenefitResource extends ApiResource {

	private Long parentId;

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long benefitTypeId;
	
	@NotNull(message = "Field required")
	private String name;

	@NotNull(message = "Field required")
	private String abbrName;
	
	@NotNull(message = "Field required")
	private String description;

	@NotNull(message = "Field required")
	private Date begDate;
	
	@NotNull(message = "Field required")
	private Date endDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/benefits/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/benefits";
	}

	public Long getBenefitTypeId() {
		return benefitTypeId;
	}

	public void setBenefitTypeId(final Long benefitTypeId) {
		this.benefitTypeId = benefitTypeId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((benefitTypeId == null) ? 0 : benefitTypeId.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
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
		BenefitResource other = (BenefitResource) obj;
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
		if (benefitTypeId == null) {
			if (other.benefitTypeId != null) {
				return false;
			}
		} else if (!benefitTypeId.equals(other.benefitTypeId)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
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
		return "BenefitResource [benefitTypeId=" + benefitTypeId
				+ ", parentId=" + parentId + ", abbrName=" + abbrName
				+ ", name=" + name + ", begDate=" + begDate + ", endDate="
				+ endDate + ", description=" + description + "]";
	}

}
