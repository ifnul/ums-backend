package org.lnu.is.extractor.timesheet.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.timesheettype.TimeSheetType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * TimesheetTypeParametersExtractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("timeSheetTypeParametersExtractor")
public class TimeSheetTypeParametersExtractor extends AbstractParametersExtractor<TimeSheetType> {

	@Override
	public Map<String, Object> getParameters(final TimeSheetType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
