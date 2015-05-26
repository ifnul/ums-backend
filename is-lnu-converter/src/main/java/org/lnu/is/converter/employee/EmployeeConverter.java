package org.lnu.is.converter.employee;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.resource.employee.EmployeeResource;

/**
 * Employee Converter.
 * @author ivanursul
 *
 */
@Converter("employeeConverter")
public class EmployeeConverter extends AbstractConverter<Employee, EmployeeResource> {

	@Override
	public EmployeeResource convert(final Employee source, final EmployeeResource target) {
		
		if (source.getEmployeeType() != null) {
			target.setEmployeeTypeId(source.getEmployeeType().getId());
		}
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getGenderType() != null) {
			target.setGenderTypeId(source.getGenderType().getId());
		}
	
		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getPost() != null) {
			target.setPostId(source.getPost().getId());
		}
		
		if (source.getJobType() != null) {
			target.setJobTypeId(source.getJobType().getId());
		}
		
		if (source.getEmployeeStatus() != null) {
			target.setEmployeeStatusId(source.getEmployeeStatus().getId());
		}
		
		if (source.getOrder() != null) {
			target.setOrderId(source.getOrder().getId());
		}

		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
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
	public EmployeeResource convert(final Employee source) {
		return convert(source, new EmployeeResource());
	}

}
