package org.lnu.is.service.specoffer;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.SpecOfferDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
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

	@Override
	public void createSpecOffer(final SpecOffer specOffer) {
		specOfferDao.save(specOffer);
	}

	@Override
	public SpecOffer getSpecOffer(final Long id) {
		return specOfferDao.findById(id);
	}

	@Override
	public void updateSpecOffer(final SpecOffer specOffer) {
		specOfferDao.update(specOffer);
	}

	@Override
	public void removeSpecOffer(final SpecOffer specOffer) {
		specOfferDao.delete(specOffer);
	}

	@Override
	public PagedResult<SpecOffer> getSpecOffers(final PagedSearch<SpecOffer> pagedSearch) {
		return specOfferDao.getSpecOffers(pagedSearch);
	}
	
}
