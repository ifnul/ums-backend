package org.lnu.is.extractor.markscale.value;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Markscale value parameters extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markscaleValueParametersExtractor")
public class MarkscaleValueParametersExtractor extends AbstractParametersExtractor<MarkscaleValue>  {

	@Resource(name = "markscaleDao")
	private Dao<Markscale, Long> markscaleDao;
	
	@Override
	public Map<String, Object> getParameters(final MarkscaleValue entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getMarkscale(), markscaleDao, "markscale", parameters);

		addParameter(entity.getStrValue(), "strValue", parameters);
		
		return parameters;
	}

}
