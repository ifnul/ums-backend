package org.lnu.is.extractor.education.form.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Edu Form Type Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("eduFormTypeParametersExtractor")
public class EducationFormTypeParametersExtractor extends AbstractParametersExtractor<EducationFormType> {

	@Override
	public Map<String, Object> getParameters(final EducationFormType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
