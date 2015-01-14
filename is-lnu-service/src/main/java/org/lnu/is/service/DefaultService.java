package org.lnu.is.service;

import java.util.Map;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.pagination.PagedSearch;
import org.springframework.beans.factory.annotation.Required;

/**
 * 
 * Default implementation of Service class.
 * NOTE: If you have some custom logic for any of methods below in this class,
 * you can easily extend this class, write some custom logic, and inject
 * it in services-context.xml.
 * 
 * @author ivanursul
 *
 * @param <ENTITY> Entity, Please see is-lnu-domain module.
 * @param <KEY> Key of corresponding 
 * @param <DAO>
 */
public class DefaultService<ENTITY, KEY, DAO extends Dao<ENTITY, KEY>> implements Service<ENTITY, KEY> {

	private DAO dao;
	
	private ParametersExtractor<ENTITY> parametersExtractor;
	
	@Override
	public void createEntity(final ENTITY entity) {
		dao.save(entity);
	}

	@Override
	public ENTITY getEntity(final KEY id) {
		return dao.findById(id);
	}

	@Override
	public void updateEntity(final ENTITY entity) {
		dao.update(entity);
	}

	@Override
	public void removeEntity(final ENTITY entity) {
		dao.delete(entity);
	}

	@Override
	public PagedResult<ENTITY> getEntities(final PagedSearch<ENTITY> search) {
		Map<String, Object> parameters = parametersExtractor.getParameters(search.getEntity());
		search.setParameters(parameters);
		
		return dao.getEntities(search);
	}

	@Required
	public void setDao(final DAO defaultDao) {
		this.dao = defaultDao;
	}

	public void setParametersExtractor(final ParametersExtractor<ENTITY> parametersExtractor) {
		this.parametersExtractor = parametersExtractor;
	}

	public DAO getDao() {
		return dao;
	}

	public ParametersExtractor<ENTITY> getParametersExtractor() {
		return parametersExtractor;
	}
	
}
