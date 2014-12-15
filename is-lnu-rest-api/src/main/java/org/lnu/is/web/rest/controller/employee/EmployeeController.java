package org.lnu.is.web.rest.controller.employee;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.employee.EmployeeResource;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Employee Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/employees")
@Api("Employee")
public class EmployeeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Resource(name = "employeeFacade")
	private Facade<EmployeeResource, Long> facade;

	/**
	 * Method for creating new employee.
	 * @param resource
	 * @return employee with generated identifier.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Employee", position = 1)
	public EmployeeResource createEmployee(@RequestBody final EmployeeResource resource) {
		LOG.info("Creating employee: {}", resource);
		return facade.createResource(resource);
	}

	/**
	 * Method for updating employee.
	 * @param id
	 * @param resource
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Employee", position = 2)
	public MessageResource updateEmployee(@PathVariable("id") final Long id,
			@RequestBody final EmployeeResource resource) {
		LOG.info("Updating employee with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Employee Updated");
	}

	/**
	 * Method for getting employee by identifier.
	 * @param id
	 * @return employee.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Employee by id", position = 3)
	public EmployeeResource getEmployee(@PathVariable("id") final Long id) {
		LOG.info("Retrieving employee with id: {}", id);
		return facade.getResource(id);
	}

	/**
	 * Method for removing employee.
	 * @param id
	 * @return message resource.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Employee", position = 4)
	public MessageResource removeEmployee(@PathVariable("id") final Long id) {
		LOG.info("Removing employee with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Employee removed");
	}

	/**
	 * Method for geting paged result of employees.
	 * 
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Employees", position = 5)
	public PagedResultResource<EmployeeResource> getEmployees(
			@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit, 
			final EmployeeResource resource) {
		LOG.info("Retrieving PagedResultResource for Employee Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest<EmployeeResource> pagedRequest = new PagedRequest<EmployeeResource>(resource, offset, limit);
		return facade.getResources(pagedRequest);
	}
}
