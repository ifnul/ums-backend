package org.lnu.is.converter.timesheet.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timesheet.type.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimeSheetTypeResource;

/**
 * TimesheetType converter.
 * @author OlehZanevych
 *
 */
@Converter("timeSheetTypeConverter")
public class TimeSheetTypeConverter extends AbstractConverter<TimeSheetType, TimeSheetTypeResource> {

	@Override
	public TimeSheetTypeResource convert(final TimeSheetType source, final TimeSheetTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public TimeSheetTypeResource convert(final TimeSheetType source) {
		return convert(source, new TimeSheetTypeResource());
	}

}
