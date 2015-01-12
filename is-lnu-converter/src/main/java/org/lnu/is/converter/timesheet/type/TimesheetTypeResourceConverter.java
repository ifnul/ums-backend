package org.lnu.is.converter.timesheet.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimesheetTypeResource;

/**
 * TimesheetType resource converter.
 * @author OlehZanevych
 *
 */
@Converter("timesheetTypeResourceConverter")
public class TimesheetTypeResourceConverter extends AbstractConverter<TimesheetTypeResource, TimeSheetType> {

	@Override
	public TimeSheetType convert(final TimesheetTypeResource source, final TimeSheetType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public TimeSheetType convert(final TimesheetTypeResource source) {
		return convert(source, new TimeSheetType());
	}

}
