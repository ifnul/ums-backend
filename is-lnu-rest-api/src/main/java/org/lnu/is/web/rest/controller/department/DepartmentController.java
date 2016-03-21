package org.lnu.is.web.rest.controller.department;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.lnu.is.facade.facade.department.DepartmentFacade;
import org.lnu.is.resource.department.DepartmentResource;
import org.lnu.is.resource.department.DepartmentSpecofferResource;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.CrudController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Controller, that handles all API with department entity.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
@Api(value = "department", description = "Departments")
public class DepartmentController extends BaseController implements CrudController<DepartmentResource, DepartmentResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentController.class);
	
	@Resource(name = "departmentFacade")
	private DepartmentFacade facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Department")
	public DepartmentResource createResource(@RequestBody final DepartmentResource departmentResource) {
		LOG.info("Creating department: {}", departmentResource);
		return facade.createResource(departmentResource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Department")
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@RequestBody final DepartmentResource departmentResource) {
		LOG.info("Updated department with id: {}, {}", id, departmentResource);
		facade.updateResource(id, departmentResource);
		return new MessageResource(MessageType.INFO, "Department Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Department by id")
	public DepartmentResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving department with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Department by id")
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Department removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get Departments")
	public PagedResultResource<DepartmentResource> getPagedResource(final PagedRequest<DepartmentResource> request) {
		LOG.info("Retrieving PagedResultResource for Department Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@RequestMapping(value = "/timeperiods/{timePeriodId}/specoffers", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public List<DepartmentSpecofferResource> getDepartmentSpecoffers(@PathVariable("timePeriodId") long timePeriodId) {
		return facade.getDepartmentByTimePeriodGroupedByDepartment(timePeriodId);
	}
}
