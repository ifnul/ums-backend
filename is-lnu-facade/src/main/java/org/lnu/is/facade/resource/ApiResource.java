package org.lnu.is.facade.resource;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Abstract class, that all resources need to implement.
 * @author ivanursul
 *
 */
public abstract class ApiResource {

	private Long id;
	private String note;
	private String crtUser;
	private String crtUserGroup;
    private Date createDate;
    private Date updateDate;
	private Long uid;
	private String utid;
	private String uapp;
	
	/**
	 * Method for getting unique uri for all resources.
	 * @return uri of string representation.
	 */
	public abstract String getUri();

	/**
	 * Method, that is used for getting uri for list(multiple resources).
	 * @return root uri.
	 */
	@JsonIgnore
	public abstract String getRootUri();
	
	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getNote() {
		return note;
	}

	public void setNote(final String note) {
		this.note = note;
	}

	public String getCrtUser() {
		return crtUser;
	}

	public void setCrtUser(final String crtUser) {
		this.crtUser = crtUser;
	}

	public String getCrtUserGroup() {
		return crtUserGroup;
	}

	public void setCrtUserGroup(final String crtUserGroup) {
		this.crtUserGroup = crtUserGroup;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(final Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(final Date updateDate) {
		this.updateDate = updateDate;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(final Long uid) {
		this.uid = uid;
	}

	public String getUtid() {
		return utid;
	}

	public void setUtid(final String utid) {
		this.utid = utid;
	}

	public String getUapp() {
		return uapp;
	}

	public void setUapp(final String uapp) {
		this.uapp = uapp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((crtUser == null) ? 0 : crtUser.hashCode());
		result = prime * result
				+ ((crtUserGroup == null) ? 0 : crtUserGroup.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((uapp == null) ? 0 : uapp.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result
				+ ((updateDate == null) ? 0 : updateDate.hashCode());
		result = prime * result + ((utid == null) ? 0 : utid.hashCode());
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
		ApiResource other = (ApiResource) obj;
		if (createDate == null) {
			if (other.createDate != null) {
				return false;
			}
		} else if (!createDate.equals(other.createDate)) {
			return false;
		}
		if (crtUser == null) {
			if (other.crtUser != null) {
				return false;
			}
		} else if (!crtUser.equals(other.crtUser)) {
			return false;
		}
		if (crtUserGroup == null) {
			if (other.crtUserGroup != null) {
				return false;
			}
		} else if (!crtUserGroup.equals(other.crtUserGroup)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (note == null) {
			if (other.note != null) {
				return false;
			}
		} else if (!note.equals(other.note)) {
			return false;
		}
		if (uapp == null) {
			if (other.uapp != null) {
				return false;
			}
		} else if (!uapp.equals(other.uapp)) {
			return false;
		}
		if (uid == null) {
			if (other.uid != null) {
				return false;
			}
		} else if (!uid.equals(other.uid)) {
			return false;
		}
		if (updateDate == null) {
			if (other.updateDate != null) {
				return false;
			}
		} else if (!updateDate.equals(other.updateDate)) {
			return false;
		}
		if (utid == null) {
			if (other.utid != null) {
				return false;
			}
		} else if (!utid.equals(other.utid)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ApiResource [id=" + id + ", note=" + note + ", crtUser="
				+ crtUser + ", crtUserGroup=" + crtUserGroup + ", createDate="
				+ createDate + ", updateDate=" + updateDate + ", uid=" + uid
				+ ", utid=" + utid + ", uapp=" + uapp + "]";
	}
	
}
