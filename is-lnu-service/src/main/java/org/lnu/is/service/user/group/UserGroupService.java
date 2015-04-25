package org.lnu.is.service.user.group;

import java.util.List;

import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.service.Service;

/**
 * Service for serving user group related entities.
 * @author ivanursul
 *
 */
public interface UserGroupService extends Service<UserGroup, UserGroup, Long> {

	/**
	 * Method for getting user groups views.
	 * @param groupsIds
	 * @return List of UserGroupView.
	 */
	List<UserGroupView> getUserGroupsView(List<Long> groupsIds);
	
}
