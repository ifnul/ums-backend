package org.lnu.is.service.specoffer;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specoffer.SpecOfferDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.extractor.ParametersExtractor;
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

	@Resource(name = "specOfferParametersExtractor")
	private ParametersExtractor<SpecOffer> parametersExtractor;
	
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
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch);
		pagedSearch.setParameters(parameters);
		
		return specOfferDao.getEntities(pagedSearch);
	}
	
}
