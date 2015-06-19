package org.lnu.is.web.rest.controller.department.name;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.department.name.DepartmentNameResource;
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


/**
 * Controller for Department Names.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
public class DepartmentNameController extends BaseController implements CrudController<DepartmentNameResource, DepartmentNameResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentNameController.class);
	
	@Resource(name = "departmentNameFacade")
	private Facade<DepartmentNameResource, DepartmentNameResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{departmentId}/names", method = RequestMethod.POST)
	public DepartmentNameResource createResource(@Valid @RequestBody final DepartmentNameResource resource) {
		LOG.info("Creating department name: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/names/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final DepartmentNameResource resource) {
		LOG.info("Updated department name with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "DepartmentName Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/names/{id}", method = RequestMethod.GET)
	public DepartmentNameResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving department name with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{departmentId}/names/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing department name with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "DepartmentName removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/names", method = RequestMethod.GET)
	public PagedResultResource<DepartmentNameResource> getPagedResource(final PagedRequest<DepartmentNameResource> request) {
		LOG.info("Retrieving PagedResultResource for DepartmentName Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
