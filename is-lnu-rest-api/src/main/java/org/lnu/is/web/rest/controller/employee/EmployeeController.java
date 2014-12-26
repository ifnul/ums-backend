package org.lnu.is.web.rest.controller.employee;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.employee.EmployeeResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class EmployeeController extends BaseController implements CrudController<EmployeeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

	@Resource(name = "employeeFacade")
	private Facade<EmployeeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Employee", position = 1)
	public EmployeeResource createResource(@RequestBody final EmployeeResource resource) {
		LOG.info("Creating employee: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Employee", position = 2)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@RequestBody final EmployeeResource resource) {
		LOG.info("Updating employee with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Employee Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Employee by id", position = 3)
	public EmployeeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving employee with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Employee", position = 4)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing employee with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Employee removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Employees", position = 5)
	public PagedResultResource<EmployeeResource> getPagedResource(final PagedRequest<EmployeeResource> request) {
		LOG.info("Retrieving PagedResultResource for Employee Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
