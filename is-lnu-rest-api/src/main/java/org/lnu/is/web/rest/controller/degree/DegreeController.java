package org.lnu.is.web.rest.controller.degree;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.degree.DegreeResource;
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
 * Degree Controller.
 * @author ivanursul
 *
 */
@RestController
public class DegreeController extends BaseController implements CrudController<DegreeResource, DegreeResource> {
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseController.class);
	
	@Resource(name = "degreeFacade")
	private Facade<DegreeResource, DegreeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = { "/degrees", "/persons/{personId}/degrees" }, method = RequestMethod.GET)
	public PagedResultResource<DegreeResource> getPagedResource(final PagedRequest<DegreeResource> request) {
		LOGGER.info("Getting paged result for degrees:{}", request);
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/degrees/{id}", method = RequestMethod.GET)
	public DegreeResource getResource(@PathVariable("id") final Long id) {
		LOGGER.info("Getting degree by id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/degrees", method = RequestMethod.POST)
	public DegreeResource createResource(@Valid @RequestBody final DegreeResource resource) {
		LOGGER.info("Creating new degree:{}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/degrees/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final DegreeResource resource) {
		LOGGER.info("Updating new resource, id:{}, resource:{}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO, "Degree updated");
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/degrees/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOGGER.info("Removing degree:{}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "Degree removed");
	}

}
