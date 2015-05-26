package org.lnu.is.extractor.duty.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.duty.type.DutyType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Duty Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("dutyTypeParametersExtractor")
public class DutyTypeParametersExtractor extends AbstractParametersExtractor<DutyType> {

	@Override
	public Map<String, Object> getParameters(final DutyType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
