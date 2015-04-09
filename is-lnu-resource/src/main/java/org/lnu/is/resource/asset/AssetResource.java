package org.lnu.is.resource.asset;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Resrouce for assets.
 * @author ivanursul
 *
 */
@CrudableResource
public class AssetResource extends ApiResource {

	@Min(value = 1, message = "Minimal value is 1")
	private Long partnerId;

	@Min(value = 1, message = "Minimal value is 1")
	private Long parentId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long assetTypeId;

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long assetStateId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long assetStatusId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long departmentId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long employeeId;
	
	private Long orderId;

	@NotNull(message = "Field required")
	private String name;
	
	@NotNull(message = "Field required")
	private String invNum;
	
	@NotNull(message = "Field required")
	private String serialNum;
	
	@NotNull(message = "Field required")
	private Date prodDate;

	@NotNull(message = "Field required")
	private Date begDate;
	
	@NotNull(message = "Field required")
	private Date endDate;
	
	@NotNull(message = "Field required")
	private Double price;
	
	@NotNull(message = "Field required")
	private Double amount;

	@NotNull(message = "Field required")
	private Double suma;

	@NotNull(message = "Field required")
	private String description;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/assets/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/assets";
	}

	public Long getAssetTypeId() {
		return assetTypeId;
	}

	public void setAssetTypeId(final Long assetTypeId) {
		this.assetTypeId = assetTypeId;
	}

	public Long getAssetStateId() {
		return assetStateId;
	}

	public void setAssetStateId(final Long assetStateId) {
		this.assetStateId = assetStateId;
	}

	public Long getAssetStatusId() {
		return assetStatusId;
	}

	public void setAssetStatusId(final Long assetStatusId) {
		this.assetStatusId = assetStatusId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(final Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(final Long partnerId) {
		this.partnerId = partnerId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(final Long orderId) {
		this.orderId = orderId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(final String invNum) {
		this.invNum = invNum;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(final String serialNum) {
		this.serialNum = serialNum;
	}

	public Date getProdDate() {
		return prodDate;
	}

	public void setProdDate(final Date prodDate) {
		this.prodDate = prodDate;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(final Double price) {
		this.price = price;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(final Double amount) {
		this.amount = amount;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(final Double suma) {
		this.suma = suma;
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
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((assetStateId == null) ? 0 : assetStateId.hashCode());
		result = prime * result
				+ ((assetStatusId == null) ? 0 : assetStatusId.hashCode());
		result = prime * result
				+ ((assetTypeId == null) ? 0 : assetTypeId.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((invNum == null) ? 0 : invNum.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result
				+ ((partnerId == null) ? 0 : partnerId.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result
				+ ((prodDate == null) ? 0 : prodDate.hashCode());
		result = prime * result
				+ ((serialNum == null) ? 0 : serialNum.hashCode());
		result = prime * result + ((suma == null) ? 0 : suma.hashCode());
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
		AssetResource other = (AssetResource) obj;
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (assetStateId == null) {
			if (other.assetStateId != null) {
				return false;
			}
		} else if (!assetStateId.equals(other.assetStateId)) {
			return false;
		}
		if (assetStatusId == null) {
			if (other.assetStatusId != null) {
				return false;
			}
		} else if (!assetStatusId.equals(other.assetStatusId)) {
			return false;
		}
		if (assetTypeId == null) {
			if (other.assetTypeId != null) {
				return false;
			}
		} else if (!assetTypeId.equals(other.assetTypeId)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (employeeId == null) {
			if (other.employeeId != null) {
				return false;
			}
		} else if (!employeeId.equals(other.employeeId)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (invNum == null) {
			if (other.invNum != null) {
				return false;
			}
		} else if (!invNum.equals(other.invNum)) {
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
		if (partnerId == null) {
			if (other.partnerId != null) {
				return false;
			}
		} else if (!partnerId.equals(other.partnerId)) {
			return false;
		}
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
			return false;
		}
		if (prodDate == null) {
			if (other.prodDate != null) {
				return false;
			}
		} else if (!prodDate.equals(other.prodDate)) {
			return false;
		}
		if (serialNum == null) {
			if (other.serialNum != null) {
				return false;
			}
		} else if (!serialNum.equals(other.serialNum)) {
			return false;
		}
		if (suma == null) {
			if (other.suma != null) {
				return false;
			}
		} else if (!suma.equals(other.suma)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AssetResource [assetTypeId=" + assetTypeId + ", assetStateId="
				+ assetStateId + ", assetStatusId=" + assetStatusId
				+ ", departmentId=" + departmentId + ", employeeId="
				+ employeeId + ", partnerId=" + partnerId + ", orderId="
				+ orderId + ", parentId=" + parentId + ", name=" + name
				+ ", invNum=" + invNum + ", serialNum=" + serialNum
				+ ", prodDate=" + prodDate + ", begDate=" + begDate
				+ ", endDate=" + endDate + ", price=" + price + ", amount="
				+ amount + ", suma=" + suma + ", description=" + description
				+ "]";
	}

}
