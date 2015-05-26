package org.lnu.is.extractor.employee.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.employee.type.EmployeeType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Employee Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("employeeTypeParametersExtractor")
public class EmployeeTypeParametersExtractor extends AbstractParametersExtractor<EmployeeType> {

	@Override
	public Map<String, Object> getParameters(final EmployeeType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
