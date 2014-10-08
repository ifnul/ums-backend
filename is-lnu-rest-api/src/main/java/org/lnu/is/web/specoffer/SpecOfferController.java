package org.lnu.is.web.specoffer;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.specoffer.SpecOfferFacade;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.lnu.is.web.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller, that handles all operations
 * with specoffers.
 * @author ivanursul
 *
 */
@RestController
@RequestMapping("/specoffers")
public class SpecOfferController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferController.class);
	
	@Resource(name = "specOfferFacade")
	private SpecOfferFacade specOfferFacade;

	/**
	 * Method for creating new specoffer.
	 * Method - POST.
	 * Content Body - spec Offer resource.
	 * @param specOfferResource
	 * @return specoffer with generated json.
	 */
	@RequestMapping(method = RequestMethod.POST)
	public SpecOfferResource createSpecOffer(@RequestBody final SpecOfferResource specOfferResource) {
		LOG.info("Creating specoffer: {}", specOfferResource);
		return specOfferFacade.createSpecOffer(specOfferResource);
	}
}
