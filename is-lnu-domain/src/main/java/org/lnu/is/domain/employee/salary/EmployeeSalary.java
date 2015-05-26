package org.lnu.is.domain.employee.salary;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.salary.type.SalaryType;
/**
 * Empoyee Salary entity. 
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_employeesalary")
public class EmployeeSalary extends InformationModel {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "salarytype_id")
	private SalaryType salaryType;
	
	@Column(name = "suma")
	private Double suma;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private EmployeeSalary employeeSalary;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public SalaryType getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(final SalaryType salaryType) {
		this.salaryType = salaryType;
	}

	public Double getSuma() {
		return suma;
	}

	public void setSuma(final Double suma) {
		this.suma = suma;
	}

	public EmployeeSalary getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(final EmployeeSalary employeeSalary) {
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
		EmployeeSalary other = (EmployeeSalary) obj;
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
