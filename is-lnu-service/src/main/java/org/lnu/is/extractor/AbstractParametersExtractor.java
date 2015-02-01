package org.lnu.is.extractor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.common.RowStatus;
import org.lnu.is.security.service.SessionService;

/**
 * Abstract parameters extractor with some operations.
 * @author ivanursul
 *
 * @param <T> Entity.
 */
public abstract class AbstractParametersExtractor<T> implements ParametersExtractor<T> {

	@Resource(name = "sessionService")
	private SessionService sessionService;

	//TODO : Change to @Value annotation and remove bean from context.
	@Resource(name = "activeFiltering")
	private Boolean active;
	
	@Resource(name = "securityFiltering")
	private Boolean security;
	
	@Override
	public Map<String, Object> getParameters(final T entity) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (active) {
			parameters.put("status", RowStatus.ACTIVE);
		}

		if (security) {
			List<String> groups = sessionService.getGroups();
			parameters.put("userGroups", groups);
		}
		
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
	 * @param entity
	 * @param parameterName
	 * @param parameters
	 */
	protected void addParameter(final Object entity, final String parameterName, final Map<String, Object> parameters) {
		
		if (entity != null) {
			parameters.put(parameterName, entity);
		}
		
	}

	/**
	 * Method for simple fields.
	 * @param entity
	 * @param parameterName
	 * @param parameters
	 */
	protected void addParameter(final List<?> entity, final String parameterName, final Map<String, Object> parameters) {
		
		if (entity != null && !entity.isEmpty()) {
			parameters.put(parameterName, entity);
		}
		
	}

	public void setSessionService(final SessionService sessionService) {
		this.sessionService = sessionService;
	}

	public void setActive(final Boolean active) {
		this.active = active;
	}

	public void setSecurity(final Boolean security) {
		this.security = security;
	}
	
}
