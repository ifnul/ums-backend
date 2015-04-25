package org.lnu.is.extractor.mark.scale.value;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * MarkScale value parameters extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markScaleValueParametersExtractor")
public class MarkScaleValueParametersExtractor extends AbstractParametersExtractor<MarkScaleValue>  {

	@Resource(name = "markScaleDao")
	private Dao<MarkScale, MarkScale, Long> markScaleDao;
	
	@Override
	public Map<String, Object> getParameters(final MarkScaleValue entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getMarkScale(), markScaleDao, "markScale", parameters);

		addParameter(entity.getStrValue(), "strValue", parameters);
		
		return parameters;
	}

}
