package org.lnu.is.domain.asset;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.partner.Partner;

/**
 * Asset entity.
 * @author ivanursul
 *
 */
@OB
@Entity
@Table(name = "q_ob_asset")
public class Asset extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "assettype_id")
	private AssetType assetType;
	
	@ManyToOne
	@JoinColumn(name = "assetstate_id")
	private AssetState assetState;
	
	@ManyToOne
	@JoinColumn(name = "assetstatus_id")
	private AssetStatus assetStatus;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "partner_id")
	private Partner partner;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Asset parent;
	
	@OneToMany(mappedBy = "asset")
	private List<AssetAddress> addresses;
	
	@OneToMany(mappedBy = "asset")
	private List<AssetProperty> properties;
	
	@OneToMany(mappedBy = "asset")
	private List<AssetRef> references;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "invnum")
	private String invNum;
	
	@Column(name = "serialnum")
	private String serialNum;
	
	@Column(name = "proddate")
	private Date prodDate;

	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "amount")
	private Double amount;

	@Column(name = "suma")
	private Double suma;

	@Column(name = "description")
	private String description;

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(final AssetType assetType) {
		this.assetType = assetType;
	}

	public AssetState getAssetState() {
		return assetState;
	}

	public void setAssetState(final AssetState assetState) {
		this.assetState = assetState;
	}

	public AssetStatus getAssetStatus() {
		return assetStatus;
	}

	public void setAssetStatus(final AssetStatus assetStatus) {
		this.assetStatus = assetStatus;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(final Partner partner) {
		this.partner = partner;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}

	public Asset getParent() {
		return parent;
	}

	public void setParent(final Asset parent) {
		this.parent = parent;
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

	public List<AssetAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(final List<AssetAddress> addresses) {
		this.addresses = addresses;
	}

	public List<AssetProperty> getProperties() {
		return properties;
	}

	public void setProperties(final List<AssetProperty> properties) {
		this.properties = properties;
	}

	public List<AssetRef> getReferences() {
		return references;
	}

	public void setReferences(final List<AssetRef> references) {
		this.references = references;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((invNum == null) ? 0 : invNum.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Asset other = (Asset) obj;
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
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
		return "Asset [name=" + name + ", invNum=" + invNum + ", serialNum="
				+ serialNum + ", prodDate=" + prodDate + ", begDate=" + begDate
				+ ", endDate=" + endDate + ", price=" + price + ", amount="
				+ amount + ", suma=" + suma + ", description=" + description
				+ "]";
	}
	
}
