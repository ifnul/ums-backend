package org.lnu.is.extractor.mark.scale;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.type.MarkScaleType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * MarkScale Parameters extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markScaleParametersExtractor")
public class MarkScaleParametersExtractor extends AbstractParametersExtractor<MarkScale>  {

	@Resource(name = "markScaleTypeDao")
	private Dao<MarkScaleType, Long> markScaleTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final MarkScale entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getMarkScaleType(), markScaleTypeDao, "markScaleType", parameters);

		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getMarkMin(), "markMin", parameters);
		addParameter(entity.getMarkMax(), "markMax", parameters);
		
		return parameters;
	}

}
