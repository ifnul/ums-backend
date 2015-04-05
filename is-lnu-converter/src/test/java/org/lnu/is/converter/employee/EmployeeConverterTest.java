package org.lnu.is.converter.employee;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
import org.lnu.is.resource.employee.EmployeeResource;

public class EmployeeConverterTest {

	private EmployeeConverter unit = new EmployeeConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long employeeTypeId = 2L;
		EmployeeType employeeType = new EmployeeType();
		employeeType.setId(employeeTypeId);
		
		Long personId = 3L;
		Person person = new Person();
		person.setId(personId);
		
		Long genderTypeId = 4L;
		GenderType genderType = new GenderType();
		genderType.setId(genderTypeId);
		
		Long departmentId = 5L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long postId = 6L;
		Post post = new Post();
		post.setId(postId);
		
		Long jobTypeId = 7L;
		JobType jobType = new JobType();
		jobType.setId(jobTypeId);
		
		Long employeeStatusId = 8L;
		EmployeeStatus employeeStatus = new EmployeeStatus();
		employeeStatus.setId(employeeStatusId);
		
		Long orderId = 9L;
		Order order = new Order();
		order.setId(orderId);
		
		Long parentId = 10L;
		Employee parent = new Employee();
		parent.setId(parentId);
		
		String name = "name1";
		String firstName = "first name";
		String fatherName = "father name";
		String surname = "surname";
		String invNum = "inv num";
		Double rate = 1.0;
		Integer isPlurality = 1;
		Integer isPensioner = 2;
		Date endDate = new Date();
		String docSeries = "doc series";
		String docNum = "Dco num";
		String phone = "phone number";
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		
		EmployeeResource expected = new EmployeeResource();
		expected.setName(name);
		expected.setFirstName(firstName);
		expected.setFatherName(fatherName);
		expected.setSurname(surname);
		expected.setBirthDate(birthDate);
		expected.setInvNum(invNum);
		expected.setRate(rate);
		expected.setIsPlurality(isPlurality);
		expected.setIsPensioner(isPensioner);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setDocSeries(docSeries);
		expected.setDocNum(docNum);
		expected.setPhone(phone);
		expected.setEmail(email);
		expected.setEmployeeTypeId(employeeTypeId);
		expected.setPersonId(personId);
		expected.setGenderTypeId(genderTypeId);
		expected.setDepartmentId(departmentId);
		expected.setPostId(postId);
		expected.setJobTypeId(jobTypeId);
		expected.setEmployeeStatusId(employeeStatusId);
		expected.setOrderId(orderId);
		expected.setParentId(parentId);
		
		Employee source = new Employee();
		source.setName(name);
		source.setFirstName(firstName);
		source.setFatherName(fatherName);
		source.setSurname(surname);
		source.setBirthDate(birthDate);
		source.setInvNum(invNum);
		source.setRate(rate);
		source.setIsPlurality(isPlurality);
		source.setIsPensioner(isPensioner);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setDocSeries(docSeries);
		source.setDocNum(docNum);
		source.setPhone(phone);
		source.setEmail(email);
		source.setEmployeeType(employeeType);
		source.setPerson(person);
		source.setGenderType(genderType);
		source.setDepartment(department);
		source.setPost(post);
		source.setJobType(jobType);
		source.setEmployeeStatus(employeeStatus);
		source.setOrder(order);
		source.setParent(parent);
		
		// When
		EmployeeResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		String name = "name1";
		String firstName = "first name";
		String fatherName = "father name";
		String surname = "surname";
		String invNum = "inv num";
		Double rate = 1.0;
		Integer isPlurality = 1;
		Integer isPensioner = 2;
		Date endDate = new Date();
		String docSeries = "doc series";
		String docNum = "Dco num";
		String phone = "phone number";
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		
		EmployeeResource expected = new EmployeeResource();
		expected.setName(name);
		expected.setFirstName(firstName);
		expected.setFatherName(fatherName);
		expected.setSurname(surname);
		expected.setBirthDate(birthDate);
		expected.setInvNum(invNum);
		expected.setRate(rate);
		expected.setIsPlurality(isPlurality);
		expected.setIsPensioner(isPensioner);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setDocSeries(docSeries);
		expected.setDocNum(docNum);
		expected.setPhone(phone);
		expected.setEmail(email);
		
		Employee source = new Employee();
		source.setName(name);
		source.setFirstName(firstName);
		source.setFatherName(fatherName);
		source.setSurname(surname);
		source.setBirthDate(birthDate);
		source.setInvNum(invNum);
		source.setRate(rate);
		source.setIsPlurality(isPlurality);
		source.setIsPensioner(isPensioner);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setDocSeries(docSeries);
		source.setDocNum(docNum);
		source.setPhone(phone);
		source.setEmail(email);
		
		// When
		EmployeeResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long employeeTypeId = 2L;
		EmployeeType employeeType = new EmployeeType();
		employeeType.setId(employeeTypeId);
		
		Long personId = 3L;
		Person person = new Person();
		person.setId(personId);
		
