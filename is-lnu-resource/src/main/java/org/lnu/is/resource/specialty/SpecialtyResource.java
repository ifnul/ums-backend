package org.lnu.is.resource.specialty;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Resource, that represents Specialty entity
 * at top level.
 * @author ivanursul
 *
 */
@CrudableResource
public class SpecialtyResource extends ApiResource {

	@Min(value = 1, message = "Minimal value is 1")
	private Long parentId;

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long specialtyTypeId;
	
	@NotNull(message = "Field required")
	private String abbrName;
	
	@NotNull(message = "Field required")
	private String name;
	
	@NotNull(message = "Field required")
	private String cipher;
	
	@NotNull(message = "Field required")
	private Date begDate;
	
	@NotNull(message = "Field required")
	private Date endDate;
	
	@NotNull(message = "Field required")
	private String note;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/specialties/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/specialties";
	}

	@Override
	public String getNote() {
		return note;
	}

	@Override
	public void setNote(final String note) {
		this.note = note;
	}

	public Long getSpecialtyTypeId() {
		return specialtyTypeId;
	}

	public void setSpecialtyTypeId(final Long specialtyTypeId) {
		this.specialtyTypeId = specialtyTypeId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
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

	public String getCipher() {
		return cipher;
	}

	public void setCipher(final String cipher) {
		this.cipher = cipher;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((cipher == null) ? 0 : cipher.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result
				+ ((specialtyTypeId == null) ? 0 : specialtyTypeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SpecialtyResource other = (SpecialtyResource) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (cipher == null) {
			if (other.cipher != null) {
				return false;
			}
		} else if (!cipher.equals(other.cipher)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (note == null) {
			if (other.note != null) {
				return false;
			}
		} else if (!note.equals(other.note)) {
			return false;
		}
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		if (specialtyTypeId == null) {
			if (other.specialtyTypeId != null) {
				return false;
			}
		} else if (!specialtyTypeId.equals(other.specialtyTypeId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "SpecialtyResource [specialtyTypeId="
				+ specialtyTypeId + ", parentId=" + parentId + ", abbrName="
				+ abbrName + ", name=" + name + ", cipher=" + cipher
				+ ", begDate=" + begDate + ", endDate=" + endDate + ", note="
				+ note + "]";
	}

}
