package org.lnu.is.web.rest.controller.publicactivity.type;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.publicactivity.type.PublicActivityTypeResource;
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

/**
 * Public Activity Type Controller.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/publicactivities/types")
public class PublicActivityTypeController extends BaseController implements PagedController<PublicActivityTypeResource, PublicActivityTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(PublicActivityTypeController.class);
	
	@Resource(name = "publicActivityTypeFacade")
	private Facade<PublicActivityTypeResource, PublicActivityTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	public PagedResultResource<PublicActivityTypeResource> getPagedResource(final PagedRequest<PublicActivityTypeResource> request) {
		LOG.info("Getting PagedResultResource for Public Activity Type with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}

	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	public PublicActivityTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
