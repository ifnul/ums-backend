package org.lnu.is.dao.dao.timeperiod;

import java.util.Collections;

import org.lnu.is.dao.AbstractDao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Repository;

/**
 * Time Period Dao.
 * @author ivanursul
 *
 */
@Repository("timePeriodDao")
public class DefaultTimePeriodDao extends AbstractDao<TimePeriod, Long> implements TimePeriodDao {

	@Override
	public Class<TimePeriod> getEntityClass() {
		return TimePeriod.class;
	}

	@Override
	public PagedResult<TimePeriod> getTimePeriods(final PagedSearch<TimePeriod> pagedSearch) {

		Queries query = Queries.FIND_TIME_PERIODS;

		pagedSearch.setClazz(getEntityClass());
		pagedSearch.setParameters(Collections.<String, Object>emptyMap());
		pagedSearch.setQuery(query);

		return search(pagedSearch);
	}

}
