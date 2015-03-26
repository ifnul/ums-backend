package org.lnu.is.domain.department;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.department.address.DepartmentAddress;
import org.lnu.is.domain.department.contact.DepartmentContact;
import org.lnu.is.domain.department.name.DepartmentName;
import org.lnu.is.domain.department.type.DepartmentType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.specialty.Specialty;

/**
 * Entity, that describes department table.
 *
 */
@OB
@Entity
@Table(name = "q_ob_department")
public class Department extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Department parent;

	@ManyToOne
	@JoinColumn(name = "departmenttype_id")
	private DepartmentType departmentType;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "manager")
	private String manager;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "identifir")
	private String identifir;
	
	@OneToMany(mappedBy = "department")
	private List<DepartmentAddress> addresses;
	
	@OneToMany(mappedBy = "department")
	private List<DepartmentContact> contacts;
	
	@OneToMany(mappedBy = "department")
	private List<DepartmentName> names;

	@ManyToMany
	@JoinTable(name = "q_od_departmentspecialty", 
		joinColumns = { @JoinColumn(name = "department_id") },
		inverseJoinColumns = { @JoinColumn(name = "specialty_id") })
	private List<Specialty> specialties;
	
	public String getIdentifir() {
		return identifir;
	}

	public void setIdentifir(final String identifir) {
		this.identifir = identifir;
	}

	public Department getParent() {
		return parent;
	}

	public void setParent(final Department parent) {
		this.parent = parent;
	}

	public DepartmentType getDepartmentType() {
		return departmentType;
	}

	public void setDepartmentType(final DepartmentType departmentType) {
		this.departmentType = departmentType;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
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

	public String getManager() {
		return manager;
	}

	public void setManager(final String manager) {
		this.manager = manager;
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

	public List<DepartmentAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(final List<DepartmentAddress> addresses) {
		this.addresses = addresses;
	}

	public List<DepartmentContact> getContacts() {
		return contacts;
	}

	public void setContacts(final List<DepartmentContact> contacts) {
		this.contacts = contacts;
	}

	public List<DepartmentName> getNames() {
		return names;
	}

	public void setNames(final List<DepartmentName> names) {
		this.names = names;
	}

	public List<Specialty> getSpecialties() {
		return specialties;
	}

	public void setSpecialties(final List<Specialty> specialties) {
		this.specialties = specialties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + ((identifir == null) ? 0 : identifir.hashCode());
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
		Department other = (Department) obj;
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
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (manager == null) {
			if (other.manager != null) {
				return false;
			}
		} else if (!manager.equals(other.manager)) {
			return false;
		}
		if (identifir == null) {
			if (other.identifir != null) {
				return false;
			}
		} else if (!identifir.equals(other.identifir)) {
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
		return "Department [abbrName=" + abbrName
				+ ", name=" + name + ", manager=" + manager + ", begDate=" + begDate
				+ ", endDate=" + endDate + ", identifir=" + identifir + "]";
	}

}
