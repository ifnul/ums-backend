package org.lnu.is.extractor.wave.type;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * WaveTypeParametersExtractor.
 * @author illay
 *
 */
@ParametersExtractor("waveTypeParametersExtractor")
public class WaveTypeParametersExtractor extends AbstractParametersExtractor<WaveType> {

	@Override
	protected Map<String, Object> getParameters(final WaveType entity, final  Map<String, Object> parameters) {
		addParameter(entity.getName(), "name", parameters);

		return parameters;
	}

}
