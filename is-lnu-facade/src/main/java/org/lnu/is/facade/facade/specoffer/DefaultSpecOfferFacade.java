package org.lnu.is.facade.facade.specoffer;

import javax.annotation.Resource;

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
	
}
