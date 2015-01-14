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
import org.lnu.is.domain.timesheettype.TimeSheetType;

/**
 * Order Employee Time Sheet entity.
 * 
 * @author kushnir
 *
 */
@DT
@Entity
@Table(name = "q_dt_orderemployeetimesheet")
public class OrderEmployeeTimeSheet extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "timesheettype_id")
	private TimeSheetType timeSheetType;

	@Column(name = "dayamount")
	private Date dayAmount;

	@Column(name = "houramount")
	private Date hourAmount;

	@Column(name = "enddate")
	private Date endDate;

	@Column(name = "begdate")
	private Date begDate;

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

	public TimeSheetType getTimeSheetType() {
		return timeSheetType;
	}

	public void setTimeSheetType(final TimeSheetType timeSheetType) {
		this.timeSheetType = timeSheetType;
	}

	public Date getDayAmount() {
		return dayAmount;
	}

	public void setDayAmount(final Date dayAmount) {
		this.dayAmount = dayAmount;
	}

	public Date getHourAmount() {
		return hourAmount;
	}

	public void setHourAmount(final Date hourAmount) {
		this.hourAmount = hourAmount;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(final Date begDate) {
		this.begDate = begDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((dayAmount == null) ? 0 : dayAmount.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((hourAmount == null) ? 0 : hourAmount.hashCode());
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
		OrderEmployeeTimeSheet other = (OrderEmployeeTimeSheet) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (dayAmount == null) {
			if (other.dayAmount != null) {
				return false;
			}
		} else if (!dayAmount.equals(other.dayAmount)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (hourAmount == null) {
			if (other.hourAmount != null) {
				return false;
			}
		} else if (!hourAmount.equals(other.hourAmount)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "OrderEmployeeTimeSheet [dayAmount=" + dayAmount
				+ ", hourAmount=" + hourAmount + ", endDate=" + endDate
				+ ", begDate=" + begDate + "]";
	}

}
