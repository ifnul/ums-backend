package org.lnu.is.facade.converter.timeperiod;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.timeperiod.TimePeriodResource;

/**
 * Time period converter.
 * @author ivanursul
 *
 */
@Converter("timePeriodConverter")
public class TimePeriodConverter extends AbstractConverter<TimePeriod, TimePeriodResource> {

	@Override
	public TimePeriodResource convert(final TimePeriod source, final TimePeriodResource target) {
		
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setName(source.getName());
		target.setNumValue(source.getNumValue());
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}

		if (source.getTimePeriodType() != null) {
			target.setTimePeriodTypeId(source.getTimePeriodType().getId());
		}
		
		return target;
	}

	@Override
	public TimePeriodResource convert(final TimePeriod source) {
		return convert(source, new TimePeriodResource());
	}

}
