package org.lnu.is.dao.builder.employee;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.job.type.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;

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
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithOrderBy() throws Exception {
		// Given
		Employee context = new Employee();
		
		OrderBy orderBy1 = new OrderBy("employeeType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("person", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("genderType", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("department", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("post", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("jobType", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("employeeStatus", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("order", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("firstName", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("fatherName", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("surname", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("birthDate", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("invNum", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("rate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("isPlurality", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("isPensioner", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy20 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("docSeries", OrderByType.ASC);
		OrderBy orderBy22 = new OrderBy("docNum", OrderByType.DESC);
		OrderBy orderBy23 = new OrderBy("phone", OrderByType.ASC);
		OrderBy orderBy24 = new OrderBy("email", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21, orderBy22, orderBy23, orderBy24);
		
		String expected = "SELECT e FROM Employee e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.employeeType ASC, e.person DESC, e.genderType ASC, e.department DESC, e.post ASC, e.jobType DESC, e.employeeStatus ASC, e.order DESC, e.parent ASC, e.name DESC, e.firstName ASC, e.fatherName DESC, e.surname ASC, e.birthDate DESC, e.invNum ASC, e.rate DESC, e.isPlurality ASC, e.isPensioner DESC, e.begDate ASC, e.endDate DESC, e.docSeries ASC, e.docNum DESC, e.phone ASC, e.email DESC";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraints() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e WHERE e.status=:status ";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraintsWithOrderBy() throws Exception {
		// Given
		unit.setSecurity(false);
		
		Employee context = new Employee();
		
		OrderBy orderBy1 = new OrderBy("employeeType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("person", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("genderType", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("department", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("post", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("jobType", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("employeeStatus", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("order", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("firstName", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("fatherName", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("surname", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("birthDate", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("invNum", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("rate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("isPlurality", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("isPensioner", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy20 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("docSeries", OrderByType.ASC);
		OrderBy orderBy22 = new OrderBy("docNum", OrderByType.DESC);
		OrderBy orderBy23 = new OrderBy("phone", OrderByType.ASC);
		OrderBy orderBy24 = new OrderBy("email", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21, orderBy22, orderBy23, orderBy24);
		
		String expected = "SELECT e FROM Employee e WHERE e.status=:status ORDER BY e.employeeType ASC, e.person DESC, e.genderType ASC, e.department DESC, e.post ASC, e.jobType DESC, e.employeeStatus ASC, e.order DESC, e.parent ASC, e.name DESC, e.firstName ASC, e.fatherName DESC, e.surname ASC, e.birthDate DESC, e.invNum ASC, e.rate DESC, e.isPlurality ASC, e.isPensioner DESC, e.begDate ASC, e.endDate DESC, e.docSeries ASC, e.docNum DESC, e.phone ASC, e.email DESC";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e WHERE e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		
		Employee context = new Employee();
		
		OrderBy orderBy1 = new OrderBy("employeeType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("person", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("genderType", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("department", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("post", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("jobType", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("employeeStatus", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("order", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("firstName", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("fatherName", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("surname", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("birthDate", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("invNum", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("rate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("isPlurality", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("isPensioner", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy20 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("docSeries", OrderByType.ASC);
		OrderBy orderBy22 = new OrderBy("docNum", OrderByType.DESC);
		OrderBy orderBy23 = new OrderBy("phone", OrderByType.ASC);
		OrderBy orderBy24 = new OrderBy("email", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21, orderBy22, orderBy23, orderBy24);
		
		String expected = "SELECT e FROM Employee e WHERE e.crtUserGroup IN (:userGroups) ORDER BY e.employeeType ASC, e.person DESC, e.genderType ASC, e.department DESC, e.post ASC, e.jobType DESC, e.employeeStatus ASC, e.order DESC, e.parent ASC, e.name DESC, e.firstName ASC, e.fatherName DESC, e.surname ASC, e.birthDate DESC, e.invNum ASC, e.rate DESC, e.isPlurality ASC, e.isPensioner DESC, e.begDate ASC, e.endDate DESC, e.docSeries ASC, e.docNum DESC, e.phone ASC, e.email DESC";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraint() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Employee context = new Employee();
		
		String expected = "SELECT e FROM Employee e ";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraintWithOrderBy() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		Employee context = new Employee();
		
		OrderBy orderBy1 = new OrderBy("employeeType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("person", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("genderType", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("department", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("post", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("jobType", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("employeeStatus", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("order", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("firstName", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("fatherName", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("surname", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("birthDate", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("invNum", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("rate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("isPlurality", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("isPensioner", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy20 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("docSeries", OrderByType.ASC);
		OrderBy orderBy22 = new OrderBy("docNum", OrderByType.DESC);
		OrderBy orderBy23 = new OrderBy("phone", OrderByType.ASC);
		OrderBy orderBy24 = new OrderBy("email", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21, orderBy22, orderBy23, orderBy24);
		
		String expected = "SELECT e FROM Employee e ORDER BY e.employeeType ASC, e.person DESC, e.genderType ASC, e.department DESC, e.post ASC, e.jobType DESC, e.employeeStatus ASC, e.order DESC, e.parent ASC, e.name DESC, e.firstName ASC, e.fatherName DESC, e.surname ASC, e.birthDate DESC, e.invNum ASC, e.rate DESC, e.isPlurality ASC, e.isPensioner DESC, e.begDate ASC, e.endDate DESC, e.docSeries ASC, e.docNum DESC, e.phone ASC, e.email DESC";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
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

		String expected = "SELECT e FROM Employee e WHERE ( e.employeeType = :employeeType AND e.person = :person AND e.genderType = :genderType AND e.department = :department AND e.post =:post AND e.jobType = :jobType AND e.employeeStatus = :employeeStatus AND e.order =:order AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.firstName LIKE CONCAT('%',:firstName,'%') AND e.fatherName LIKE CONCAT('%',:fatherName,'%') AND e.surname LIKE CONCAT('%',:surname,'%') AND e.birthDate = :birthDate AND e.invNum = :invNum AND e.rate = :rate AND e.isPlurality =:isPlurality AND e.isPensioner =:isPensioner AND e.begDate <= :begDate AND e.endDate >= :endDate AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.phone LIKE CONCAT('%',:phone,'%') AND e.email LIKE CONCAT('%',:email,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithOrderBy() throws Exception {
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
		
		OrderBy orderBy1 = new OrderBy("employeeType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("person", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("genderType", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("department", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("post", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("jobType", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("employeeStatus", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("order", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("firstName", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("fatherName", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("surname", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("birthDate", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("invNum", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("rate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("isPlurality", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("isPensioner", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy20 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("docSeries", OrderByType.ASC);
		OrderBy orderBy22 = new OrderBy("docNum", OrderByType.DESC);
		OrderBy orderBy23 = new OrderBy("phone", OrderByType.ASC);
		OrderBy orderBy24 = new OrderBy("email", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21, orderBy22, orderBy23, orderBy24);

		String expected = "SELECT e FROM Employee e WHERE ( e.employeeType = :employeeType AND e.person = :person AND e.genderType = :genderType AND e.department = :department AND e.post =:post AND e.jobType = :jobType AND e.employeeStatus = :employeeStatus AND e.order =:order AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.firstName LIKE CONCAT('%',:firstName,'%') AND e.fatherName LIKE CONCAT('%',:fatherName,'%') AND e.surname LIKE CONCAT('%',:surname,'%') AND e.birthDate = :birthDate AND e.invNum = :invNum AND e.rate = :rate AND e.isPlurality =:isPlurality AND e.isPensioner =:isPensioner AND e.begDate <= :begDate AND e.endDate >= :endDate AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.phone LIKE CONCAT('%',:phone,'%') AND e.email LIKE CONCAT('%',:email,'%') ) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ORDER BY e.employeeType ASC, e.person DESC, e.genderType ASC, e.department DESC, e.post ASC, e.jobType DESC, e.employeeStatus ASC, e.order DESC, e.parent ASC, e.name DESC, e.firstName ASC, e.fatherName DESC, e.surname ASC, e.birthDate DESC, e.invNum ASC, e.rate DESC, e.isPlurality ASC, e.isPensioner DESC, e.begDate ASC, e.endDate DESC, e.docSeries ASC, e.docNum DESC, e.phone ASC, e.email DESC";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);

		// Then
		assertEquals(expected, actualQuery);
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
		
		String expected = "SELECT e FROM Employee e WHERE ( e.employeeType = :employeeType AND e.person = :person AND e.genderType = :genderType AND e.department = :department AND e.post =:post AND e.jobType = :jobType AND e.employeeStatus = :employeeStatus AND e.order =:order AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.firstName LIKE CONCAT('%',:firstName,'%') AND e.fatherName LIKE CONCAT('%',:fatherName,'%') AND e.surname LIKE CONCAT('%',:surname,'%') AND e.birthDate = :birthDate AND e.invNum = :invNum AND e.rate = :rate AND e.isPlurality =:isPlurality AND e.isPensioner =:isPensioner AND e.begDate <= :begDate AND e.endDate >= :endDate AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.phone LIKE CONCAT('%',:phone,'%') AND e.email LIKE CONCAT('%',:email,'%') ) ";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
	@Test
	public void testBuildWithParametersWithDisabledDefaultConstraintsWithOrderBy() throws Exception {
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
		
		OrderBy orderBy1 = new OrderBy("employeeType", OrderByType.ASC);
		OrderBy orderBy2 = new OrderBy("person", OrderByType.DESC);
		OrderBy orderBy3 = new OrderBy("genderType", OrderByType.ASC);
		OrderBy orderBy4 = new OrderBy("department", OrderByType.DESC);
		OrderBy orderBy5 = new OrderBy("post", OrderByType.ASC);
		OrderBy orderBy6 = new OrderBy("jobType", OrderByType.DESC);
		OrderBy orderBy7 = new OrderBy("employeeStatus", OrderByType.ASC);
		OrderBy orderBy8 = new OrderBy("order", OrderByType.DESC);
		OrderBy orderBy9 = new OrderBy("parent", OrderByType.ASC);
		OrderBy orderBy10 = new OrderBy("name", OrderByType.DESC);
		OrderBy orderBy11 = new OrderBy("firstName", OrderByType.ASC);
		OrderBy orderBy12 = new OrderBy("fatherName", OrderByType.DESC);
		OrderBy orderBy13 = new OrderBy("surname", OrderByType.ASC);
		OrderBy orderBy14 = new OrderBy("birthDate", OrderByType.DESC);
		OrderBy orderBy15 = new OrderBy("invNum", OrderByType.ASC);
		OrderBy orderBy16 = new OrderBy("rate", OrderByType.DESC);
		OrderBy orderBy17 = new OrderBy("isPlurality", OrderByType.ASC);
		OrderBy orderBy18 = new OrderBy("isPensioner", OrderByType.DESC);
		OrderBy orderBy19 = new OrderBy("begDate", OrderByType.ASC);
		OrderBy orderBy20 = new OrderBy("endDate", OrderByType.DESC);
		OrderBy orderBy21 = new OrderBy("docSeries", OrderByType.ASC);
		OrderBy orderBy22 = new OrderBy("docNum", OrderByType.DESC);
		OrderBy orderBy23 = new OrderBy("phone", OrderByType.ASC);
		OrderBy orderBy24 = new OrderBy("email", OrderByType.DESC);
		List<OrderBy> orders = Arrays.asList(orderBy1, orderBy2, orderBy3, orderBy4, orderBy5, orderBy6, orderBy7, orderBy8, orderBy9, orderBy10, orderBy11, orderBy12, orderBy13, orderBy14, orderBy15, orderBy16, orderBy17, orderBy18, orderBy19, orderBy20, orderBy21, orderBy22, orderBy23, orderBy24);
		
		String expected = "SELECT e FROM Employee e WHERE ( e.employeeType = :employeeType AND e.person = :person AND e.genderType = :genderType AND e.department = :department AND e.post =:post AND e.jobType = :jobType AND e.employeeStatus = :employeeStatus AND e.order =:order AND e.parent = :parent AND e.name LIKE CONCAT('%',:name,'%') AND e.firstName LIKE CONCAT('%',:firstName,'%') AND e.fatherName LIKE CONCAT('%',:fatherName,'%') AND e.surname LIKE CONCAT('%',:surname,'%') AND e.birthDate = :birthDate AND e.invNum = :invNum AND e.rate = :rate AND e.isPlurality =:isPlurality AND e.isPensioner =:isPensioner AND e.begDate <= :begDate AND e.endDate >= :endDate AND e.docSeries LIKE CONCAT('%',:docSeries,'%') AND e.docNum LIKE CONCAT('%',:docNum,'%') AND e.phone LIKE CONCAT('%',:phone,'%') AND e.email LIKE CONCAT('%',:email,'%') ) ORDER BY e.employeeType ASC, e.person DESC, e.genderType ASC, e.department DESC, e.post ASC, e.jobType DESC, e.employeeStatus ASC, e.order DESC, e.parent ASC, e.name DESC, e.firstName ASC, e.fatherName DESC, e.surname ASC, e.birthDate DESC, e.invNum ASC, e.rate DESC, e.isPlurality ASC, e.isPensioner DESC, e.begDate ASC, e.endDate DESC, e.docSeries ASC, e.docNum DESC, e.phone ASC, e.email DESC";
		MultiplePagedSearch<Employee> pagedSearch = new MultiplePagedSearch<>();
		pagedSearch.setEntity(context);
		pagedSearch.setOrders(orders);
		
		// When
		String actualQuery = unit.build(pagedSearch);
		
		// Then
		assertEquals(expected, actualQuery);
	}
	
}
