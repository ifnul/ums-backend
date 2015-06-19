package org.lnu.is.web.rest.controller.publicactivity;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.message.MessageResource;
import org.lnu.is.resource.message.MessageType;
import org.lnu.is.resource.publicactivity.PublicActivityResource;
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

/**
 * PublicActivity controller.
 * 
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/publicactivities")
public class PublicActivityController extends BaseController implements CrudController<PublicActivityResource, PublicActivityResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PublicActivityController.class);

	@Resource(name = "publicActivityFacade")
	private Facade<PublicActivityResource, PublicActivityResource, Long> facade;

	@Override
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public PublicActivityResource createResource(@Valid @RequestBody final PublicActivityResource personResource) {
		LOG.info("Creating PublicActivity: {}", personResource);
		return facade.createResource(personResource);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.PUT)
	public MessageResource updateResource(@PathVariable("id") final Long id,
			@Valid @RequestBody final PublicActivityResource personResource) {
		LOG.info("Updating PublicActivity with id: {}, {}", id, personResource);
		facade.updateResource(id, personResource);
		return new MessageResource(MessageType.INFO);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	public PublicActivityResource getResource(@PathVariable("id") final Long id) {
		LOG.info("Retrieving PublicActivity with id: {}", id);
		return facade.getResource(id);
	}

	@Override
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = Request.ID, method = RequestMethod.DELETE)
	public MessageResource removeResource(@PathVariable("id") final Long id) {
		LOG.info("Removing PublicActivity with id: {}", id);
		facade.removeResource(id);
		return new MessageResource(MessageType.INFO, "PublicActivity removed");
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public PagedResultResource<PublicActivityResource> getPagedResource(final PagedRequest<PublicActivityResource> request) {
		LOG.info("Retrieving PagedResultResource for PublicActivity Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
}
