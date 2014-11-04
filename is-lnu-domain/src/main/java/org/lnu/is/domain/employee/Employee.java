package org.lnu.is.domain.employee;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.NotMapped;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employeestatus.EmployeeStatus;
import org.lnu.is.domain.employeetype.EmployeeType;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;


/**
 * Employee entity.
 * @author ivanursul
 *
 */
@NotMapped
@Entity
@Table(name = "q_ob_employee")
public class Employee extends Model {
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
	
	@Column(name = "ispansioner")
	private Integer isPensioner;
	
	@Column(name = "ranktype_id")
	private Long rankTypeId;
	
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

	public Long getRankTypeId() {
		return rankTypeId;
	}

	public void setRankTypeId(final Long rankTypeId) {
		this.rankTypeId = rankTypeId;
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
	public String toString() {
		return "Employee [name=" + name + ", firstName=" + firstName
				+ ", fatherName=" + fatherName + ", surname=" + surname
				+ ", birthDate=" + birthDate + ", invNum=" + invNum + ", rate="
				+ rate + ", isPlurality=" + isPlurality + ", isPensioner="
				+ isPensioner + ", rankTypeId=" + rankTypeId + ", begDate="
				+ begDate + ", endDate=" + endDate + ", docSeries=" + docSeries
				+ ", docNum=" + docNum + ", phone=" + phone + ", email="
				+ email + "]";
	}
	
}
