package org.lnu.is.extractor.eduformtype;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Edu Form Type Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("eduFormTypeParametersExtractor")
public class EduFormTypeParametersExtractor extends AbstractParametersExtractor<EduFormType> {

	@Override
	public Map<String, Object> getParameters(final EduFormType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
