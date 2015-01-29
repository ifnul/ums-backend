package org.lnu.is.domain.user;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OP;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.group.Group;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.role.UserRole;

/**
 * User entity.
 *
 * @author 
 */
@OP
@Entity
@Table(name = "q_op_user")
public class User extends Model implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "login")
    private String login;
    
    @Column(name = "title")
    private String title;

    @Column(name = "password")
    private String password;

    @Column(name = "begdate")
    private Date begDate;
    
    @Column(name = "enddate")
    private Date endDate;

    @OneToMany(mappedBy = "user")
    private List<UserGroup> userGroups;
    
    @OneToMany(mappedBy = "role")
    private List<UserRole> userRoles;
    
    @ManyToMany
    @JoinTable(name = "q_op_usergroup",
		joinColumns = { @JoinColumn(name = "user_id") },
		inverseJoinColumns = { @JoinColumn(name = "group_id") })
    private List<Group> groups;
    
	public List<Group> getGroups() {
		return groups;
	}

	public void setGroups(final List<Group> groups) {
		this.groups = groups;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	public List<UserGroup> getUserGroups() {
		return userGroups;
	}

	public void setUserGroups(final List<UserGroup> groups) {
		this.userGroups = groups;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(final List<UserRole> roles) {
		this.userRoles = roles;
	}

	public Date getBegDate() {
		return begDate;
	}

	public void setBegDate(final Date begDate) {
		this.begDate = begDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
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
		User other = (User) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "User [login=" + login + ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}
