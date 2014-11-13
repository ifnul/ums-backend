package org.lnu.is.extractor.timeperiod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.timeperiod.TimePeriodDao;
import org.lnu.is.dao.dao.timeperiodtype.TimePeriodTypeDao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiodtype.TimePeriodType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Time Period Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("timePeriodParametersExtractor")
public class TimePeriodParametersExtractor implements ParametersExtractor<TimePeriod> {

	@Resource(name = "timePeriodDao")
	private TimePeriodDao timePeriodDao;
	
	@Resource(name = "timePeriodTypeDao")
	private TimePeriodTypeDao timePeriodTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final PagedSearch<TimePeriod> pagedSearch) {
		TimePeriod context = pagedSearch.getEntity();
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (context.getBegDate() != null) {
			parameters.put("begDate", context.getBegDate());
		}
		
		if (context.getEndDate() != null) {
			parameters.put("endDate", context.getEndDate());
		}
		
		if (context.getName() != null) {
			parameters.put("name", context.getName());
		}
		
		if (context.getNumValue() != null) {
			parameters.put("numValue", context.getNumValue());
		}
		
		if (context.getParent() != null) {
			TimePeriod parent = timePeriodDao.findById(context.getParent().getId());
			parameters.put("parent", parent);
		}
		
		if (context.getTimePeriodType() != null) {
			TimePeriodType timePeriodType = timePeriodTypeDao.findById(context.getTimePeriodType().getId());
			parameters.put("timePeriodType", timePeriodType);
		}
		
		return parameters;
	}

}
