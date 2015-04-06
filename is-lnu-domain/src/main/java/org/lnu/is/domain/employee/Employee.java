package org.lnu.is.domain.employee;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.contact.EmployeeContact;
import org.lnu.is.domain.employee.salary.EmployeeSalary;
import org.lnu.is.domain.employee.schedule.EmployeeSchedule;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;


/**
 * Employee entity.
 * @author ivanursul
 *
 */
@OB
@Entity
@Table(name = "q_ob_employee")
public class Employee extends InformationModel {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "employeetype_id")
	private EmployeeType employeeType;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "gendertype_id")
	private GenderType genderType;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	@ManyToOne
	@JoinColumn(name = "jobtype_id")
	private JobType jobType;
	
	@ManyToOne
	@JoinColumn(name = "employeestatus_id")
	private EmployeeStatus employeeStatus;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Employee parent;
	
	@OneToMany(mappedBy = "employee")
	private List<EmployeeContact> contacts;
	
	@OneToMany(mappedBy = "employee")
	private List<EmployeeSalary> salaries;
	
	@OneToMany(mappedBy = "employee")
	private List<EmployeeSchedule> schedules;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "fathername")
	private String fatherName;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "birthdate")
	private Date birthDate;
	
	@Column(name = "invnum")
	private String invNum;
	
	@Column(name = "rate")
	private Double rate;
	
	@Column(name = "isplurality")
	private Integer isPlurality;
	
	@Column(name = "ispensioner")
	private Integer isPensioner;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "email")
	private String email;

	public Post getPost() {
		return post;
	}

	public void setPost(final Post post) {
		this.post = post;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(final String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(final Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(final String invNum) {
		this.invNum = invNum;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(final Double rate) {
		this.rate = rate;
	}

	public Integer getIsPlurality() {
		return isPlurality;
	}

	public void setIsPlurality(final Integer isPlurality) {
		this.isPlurality = isPlurality;
	}

	public Integer getIsPensioner() {
		return isPensioner;
	}

	public void setIsPensioner(final Integer isPensioner) {
		this.isPensioner = isPensioner;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(final String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(final EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public GenderType getGenderType() {
		return genderType;
	}

	public void setGenderType(final GenderType genderType) {
		this.genderType = genderType;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public JobType getJobType() {
		return jobType;
	}

	public void setJobType(final JobType jobType) {
		this.jobType = jobType;
	}

	public EmployeeStatus getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(final EmployeeStatus employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(final Order order) {
		this.order = order;
	}

	public Employee getParent() {
		return parent;
	}

	public void setParent(final Employee parent) {
		this.parent = parent;
	}

	public List<EmployeeContact> getContacts() {
		return contacts;
	}

	public void setContacts(final List<EmployeeContact> contacts) {
		this.contacts = contacts;
	}

	public List<EmployeeSalary> getSalaries() {
		return salaries;
	}

	public void setSallaries(final List<EmployeeSalary> salaries) {
		this.salaries = salaries;
	}

	public List<EmployeeSchedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(final List<EmployeeSchedule> schedules) {
		this.schedules = schedules;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((invNum == null) ? 0 : invNum.hashCode());
		result = prime * result
				+ ((isPensioner == null) ? 0 : isPensioner.hashCode());
		result = prime * result
				+ ((isPlurality == null) ? 0 : isPlurality.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((rate == null) ? 0 : rate.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Employee other = (Employee) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (birthDate == null) {
			if (other.birthDate != null) {
				return false;
			}
		} else if (!birthDate.equals(other.birthDate)) {
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
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (fatherName == null) {
			if (other.fatherName != null) {
				return false;
			}
		} else if (!fatherName.equals(other.fatherName)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (invNum == null) {
			if (other.invNum != null) {
				return false;
			}
		} else if (!invNum.equals(other.invNum)) {
			return false;
		}
		if (isPensioner == null) {
			if (other.isPensioner != null) {
				return false;
			}
		} else if (!isPensioner.equals(other.isPensioner)) {
			return false;
		}
		if (isPlurality == null) {
			if (other.isPlurality != null) {
				return false;
			}
		} else if (!isPlurality.equals(other.isPlurality)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		if (rate == null) {
			if (other.rate != null) {
				return false;
			}
		} else if (!rate.equals(other.rate)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", firstName=" + firstName
				+ ", fatherName=" + fatherName + ", surname=" + surname
				+ ", birthDate=" + birthDate + ", invNum=" + invNum + ", rate="
				+ rate + ", isPlurality=" + isPlurality + ", isPensioner="
				+ isPensioner + ", begDate="
				+ begDate + ", endDate=" + endDate + ", docSeries=" + docSeries
				+ ", docNum=" + docNum + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
}
