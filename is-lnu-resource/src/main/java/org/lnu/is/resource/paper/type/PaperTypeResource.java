package org.lnu.is.resource.paper.type;

import java.text.MessageFormat;

import org.lnu.is.annotation.ReferenceResource;
import org.lnu.is.resource.ApiResource;

/**
 * Paper Type resource.
 * @author ivanursul
 *
 */
@ReferenceResource
public class PaperTypeResource extends ApiResource {

	private String name;
	private String abbrName;
	private Long paperUsageId;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/papers/types/{0}", getId());
	}
	@Override
	public String getRootUri() {
		return "/papers/types";
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
	public Long getPaperUsageId() {
		return paperUsageId;
	}
	public void setPaperUsageId(final Long paperUsageId) {
		this.paperUsageId = paperUsageId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((paperUsageId == null) ? 0 : paperUsageId.hashCode());
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
		PaperTypeResource other = (PaperTypeResource) obj;
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
		if (paperUsageId == null) {
			if (other.paperUsageId != null) {
				return false;
			}
		} else if (!paperUsageId.equals(other.paperUsageId)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "PaperTypeResource [name=" + name + ", abbrName=" + abbrName
				+ ", paperUsageId=" + paperUsageId + "]";
	}
	
}
