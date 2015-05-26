package org.lnu.is.resource.person.name;

import java.text.MessageFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.ApiResource;

/**
 * Person Name resource.
 * @author ivanursul
 *
 */
@CrudableResource
public class PersonNameResource extends ApiResource {

	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long personId;
	
	@NotNull(message = "Field required")
	@Min(value = 1, message = "Minimal value is 1")
	private Long languageId;
	
	@NotNull(message = "Field required")
	private String name;
	
	@NotNull(message = "Field required")
	private String firstName;
	
	@NotNull(message = "Field required")
	private String fatherName;
	
	@NotNull(message = "Field required")
	private String surname;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/names/{1}", personId, getId());
	}

	@Override
	public String getRootUri() {
		return MessageFormat.format("/persons/{0}/names", personId);
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(final Long languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(final String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((languageId == null) ? 0 : languageId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		PersonNameResource other = (PersonNameResource) obj;
		if (fatherName == null) {
			if (other.fatherName != null) {
				return false;
			}
		} else if (!fatherName.equals(other.fatherName)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (languageId == null) {
			if (other.languageId != null) {
				return false;
			}
		} else if (!languageId.equals(other.languageId)) {
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
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonNameResource [personId=" + personId + ", languageId="
				+ languageId + ", name=" + name + ", firstName=" + firstName
				+ ", fatherName=" + fatherName + ", surname=" + surname + "]";
	}

}
