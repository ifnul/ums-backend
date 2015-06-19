package org.lnu.is.service.user.group;

import java.util.List;
import java.util.Map;

import org.lnu.is.dao.dao.user.group.UserGroupDao;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.extractor.ParametersExtractor;
import org.lnu.is.pagination.MultipleSearch;
import org.lnu.is.service.DefaultService;

/**
 * Default User Group Service.
 * @author ivanursul
 *
 */
public class DefaultUserGroupService extends DefaultService<UserGroup, UserGroup, Long, UserGroupDao> implements UserGroupService  {

	private ParametersExtractor<List<Long>> userGroupViewsParametersExtractor;
	
	@Override
	public List<UserGroupView> getUserGroupsView(final List<Long> groupsIds) {
		Map<String, Object> parameters = userGroupViewsParametersExtractor.getParameters(groupsIds);
		MultipleSearch<UserGroupView> request = new MultipleSearch<UserGroupView>(parameters, UserGroupView.class);
		return getDao().getUserGroupViews(request, groupsIds);
	}

	public void setUserGroupViewsParametersExtractor(final ParametersExtractor<List<Long>> userGroupViewsParametersExtractor) {
		this.userGroupViewsParametersExtractor = userGroupViewsParametersExtractor;
	}

}
