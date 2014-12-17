package org.lnu.is.extractor.asset.status;

import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.asset.AssetStatus;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Asset status parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("assetStatusParametersExtractor")
public class AssetStatusParametersExtractor extends AbstractParametersExtractor<AssetStatus> {

	@Override
	public Map<String, Object> getParameters(final AssetStatus entity, final Map<String, Object> parameters) {
		addParameter(entity.getName(), "name", parameters);
		return parameters;
	}

}
