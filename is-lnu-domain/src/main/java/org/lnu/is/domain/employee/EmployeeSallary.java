package org.lnu.is.domain.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.salarytype.SallaryType;
/**
 * Empoyee Salary entity. 
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_employeesalary")
public class EmployeeSallary extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "salarytype_id")
	private SallaryType salaryType;
	
	@Column(name = "suma")
	private Double suma;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private EmployeeSallary employeeSalary;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public SallaryType getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(final SallaryType salaryType) {
		this.salaryType = salaryType;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(final Double suma) {
		this.suma = suma;
	}

	public EmployeeSallary getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(final EmployeeSallary employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((suma == null) ? 0 : suma.hashCode());
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
		EmployeeSallary other = (EmployeeSallary) obj;
		if (suma == null) {
			if (other.suma != null) {
				return false;
			}
		} else if (!suma.equals(other.suma)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeSalary [suma=" + suma + "]";
	}
	
}
