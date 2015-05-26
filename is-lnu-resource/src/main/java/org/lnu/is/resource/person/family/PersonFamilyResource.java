package org.lnu.is.resource.person.family;

import java.text.MessageFormat;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Person Family Resource.
 * @author ivanursul
 *
 */
public class PersonFamilyResource extends ApiResource {

	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;
	
	@NotNull
	@Min(value = 1, message = "Minimal value is 1")
	private Long familyTypeId;
	
	@NotNull
	private String name;
	
	@NotNull
	private Date birthDate;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/families/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/families", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getFamilyTypeId() {
		return familyTypeId;
	}

	public void setFamilyTypeId(final Long familyTypeId) {
		this.familyTypeId = familyTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(final Date birthdate) {
		this.birthDate = birthdate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result
				+ ((familyTypeId == null) ? 0 : familyTypeId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
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
		PersonFamilyResource other = (PersonFamilyResource) obj;
		if (birthDate == null) {
			if (other.birthDate != null) {
				return false;
			}
		} else if (!birthDate.equals(other.birthDate)) {
			return false;
		}
		if (familyTypeId == null) {
			if (other.familyTypeId != null) {
				return false;
			}
		} else if (!familyTypeId.equals(other.familyTypeId)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonFamilyResource [personId=" + personId + ", familyTypeId="
				+ familyTypeId + ", name=" + name + ", birthdate=" + birthDate
				+ "]";
	}

}
