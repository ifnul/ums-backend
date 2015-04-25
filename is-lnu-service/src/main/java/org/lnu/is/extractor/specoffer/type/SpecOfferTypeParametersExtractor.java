package org.lnu.is.extractor.specoffer.type;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Spec Offer Type Parameter extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specOfferTypeParametersExtractor")
public class SpecOfferTypeParametersExtractor extends AbstractParametersExtractor<SpecOfferType> {

	@Resource(name = "timePeriodDao")
	private Dao<TimePeriod, TimePeriod, Long> timePeriodDao;
	
	@Override
	public Map<String, Object> getParameters(final SpecOfferType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		addParameter(entity.getTimePeriod(), timePeriodDao, "timePeriod", parameters);
		
		return parameters;
	}

}
