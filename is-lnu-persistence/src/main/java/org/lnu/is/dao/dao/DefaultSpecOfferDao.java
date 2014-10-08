package org.lnu.is.dao.dao;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Default implementation of specoffer table for
 * persistence layer.
 * @author ivanursul
 *
 */
@Repository("specOfferDao")
public class DefaultSpecOfferDao extends AbstractDao<SpecOffer, Long> implements SpecOfferDao {

	@Override
	public Class<SpecOffer> getEntityClass() {
		return SpecOffer.class;
	}

	@Override
	public PagedResult<SpecOffer> getSpecOffers(final PagedSearch<SpecOffer> pagedSearch) {

		Queries query = Queries.FIND_SPECOFFERS;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);

		return search(pagedSearch);
	}

}
