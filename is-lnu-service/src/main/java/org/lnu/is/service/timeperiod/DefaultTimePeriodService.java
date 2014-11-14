package org.lnu.is.service.timeperiod;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.timeperiod.TimePeriodDao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.ParametersExtractor;
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
	
	@Resource(name = "timePeriodParametersExtractor")
	private ParametersExtractor<TimePeriod> parametersExtractor;
	
	@Override
	public PagedResult<TimePeriod> getTimePeriods(final PagedSearch<TimePeriod> pagedSearch) {
		Map<String, Object> parameters = parametersExtractor.getParameters(pagedSearch.getEntity());
		pagedSearch.setParameters(parameters);
		
		return timePeriodDao.getEntities(pagedSearch);
	}

}
