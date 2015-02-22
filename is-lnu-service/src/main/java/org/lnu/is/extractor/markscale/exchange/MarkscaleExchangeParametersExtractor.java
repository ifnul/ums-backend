package org.lnu.is.extractor.markscale.exchange;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.markscale.Markscale;
import org.lnu.is.domain.markscale.exchange.MarkscaleExchange;
import org.lnu.is.domain.markscale.value.MarkscaleValue;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Markscale exchange parameters extractor.
 * @author OlehZanevych
 *
 */
@ParametersExtractor("markscaleExchangeParametersExtractor")
public class MarkscaleExchangeParametersExtractor extends AbstractParametersExtractor<MarkscaleExchange>  {

	@Resource(name = "markscaleDao")
	private Dao<Markscale, Long> markscaleDao;
	
	@Resource(name = "markscaleValueDao")
	private Dao<MarkscaleValue, Long> markscaleValueDao;
	
	@Override
	public Map<String, Object> getParameters(final MarkscaleExchange entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getMarkscale(), markscaleDao, "markscale", parameters);
		
		addParameter(entity.getMarkscaleValue(), markscaleValueDao, "markscaleValue", parameters);
		
		addParameter(entity.getMarkscaleExchange(), markscaleDao, "markscaleExchange", parameters);
		
		addParameter(entity.getMarkscaleExchangeValue(), markscaleValueDao, "markscaleExchangeValue", parameters);

		addParameter(entity.getMarkMin(), "markMin", parameters);
		
		addParameter(entity.getMarkMax(), "markMax", parameters);
		
		addParameter(entity.getMarkExchange(), "markExchange", parameters);
		
		return parameters;
	}

}
