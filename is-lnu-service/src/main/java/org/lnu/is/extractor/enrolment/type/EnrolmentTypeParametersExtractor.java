package org.lnu.is.extractor.enrolment.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.enrolment.type.EnrolmentType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Enrolment Type Parameters Extractor.
 * 
 * @author kushnir
 *
 */
@ParametersExtractor("enrolmentTypeParametersExtractor")
public class EnrolmentTypeParametersExtractor extends AbstractParametersExtractor<EnrolmentType> {

	@Override
	public Map<String, Object> getParameters(final EnrolmentType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrname(), "abbrname", parameters);

		return parameters;
	}
}
