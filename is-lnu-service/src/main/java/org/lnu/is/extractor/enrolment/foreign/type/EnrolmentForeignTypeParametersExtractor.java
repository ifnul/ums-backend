package org.lnu.is.extractor.enrolment.foreign.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.enrolment.foreign.type.EnrolmentForeignType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * EnrolmentForeign Type Parameters Extractor.
 * 
 * @author OlehZanevych
 *
 */
@ParametersExtractor("enrolmentForeignTypeParametersExtractor")
public class EnrolmentForeignTypeParametersExtractor extends AbstractParametersExtractor<EnrolmentForeignType> {

	@Override
	public Map<String, Object> getParameters(final EnrolmentForeignType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
