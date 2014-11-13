package org.lnu.is.dao.dao.specoffertype;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default Spec Offer Type Dao.
 * @author ivanursul
 *
 */
@Repository("specOfferTypeDao")
public class DefaultSpecOfferTypeDao extends AbstractDao<SpecOfferType, Long> implements SpecOfferTypeDao {

	@Override
	public Class<SpecOfferType> getEntityClass() {
		return SpecOfferType.class;
	}

	@Override
	public PagedResult<SpecOfferType> getSpecOfferTypes(final PagedSearch<SpecOfferType> pagedSearch) {
		
		Queries query = Queries.FIND_SPECOFFER_TYPES;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);
		
		return search(pagedSearch);
	}

}
