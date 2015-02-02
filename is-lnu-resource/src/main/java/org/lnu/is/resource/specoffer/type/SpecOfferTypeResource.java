package org.lnu.is.resource.specoffer.type;

import java.text.MessageFormat;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;

/**
 * Spec Offer Type Resource.
 * @author ivanursul
 *
 */
@ReferenceResource
public class SpecOfferTypeResource extends ApiResource {
	
	private Long timePeriodId;
	
	private String abbrName;
	
	private String name;

	@Override
	public String getUri() {
		return MessageFormat.format("/specoffers/types/{0}", getId());
	}
	
	@Override
	public String getRootUri() {
		return "/specoffers/types";
	}

	public Long getTimePeriodId() {
		return timePeriodId;
	}

	public void setTimePeriodId(final Long timePeriodId) {
		this.timePeriodId = timePeriodId;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((timePeriodId == null) ? 0 : timePeriodId.hashCode());
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
		SpecOfferTypeResource other = (SpecOfferTypeResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (timePeriodId == null) {
			if (other.timePeriodId != null) {
				return false;
			}
		} else if (!timePeriodId.equals(other.timePeriodId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecOfferTypeResource [timePeriodId=" + timePeriodId
				+ ", abbrName=" + abbrName + ", name=" + name + "]";
	}

}
