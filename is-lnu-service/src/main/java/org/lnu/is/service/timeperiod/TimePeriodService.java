package org.lnu.is.service.timeperiod;

import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.lnu.is.service.Service;

/**
 * Time Period service.
 * @author ivanursul
 *
 */
public interface TimePeriodService extends Service<TimePeriod> {

	/**
	 * Method for getting time periods.
	 * @param pagedSearch
	 * @return Time Period paged result.
	 */
	PagedResult<TimePeriod> getTimePeriods(PagedSearch<TimePeriod> pagedSearch);

}
