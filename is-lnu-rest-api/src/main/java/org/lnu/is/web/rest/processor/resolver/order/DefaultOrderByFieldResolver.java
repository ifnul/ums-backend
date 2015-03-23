package org.lnu.is.web.rest.processor.resolver.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.lnu.is.pagination.OrderBy;
import org.lnu.is.pagination.OrderByType;
import org.lnu.is.web.exception.InvalidOrderByException;
import org.springframework.stereotype.Component;

/**
 * Resolver for order by fields.
 * @author ivanursul
 *
 */
@Component("orderByFieldResolver")
public class DefaultOrderByFieldResolver implements OrderByFieldResolver {

	@Resource(name = "orderByPattern")
	private Pattern pattern;
	
	@Resource(name = "resourceReplacementMap")
	private Map<String, Map<String, String>> replacementMap;
	
	@Override
	public List<OrderBy> getOrdersBy(final String orderByParam, final Object resource) {
		List<OrderBy> orders = new ArrayList<>();
		String orderByParameter = orderByParam;
		
		
		if (orderByParameter != null  && !orderByParameter.isEmpty()) {
			Map<String, String> resourceReplacementMap = replacementMap.get(resource.getClass().getName());
			orderByParameter = orderByParameter.replaceAll("\\s", "");

			if (!pattern.matcher(orderByParameter).matches()) {
				throw new InvalidOrderByException(orderByParameter);
			}
			
			String[] ordersBy = orderByParameter.split(",");
			
			for (String order: ordersBy) {
				String[] orderByParts = order.split("-");
				
				// Splitting parts of order
				String fieldName = getOrderByFieldName(orderByParts, resourceReplacementMap);
				OrderByType type = OrderByType.resolve(orderByParts[1]);
				
				// Constructing new order
				OrderBy orderBy = new OrderBy(fieldName, type);
				orders.add(orderBy);
			}
		}
		
		return orders;
	}
	
	/**
	 * Method for getting valid order By Field Name.
	 * Please admit, that this method is responsible for
	 * replacing fields, that contains 'Id' part into
	 * entity fields.
	 * 
	 * @param orderByParts
	 * @param resourceReplacementMap
	 * @return handled field name.
	 */
	private String getOrderByFieldName(final String[] orderByParts, final Map<String, String> resourceReplacementMap) {
		String fieldName = orderByParts[0];
		
		if (resourceReplacementMap != null && resourceReplacementMap.containsKey(fieldName)) {
			fieldName = resourceReplacementMap.get(fieldName);
		}
		
		if (fieldName.contains("Id")) {
			throw new IllegalArgumentException("Fields that contains 'Id' are not supported for ordering.Please contact backend-dev team to fix this issue.");
		}
		
		return fieldName;
	}

	public void setPattern(final Pattern pattern) {
		this.pattern = pattern;
	}

	public void setReplacementMap(final Map<String, Map<String, String>> replacementMap) {
		this.replacementMap = replacementMap;
	}
	
}
