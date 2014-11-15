package org.lnu.is.domain.employeecontact;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.domain.employee.Employee;

/**
 * Employee contact entity.
 * 
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_employeecontact")
public class EmployeeContact extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "contacttype_id")
	private ContactType contactType;

	@Column(name = "strvalue")
	private String strValue;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(final ContactType contactType) {
		this.contactType = contactType;
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
		EmployeeContact other = (EmployeeContact) obj;
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
		return "EmployeeContact [strValue=" + strValue + "]";
	}

}
