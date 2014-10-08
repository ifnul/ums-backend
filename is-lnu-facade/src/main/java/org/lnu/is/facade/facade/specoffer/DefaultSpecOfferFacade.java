package org.lnu.is.facade.facade.specoffer;

import javax.annotation.Resource;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.Converter;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.lnu.is.service.specoffer.SpecOfferService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Default implementation of spec offer functionality
 * in facade level.
 * 
 * @author ivanursul
 *
 */
@Transactional
@Component("specOfferFacade")
public class DefaultSpecOfferFacade implements SpecOfferFacade {

	@Resource(name = "specOfferService")
	private SpecOfferService specOfferService;

	@Resource(name = "specOfferResourceConverter")
	private Converter<SpecOfferResource, SpecOffer> specOfferResourceConverter;
	
	@Resource(name = "specOfferConverter")
	private Converter<SpecOffer, SpecOfferResource> specOfferConverter;
	
	@Override
	public SpecOfferResource createSpecOffer(final SpecOfferResource specOfferResource) {
		//Converting from resource(Controller - Facade visibility) to Entity(Service - Dao visibility)
		SpecOffer specOffer = specOfferResourceConverter.convert(specOfferResource);
		
		// Delegating creation to service layer.
		specOfferService.createSpecOffer(specOffer);
		
		// Converting to specoffer resource with generated identity.
		return specOfferConverter.convert(specOffer);
	}
	
}
