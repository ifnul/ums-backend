package org.lnu.is.extractor.paper.usage;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Paper Type Parameters Extractor.
 * 
 * @author illay
 *
 */
@ParametersExtractor("paperUsageParametersExtractor")
public class PaperUsageParametersExtractor extends AbstractParametersExtractor<PaperUsage> {

	@Override
	public Map<String, Object> getParameters(final PaperUsage entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);

		return parameters;
	}

}
