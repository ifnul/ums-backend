package org.lnu.is.domain.departmentspecialty;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.specialty.Specialty;

/**
 * Department specialty entity.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "q_od_departmentspecialty")
public class DepartmentSpecialty extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "specialty_id")
	private Specialty specialty;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(final Specialty specialty) {
		this.specialty = specialty;
	}
	
}
