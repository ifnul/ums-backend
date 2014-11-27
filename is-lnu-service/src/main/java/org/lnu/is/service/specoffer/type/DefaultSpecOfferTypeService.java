package org.lnu.is.service.specoffer.type;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specoffer.type.SpecOfferTypeDao;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default Spec Offer Type Service.
 * @author ivanursul
 *
 */
@Service("specOfferTypeService")
public class DefaultSpecOfferTypeService implements SpecOfferTypeService {

	@Resource(name = "specOfferTypeDao")
	private SpecOfferTypeDao defaultDao;
	
	@Resource(name = "specOfferTypeParametersExtractor")
	private ParametersExtractor<SpecOfferType> parametersExtractor;
	
	@Override
	public PagedResult<SpecOfferType> getSpecOfferTypes(final PagedSearch<SpecOfferType> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return defaultDao.getEntities(pagedSearch);
	}

}
