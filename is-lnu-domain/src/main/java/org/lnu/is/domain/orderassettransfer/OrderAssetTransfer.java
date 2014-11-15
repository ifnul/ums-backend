package org.lnu.is.domain.orderassettransfer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.order.Order;

/**
 * Order Asset Transfer entity.
 * @author illay
 *
 */
@DT
@Entity
@Table(name = "q_dt_orderassettransfer")
public class OrderAssetTransfer extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@Column(name = "price")
	private Double price;
	
	@Column(name = "amount")
	private Double amount;
	
	@Column(name = "suma")
	private Double suma;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
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
		OrderAssetTransfer other = (OrderAssetTransfer) obj;
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
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
		return "OrderAssetTransfer [price=" + price + ", amount=" + amount
				+ ", suma=" + suma + "]";
	}
	
	
}
