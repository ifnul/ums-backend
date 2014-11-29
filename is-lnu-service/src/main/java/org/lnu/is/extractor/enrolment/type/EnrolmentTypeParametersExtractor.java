package org.lnu.is.extractor.enrolment.type;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.domain.enrolment.EnrolmentType;
import org.lnu.is.extractor.AbstractParametersExtractor;
import org.springframework.stereotype.Component;

/**
 * Enrolment Type Parameters Extractor.
 * 
 * @author kushnir
 *
 */
@Component("enrolmentTypeParametersExtractor")
public class EnrolmentTypeParametersExtractor extends AbstractParametersExtractor<EnrolmentType> {

	@Override
	public Map<String, Object> getParameters(final EnrolmentType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getName(), "name", parameters);

		return parameters;
	}
}
