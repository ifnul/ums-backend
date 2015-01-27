package org.lnu.is.extractor.employee.status;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.employee.status.EmployeeStatus;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Employee Status Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("employeeStatusParametersExtractor")
public class EmployeeStatusParametersExtractor extends AbstractParametersExtractor<EmployeeStatus> {

	@Override
	public Map<String, Object> getParameters(final EmployeeStatus entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
