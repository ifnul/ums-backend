package org.lnu.is.converter.timeperiod.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.type.TimePeriodTypeResource;

/**
 * Time Period Type Resource Converter.
 * @author ivanursul
 *
 */
@Converter("timePeriodTypeResourceConverter")
public class TimePeriodTypeResourceConverter extends AbstractConverter<TimePeriodTypeResource, TimePeriodType> {

	@Override
	public TimePeriodType convert(final TimePeriodTypeResource source, final TimePeriodType target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public TimePeriodType convert(final TimePeriodTypeResource source) {
		return convert(source, new TimePeriodType());
	}

}
