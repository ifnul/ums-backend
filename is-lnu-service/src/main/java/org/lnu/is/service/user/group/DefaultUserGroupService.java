package org.lnu.is.service.user.group;

import org.lnu.is.dao.dao.user.group.UserGroupDao;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.MultipleSearch;

import java.util.List;
import java.util.Map;

/**
 * Default User Group Service.
 * @author ivanursul
 *
 */
public class DefaultUserGroupService implements UserGroupService  {

	private UserGroupDao dao;

	private ParametersExtractor<List<Long>> userGroupViewsParametersExtractor;
	
	@Override
	public List<UserGroupView> getUserGroupsView(final List<Long> groupsIds) {
		Map<String, Object> parameters = userGroupViewsParametersExtractor.getParameters(groupsIds);
		MultipleSearch<UserGroupView> request = new MultipleSearch<UserGroupView>(parameters, UserGroupView.class);
		return dao.getUserGroupViews(request, groupsIds);
	}

	public void setUserGroupViewsParametersExtractor(final ParametersExtractor<List<Long>> userGroupViewsParametersExtractor) {
		this.userGroupViewsParametersExtractor = userGroupViewsParametersExtractor;
	}

	public void setDao(UserGroupDao dao) {
		this.dao = dao;
	}
}
