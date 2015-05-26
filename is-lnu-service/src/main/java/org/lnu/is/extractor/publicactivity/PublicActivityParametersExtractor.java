package org.lnu.is.extractor.publicactivity;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Public activity parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("publicActivityParametersExtractor")
public class PublicActivityParametersExtractor extends AbstractParametersExtractor<PublicActivity> {

	@Resource(name = "publicActivityTypeDao")
	private Dao<PublicActivityType, Long> publicActivityTypeDao;
	
	@Resource(name = "timePeriodDao")
	private Dao<TimePeriod, Long> timePeriodDao;
	
	@Override
	protected Map<String, Object> getParameters(final PublicActivity entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getPublicActivityTypeType(), publicActivityTypeDao, "publicActivityType", parameters);
		addParameter(entity.getTimePeriod(), timePeriodDao, "timePeriod", parameters);
		
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getBegDate(), "begDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
