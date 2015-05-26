package org.lnu.is.resource.mark.scale.value;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Api Resource for markscale value.
 * @author OlehZanevych
 *
 */
@CrudableResource
public class MarkScaleValueResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long markScaleId;

	@NotNull(message = "Field required")
	private String strValue;

	@Override
	public String getUri() {
		return MessageFormat.format("/marks/scales/{0}/values/{1}", markScaleId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/marks/scales/{0}/values", markScaleId);
	}

	public Long getMarkScaleId() {
		return markScaleId;
	}

	public void setMarkScaleId(final Long markScaleId) {
		this.markScaleId = markScaleId;
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
				+ ((markScaleId == null) ? 0 : markScaleId.hashCode());
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
		MarkScaleValueResource other = (MarkScaleValueResource) obj;
		if (markScaleId == null) {
			if (other.markScaleId != null) {
				return false;
			}
		} else if (!markScaleId.equals(other.markScaleId)) {
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

	@Override
	public String toString() {
		return "MarkScaleValueResource [markScaleId=" + markScaleId
				+ ", strValue=" + strValue + "]";
	}
	
}
