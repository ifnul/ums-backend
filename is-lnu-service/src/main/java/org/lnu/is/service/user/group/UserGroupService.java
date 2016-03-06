package org.lnu.is.service.user.group;

import org.lnu.is.domain.user.group.UserGroupView;

import java.util.List;

/**
 * Service for serving user group related entities.
 * @author ivanursul
 *
 */
public interface UserGroupService {

	/**
	 * Method for getting user groups views.
	 * @param groupsIds
	 * @return List of UserGroupView.
	 */
	List<UserGroupView> getUserGroupsView(List<Long> groupsIds);
	
}
