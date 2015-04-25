package org.lnu.is.web.rest.controller.employee.status;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.employee.status.EmployeeStatusResource;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.web.rest.constant.Request;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Employee Status controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/employees/statuses")
public class EmployeeStatusController extends BaseController implements PagedController<EmployeeStatusResource, EmployeeStatusResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeStatusController.class);

	@Resource(name = "employeeStatusFacade")
	private Facade<EmployeeStatusResource, EmployeeStatusResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Employee Status Resources")
	public PagedResultResource<EmployeeStatusResource> getPagedResource(final PagedRequest<EmployeeStatusResource> request) {
		LOG.info("Getting PagedResultResource for Employee Status with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get EmployeeStatusResource by id")
	public EmployeeStatusResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting employee type resource:{}", id);
		return facade.getResource(id);
	}
}
