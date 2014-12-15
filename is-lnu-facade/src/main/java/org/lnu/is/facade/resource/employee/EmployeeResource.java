package org.lnu.is.facade.resource.employee;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Api Resource for employee.
 * @author ivanursul
 *
 */
public class EmployeeResource extends ApiResource {

	private Long employeeTypeId;
	
	private Long personId;
	
	private Long genderTypeId;
	
	private Long departmentId;
	
	private Long postId;
	
	private Long jobTypeId;
	
	private Long employeeStatusId;
	
	private Long orderId;
	
	private Long parentId;
	
	private String name;

	private String firstName;
	
	private String fatherName;
	
	private String surname;
	
	private Date birthDate;
	
	private String invNum;
	
	private Double rate;
	
	private Integer isPlurality;
	
	private Integer isPensioner;
	
	private Date begDate;
	
	private Date endDate;
	
	private String docSeries;
	
	private String docNum;
	
	private String phone;
	
	private String email;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/employees/{0}", getId());
	}

	@Override
	public String getRootUri() {
		return "/employees";
	}

	public Long getEmployeeTypeId() {
		return employeeTypeId;
	}

	public void setEmployeeTypeId(final Long employeeTypeId) {
		this.employeeTypeId = employeeTypeId;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getGenderTypeId() {
		return genderTypeId;
	}

	public void setGenderTypeId(final Long genderTypeId) {
		this.genderTypeId = genderTypeId;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(final Long departmentId) {
		this.departmentId = departmentId;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(final Long postId) {
		this.postId = postId;
	}

	public Long getJobTypeId() {
		return jobTypeId;
	}

	public void setJobTypeId(final Long jobTypeId) {
		this.jobTypeId = jobTypeId;
	}

	public Long getEmployeeStatusId() {
		return employeeStatusId;
	}

	public void setEmployeeStatusId(final Long employeeStatusId) {
		this.employeeStatusId = employeeStatusId;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(final Long orderId) {
		this.orderId = orderId;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(final Long parentId) {
		this.parentId = parentId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((birthDate == null) ? 0 : birthDate.hashCode());
		result = prime * result
				+ ((departmentId == null) ? 0 : departmentId.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime
				* result
				+ ((employeeStatusId == null) ? 0 : employeeStatusId.hashCode());
		result = prime * result
				+ ((employeeTypeId == null) ? 0 : employeeTypeId.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((genderTypeId == null) ? 0 : genderTypeId.hashCode());
		result = prime * result + ((invNum == null) ? 0 : invNum.hashCode());
		result = prime * result
				+ ((isPensioner == null) ? 0 : isPensioner.hashCode());
		result = prime * result
				+ ((isPlurality == null) ? 0 : isPlurality.hashCode());
		result = prime * result
				+ ((jobTypeId == null) ? 0 : jobTypeId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((postId == null) ? 0 : postId.hashCode());
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
		EmployeeResource other = (EmployeeResource) obj;
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
		if (departmentId == null) {
			if (other.departmentId != null) {
				return false;
			}
		} else if (!departmentId.equals(other.departmentId)) {
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
		if (employeeStatusId == null) {
			if (other.employeeStatusId != null) {
				return false;
			}
		} else if (!employeeStatusId.equals(other.employeeStatusId)) {
			return false;
		}
		if (employeeTypeId == null) {
			if (other.employeeTypeId != null) {
				return false;
			}
		} else if (!employeeTypeId.equals(other.employeeTypeId)) {
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
		if (genderTypeId == null) {
			if (other.genderTypeId != null) {
				return false;
			}
		} else if (!genderTypeId.equals(other.genderTypeId)) {
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
		if (jobTypeId == null) {
			if (other.jobTypeId != null) {
				return false;
			}
		} else if (!jobTypeId.equals(other.jobTypeId)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (orderId == null) {
			if (other.orderId != null) {
				return false;
			}
		} else if (!orderId.equals(other.orderId)) {
			return false;
		}
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		if (postId == null) {
			if (other.postId != null) {
				return false;
			}
		} else if (!postId.equals(other.postId)) {
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
		return "EmployeeResource [employeeTypeId=" + employeeTypeId
				+ ", personId=" + personId + ", genderTypeId=" + genderTypeId
				+ ", departmentId=" + departmentId + ", postId=" + postId
				+ ", jobTypeId=" + jobTypeId + ", employeeStatusId="
				+ employeeStatusId + ", orderId=" + orderId + ", parentId="
				+ parentId + ", name=" + name + ", firstName=" + firstName
				+ ", fatherName=" + fatherName + ", surname=" + surname
				+ ", birthDate=" + birthDate + ", invNum=" + invNum + ", rate="
				+ rate + ", isPlurality=" + isPlurality + ", isPensioner="
				+ isPensioner + ", begDate=" + begDate + ", endDate=" + endDate
				+ ", docSeries=" + docSeries + ", docNum=" + docNum
				+ ", phone=" + phone + ", email=" + email + "]";
	}

}
