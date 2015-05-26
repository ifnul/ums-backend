package org.lnu.is.pagination;

/**
 * Enum for storing order By types.
 * @author ivanursul
 *
 */
public enum OrderByType {
	DESC,
	ASC;

	/**
	 * Method for getting required orderByType by name.
	 * @param orderByType orderByType
	 * @return ready OrderByType.
	 */
	public static OrderByType resolve(final String orderByType) {
		OrderByType result = null;
		
		if (orderByType != null) {
			for (OrderByType type: OrderByType.values()) {
				if (orderByType.toLowerCase().equals(type.name().toLowerCase())) {
					result = type;
					break;
				}
			}
		}
		
		return result;
	}
}
