package org.lnu.is.extractor.salary.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.salary.type.SalaryType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * SalaryTypeParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("salaryTypeParametersExtractor")
public class SalaryTypeParametersExtractor extends AbstractParametersExtractor<SalaryType> {

	@Override
	public Map<String, Object> getParameters(final SalaryType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
