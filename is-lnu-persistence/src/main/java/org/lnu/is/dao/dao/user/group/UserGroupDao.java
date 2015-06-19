package org.lnu.is.dao.dao.user.group;

import java.util.List;

import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.group.UserGroupView;
import org.lnu.is.pagination.MultipleSearch;

/**
 * User Group Dao interface.
 * @author ivanursul
 *
 */
public interface UserGroupDao extends Dao<UserGroup, UserGroup, Long> {

	/**
	 * Method for getting user groups.
	 * @param request request
	 * @param groupsIds  groupIds.
	 * @return collection of user groups.
	 */
	List<UserGroupView> getUserGroupViews(MultipleSearch<UserGroupView> request, List<Long> groupsIds);

}
