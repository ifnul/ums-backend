package org.lnu.is.web.rest.controller.department.contact;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.department.contact.DepartmentContactResource;
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
 * Controller for Department Contacts.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
public class DepartmentContactController extends BaseController implements CrudController<DepartmentContactResource, DepartmentContactResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentContactController.class);
	
	@Resource(name = "departmentContactFacade")
	private Facade<DepartmentContactResource, DepartmentContactResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{departmentId}/contacts", method = RequestMethod.POST)
	public DepartmentContactResource createResource(@Valid @RequestBody final DepartmentContactResource resource) {
		LOG.info("Creating department contact: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/contacts/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final DepartmentContactResource resource) {
		LOG.info("Updated department contact with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "DepartmentContact Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/contacts/{id}", method = RequestMethod.GET)
	public DepartmentContactResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving department contact with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{departmentId}/contacts/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing department contact with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "DepartmentContact removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/contacts", method = RequestMethod.GET)
	public PagedResultResource<DepartmentContactResource> getPagedResource(final PagedRequest<DepartmentContactResource> request) {
		LOG.info("Retrieving PagedResultResource for DepartmentContact Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
