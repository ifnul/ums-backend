package org.lnu.is.domain.user.group;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.domain.View;

/**
 * View for more convenient work with q_op_usergroup table.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "v_op_user_groups")
public class UserGroupView extends View {

	@Column(name = "group_id")
	private Long groupId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "group_title")
	private String groupTitle;
	
	@Column(name = "user_email")
	private String userEmail;

	public Long getGroupId() {
		return groupId;
	}

	public void setGroupId(final Long groupId) {
		this.groupId = groupId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(final Long userId) {
		this.userId = userId;
	}

	public String getGroupTitle() {
		return groupTitle;
	}

	public void setGroupTitle(final String groupTitle) {
		this.groupTitle = groupTitle;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(final String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result
				+ ((groupTitle == null) ? 0 : groupTitle.hashCode());
		result = prime * result
				+ ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		UserGroupView other = (UserGroupView) obj;
		if (groupId == null) {
			if (other.groupId != null) {
				return false;
			}
		} else if (!groupId.equals(other.groupId)) {
			return false;
		}
		if (groupTitle == null) {
			if (other.groupTitle != null) {
				return false;
			}
		} else if (!groupTitle.equals(other.groupTitle)) {
			return false;
		}
		if (userEmail == null) {
			if (other.userEmail != null) {
				return false;
			}
		} else if (!userEmail.equals(other.userEmail)) {
			return false;
		}
		if (userId == null) {
			if (other.userId != null) {
				return false;
			}
		} else if (!userId.equals(other.userId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "UserGroupView [groupId=" + groupId + ", userId=" + userId
				+ ", groupTitle=" + groupTitle + ", userEmail=" + userEmail
				+ "]";
	}
	
}
