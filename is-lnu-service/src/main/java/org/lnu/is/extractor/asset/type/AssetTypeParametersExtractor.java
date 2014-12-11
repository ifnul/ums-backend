package org.lnu.is.extractor.asset.type;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.domain.asset.AssetType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Asset Type paramters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("assetTypeParametersExtractor")
public class AssetTypeParametersExtractor extends AbstractParametersExtractor<AssetType> {

	@Override
	public Map<String, Object> getParameters(final AssetType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		return parameters;
	}

}
