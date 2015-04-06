package org.lnu.is.web.rest.controller.publicactivity.award;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.publicactivity.award.PublicActivityAwardResource;
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
 * PublicActivity controller.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/publicactivities")
public class PublicActivityAwardController extends BaseController implements CrudController<PublicActivityAwardResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PublicActivityAwardController.class);

	@Resource(name = "publicActivityAwardFacade")
	private Facade<PublicActivityAwardResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/{publicActivityId}/awards", method = RequestMethod.POST)
	public PublicActivityAwardResource createResource(@Valid @RequestBody final PublicActivityAwardResource resource) {
		LOG.info("Creating PublicActivityAward: {}", resource);
		return facade.createResource(resource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{publicActivityId}/awards/{id}", method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PublicActivityAwardResource resource) {
		LOG.info("Updating PublicActivityAward with id: {}, {}", id, resource);
		facade.updateResource(id, resource);
		return new MessageResource(MessageType.INFO);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{publicActivityId}/awards/{id}", method = RequestMethod.GET)
	public PublicActivityAwardResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving PublicActivityAward with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{publicActivityId}/awards/{id}", method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing PublicActivityAward with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PublicActivityAward removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{publicActivityId}/awards", method = RequestMethod.GET)
	public PagedResultResource<PublicActivityAwardResource> getPagedResource(final PagedRequest<PublicActivityAwardResource> request) {
		LOG.info("Retrieving PagedResultResource for PublicActivityAward Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
