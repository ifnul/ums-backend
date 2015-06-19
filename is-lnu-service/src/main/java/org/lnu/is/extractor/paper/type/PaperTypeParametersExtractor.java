package org.lnu.is.extractor.paper.type;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.paper.type.PaperType;
import org.lnu.is.domain.paper.usage.PaperUsage;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Paper Type Parameters Extractor.
 * 
 * @author ivanursul
 *
 */
@ParametersExtractor("paperTypeParametersExtractor")
public class PaperTypeParametersExtractor extends AbstractParametersExtractor<PaperType> {

	@Resource(name = "paperUsageDao")
	private Dao<PaperUsage, PaperUsage, Long> paperUsageDao;
	
	@Override
	public Map<String, Object> getParameters(final PaperType entity, final Map<String, Object> parameters) {

		addParameter(entity.getName(), "name", parameters);
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getPaperUsage(), paperUsageDao, "paperUsage", parameters);

		return parameters;
	}

}
