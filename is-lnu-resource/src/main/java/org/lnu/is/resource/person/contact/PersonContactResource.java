package org.lnu.is.resource.person.contact;

import java.text.MessageFormat;

import javax.validation.constraints.NotNull;

import org.lnu.is.resource.ApiResource;

/**
 * Person Contact Resource.
 * @author illay
 *
 */
public class PersonContactResource extends ApiResource {

    @NotNull(message = "Field required")
    private Long personId;

    @NotNull(message = "Field required")
    private Long contactTypeId;

    @NotNull(message = "Field required")
    private String value;

    @Override
    public String getUri() {
	return MessageFormat.format("/persons/{0}/contacts/{1}", personId,
		getId());
    }

    @Override
    public String getRootUri() {
	return MessageFormat.format("/persons/{0}/contacts", personId);
    }

    public Long getPersonId() {
	return personId;
    }

    public void setPersonId(final Long personId) {
	this.personId = personId;
    }

    public Long getContactTypeId() {
	return contactTypeId;
    }

    public void setContactTypeId(final Long contactTypeId) {
	this.contactTypeId = contactTypeId;
    }

    public String getValue() {
	return value;
    }

    public void setValue(final String value) {
	this.value = value;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result
		+ ((contactTypeId == null) ? 0 : contactTypeId.hashCode());
	result = prime * result
		+ ((personId == null) ? 0 : personId.hashCode());
	result = prime * result + ((value == null) ? 0 : value.hashCode());
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
	PersonContactResource other = (PersonContactResource) obj;
	if (contactTypeId == null) {
	    if (other.contactTypeId != null) {
		return false;
	    }
	} else if (!contactTypeId.equals(other.contactTypeId)) {
	    return false;
	}
	if (personId == null) {
	    if (other.personId != null) {
		return false;
	    }
	} else if (!personId.equals(other.personId)) {
	    return false;
	}
	if (value == null) {
	    if (other.value != null) {
		return false;
	    }
	} else if (!value.equals(other.value)) {
	    return false;
	}
	return true;
    }

    @Override
    public String toString() {
	return "PersonContactResource [personId=" + personId
		+ ", contactTypeId=" + contactTypeId + ", value=" + value + "]";
    }

}
