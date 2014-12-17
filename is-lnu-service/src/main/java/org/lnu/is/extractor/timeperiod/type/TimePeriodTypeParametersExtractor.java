package org.lnu.is.extractor.timeperiod.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Time Period Type Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("timePeriodTypeParametersExtractor")
public class TimePeriodTypeParametersExtractor extends AbstractParametersExtractor<TimePeriodType> {

	@Override
	public Map<String, Object> getParameters(final TimePeriodType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
