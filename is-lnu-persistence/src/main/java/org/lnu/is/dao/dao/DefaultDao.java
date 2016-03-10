package org.lnu.is.dao.dao;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.pagination.MultiplePagedQuerySearch;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.PagedResult;
import org.lnu.is.queries.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;


/**
 * Abstract implementation, that has
 * all methods for convenient work with entities.
 * @author ivanursul
 *
 * @param <ENTITY> Entity type.
 * @param <ENTITYLIST> Entity type or MultySearch.    
 * @param <KEY> Identifier class.
 */
public class DefaultDao<ENTITY extends InformationModel, ENTITYLIST, KEY> implements Dao<ENTITY, ENTITYLIST, KEY> {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultDao.class);
	
	private PersistenceManager<ENTITY, KEY> persistenceManager;
	
	private QueryBuilder<ENTITYLIST> queryBuilder;
	
	private Class<ENTITY> entityClass;
	
	@Override
	public ENTITY getEntityById(final KEY id) {
		LOG.info("Getting {}.entity wit id", getEntityClass().getSimpleName(), id);
		return persistenceManager.findById(getEntityClass(), id);
	}

	@Override
	public void save(final ENTITY entity) {
		LOG.info("Saving {}.entity: {}", getEntityClass().getSimpleName(), entity);
		persistenceManager.create(entity);
	}

	@Override
	public void update(final ENTITY entity) {
		LOG.info("Updating {}.entity with id: {}, {}", getEntityClass().getSimpleName(), entity.getId(), entity);
		persistenceManager.update(entity);
	}

	@Override
	public void delete(final ENTITY entity) {
		LOG.info("Removing {}.entity with id: {}, {}", getEntityClass().getSimpleName(), entity.getId(), entity);
		persistenceManager.remove(entity);
	}

	@Override
	public ENTITY getByUid(long uid) {
		String queryJpql = String.format("SELECT e FROM %s WHERE uid=:uid", getEntityClass().getSimpleName());
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("uid", uid);

		Query<ENTITY> query = new Query<>(getEntityClass(), queryJpql, params);
		return persistenceManager.getSingleResult(query);
	}


	@Override
	public ENTITY getByUidAndUap(long uid, String uapp) {
		String queryJpql = String.format("SELECT e FROM %s WHERE uid=:uid AND uapp=uapp", getEntityClass().getSimpleName());
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("uid", uid);
		params.put("uapp", uapp);

		Query<ENTITY> query = new Query<>(getEntityClass(), queryJpql, params);
		return persistenceManager.getSingleResult(query);
	}

	@Override
	public ENTITY getByUidOrUtidAndUap(long uid, String utid, String uapp) {
		String queryJpql = String.format("SELECT e FROM %s " +
				"WHERE uapp=uapp AND (" +
					"(uid IS NOT NULL AND uid=:uid) OR " +
					"(utid IS NOT NULL AND utid=:utid)" +
				")", getEntityClass().getSimpleName());
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("uid", uid);
		params.put("uapp", uapp);
		params.put("utid", utid);

		Query<ENTITY> query = new Query<>(getEntityClass(), queryJpql, params);
		return persistenceManager.getSingleResult(query);
	}

	@Override
	public ENTITY getByUtid(String utid) {
		String queryJpql = String.format("SELECT e FROM %s " +
				"WHERE utid=:utid", getEntityClass().getSimpleName());
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("utid", utid);

		Query<ENTITY> query = new Query<>(getEntityClass(), queryJpql, params);
		return persistenceManager.getSingleResult(query);
	}

	@Override
	public PagedResult<ENTITY> getEntities(final MultiplePagedSearch<ENTITYLIST> pagedSearch) {
		LOG.info("Getting paged result for {}: {}", getEntityClass().getSimpleName(), pagedSearch);
		
		String querySql = queryBuilder.build(pagedSearch);
		Query<ENTITY> queries = new Query<ENTITY>(getEntityClass(), querySql);
		
		MultiplePagedQuerySearch<ENTITY> pagedQuerySearch = new MultiplePagedQuerySearch<ENTITY>(queries, pagedSearch.getOffset(), 
				pagedSearch.getLimit(), pagedSearch.getParameters(), getEntityClass());

		return persistenceManager.search(pagedQuerySearch);
	}

	public ENTITY getSingleResult(Query<ENTITY> query) {
		return persistenceManager.getSingleResult(query);
	}

	public Class<ENTITY> getEntityClass() {
		return entityClass;
	}

	public PersistenceManager<ENTITY, KEY> getPersistenceManager() {
		return persistenceManager;
	}
	
	public QueryBuilder<ENTITYLIST> getQueryBuilder() {
		return queryBuilder;
	}

	public void setPersistenceManager(final PersistenceManager<ENTITY, KEY> persistenceManager) {
		this.persistenceManager = persistenceManager;
	}

	public void setQueryBuilder(final QueryBuilder<ENTITYLIST> queryBuilder) {
		this.queryBuilder = queryBuilder;
	}

	public void setEntityClass(final Class<ENTITY> entityClass) {
		this.entityClass = entityClass;
	}
	
}
