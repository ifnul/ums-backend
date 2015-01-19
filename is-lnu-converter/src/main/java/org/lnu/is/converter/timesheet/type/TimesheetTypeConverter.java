package org.lnu.is.converter.timesheet.type;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.resource.timesheet.type.TimesheetTypeResource;

/**
 * TimesheetType converter.
 * @author OlehZanevych
 *
 */
@ResourceConverter("timesheetTypeConverter")
public class TimesheetTypeConverter extends AbstractConverter<TimeSheetType, TimesheetTypeResource> {

	@Override
	public TimesheetTypeResource convert(final TimeSheetType source, final TimesheetTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public TimesheetTypeResource convert(final TimeSheetType source) {
		return convert(source, new TimesheetTypeResource());
	}

}
