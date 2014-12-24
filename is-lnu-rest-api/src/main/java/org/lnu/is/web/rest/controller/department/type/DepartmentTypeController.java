package org.lnu.is.web.rest.controller.department.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.facade.resource.department.type.DepartmentTypeResource;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.web.rest.controller.BaseController;
import org.lnu.is.web.rest.controller.PagedController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for department types.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments/types")
@Api("Department Type Controller")
public class DepartmentTypeController extends BaseController implements PagedController<DepartmentTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentTypeController.class);

	@Resource(name = "departmentTypeFacade")
	private Facade<DepartmentTypeResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get All Gender Types")
	public PagedResultResource<DepartmentTypeResource> getPagedResource(final PagedRequest<DepartmentTypeResource> request) {
		LOG.info("Getting PagedResultResource for Department Type with  offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

}
