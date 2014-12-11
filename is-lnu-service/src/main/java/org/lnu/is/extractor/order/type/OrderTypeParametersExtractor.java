package org.lnu.is.extractor.order.type;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.order.OrderType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Order Type Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("orderTypeParametersExtractor")
public class OrderTypeParametersExtractor extends AbstractParametersExtractor<OrderType> {

	@Resource(name = "orderTypeDao")
	private Dao<OrderType, Long> orderTypeDao;
	
	@Override
	public Map<String, Object> getParameters(final OrderType entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		addParameter(entity.getAbbrName(), "abbrName", parameters);
		addParameter(entity.getName(), "name", parameters);
		
		addParameter(entity.getParent(), orderTypeDao, "parent", parameters);
		
		return parameters;
	}

}
