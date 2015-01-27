package org.lnu.is.domain.order;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DT;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.domain.optype.OperationType;

/**
 * Order Employee entity.
 * 
 * @author kushnir
 *
 */
@DT
@Entity
@Table(name = "q_dt_orderemployee")
public class OrderEmployee extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "employeestatus_id")
	private EmployeeStatus employeeStatus;

	@ManyToOne
	@JoinColumn(name = "optype_id")
	private OperationType opType;

	@Column(name = "rate")
	private long rate;

	@Column(name = "begdate")
	private Date begDate;

	@Column(name = "enddate")
	private Date endDate;

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(final EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public OperationType getOpType() {
		return opType;
	}

	public void setOpType(final OperationType opType) {
		this.opType = opType;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(final long rate) {
		this.rate = rate;
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
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + (int) (rate ^ (rate >>> 32));
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
		OrderEmployee other = (OrderEmployee) obj;
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
		if (rate != other.rate) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "OrderEmployee [rate=" + rate + ", begDate=" + begDate
				+ ", endDate=" + endDate + "]";
	}

}
