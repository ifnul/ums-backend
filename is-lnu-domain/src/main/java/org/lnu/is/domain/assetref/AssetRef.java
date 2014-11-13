package org.lnu.is.domain.assetref;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.asset.Asset;
/***
 * AssetRef entity.
 * @author illay
 *
 */
@Entity
@Table(name = "q_od_assetref")
public class AssetRef extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@Column(name = "serialnum")
	private String serialNum;
	
	@Column(name = "amount")
	private Double amount;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private AssetRef assetRef;

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(final Asset asset) {
		this.asset = asset;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(final String serialNum) {
		this.serialNum = serialNum;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(final Double amount) {
		this.amount = amount;
	}

	public AssetRef getAssetRef() {
		return assetRef;
	}

	public void setAssetRef(final AssetRef assetRef) {
		this.assetRef = assetRef;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((amount == null) ? 0 : amount.hashCode());
		result = prime * result
				+ ((serialNum == null) ? 0 : serialNum.hashCode());
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
		AssetRef other = (AssetRef) obj;
		if (amount == null) {
			if (other.amount != null) {
				return false;
			}
		} else if (!amount.equals(other.amount)) {
			return false;
		}
		if (serialNum == null) {
			if (other.serialNum != null) {
				return false;
			}
		} else if (!serialNum.equals(other.serialNum)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "AssetRef [serialNum=" + serialNum + ", amount=" + amount + "]";
	}
	
}
