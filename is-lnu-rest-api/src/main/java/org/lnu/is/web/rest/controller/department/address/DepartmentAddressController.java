package org.lnu.is.web.rest.controller.department.address;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.department.address.DepartmentAddressResource;
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
 * Controller for Department Addresses.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
public class DepartmentAddressController extends BaseController implements CrudController<DepartmentAddressResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentAddressController.class);
	
	@Resource(name = "departmentAddressFacade")
	private Facade<DepartmentAddressResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{departmentId}/addresses", method = RequestMethod.POST)
	public DepartmentAddressResource createResource(@Valid @RequestBody final DepartmentAddressResource resource) {
		LOG.info("Creating department address: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/addresses/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final DepartmentAddressResource resource) {
		LOG.info("Updated department address with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "DepartmentAddress Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/addresses/{id}", method = RequestMethod.GET)
	public DepartmentAddressResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving department address with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{departmentId}/addresses/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing department address with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "DepartmentAddress removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/addresses", method = RequestMethod.GET)
	public PagedResultResource<DepartmentAddressResource> getPagedResource(final PagedRequest<DepartmentAddressResource> request) {
		LOG.info("Retrieving PagedResultResource for DepartmentAddress Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
