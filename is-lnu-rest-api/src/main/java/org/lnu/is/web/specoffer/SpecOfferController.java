package org.lnu.is.web.specoffer;

import javax.annotation.Resource;

import org.lnu.is.facade.facade.specoffer.SpecOfferFacade;
import org.lnu.is.facade.resources.message.MessageResource;
import org.lnu.is.facade.resources.message.MessageType;
import org.lnu.is.facade.resources.search.PagedRequest;
import org.lnu.is.facade.resources.search.PagedResultResource;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.lnu.is.web.BaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller, that handles all operations
 * with specoffers.
 * @author ivanursul.
 */
@RestController
@RequestMapping("/specoffers")
public class SpecOfferController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(SpecOfferController.class);
	
	@Resource(name = "specOfferFacade")
	private SpecOfferFacade specOfferFacade;

	/**
	 * Method for creating new specoffer.
	 * Http Method - POST.
	 * Content Body - spec Offer resource.
	 * PS - to help you understand how you should map methods, this
	 * method url will look like:
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/specoffers,
	 * the method should be POST
	 * 
	 * @param specOfferResource
	 * @return specoffer with generated json.
	 */
	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(method = RequestMethod.POST)
	public SpecOfferResource createSpecOffer(@RequestBody final SpecOfferResource specOfferResource) {
		LOG.info("Creating specoffer: {}", specOfferResource);
		return specOfferFacade.createSpecOffer(specOfferResource);
	}
	
	/**
	 * Method for updating specoffer.
	 * HttpMethod - PUT.
	 * 
	 * PS - To help you understand how you shoul map methods, this
	 * method url will look like:
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/specoffers/1,
	 * where 1 - is identifier of specoffer.
	 * method should be PUT.
	 * 
	 * @param id identifier
	 * @param specOfferResource 
	 * @return message about result of operation, we don't need to return any
	 * additional info.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public MessageResource updateSpecOffer(@PathVariable("id") final Long id,
			@RequestBody final SpecOfferResource specOfferResource) {
		LOG.info("Updated specoffer with id: {}, {}", id, specOfferResource);
		specOfferFacade.updateSpecOffer(id, specOfferResource);
		return new MessageResource(MessageType.INFO, "SpecOffer Updated");
	}
	
	/**
	 * Method for getting specoffer by it's id.
	 * Http Method - GET
	 * 
	 * PS - to try this method, use your browser
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/specoffers/1,
	 * http method - GET.
	 * 
	 * @param id identifier.
	 * @return spec offer.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public SpecOfferResource getSpecOffer(@PathVariable("id") final Long id) {
		LOG.info("Retrieving specoffer with id: {}", id);
		return specOfferFacade.getSpecOffer(id);
	}
	
	/**
	 * Method for removing specoffer.
	 * HttpMethod - DELETE.
	 * 
	 * PS - For better understanding , url should look like
	 * this:
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/specoffers/1
	 * Http Method - DELETE.
	 * @param id identifier.
	 * @return message about result of operation, we don't need to return any
	 * additional info.
	 */
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public MessageResource removeSpecOffer(@PathVariable("id") final Long id) {
		LOG.info("Removing specoffer with id: {}", id);
		specOfferFacade.removeSpecOffer(id);
		return new MessageResource(MessageType.INFO, "SpecOffer removed");
	}
	
	/**
	 * Method for paged search.
	 * This means, that if you can pass parameters to this method
	 * 
	 * Http Method - GET
	 * 
	 * http://localhost:8080/is-lnu-rest-api/api/specoffers?offset=0&limit=20
	 * Request to this url will return 20 specoffers, starting from 0 position.
	 * 
	 * Another example of url
	 * http://localhost:8080/is-lnu-rest-api/api/specoffers
	 * 
	 * Request to this url will return 20 specoffers, starting from 0 position.
	 * Why 20 specoffer, starting from 0 position? Because of default values of
	 * offset ant limit parameters.
	 * @param offset start position.If not specified, default value will be - 0.
	 * @param limit maximum results. If not specified, default value will be - 20.
	 * @return Paged Result with generated entities.
	 */
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping
	public PagedResultResource<SpecOfferResource> getSpecOffers(@RequestParam(value = "offset", defaultValue = "0") final Integer offset,
			@RequestParam(value = "limit", defaultValue = "20") final Integer limit) {
		LOG.info("Retrieving PagedResultResource for Spec Offer Resources with offset: {}, limit: {}", offset, limit);
		PagedRequest pagedRequest = new PagedRequest(offset, limit);
		return specOfferFacade.getSpecOffers(pagedRequest);
	}
}
