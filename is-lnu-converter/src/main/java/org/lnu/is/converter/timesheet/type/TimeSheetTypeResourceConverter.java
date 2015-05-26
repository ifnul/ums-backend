package org.lnu.is.converter.timesheet.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timesheet.type.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimeSheetTypeResource;

/**
 * TimesheetType resource converter.
 * @author OlehZanevych
 *
 */
@Converter("timeSheetTypeResourceConverter")
public class TimeSheetTypeResourceConverter extends AbstractConverter<TimeSheetTypeResource, TimeSheetType> {

	@Override
	public TimeSheetType convert(final TimeSheetTypeResource source, final TimeSheetType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public TimeSheetType convert(final TimeSheetTypeResource source) {
		return convert(source, new TimeSheetType());
	}

}
