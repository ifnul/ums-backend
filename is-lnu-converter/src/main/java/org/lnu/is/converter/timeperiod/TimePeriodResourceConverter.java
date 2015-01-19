package org.lnu.is.converter.timeperiod;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.domain.timeperiod.TimePeriodType;
import org.lnu.is.resource.timeperiod.TimePeriodResource;

/**
 * Time Period Resource Converter.
 * @author ivanursul
 *
 */
@Converter("timePeriodResourceConverter")
public class TimePeriodResourceConverter extends AbstractConverter<TimePeriodResource, TimePeriod> {

	@Override
	public TimePeriod convert(final TimePeriodResource source, final TimePeriod target) {

		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setName(source.getName());
		target.setNumValue(source.getNumValue());
		
		if (source.getTimePeriodTypeId() != null) {
			TimePeriodType timePeriodType = new TimePeriodType();
			timePeriodType.setId(source.getTimePeriodTypeId());
		
			target.setTimePeriodType(timePeriodType);
		}
		
		if (source.getParentId() != null) {
			TimePeriod parent = new TimePeriod();
			parent.setId(source.getParentId());
			
			target.setParent(parent);
		}
		
		return target;
	}

	@Override
	public TimePeriod convert(final TimePeriodResource source) {
		return convert(source, new TimePeriod());
	}

}
