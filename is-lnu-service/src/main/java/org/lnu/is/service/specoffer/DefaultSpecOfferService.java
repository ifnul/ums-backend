package org.lnu.is.service.specoffer;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.SpecOfferDao;
import org.springframework.stereotype.Service;

/**
 * Default implementation of specoffer
 * functionality for service layer.
 * @author ivanursul
 *
 */
@Service("specOfferService")
public class DefaultSpecOfferService implements SpecOfferService {

	@Resource(name = "specOfferDao")
	private SpecOfferDao specOfferDao;
	
}
