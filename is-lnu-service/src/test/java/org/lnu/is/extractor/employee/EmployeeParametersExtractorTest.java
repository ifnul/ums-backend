package org.lnu.is.extractor.employee;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.EmployeeStatus;
import org.lnu.is.domain.employee.EmployeeType;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;
import org.lnu.is.security.service.SessionService;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeParametersExtractorTest {

	@Mock(name = "employeeTypeDao")
	private Dao<EmployeeType, Long> employeeTypeDao;
	
	@Mock(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Mock(name = "genderTypeDao")
	private Dao<GenderType, Long> genderTypeDao;
	
	@Mock(name = "departmentDao")
	private Dao<Department, Long> departmentDao;
	
	@Mock(name = "postDao")
	private Dao<Post, Long> postDao;
	
	@Mock(name = "jobTypeDao")
	private Dao<JobType, Long> jobTypeDao;
	
	@Mock(name = "employeeStatusDao")
	private Dao<EmployeeStatus, Long> employeeStatusDao;
	
	@Mock(name = "orderDao")
	private Dao<Order, Long> orderDao;
	
	@Mock(name = "employeeDao")
	private Dao<Employee, Long> employeeDao;
	
	@InjectMocks
	private EmployeeParametersExtractor unit;

	@Mock
	private SessionService sessionService;

	private Boolean active = true;
	private Boolean security = true;

	private String group1 = "developers";
	private String group2 = "students";
	
	private List<String> groups = Arrays.asList(group1, group2);
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
		
		when(sessionService.getGroups()).thenReturn(groups);
	}
		
	@Test
	public void testGetParameters() throws Exception {
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
		
		Employee entity = new Employee();
		
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

		entity.setPost(post);
		entity.setPerson(person);
		entity.setParent(parent);
		entity.setOrder(order);
		entity.setJobType(jobType);
		entity.setGenderType(genderType);
		entity.setEmployeeType(employeeType);
		entity.setEmployeeStatus(employeeStatus);
		entity.setDepartment(department);

		entity.setSurname(surname);
		entity.setRate(rate);
		entity.setPhone(phone);
		entity.setName(name);
		entity.setIsPlurality(isPlurality);
		entity.setIsPensioner(isPensioner);
		entity.setInvNum(invNum);
		entity.setFirstName(firstName);
		entity.setFatherName(fatherName);
		entity.setEndDate(endDate);
		entity.setDocSeries(docSeries);
		entity.setDocNum(docNum);
		entity.setBegDate(begDate);
		entity.setBirthDate(birthDate);
		entity.setEmail(email);

		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("employeeStatus", employeeStatus);
		expected.put("employeeType", employeeType);
		expected.put("post", post);
		expected.put("person", person);
		expected.put("parent", parent);
		expected.put("order", order);
		expected.put("jobType", jobType);
		expected.put("genderType", genderType);
		expected.put("department", department);
		expected.put("surname", surname);
		expected.put("rate", rate);
		expected.put("phone", phone);
		expected.put("name", name);
		expected.put("isPlurality", isPlurality);
		expected.put("isPensioner", isPensioner);
		expected.put("invNum", invNum);
		expected.put("firstName", firstName);
		expected.put("fatherName", fatherName);
		expected.put("endDate", endDate);
		expected.put("docSeries", docSeries);
		expected.put("docNum", docNum);
		expected.put("begDate", begDate);
		expected.put("birthDate", birthDate);
		expected.put("email", email);
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		when(departmentDao.getEntityById(anyLong())).thenReturn(department);
		when(employeeStatusDao.getEntityById(anyLong())).thenReturn(employeeStatus);
		when(employeeTypeDao.getEntityById(anyLong())).thenReturn(employeeType);
		when(postDao.getEntityById(anyLong())).thenReturn(post);
		when(personDao.getEntityById(anyLong())).thenReturn(person);
		when(employeeDao.getEntityById(anyLong())).thenReturn(parent);
		when(orderDao.getEntityById(anyLong())).thenReturn(order);
		when(jobTypeDao.getEntityById(anyLong())).thenReturn(jobType);
		when(genderTypeDao.getEntityById(anyLong())).thenReturn(genderType);
		
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetParametersWithDefaultEntity() throws Exception {
		// Given
		Employee entity = new Employee();
		Map<String, Object> expected = new HashMap<String, Object>();
		expected.put("status", RowStatus.ACTIVE);
		expected.put("userGroups", groups);
		
		// When
		Map<String, Object> actual = unit.getParameters(entity);

		// Then
		assertEquals(expected, actual);
	}
}
