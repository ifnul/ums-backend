package org.lnu.is.converter.timeperiod.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.type.TimePeriodTypeResource;

/**
 * Time Period Type Converter.
 * @author ivanursul
 *
 */
@Converter("timePeriodTypeConverter")
public class TimePeriodTypeConverter extends AbstractConverter<TimePeriodType, TimePeriodTypeResource> {

	@Override
	public TimePeriodTypeResource convert(final TimePeriodType source, final TimePeriodTypeResource target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public TimePeriodTypeResource convert(final TimePeriodType source) {
		return convert(source, new TimePeriodTypeResource());
	}

}
