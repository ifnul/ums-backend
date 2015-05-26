package org.lnu.is.resource.mark.scale.exchange;

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
public class MarkScaleExchangeResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long markScaleId;

	@Min(value = 1, message = "Minimal value is 1")
	private Long markScaleValueId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long markScaleExchangeId;
	
	@Min(value = 1, message = "Minimal value is 1")
	private Long markScaleExchangeValueId;
	
	private Double markMin;
	
	private Double markMax;
	
	private Double markExchange;

	@Override
	public String getUri() {
		return MessageFormat.format("/marks/scales/{0}/exchanges/{1}", markScaleId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/marks/scales/{0}/exchanges", markScaleId);
	}

	public Long getMarkScaleId() {
		return markScaleId;
	}

	public void setMarkScaleId(final Long markScaleId) {
		this.markScaleId = markScaleId;
	}

	public Long getMarkScaleValueId() {
		return markScaleValueId;
	}

	public void setMarkScaleValueId(final Long markScaleValueId) {
		this.markScaleValueId = markScaleValueId;
	}

	public Long getMarkScaleExchangeId() {
		return markScaleExchangeId;
	}

	public void setMarkScaleExchangeId(final Long markScaleExchangeId) {
		this.markScaleExchangeId = markScaleExchangeId;
	}

	public Long getMarkScaleExchangeValueId() {
		return markScaleExchangeValueId;
	}

	public void setMarkScaleExchangeValueId(final Long markScaleExchangeValueId) {
		this.markScaleExchangeValueId = markScaleExchangeValueId;
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
				+ ((markScaleExchangeId == null) ? 0 : markScaleExchangeId
						.hashCode());
		result = prime
				* result
				+ ((markScaleExchangeValueId == null) ? 0
						: markScaleExchangeValueId.hashCode());
		result = prime * result
				+ ((markScaleId == null) ? 0 : markScaleId.hashCode());
		result = prime
				* result
				+ ((markScaleValueId == null) ? 0 : markScaleValueId.hashCode());
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
		MarkScaleExchangeResource other = (MarkScaleExchangeResource) obj;
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
		if (markScaleExchangeId == null) {
			if (other.markScaleExchangeId != null) {
				return false;
			}
		} else if (!markScaleExchangeId.equals(other.markScaleExchangeId)) {
			return false;
		}
		if (markScaleExchangeValueId == null) {
			if (other.markScaleExchangeValueId != null) {
				return false;
			}
		} else if (!markScaleExchangeValueId.equals(other.markScaleExchangeValueId)) {
			return false;
		}
		if (markScaleId == null) {
			if (other.markScaleId != null) {
				return false;
			}
		} else if (!markScaleId.equals(other.markScaleId)) {
			return false;
		}
		if (markScaleValueId == null) {
			if (other.markScaleValueId != null) {
				return false;
			}
		} else if (!markScaleValueId.equals(other.markScaleValueId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MarkScaleExchangeResource [markscaleId=" + markScaleId
				+ ", markscaleValueId=" + markScaleValueId
				+ ", markscaleExchangeId=" + markScaleExchangeId
				+ ", markscaleExchangeValueId=" + markScaleExchangeValueId
				+ ", markMin=" + markMin + ", markMax=" + markMax
				+ ", markExchange=" + markExchange + "]";
	}

}
