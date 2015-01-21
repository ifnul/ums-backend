package org.lnu.is.dao.builder.employee;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.EmployeeStatus;
import org.lnu.is.domain.employee.EmployeeType;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;

public class EmployeeQueryBuilderTest {

	private EmployeeQueryBuilder unit = new EmployeeQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e WHERE e.status=:status ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParameters() throws Exception {
		// Given
		String docNum = "doc num";
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		String docSeries = "doc series";
		String surname = "surname";
		Double rate = 1.0;
		String phone = "phone";
		String name = "name";
		Integer isPlurality = 11;
		Integer isPensioner = 12;
		String invNum = "invNum";
		String firstName = "first name";
		String fatherName = "father name";
		Date endDate = new Date();

		Department department = new Department();
		department.setId(1L);
		
		Employee context = new Employee();
		
		EmployeeStatus employeeStatus = new EmployeeStatus();
		employeeStatus.setId(4L);
		
		EmployeeType employeeType = new EmployeeType();
		employeeType.setId(5L);
		
		Post post = new Post();
		post.setId(7L);
		
		Person person = new Person();
		person.setId(9L);
		
		Employee parent = new Employee();
		parent.setId(11L);
		
		Order order = new Order();
		order.setId(12L);
		
		JobType jobType = new JobType();
		jobType.setId(13L);
		
		GenderType genderType = new GenderType();
		genderType.setId(15L);

		context.setPost(post);
		context.setPerson(person);
		context.setParent(parent);
		context.setOrder(order);
		context.setJobType(jobType);
		context.setGenderType(genderType);
		context.setEmployeeType(employeeType);
		context.setEmployeeStatus(employeeStatus);
		context.setDepartment(department);

		context.setSurname(surname);
		context.setRate(rate);
		context.setPhone(phone);
		context.setName(name);
		context.setIsPlurality(isPlurality);
		context.setIsPensioner(isPensioner);
		context.setInvNum(invNum);
		context.setFirstName(firstName);
		context.setFatherName(fatherName);
		context.setEndDate(endDate);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setBegDate(begDate);
		context.setBirthDate(birthDate);
		context.setEmail(email);

		String expected = "SELECT e FROM Employee e WHERE ( e.employeeType = :employeeType OR e.person = :person OR e.genderType = :genderType OR e.department = :department OR e.post =:post OR e.jobType = :jobType OR e.employeeStatus = :employeeStatus OR e.order =:order OR e.parent = :parent OR e.name LIKE CONCAT('%',:name,'%') OR e.firstName LIKE CONCAT('%',:firstName,'%') OR e.fatherName LIKE CONCAT('%',:fatherName,'%') OR e.surname LIKE CONCAT('%',:surname,'%') eOR e.birthDate = :birthDate OR e.invNum = :invNum OR e.rate = :rate OR e.isPlurality =:isPlurality OR e.isPensioner =:isPensioner OR e.begDate <= :begDate OR e.endDate >= :endDateOR e.docSeries LIKE CONCAT('%',:docSeries,'%') OR e.docNum LIKE CONCAT('%',:docNum,'%') OR e.phone LIKE CONCAT('%',:phone,'%') OR e.email LIKE CONCAT('%',:email,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actual = unit.build(context);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		String docNum = "doc num";
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		String docSeries = "doc series";
		String surname = "surname";
		Double rate = 1.0;
		String phone = "phone";
		String name = "name";
		Integer isPlurality = 11;
		Integer isPensioner = 12;
		String invNum = "invNum";
		String firstName = "first name";
		String fatherName = "father name";
		Date endDate = new Date();
		
		Department department = new Department();
		department.setId(1L);
		
		Employee context = new Employee();
		
		EmployeeStatus employeeStatus = new EmployeeStatus();
		employeeStatus.setId(4L);
		
		EmployeeType employeeType = new EmployeeType();
		employeeType.setId(5L);
		
		Post post = new Post();
		post.setId(7L);
		
		Person person = new Person();
		person.setId(9L);
		
		Employee parent = new Employee();
		parent.setId(11L);
		
		Order order = new Order();
		order.setId(12L);
		
		JobType jobType = new JobType();
		jobType.setId(13L);
		
		GenderType genderType = new GenderType();
		genderType.setId(15L);
		
		context.setPost(post);
		context.setPerson(person);
		context.setParent(parent);
		context.setOrder(order);
		context.setJobType(jobType);
		context.setGenderType(genderType);
		context.setEmployeeType(employeeType);
		context.setEmployeeStatus(employeeStatus);
		context.setDepartment(department);
		
		context.setSurname(surname);
		context.setRate(rate);
		context.setPhone(phone);
		context.setName(name);
		context.setIsPlurality(isPlurality);
		context.setIsPensioner(isPensioner);
		context.setInvNum(invNum);
		context.setFirstName(firstName);
		context.setFatherName(fatherName);
		context.setEndDate(endDate);
		context.setDocSeries(docSeries);
		context.setDocNum(docNum);
		context.setBegDate(begDate);
		context.setBirthDate(birthDate);
		context.setEmail(email);
		
		String expected = "SELECT e FROM Employee e WHERE ( e.employeeType = :employeeType OR e.person = :person OR e.genderType = :genderType OR e.department = :department OR e.post =:post OR e.jobType = :jobType OR e.employeeStatus = :employeeStatus OR e.order =:order OR e.parent = :parent OR e.name LIKE CONCAT('%',:name,'%') OR e.firstName LIKE CONCAT('%',:firstName,'%') OR e.fatherName LIKE CONCAT('%',:fatherName,'%') OR e.surname LIKE CONCAT('%',:surname,'%') eOR e.birthDate = :birthDate OR e.invNum = :invNum OR e.rate = :rate OR e.isPlurality =:isPlurality OR e.isPensioner =:isPensioner OR e.begDate <= :begDate OR e.endDate >= :endDateOR e.docSeries LIKE CONCAT('%',:docSeries,'%') OR e.docNum LIKE CONCAT('%',:docNum,'%') OR e.phone LIKE CONCAT('%',:phone,'%') OR e.email LIKE CONCAT('%',:email,'%') ) ";
		
		// When
		String actual = unit.build(context);
		
		// Then
		assertEquals(expected, actual);
	}
}
