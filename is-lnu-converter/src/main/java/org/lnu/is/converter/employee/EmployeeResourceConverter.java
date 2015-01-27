package org.lnu.is.converter.employee;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.jobtype.JobType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.post.Post;
import org.lnu.is.resource.employee.EmployeeResource;

/**
 * Employee Resource Converter.
 * @author ivanursul
 *
 */
@Converter("employeeResourceConverter")
public class EmployeeResourceConverter extends AbstractConverter<EmployeeResource, Employee> {

	@Override
	public Employee convert(final EmployeeResource source, final Employee target) {
		
		if (source.getEmployeeTypeId() != null) {
			EmployeeType employeeType = new EmployeeType();
			employeeType.setId(source.getEmployeeTypeId());
			target.setEmployeeType(employeeType);
		}
		
		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}
		
		if (source.getGenderTypeId() != null) {
			GenderType genderType = new GenderType();
			genderType.setId(source.getGenderTypeId());
			target.setGenderType(genderType);
		}
	
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());
			target.setDepartment(department);
		}
		
		if (source.getPostId() != null) {
			Post post = new Post();
			post.setId(source.getPostId());
			target.setPost(post);
		}
		
		if (source.getJobTypeId() != null) {
			JobType jobType = new JobType();
			jobType.setId(source.getJobTypeId());
			target.setJobType(jobType);
		}
		
		if (source.getEmployeeStatusId() != null) {
			EmployeeStatus employeeStatus = new EmployeeStatus();
			employeeStatus.setId(source.getEmployeeStatusId());
			target.setEmployeeStatus(employeeStatus);
		}
		
		if (source.getOrderId() != null) {
			Order order = new Order();
			order.setId(source.getOrderId());
			target.setOrder(order);
		}

		if (source.getParentId() != null) {
			Employee parent = new Employee();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		target.setName(source.getName());
		target.setFirstName(source.getFirstName());
		target.setFatherName(source.getFatherName());
		target.setSurname(source.getSurname());
		target.setBirthDate(source.getBirthDate());
		target.setInvNum(source.getInvNum());
		target.setRate(source.getRate());
		target.setIsPlurality(source.getIsPlurality());
		target.setIsPensioner(source.getIsPensioner());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setDocSeries(source.getDocSeries());
		target.setDocNum(source.getDocNum());
		target.setPhone(source.getPhone());
		target.setEmail(source.getEmail());
		
		return target;
	}

	@Override
	public Employee convert(final EmployeeResource source) {
		return convert(source, new Employee());
	}

}

