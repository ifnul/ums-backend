package org.lnu.is.extractor.reason;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * ReasonParametersExtractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("reasonParametersExtractor")
public class ReasonParametersExtractor extends AbstractParametersExtractor<Reason> {

	@Override
	public Map<String, Object> getParameters(final Reason entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
