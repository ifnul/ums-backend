package org.lnu.is.extractor.enrolment.statustype;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.enrolment.EnrolmentStatusType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Enrolment Status Type ParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("enrolmentStatusTypeParametersExtractor")
public class EnrolmentStatusTypeParametersExtractor extends AbstractParametersExtractor<EnrolmentStatusType> {

	@Override
	public Map<String, Object> getParameters(final EnrolmentStatusType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getDescription(), "description", parameters);
		
		return parameters;
	}

}
