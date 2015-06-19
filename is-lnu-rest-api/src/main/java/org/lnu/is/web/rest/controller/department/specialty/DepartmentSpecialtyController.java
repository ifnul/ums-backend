package org.lnu.is.web.rest.controller.department.specialty;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.department.specialty.DepartmentSpecialtyResource;
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
 * Controller for Department Specialtys.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/departments")
public class DepartmentSpecialtyController extends BaseController implements CrudController<DepartmentSpecialtyResource, DepartmentSpecialtyResource> {
	private static final Logger LOG = LoggerFactory.getLogger(DepartmentSpecialtyController.class);
	
	@Resource(name = "departmentSpecialtyFacade")
	private Facade<DepartmentSpecialtyResource, DepartmentSpecialtyResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{departmentId}/specialties", method = RequestMethod.POST)
	public DepartmentSpecialtyResource createResource(@Valid @RequestBody final DepartmentSpecialtyResource resource) {
		LOG.info("Creating department specialty: {}", resource);
		return facade.createResource(resource);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/specialties/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final DepartmentSpecialtyResource resource) {
		LOG.info("Updated department specialty with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "DepartmentSpecialty Updated");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/specialties/{id}", method = RequestMethod.GET)
	public DepartmentSpecialtyResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving department specialty with id: {}", id);
		return facade.getResource(id);
	}
	
	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{departmentId}/specialties/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing department specialty with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "DepartmentSpecialty removed");
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{departmentId}/specialties", method = RequestMethod.GET)
	public PagedResultResource<DepartmentSpecialtyResource> getPagedResource(final PagedRequest<DepartmentSpecialtyResource> request) {
		LOG.info("Retrieving PagedResultResource for DepartmentSpecialty Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}	
}
