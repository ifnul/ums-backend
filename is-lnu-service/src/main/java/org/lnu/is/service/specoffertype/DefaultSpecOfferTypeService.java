package org.lnu.is.service.specoffertype;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specoffertype.SpecOfferTypeDao;
import org.lnu.is.dao.extractor.ParametersExtractor;
import org.lnu.is.domain.specoffertype.SpecOfferType;
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
	private SpecOfferTypeDao specOfferTypeDao;
	
	@Resource(name = "specOfferTypeParametersExtractor")
	private ParametersExtractor<SpecOfferType> parametersExtractor;
	
	@Override
	public PagedResult<SpecOfferType> getSpecOfferTypes(final PagedSearch<SpecOfferType> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch);
		pagedSearch.setParameters(parameters);
		
		return specOfferTypeDao.getEntities(pagedSearch);
	}

}
