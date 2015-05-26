package org.lnu.is.domain.order;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.DC;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.domain.order.asset.OrderNewAsset;
import org.lnu.is.domain.order.asset.transfer.OrderAssetTransfer;
import org.lnu.is.domain.order.duty.OrderDuty;
import org.lnu.is.domain.order.employee.OrderEmployee;
import org.lnu.is.domain.order.employee.OrderNewEmployee;
import org.lnu.is.domain.order.employee.timesheet.OrderEmployeeTimeSheet;
import org.lnu.is.domain.order.student.OrderNewStudent;
import org.lnu.is.domain.order.type.OrderType;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.domain.timeperiod.TimePeriod;

/**
 * Order entity.
 * @author ivanursul
 *
 */
@DC
@Entity
@Table(name = "q_dc_order")
public class Order extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "ordertype_id")
	private OrderType orderType;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;
	
	@ManyToOne
	@JoinColumn(name = "partner_id")
	private Partner partner;
	
	@ManyToOne
	@JoinColumn(name = "optype_id")
	private OperationType opType;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "reason_id")
	private Reason reason;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Order parent;
	
	@ManyToOne
	@JoinColumn(name = "timeperiod_id")
	private TimePeriod timePeriod;

	@OneToMany(mappedBy = "order")
	private List<OrderAssetTransfer> assetTransfers;
	
	@OneToMany(mappedBy = "order")
	private List<OrderDuty> duties;

	@OneToMany(mappedBy = "order")
	private List<OrderEmployee> employees;
	
	@OneToMany(mappedBy = "order")
	private List<OrderEmployeeTimeSheet> employeeTimeSheets;
	
	@OneToMany(mappedBy = "order")
	private List<OrderNewAsset> newAssets;
	
	@OneToMany(mappedBy = "order")
	private List<OrderNewEmployee> newEmployees;
	
	@OneToMany(mappedBy = "order")
	private List<OrderNewStudent> newStudents;
	
	@Column(name = "reasontext")
	private String reasonText;
	
	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;
	
	@Column(name = "docdate")
	private Date docDate;
	
	@Column(name = "docissued")
	private String docIssued;

	@Column(name = "evdate")
	private Date evDate;

	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	public OrderType getOrderType() {
		return orderType;
	}

	public void setOrderType(final OrderType orderType) {
		this.orderType = orderType;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(final Employee employee) {
		this.employee = employee;
	}

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(final Asset asset) {
		this.asset = asset;
	}

	public Partner getPartner() {
		return partner;
	}

	public void setPartner(final Partner partner) {
		this.partner = partner;
	}

	public OperationType getOpType() {
		return opType;
	}

	public void setOpType(final OperationType opType) {
		this.opType = opType;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public Reason getReason() {
		return reason;
	}

	public void setReason(final Reason reason) {
		this.reason = reason;
	}

	public Order getParent() {
		return parent;
	}

	public void setParent(final Order parent) {
		this.parent = parent;
	}

	public String getReasonText() {
		return reasonText;
	}

	public void setReasonText(final String reasonText) {
		this.reasonText = reasonText;
	}

	public String getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(final String docSeries) {
		this.docSeries = docSeries;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(final String docNum) {
		this.docNum = docNum;
	}

	public Date getDocDate() {
		return docDate;
	}

	public void setDocDate(final Date docDate) {
		this.docDate = docDate;
	}

	public String getDocIssued() {
		return docIssued;
	}

	public void setDocIssued(final String docIssued) {
		this.docIssued = docIssued;
	}

	public Date getEvDate() {
		return evDate;
	}

	public void setEvDate(final Date evDate) {
		this.evDate = evDate;
	}

	public List<OrderAssetTransfer> getAssetTransfers() {
		return assetTransfers;
	}

	public void setAssetTransfers(final List<OrderAssetTransfer> assetTransfers) {
		this.assetTransfers = assetTransfers;
	}

	public List<OrderDuty> getDuties() {
		return duties;
	}

	public void setDuties(final List<OrderDuty> duties) {
		this.duties = duties;
	}

	public List<OrderEmployee> getEmployees() {
		return employees;
	}

	public void setEmployees(final List<OrderEmployee> employees) {
		this.employees = employees;
	}

	public List<OrderEmployeeTimeSheet> getEmployeeTimeSheets() {
		return employeeTimeSheets;
	}

	public void setEmployeeTimeSheets(
			final List<OrderEmployeeTimeSheet> employeeTimeSheets) {
		this.employeeTimeSheets = employeeTimeSheets;
	}

	public List<OrderNewAsset> getNewAssets() {
		return newAssets;
	}

	public void setNewAssets(final List<OrderNewAsset> newAssets) {
		this.newAssets = newAssets;
	}

	public List<OrderNewEmployee> getNewEmployees() {
		return newEmployees;
	}

	public void setNewEmployees(final List<OrderNewEmployee> newEmployees) {
		this.newEmployees = newEmployees;
	}

	public List<OrderNewStudent> getNewStudents() {
		return newStudents;
	}

	public void setNewStudents(final List<OrderNewStudent> newStudents) {
		this.newStudents = newStudents;
	}
	public TimePeriod getTimePeriod() {
		return timePeriod;
	}

	public void setTimePeriod(final TimePeriod timeperiod) {
		this.timePeriod = timeperiod;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((docDate == null) ? 0 : docDate.hashCode());
		result = prime * result
				+ ((docIssued == null) ? 0 : docIssued.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((evDate == null) ? 0 : evDate.hashCode());
		result = prime * result
				+ ((reasonText == null) ? 0 : reasonText.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		Order other = (Order) obj;
		if (docDate == null) {
			if (other.docDate != null) {
				return false;
			}
		} else if (!docDate.equals(other.docDate)) {
			return false;
		}
		if (docIssued == null) {
			if (other.docIssued != null) {
				return false;
			}
		} else if (!docIssued.equals(other.docIssued)) {
			return false;
		}
		if (docNum == null) {
			if (other.docNum != null) {
				return false;
			}
		} else if (!docNum.equals(other.docNum)) {
			return false;
		}
		if (docSeries == null) {
			if (other.docSeries != null) {
				return false;
			}
		} else if (!docSeries.equals(other.docSeries)) {
			return false;
		}
		if (evDate == null) {
			if (other.evDate != null) {
				return false;
			}
		} else if (!evDate.equals(other.evDate)) {
			return false;
		}
		if (reasonText == null) {
			if (other.reasonText != null) {
				return false;
			}
		} else if (!reasonText.equals(other.reasonText)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Order [reasonText=" + reasonText + ", docSeries=" + docSeries
				+ ", docNum=" + docNum + ", docDate=" + docDate
				+ ", docIssued=" + docIssued + ", evDate=" + evDate + ", description=" + description + "]";
	}
	
}
