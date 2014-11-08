package org.lnu.is.web.controller.department;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.department.DepartmentFacade;
import org.lnu.is.facade.resource.department.DepartmentResource;
import org.lnu.is.facade.resource.message.MessageResource;
import org.lnu.is.facade.resource.message.MessageType;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.controller.BaseController;
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
 * Controller, that handles all API with department entity.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
@Api(value = "department", description = "Departments", position = 2)
public class DepartmentController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class);
	
	@Resource(name = "departmentFacade")
	private DepartmentFacade departmentFacade;

	/**
	 * Method for creating new department.
	 * Http Method - POST.
	 * Content Body - department resource.
	 * PS - to help you understand how you should map methods, this
	 * method url will look like:
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/specailties,
	 * the method should be POST
	 * 
	 * @param departmentResource
	 * @return department with generated identifier.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Specoffer", position = 1)
	public DepartmentResource createDepartment(@RequestBody final DepartmentResource departmentResource) {
		LOG.info("Creating department: {}", departmentResource);
		return departmentFacade.createDepartment(departmentResource);
	}
	
	/**
	 * Method for updating department.
	 * HttpMethod - PUT.
	 * 
	 * PS - To help you understand how you should map methods, this
	 * method url will look like:
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/departments/1,
	 * where 1 - is identifier of department.
	 * method should be PUT.
	 * 
	 * @param id identifier
	 * @param departmentResource 
	 * @return message about result of operation, we don't need to return any
	 * additional info.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ApiOperation(value = "Update Department", position = 2)
	public MessageResource updateDepartment(@PathVariable("id") final Long id,
			@RequestBody final DepartmentResource departmentResource) {
		LOG.info("Updated department with id: {}, {}", id, departmentResource);
		departmentFacade.updateDepartment(id, departmentResource);
		return new MessageResource(MessageType.INFO, "Department Updated");
	}
	
	/**
	 * Method for getting department by it's id.
	 * Http Method - GET
	 * 
	 * PS - to try this method, use your browser
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/departments/1,
	 * http method - GET.
	 * 
	 * @param id identifier.
	 * @return department resource.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ApiOperation(value = "Get Department by id", position = 3)
	public DepartmentResource getDepartment(@PathVariable("id") final Long id) {
		LOG.info("Retrieving department with id: {}", id);
		return departmentFacade.getDepartment(id);
	}
	
	/**
	 * Method for removing department.
	 * HttpMethod - DELETE.
	 * 
	 * PS - For better understanding , url should look like
	 * this:
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/departments/1
	 * Http Method - DELETE.
	 * @param id identifier.
	 * @return message about result of operation, we don't need to return any
	 * additional info.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Department by id", position = 4)
	public MessageResource removeDepartment(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		departmentFacade.removeDepartment(id);
		return new MessageResource(MessageType.INFO, "Department removed");
	}
	
	/**
	 * Method for paged search.
	 * This means, that if you can pass parameters to this method
	 * 
	 * Http Method - GET
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/departments?offset=0&limit=20
	 * Request to this url will return 20 departments, starting from 0 position.
	 * 
	 * Another example of url
	 * http://localhost:8080/is-lnu-rest-api/api/departments
	 * 
	 * Request to this url will return 20 departments, starting from 0 position.
	 * Why 20 departments, starting from 0 position? Because of default values of
	 * offset ant limit parameters.
	 * @param offset start position.If not specified, default value will be - 0.
	 * @param limit maximum results. If not specified, default value will be - 20.
	 * @param resource - all form parameters.
	 * @return Paged Result with generated entities.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Departments", position = 5)
	public PagedResultResource<DepartmentResource> getSpecialties(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final DepartmentResource resource) {
		LOG.info("Retrieving PagedResultResource for Department Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest<DepartmentResource> pagedRequest = new PagedRequest<DepartmentResource>(resource, offset, limit);
		return departmentFacade.getDepartments(pagedRequest);
	}	
}
