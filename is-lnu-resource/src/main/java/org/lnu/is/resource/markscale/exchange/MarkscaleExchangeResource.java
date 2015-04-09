package org.lnu.is.resource.markscale.exchange;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Api Resource for markscale exchange.
 * @author OlehZanevych
 *
 */
@CrudableResource
public class MarkscaleExchangeResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long markscaleId;

	@Min(value = 1, message = "Minimal value is 1")
	private Long markscaleValueId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long markscaleExchangeId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long markscaleExchangeValueId;
	
	private Double markMin;
	
	private Double markMax;
	
	private Double markExchange;

	@Override
	public String getUri() {
		return MessageFormat.format("/markscales/{0}/exchanges/{1}", markscaleId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/markscales/{0}/exchanges", markscaleId);
	}

	public Long getMarkscaleId() {
		return markscaleId;
	}

	public void setMarkscaleId(final Long markscaleId) {
		this.markscaleId = markscaleId;
	}

	public Long getMarkscaleValueId() {
		return markscaleValueId;
	}

	public void setMarkscaleValueId(final Long markscaleValueId) {
		this.markscaleValueId = markscaleValueId;
	}

	public Long getMarkscaleExchangeId() {
		return markscaleExchangeId;
	}

	public void setMarkscaleExchangeId(final Long markscaleExchangeId) {
		this.markscaleExchangeId = markscaleExchangeId;
	}

	public Long getMarkscaleExchangeValueId() {
		return markscaleExchangeValueId;
	}

	public void setMarkscaleExchangeValueId(final Long markscaleExchangeValueId) {
		this.markscaleExchangeValueId = markscaleExchangeValueId;
	}

	public Double getMarkMin() {
		return markMin;
	}

	public void setMarkMin(final Double markMin) {
		this.markMin = markMin;
	}

	public Double getMarkMax() {
		return markMax;
	}

	public void setMarkMax(final Double markMax) {
		this.markMax = markMax;
	}

	public Double getMarkExchange() {
		return markExchange;
	}

	public void setMarkExchange(final Double markExchange) {
		this.markExchange = markExchange;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((markExchange == null) ? 0 : markExchange.hashCode());
		result = prime * result + ((markMax == null) ? 0 : markMax.hashCode());
		result = prime * result + ((markMin == null) ? 0 : markMin.hashCode());
		result = prime
				* result
				+ ((markscaleExchangeId == null) ? 0 : markscaleExchangeId
						.hashCode());
		result = prime
				* result
				+ ((markscaleExchangeValueId == null) ? 0
						: markscaleExchangeValueId.hashCode());
		result = prime * result
				+ ((markscaleId == null) ? 0 : markscaleId.hashCode());
		result = prime
				* result
				+ ((markscaleValueId == null) ? 0 : markscaleValueId.hashCode());
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
		MarkscaleExchangeResource other = (MarkscaleExchangeResource) obj;
		if (markExchange == null) {
			if (other.markExchange != null) {
				return false;
			}
		} else if (!markExchange.equals(other.markExchange)) {
			return false;
		}
		if (markMax == null) {
			if (other.markMax != null) {
				return false;
			}
		} else if (!markMax.equals(other.markMax)) {
			return false;
		}
		if (markMin == null) {
			if (other.markMin != null) {
				return false;
			}
		} else if (!markMin.equals(other.markMin)) {
			return false;
		}
		if (markscaleExchangeId == null) {
			if (other.markscaleExchangeId != null) {
				return false;
			}
		} else if (!markscaleExchangeId.equals(other.markscaleExchangeId)) {
			return false;
		}
		if (markscaleExchangeValueId == null) {
			if (other.markscaleExchangeValueId != null) {
				return false;
			}
		} else if (!markscaleExchangeValueId.equals(other.markscaleExchangeValueId)) {
			return false;
		}
		if (markscaleId == null) {
			if (other.markscaleId != null) {
				return false;
			}
		} else if (!markscaleId.equals(other.markscaleId)) {
			return false;
		}
		if (markscaleValueId == null) {
			if (other.markscaleValueId != null) {
				return false;
			}
		} else if (!markscaleValueId.equals(other.markscaleValueId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MarkscaleExchangeResource [markscaleId=" + markscaleId
				+ ", markscaleValueId=" + markscaleValueId
				+ ", markscaleExchangeId=" + markscaleExchangeId
				+ ", markscaleExchangeValueId=" + markscaleExchangeValueId
				+ ", markMin=" + markMin + ", markMax=" + markMax
				+ ", markExchange=" + markExchange + "]";
	}

}
