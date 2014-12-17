package org.lnu.is.extractor.asset.state;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.asset.AssetState;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Asset state parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("assetStateParametersExtractor")
public class AssetStateParametersExtractor extends AbstractParametersExtractor<AssetState> {

	@Override
	public Map<String, Object> getParameters(final AssetState entity, final Map<String, Object> parameters) {
		addParameter(entity.getName(), "name", parameters);
		return parameters;
	}

}
