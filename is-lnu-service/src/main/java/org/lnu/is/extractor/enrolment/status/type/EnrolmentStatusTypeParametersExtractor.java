package org.lnu.is.extractor.enrolment.status.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Enrolment Status Type ParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("enrolmentStatusTypeParametersExtractor")
public class EnrolmentStatusTypeParametersExtractor extends AbstractParametersExtractor<EnrolmentStatusType> {

	@Override
	public Map<String, Object> getParameters(final EnrolmentStatusType entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getDescription(), "description", parameters);
		
		return parameters;
	}

}
