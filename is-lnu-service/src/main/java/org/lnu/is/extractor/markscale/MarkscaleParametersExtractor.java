package org.lnu.is.extractor.markscale;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.type.MarkscaleType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Markscale Parameters extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markscaleParametersExtractor")
public class MarkscaleParametersExtractor extends AbstractParametersExtractor<Markscale>  {

	@Resource(name = "markscaleTypeDao")
	private Dao<MarkscaleType, Long> markscaleTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final Markscale entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getMarkscaleType(), markscaleTypeDao, "markscaleType", parameters);

		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getMarkMin(), "markMin", parameters);
		addParameter(entity.getMarkMax(), "markMax", parameters);
		
		return parameters;
	}

}
