package org.lnu.is.domain.session;

import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.role.Role;
import org.lnu.is.domain.user.User;

import java.io.Serializable;
import java.util.List;

/**
 * Content for storing session details.
 * @author ivanursul
 *
 */
public class Session implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	private User user;
	private List<Role> roles;
	private List<Group> groups;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(final User user) {
		this.user = user;
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(final List<Role> roles) {
		this.roles = roles;
	}
	
	public List<Group> getGroups() {
		return groups;
	}
	
	public void setGroups(final List<Group> groups) {
		this.groups = groups;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Session other = (Session) obj;
		if (groups == null) {
			if (other.groups != null) {
				return false;
			}
		} else if (!groups.equals(other.groups)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!roles.equals(other.roles)) {
			return false;
		}
		if (user == null) {
			if (other.user != null) {
				return false;
			}
		} else if (!user.equals(other.user)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Session [name=" + name + ", user=" + user + ", roles=" + roles
				+ ", groups=" + groups + "]";
	}
	
}
