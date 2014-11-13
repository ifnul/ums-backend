package org.lnu.is.service.specoffertype;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.specoffertype.SpecOfferTypeDao;
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
	
	@Override
	public PagedResult<SpecOfferType> getSpecOfferTypes(final PagedSearch<SpecOfferType> pagedSearch) {
		return specOfferTypeDao.getSpecOfferTypes(pagedSearch);
	}

}
