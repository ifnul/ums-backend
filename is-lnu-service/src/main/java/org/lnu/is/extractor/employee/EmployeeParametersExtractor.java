package org.lnu.is.extractor.employee;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.EmployeeStatus;
import org.lnu.is.domain.employee.EmployeeType;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Employee Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("employeeParametersExtractor")
public class EmployeeParametersExtractor extends AbstractParametersExtractor<Employee>  {

	@Resource(name = "employeeTypeDao")
	private Dao<EmployeeType, Long> employeeTypeDao;
	
	@Resource(name = "personDao")
	private Dao<Person, Long> personDao;
	
	@Resource(name = "genderTypeDao")
	private Dao<GenderType, Long> genderTypeDao;
	
	@Resource(name = "departmentDao")
	private Dao<Department, Long> departmentDao;
	
	@Resource(name = "postDao")
	private Dao<Post, Long> postDao;
	
	@Resource(name = "jobTypeDao")
	private Dao<JobType, Long> jobTypeDao;
	
	@Resource(name = "employeeStatus")
	private Dao<EmployeeStatus, Long> employeeStatus;
	
	@Resource(name = "orderDao")
	private Dao<Order, Long> orderDao;
	
	@Resource(name = "employeeDao")
	private Dao<Employee, Long> employeeDao;
	
	@Override
	public Map<String, Object> getParameters(final Employee entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getEmployeeType(), employeeTypeDao, "employeeType", parameters);
		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getGenderType(), genderTypeDao, "genderType", parameters);
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getPost(), postDao, "post", parameters);
		addParameter(entity.getJobType(), jobTypeDao, "jobType", parameters);
		addParameter(entity.getEmployeeStatus(), employeeStatus, "employeeStatus", parameters);
		addParameter(entity.getOrder(), orderDao, "order", parameters);
		addParameter(entity.getParent(), employeeDao, "employee", parameters);
		
		return parameters;
	}

}

/**

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
**/