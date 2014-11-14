package org.lnu.is.extractor.timeperiod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.timeperiod.TimePeriodDao;
import org.lnu.is.dao.dao.timeperiodtype.TimePeriodTypeDao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Time Period Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("timePeriodParametersExtractor")
public class TimePeriodParametersExtractor extends AbstractParametersExtractor<TimePeriod> {

	@Resource(name = "timePeriodDao")
	private TimePeriodDao timePeriodDao;
	
	@Resource(name = "timePeriodTypeDao")
	private TimePeriodTypeDao timePeriodTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final TimePeriod entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getNumValue(), "numValue", parameters);

		addParameter(entity.getParent(), timePeriodDao, "parent", parameters);
		addParameter(entity.getTimePeriodType(), timePeriodTypeDao, "timePeriodType", parameters);
		
		return parameters;
	}

}
