package org.lnu.is.extractor.subject.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * SubjectTypeParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("subjectTypeParametersExtractor")
public class SubjectTypeParametersExtractor extends AbstractParametersExtractor<SubjectType> {

	@Override
	public Map<String, Object> getParameters(final SubjectType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
