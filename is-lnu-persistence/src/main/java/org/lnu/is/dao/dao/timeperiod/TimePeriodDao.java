package org.lnu.is.dao.dao.timeperiod;

import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;

/**
 * Interface of Time Period Dao.
 * @author ivanursul
 *
 */
public interface TimePeriodDao {
	
	/**
	 * Method for getting Time Periods.
	 * @param pagedSearch
	 * @return paged result.
	 */
	PagedResult<TimePeriod> getTimePeriods(PagedSearch<TimePeriod> pagedSearch);

}
