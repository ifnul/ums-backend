package org.lnu.is.extractor.broadcasting;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.broadcasting.BroadcastingMessage;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Benefit Parameters Extactor.
 * @author ivanursul
 *
 */
@ParametersExtractor("broadcastingParametersExtractor")
public class BroadcastingParametersExtractor extends AbstractParametersExtractor<BroadcastingMessage> {

	@Override
	protected Map<String, Object> getParameters(final BroadcastingMessage entity, final Map<String, Object> parameters) {
		addParameter(entity.getTopic(), "topic", parameters);
		return parameters;
	}

}