		Long genderTypeId = 4L;
		GenderType genderType = new GenderType();
		genderType.setId(genderTypeId);
		
		Long departmentId = 5L;
		Department department = new Department();
		department.setId(departmentId);
		
		Long postId = 6L;
		Post post = new Post();
		post.setId(postId);
		
		Long jobTypeId = 7L;
		JobType jobType = new JobType();
		jobType.setId(jobTypeId);
		
		Long employeeStatusId = 8L;
		EmployeeStatus employeeStatus = new EmployeeStatus();
		employeeStatus.setId(employeeStatusId);
		
		Long orderId = 9L;
		Order order = new Order();
		order.setId(orderId);
		
		Long parentId = 10L;
		Employee parent = new Employee();
		parent.setId(parentId);
		
		String name = "name1";
		String firstName = "first name";
		String fatherName = "father name";
		String surname = "surname";
		String invNum = "inv num";
		Double rate = 1.0;
		Integer isPlurality = 1;
		Integer isPensioner = 2;
		Date endDate = new Date();
		String docSeries = "doc series";
		String docNum = "Dco num";
		String phone = "phone number";
		String email = "email@email.com";
		Date begDate = new Date();
		Date birthDate = new Date();
		
		EmployeeResource expected = new EmployeeResource();
		expected.setName(name);
		expected.setFirstName(firstName);
		expected.setFatherName(fatherName);
		expected.setSurname(surname);
		expected.setBirthDate(birthDate);
		expected.setInvNum(invNum);
		expected.setRate(rate);
		expected.setIsPlurality(isPlurality);
		expected.setIsPensioner(isPensioner);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		expected.setDocSeries(docSeries);
		expected.setDocNum(docNum);
		expected.setPhone(phone);
		expected.setEmail(email);
		expected.setEmployeeTypeId(employeeTypeId);
		expected.setPersonId(personId);
		expected.setGenderTypeId(genderTypeId);
		expected.setDepartmentId(departmentId);
		expected.setPostId(postId);
		expected.setJobTypeId(jobTypeId);
		expected.setEmployeeStatusId(employeeStatusId);
		expected.setOrderId(orderId);
		expected.setParentId(parentId);
		
		Employee source = new Employee();
		source.setName(name);
		source.setFirstName(firstName);
		source.setFatherName(fatherName);
		source.setSurname(surname);
		source.setBirthDate(birthDate);
		source.setInvNum(invNum);
		source.setRate(rate);
		source.setIsPlurality(isPlurality);
		source.setIsPensioner(isPensioner);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		source.setDocSeries(docSeries);
		source.setDocNum(docNum);
		source.setPhone(phone);
		source.setEmail(email);
		source.setEmployeeType(employeeType);
		source.setPerson(person);
		source.setGenderType(genderType);
		source.setDepartment(department);
		source.setPost(post);
		source.setJobType(jobType);
		source.setEmployeeStatus(employeeStatus);
		source.setOrder(order);
		source.setParent(parent);

		String name1 = "name1";
		String firstName1 = "first name";
		String fatherName1 = "father name";
		String surname1 = "surname";
		String invNum1 = "inv num";
		Double rate1 = 1.0;
		Integer isPlurality1 = 1;
		Integer isPensioner1 = 2;
		Date endDate1 = new Date();
		String docSeries1 = "doc series";
		String docNum1 = "Dco num";
		String phone1 = "phone number";
		String email1 = "email@email.com";
		Date begDate1 = new Date();
		Date birthDate1 = new Date();
		
		EmployeeResource expected1 = new EmployeeResource();
		expected1.setName(name1);
		expected1.setFirstName(firstName1);
		expected1.setFatherName(fatherName1);
		expected1.setSurname(surname1);
		expected1.setBirthDate(birthDate1);
		expected1.setInvNum(invNum1);
		expected1.setRate(rate1);
		expected1.setIsPlurality(isPlurality1);
		expected1.setIsPensioner(isPensioner1);
		expected1.setBegDate(begDate1);
		expected1.setEndDate(endDate1);
		expected1.setDocSeries(docSeries1);
		expected1.setDocNum(docNum1);
		expected1.setPhone(phone1);
		expected1.setEmail(email1);
		
		Employee source1 = new Employee();
		source1.setName(name1);
		source1.setFirstName(firstName1);
		source1.setFatherName(fatherName1);
		source1.setSurname(surname1);
		source1.setBirthDate(birthDate1);
		source1.setInvNum(invNum1);
		source1.setRate(rate1);
		source1.setIsPlurality(isPlurality1);
		source1.setIsPensioner(isPensioner1);
		source1.setBegDate(begDate1);
		source1.setEndDate(endDate1);
		source1.setDocSeries(docSeries1);
		source1.setDocNum(docNum1);
		source1.setPhone(phone1);
		source1.setEmail(email1);
		
		List<Employee> sources = Arrays.asList(source,source1);
		
		List<EmployeeResource> expecteds = Arrays.asList(expected, expected1);
		
		// When
		List<EmployeeResource> actual = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actual);
	}
}
