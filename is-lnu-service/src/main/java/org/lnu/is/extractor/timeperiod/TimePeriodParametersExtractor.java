package org.lnu.is.extractor.timeperiod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Time Period Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("timePeriodParametersExtractor")
public class TimePeriodParametersExtractor extends AbstractParametersExtractor<TimePeriod> {

	@Resource(name = "timePeriodDao")
	private Dao<TimePeriod, Long> timePeriodDao;
	
	@Resource(name = "timePeriodTypeDao")
	private Dao<TimePeriodType, Long> timePeriodTypeDao;
	
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
