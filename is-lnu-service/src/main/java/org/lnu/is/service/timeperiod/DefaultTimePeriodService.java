package org.lnu.is.service.timeperiod;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.timeperiod.TimePeriodDao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Service;

/**
 * Default Time Period Service.
 * @author ivanursul
 *
 */
@Service("timePeriodService")
public class DefaultTimePeriodService implements TimePeriodService {

	@Resource(name = "timePeriodDao")
	private TimePeriodDao timePeriodDao;
	
	@Override
	public PagedResult<TimePeriod> getTimePeriods(final PagedSearch<TimePeriod> pagedSearch) {
		return timePeriodDao.getTimePeriods(pagedSearch);
	}

}
