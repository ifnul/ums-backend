package org.lnu.is.extractor.mark.scale.exchange;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.mark.scale.MarkScale;
import org.lnu.is.domain.mark.scale.exchange.MarkScaleExchange;
import org.lnu.is.domain.mark.scale.value.MarkScaleValue;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * MarkScale exchange parameters extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markScaleExchangeParametersExtractor")
public class MarkScaleExchangeParametersExtractor extends AbstractParametersExtractor<MarkScaleExchange>  {

	@Resource(name = "markScaleDao")
	private Dao<MarkScale, MarkScale, Long> markScaleDao;
	
	@Resource(name = "markScaleValueDao")
	private Dao<MarkScaleValue, MarkScaleValue, Long> markScaleValueDao;
	
	@Override
	public Map<String, Object> getParameters(final MarkScaleExchange entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getMarkScale(), markScaleDao, "markScale", parameters);
		
		addParameter(entity.getMarkScaleValue(), markScaleValueDao, "markScaleValue", parameters);
		
		addParameter(entity.getMarkScaleExchange(), markScaleDao, "markScaleExchange", parameters);
		
		addParameter(entity.getMarkScaleExchangeValue(), markScaleValueDao, "markScaleExchangeValue", parameters);

		addParameter(entity.getMarkMin(), "markMin", parameters);
		
		addParameter(entity.getMarkMax(), "markMax", parameters);
		
		addParameter(entity.getMarkExchange(), "markExchange", parameters);
		
		return parameters;
	}

}
