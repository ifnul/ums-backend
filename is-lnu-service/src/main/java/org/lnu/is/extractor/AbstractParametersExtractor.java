package org.lnu.is.extractor;

import java.util.Map;

import org.lnu.is.dao.Dao;
import org.lnu.is.domain.Model;

/**
 * Abstract parameters extractor with some operations.
 * @author ivanursul
 *
 * @param <T> Entity.
 */
public abstract class AbstractParametersExtractor<T> implements ParametersExtractor<T> {

	/**
	 * 
	 * Method for foreign key parameters.
	 * 
	 * @param entity
	 * @param dao
	 * @param parameterName
	 * @param parameters
	 */
	protected <E> void addParameter(final Model entity, final Dao<E, Long> dao, final String parameterName, final Map<String, Object> parameters) {
		
		if (entity != null) {
			E dbEntity = dao.findById(entity.getId());
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
