package org.lnu.is.extractor.eduformtype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Edu Form Type Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("eduFormTypeParametersExtractor")
public class EduFormTypeParametersExtractor extends AbstractParametersExtractor<EduFormType> {

	@Override
	public Map<String, Object> getParameters(final EduFormType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
