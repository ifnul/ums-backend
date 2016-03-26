package org.lnu.is.web.rest.controller.specoffer.type;

import javax.annotation.Resource;

import org.lnu.is.annotations.Limit;
import org.lnu.is.facade.facade.Facade;
import org.lnu.is.resource.search.PagedRequest;
import org.lnu.is.resource.search.PagedResultResource;
import org.lnu.is.resource.specoffer.type.SpecOfferTypeResource;
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

import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller for spec offer type.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specoffers/types")
@Api(value = "specoffers type", description = "Specoffers Type")
public class SpecOffetTypeController extends BaseController implements PagedController<SpecOfferTypeResource, SpecOfferTypeResource> {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOffetTypeController.class);
	
	@Resource(name = "specOfferTypeFacade")
	private Facade<SpecOfferTypeResource, SpecOfferTypeResource, Long> facade;
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get's All SpecOfferTypes", position = 5)
	public PagedResultResource<SpecOfferTypeResource> getPagedResource(@Limit(defaultValue = "40") final PagedRequest<SpecOfferTypeResource> request) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Type Resources with offset: {}, limit: {}", request.getOffset(), request.getLimit());
		return facade.getResources(request);
	}
	
	@Override
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = Request.ID, method = RequestMethod.GET)
	@ApiOperation(value = "Get spec offer type by id")
	public SpecOfferTypeResource getResource(@PathVariable("id") final Long id) {
		return facade.getResource(id);
	}

}
