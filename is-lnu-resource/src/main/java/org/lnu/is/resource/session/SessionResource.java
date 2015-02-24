package org.lnu.is.resource.session;

import java.util.List;


/**
 * Session Resource class.
 * @author ivanursul
 *
 */
public class SessionResource {

	private String login;
	private List<String> roles;
	private List<String> groups;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(final String login) {
		this.login = login;
	}
	
	public List<String> getRoles() {
		return roles;
	}
	
	public void setRoles(final List<String> roles) {
		this.roles = roles;
	}
	
	public List<String> getGroups() {
		return groups;
	}
	
	public void setGroups(final List<String> groups) {
		this.groups = groups;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groups == null) ? 0 : groups.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
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
		SessionResource other = (SessionResource) obj;
		if (groups == null) {
			if (other.groups != null) {
				return false;
			}
		} else if (!groups.equals(other.groups)) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (roles == null) {
			if (other.roles != null) {
				return false;
			}
		} else if (!roles.equals(other.roles)) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "SessionResource [login=" + login + ", roles=" + roles
				+ ", groups=" + groups + "]";
	}

}
