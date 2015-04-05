package org.lnu.is.web.rest.controller.admin.unit;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.adminunit.AdminUnitResource;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Admin Units controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/adminunits")
public class AdminUnitController extends BaseController implements CrudController<AdminUnitResource> {
	private static final Logger LOG = LoggerFactory.getLogger(AdminUnitController.class);
	
	@Resource(name = "adminUnitFacade")
	private Facade<AdminUnitResource, Long> facade;
	
 	@Override
	@ResponseStatus(HttpStatus.OK)
 	@RequestMapping(method = RequestMethod.GET)
 	@ApiOperation(value = "Get Admin Unit Types")
 	public PagedResultResource<AdminUnitResource> getPagedResource(final PagedRequest<AdminUnitResource> request) {
 		LOG.info("Getting PagedResultResource for Admin Unit Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
 		return facade.getResources(request);	
 	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get Admin Unit by id")
	public AdminUnitResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Getting admin unit resource: {}", id);
		return facade.getResource(id);
	}

	
	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	@ApiOperation(value = "Create Admin Unit")
	public AdminUnitResource createResource(@Valid @RequestBody final AdminUnitResource resource) {
		LOG.info("Creating Admin Unit: {}", resource);
		return facade.createResource(resource);
	}
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	@ApiOperation(value = "Update Admin Unit")
	public MessageResource updateResource(@PathVariable("id") final Long id, @Valid @RequestBody final AdminUnitResource resource) {
		LOG.info("Updated Admin Unit with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Admin Unit Updated");
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete Admin Unit by id")
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing Admin Unit with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Asset removed");
	}


}
