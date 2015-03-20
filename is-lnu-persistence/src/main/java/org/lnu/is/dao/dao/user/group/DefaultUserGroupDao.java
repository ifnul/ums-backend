package org.lnu.is.dao.dao.user.group;

import java.util.List;

import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.dao.dao.DefaultDao;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.pagination.MultiplePagedSearch;
import org.lnu.is.pagination.MultipleSearch;
import org.lnu.is.queries.Query;

/**
 * Default implementation of UserGroupDao.
 * @author ivanursul
 *
 */
public class DefaultUserGroupDao extends DefaultDao<UserGroup, Long> implements UserGroupDao {

	private QueryBuilder<List<Long>> userGroupViewQueryBuilder;
	
	@Override
	public List<UserGroupView> getUserGroupViews(final MultipleSearch<UserGroupView> request, final List<Long> groupsIds) {
		MultiplePagedSearch<List<Long>> search = new MultiplePagedSearch<>();
		search.setEntity(groupsIds);
		String querySql = userGroupViewQueryBuilder.build(search);
		Query<UserGroupView> query = new Query<UserGroupView>(request.getClazz(), querySql, request.getParameters());
		return getPersistenceManager().getMultipleResult(query);
	}

	public void setUserGroupViewQueryBuilder(final QueryBuilder<List<Long>> userGroupViewQueryBuilder) {
		this.userGroupViewQueryBuilder = userGroupViewQueryBuilder;
	}

}
