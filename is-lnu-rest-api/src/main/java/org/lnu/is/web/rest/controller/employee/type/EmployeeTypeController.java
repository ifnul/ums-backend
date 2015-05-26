package org.lnu.is.web.rest.controller.employee.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.employee.type.EmployeeTypeResource;
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
 * Employee Type controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/employees/types")
public class EmployeeTypeController extends BaseController implements PagedController<EmployeeTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(EmployeeTypeController.class);

	@Resource(name = "employeeTypeFacade")
	private Facade<EmployeeTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Employee Type Resources")
	public PagedResultResource<EmployeeTypeResource> getPagedResource(final PagedRequest<EmployeeTypeResource> request) {
		LOG.info("Getting PagedResultResource for Employee Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get EmployeeTypeResource by id")
	public EmployeeTypeResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting employee type resource:{}", id);
		return facade.getResource(id);
	}
}
