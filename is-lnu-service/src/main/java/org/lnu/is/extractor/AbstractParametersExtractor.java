package org.lnu.is.extractor;

import java.util.HashMap;
import java.util.Map;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.common.RowStatus;

/**
 * Abstract parameters extractor with some operations.
 * @author ivanursul
 *
 * @param <T> Entity.
 */
public abstract class AbstractParametersExtractor<T> implements ParametersExtractor<T> {

	
	@Override
	public Map<String, Object> getParameters(final T entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		parameters.put("status", RowStatus.ACTIVE);
		
		return getParameters(entity, parameters);
	}

	/**
	 * Template method for method above(getParameters(entity).
	 * @param entity
	 * @param parameters
	 * @return map.
	 */
	protected abstract Map<String, Object> getParameters(T entity, Map<String, Object> parameters);

	/**
	 * 
	 * Method for foreign key parameters.
	 * 
	 * @param entity
	 * @param dao
	 * @param parameterName
	 * @param parameters
	 */
	protected <E extends Model> void addParameter(final E entity, final Dao<E, Long> dao, final String parameterName, final Map<String, Object> parameters) {
		
		if (entity != null) {
			E dbEntity = dao.getEntityById(entity.getId());
			parameters.put(parameterName, dbEntity);
		}
	}
	
	/**
	 * Method for simple fields.
	 * @param parameter
	 * @param parameterName
	 * @param parameters
	 */
	protected void addParameter(final Object parameter, final String parameterName, final Map<String, Object> parameters) {
		
		if (parameter != null) {
			parameters.put(parameterName, parameter);
		}
		
	}
}
