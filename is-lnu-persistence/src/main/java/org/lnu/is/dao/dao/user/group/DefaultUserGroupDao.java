package org.lnu.is.dao.dao.user.group;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.persistence.PersistenceManager;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.MultipleSearch;
import org.lnu.is.queries.Query;

import java.util.List;

/**
 * Default implementation of UserGroupDao.
 * @author ivanursul
 *
 */
public class DefaultUserGroupDao implements UserGroupDao {

	private PersistenceManager<UserGroup, Long> persistenceManager;

	private QueryBuilder<List<Long>> userGroupViewQueryBuilder;
	
	@Override
	public List<UserGroupView> getUserGroupViews(final MultipleSearch<UserGroupView> request, final List<Long> groupsIds) {
		MultiplePagedSearch<List<Long>> search = new MultiplePagedSearch<>();
		search.setEntity(groupsIds);
		String querySql = userGroupViewQueryBuilder.build(search);
		Query<UserGroupView> query = new Query<UserGroupView>(request.getClazz(), querySql, request.getParameters());
		return persistenceManager.getMultipleResult(query);
	}

	public void setUserGroupViewQueryBuilder(final QueryBuilder<List<Long>> userGroupViewQueryBuilder) {
		this.userGroupViewQueryBuilder = userGroupViewQueryBuilder;
	}

	public void setPersistenceManager(PersistenceManager<UserGroup, Long> persistenceManager) {
		this.persistenceManager = persistenceManager;
	}
}
