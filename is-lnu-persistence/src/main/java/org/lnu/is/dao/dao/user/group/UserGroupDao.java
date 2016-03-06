package org.lnu.is.dao.dao.user.group;

import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.pagination.MultipleSearch;

import java.util.List;

/**
 * User Group Dao interface.
 * @author ivanursul
 *
 */
public interface UserGroupDao {

	/**
	 * Method for getting user groups.
	 * @param request request
	 * @param groupsIds  groupIds.
	 * @return collection of user groups.
	 */
	List<UserGroupView> getUserGroupViews(MultipleSearch<UserGroupView> request, List<Long> groupsIds);

}
