package org.lnu.is.extractor.eduformtype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.stereotype.Component;

/**
 * Edu Form Type Parameters Extractor.
 * @author ivanursul
 *
 */
@Component("eduFormTypeParametersExtractor")
public class EduFormTypeParametersExtractor implements ParametersExtractor<EduFormType> {

	@Override
	public Map<String, Object> getParameters(final PagedSearch<EduFormType> pagedSearch) {
		EduFormType entity = new EduFormType();
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (entity.getName() != null) {
			parameters.put("name", entity.getName());
		}
		
		return parameters;
	}

}
