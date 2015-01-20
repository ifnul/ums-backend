package org.lnu.is.domain.group;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.domain.Model;

/**
 * Entity for storing groups of users.
 * 
 * @author ivanursul
 *
 */
@Entity
@Table(name = "q_op_group")
public class Group extends Model {
	private static final long serialVersionUID = 1L;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String password;

	public String getTitle() {
		return title;
	}

	public void setTitle(final String title) {
		this.title = title;
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
		int result = super.hashCode();
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Group other = (Group) obj;
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!title.equals(other.title)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Group [title=" + title + ", password=" + password + "]";
	}
	
}
