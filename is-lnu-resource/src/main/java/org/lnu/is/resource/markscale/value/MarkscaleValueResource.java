package org.lnu.is.resource.markscale.value;

import java.text.MessageFormat;

import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Api Resource for markscale value.
 * @author OlehZanevych
 *
 */
@CrudableResource
public class MarkscaleValueResource extends ApiResource {

	@NotNull(message = "Field required")
	private Long markscaleId;

	@NotNull(message = "Field required")
	private String strValue;

	@Override
	public String getUri() {
		return MessageFormat.format("/markscales/{0}/values/{1}", markscaleId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/markscales/{0}/values", markscaleId);
	}

	public Long getMarkscaleId() {
		return markscaleId;
	}

	public void setMarkscaleId(final Long markscaleId) {
		this.markscaleId = markscaleId;
	}

	public String getStrValue() {
		return strValue;
	}

	public void setStrValue(final String strValue) {
		this.strValue = strValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((markscaleId == null) ? 0 : markscaleId.hashCode());
		result = prime * result
				+ ((strValue == null) ? 0 : strValue.hashCode());
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
		MarkscaleValueResource other = (MarkscaleValueResource) obj;
		if (markscaleId == null) {
			if (other.markscaleId != null) {
				return false;
			}
		} else if (!markscaleId.equals(other.markscaleId)) {
			return false;
		}
		if (strValue == null) {
			if (other.strValue != null) {
				return false;
			}
		} else if (!strValue.equals(other.strValue)) {
			return false;
		}
		return true;
	}
	
}
