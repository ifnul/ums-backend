package org.lnu.is.web.controller.specoffertype;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.specoffertype.SpecOfferTypeFacade;
import org.lnu.is.facade.resource.search.PagedRequest;
import org.lnu.is.facade.resource.search.PagedResultResource;
import org.lnu.is.facade.resource.specoffertype.SpecOfferTypeResource;
import org.lnu.is.web.controller.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

/**
 * Controller, that handles all operations
 * with specoffer types.
 * @author ivanursul.
 */
@RestController
@RequestMapping("/specoffertypes")
@Api(value = "Spec Offer Types", description = "Spec Offer Types")
public class SpecOfferTypeController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferTypeController.class);
	
	@Resource(name = "specOfferTypeFacade")
	private SpecOfferTypeFacade specOfferTypeFacade;

	/**
	 * Method for getting paged result.
	 * @param offset
	 * @param limit
	 * @param resource
	 * @return paged result.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(method = RequestMethod.GET)
	@ApiOperation(value = "Get's All SpecOfferTypes", position = 5)
	public PagedResultResource<SpecOfferTypeResource> getSpecOfferTypes(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit,
			final SpecOfferTypeResource resource) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Type Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest<SpecOfferTypeResource> pagedRequest = new PagedRequest<SpecOfferTypeResource>(resource, offset, limit);
		return specOfferTypeFacade.getSpecOfferTypes(pagedRequest);
	}
}
