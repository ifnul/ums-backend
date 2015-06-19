package org.lnu.is.extractor.employee;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.job.type.JobType;
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
	
	@Resource(name = "personDao")
	private Dao<Person, Person, Long> personDao;
	
	@Resource(name = "genderTypeDao")
	private Dao<GenderType, GenderType, Long> genderTypeDao;
	
	@Resource(name = "departmentDao")
	private Dao<Department, Department, Long> departmentDao;
	
	@Resource(name = "postDao")
	private Dao<Post, Post, Long> postDao;
	
	@Resource(name = "jobTypeDao")
	private Dao<JobType, JobType, Long> jobTypeDao;

	@Resource(name = "employeeTypeDao")
	private Dao<EmployeeType, EmployeeType, Long> employeeTypeDao;
	
	@Resource(name = "employeeStatusDao")
	private Dao<EmployeeStatus, EmployeeStatus, Long> employeeStatusDao;
	
	@Resource(name = "orderDao")
	private Dao<Order, Order, Long> orderDao;
	
	@Resource(name = "employeeDao")
	private Dao<Employee, Employee, Long> employeeDao;
	
	@Override
	public Map<String, Object> getParameters(final Employee entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getEmployeeType(), employeeTypeDao, "employeeType", parameters);
		addParameter(entity.getEmployeeStatus(), employeeStatusDao, "employeeStatus", parameters);

		addParameter(entity.getPerson(), personDao, "person", parameters);
		addParameter(entity.getGenderType(), genderTypeDao, "genderType", parameters);
		addParameter(entity.getDepartment(), departmentDao, "department", parameters);
		addParameter(entity.getPost(), postDao, "post", parameters);
		addParameter(entity.getJobType(), jobTypeDao, "jobType", parameters);
		addParameter(entity.getOrder(), orderDao, "order", parameters);
		addParameter(entity.getParent(), employeeDao, "parent", parameters);

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getFirstName(), "firstName", parameters);
		addParameter(entity.getFatherName(), "fatherName", parameters);
		addParameter(entity.getSurname(), "surname", parameters);
		addParameter(entity.getBirthDate(), "birthDate", parameters);
		addParameter(entity.getInvNum(), "invNum", parameters);
		addParameter(entity.getRate(), "rate", parameters);
		addParameter(entity.getIsPlurality(), "isPlurality", parameters);
		addParameter(entity.getIsPensioner(), "isPensioner", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getPhone(), "phone", parameters);
		addParameter(entity.getEmail(), "email", parameters);
		
		return parameters;
	}

}
