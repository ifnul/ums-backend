package org.lnu.is.domain.person.contact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.person.Person;

/**
 * Person Contact entity.
 * 
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_personcontact")
public class PersonContact extends InformationModel {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

    @ManyToOne
    @JoinColumn(name = "contacttype_id")
    private ContactType contactType;

    @Column(name = "strvalue")
    private String value;

    public Person getPerson() {
	return person;
    }

    public void setPerson(final Person person) {
	this.person = person;
    }

    public ContactType getContactType() {
	return contactType;
    }

    public void setContactType(final ContactType contactType) {
	this.contactType = contactType;
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
	PersonContact other = (PersonContact) obj;
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
	return "ParsonContact [value=" + value + "]";
    }
}
