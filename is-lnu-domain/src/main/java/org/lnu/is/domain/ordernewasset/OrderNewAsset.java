package org.lnu.is.domain.ordernewasset;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.assetstate.AssetState;
import org.lnu.is.domain.assetstatus.AssetStatus;
import org.lnu.is.domain.assettype.AssetType;
import org.lnu.is.domain.order.Order;

/**
 * Order New Asset entity.
 * 
 * @author kushnir
 *
 */
@DT
@Entity
@Table(name = "q_dt_ordernewasset")
public class OrderNewAsset extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;

	@ManyToOne
	@JoinColumn(name = "assetstate_id")
	private AssetState assetState;

	@ManyToOne
	@JoinColumn(name = "assetstatus_id")
	private AssetStatus assetStatus;

	@ManyToOne
	@JoinColumn(name = "assettype_id")
	private AssetType assetType;

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

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(final Asset asset) {
		this.asset = asset;
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

	public AssetType getAssetType() {
		return assetType;
	}

	public void setAssetType(final AssetType assetType) {
		this.assetType = assetType;
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
		OrderNewAsset other = (OrderNewAsset) obj;
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
		return "OrderNewAsset [name=" + name + ", invNum=" + invNum
				+ ", serialNum=" + serialNum + ", prodDate=" + prodDate
				+ ", begDate=" + begDate + ", endDate=" + endDate + ", price="
				+ price + ", amount=" + amount + ", suma=" + suma
				+ ", description=" + description + "]";
	}

}
