package org.lnu.is.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.lnu.is.domain.common.RowStatus;

/**
 * Common model for all entities.
 * I want to emphasize about getters and setters
 * for date- related fields.A standart approach 
 * of writing getters and setters is that you do
 * something like this:
 *  
 *  public Date getCreateDate() {
 *       return createDate;
 *  }
 *	
 *  public void setCreateDate(final Date createDate) {
 *      this.createDate = createDate;
 *  }
 *  
 *  But in this case we do it with instantiating a new
 *  object, because of mutable object Date.
 *  More information about this approach you can find
 *  by googling findbug error "EI_EXPOSE_REP".
 *  
 * @author ivanursul
 *
 */
@MappedSuperclass
public abstract class Model implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private RowStatus status;
	
	@Column(name = "actual")
	private Integer actual;
	
	@Column(name = "note")
	private String note;
	
	@Column(name = "crtuser")
	private String crtUser;
	
	@Column(name = "crtusergroup")
	private String crtUserGroup;
    
	@Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;
    	
	@Column(name = "uid")
	private Long uid;
	
	@Column(name = "utid")
	private String utid;
	
	@Column(name = "uapp")
	private String uapp;
    
    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
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

	public RowStatus getStatus() {
		return status;
	}

	public void setStatus(final RowStatus status) {
		this.status = status;
	}

	public Integer getActual() {
		return actual;
	}

	public void setActual(final Integer actual) {
		this.actual = actual;
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
		result = prime * result + ((actual == null) ? 0 : actual.hashCode());
		result = prime * result + ((crtUser == null) ? 0 : crtUser.hashCode());
		result = prime * result
				+ ((crtUserGroup == null) ? 0 : crtUserGroup.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((uapp == null) ? 0 : uapp.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		Model other = (Model) obj;
		if (actual == null) {
			if (other.actual != null) {
				return false;
			}
		} else if (!actual.equals(other.actual)) {
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
		if (status != other.status) {
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
		return "Model [id=" + id + ", status=" + status + ", actual=" + actual
				+ ", note=" + note + ", crtUser=" + crtUser + ", crtUserGroup="
				+ crtUserGroup + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", uid=" + uid + ", utid=" + utid + ", uapp="
				+ uapp + "]";
	}

}
