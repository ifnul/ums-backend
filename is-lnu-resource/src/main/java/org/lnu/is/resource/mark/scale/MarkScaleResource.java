package org.lnu.is.resource.mark.scale;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Api Resource for markscale.
 * @author OlehZanevych
 *
 */
@CrudableResource
public class MarkScaleResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long markScaleTypeId;

	@NotNull(message = "Field required")
	private String name;
	
	private String abbrName;
	
	private Double markMin;
	
	private Double markMax;

	@Override
	public String getUri() {
		return MessageFormat.format("/marks/scales/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/marks/scales";
	}

	public Long getMarkScaleTypeId() {
		return markScaleTypeId;
	}

	public void setMarkScaleTypeId(final Long markscaleTypeId) {
		this.markScaleTypeId = markscaleTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((markMax == null) ? 0 : markMax.hashCode());
		result = prime * result + ((markMin == null) ? 0 : markMin.hashCode());
		result = prime * result
				+ ((markScaleTypeId == null) ? 0 : markScaleTypeId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		MarkScaleResource other = (MarkScaleResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
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
		if (markScaleTypeId == null) {
			if (other.markScaleTypeId != null) {
				return false;
			}
		} else if (!markScaleTypeId.equals(other.markScaleTypeId)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "MarkScaleResource [markscaleType=" + markScaleTypeId + ", name="
				+ name + ", abbrName=" + abbrName + ", markMin=" + markMin
				+ ", markMax=" + markMax + "]";
	}

}
