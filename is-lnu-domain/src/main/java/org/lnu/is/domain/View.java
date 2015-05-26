package org.lnu.is.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.lnu.is.domain.common.RowStatus;

/**
 * View Entity.
 * @author ivanursul
 *
 */
@MappedSuperclass
public class View {
	
	@Id
	private Long id;
	
	@Type(type = "org.lnu.is.dao.persistence.enumtype.PGEnumUserType",
			parameters = {
						@Parameter(
							name = "enumClassName", 
							value = "org.lnu.is.domain.common.RowStatus"
								)
						})
		@Column(name = "status", columnDefinition = "q_en_row_status")
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

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actual == null) ? 0 : actual.hashCode());
		result = prime * result
				+ ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((crtUser == null) ? 0 : crtUser.hashCode());
		result = prime * result
				+ ((crtUserGroup == null) ? 0 : crtUserGroup.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((note == null) ? 0 : note.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result
				+ ((updateDate == null) ? 0 : updateDate.hashCode());
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
		View other = (View) obj;
		if (actual == null) {
			if (other.actual != null) {
				return false;
			}
		} else if (!actual.equals(other.actual)) {
			return false;
		}
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
		if (status != other.status) {
			return false;
		}
		if (updateDate == null) {
			if (other.updateDate != null) {
				return false;
			}
		} else if (!updateDate.equals(other.updateDate)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "View [id=" + id + ", status=" + status + ", actual=" + actual
				+ ", note=" + note + ", crtUser=" + crtUser + ", crtUserGroup="
				+ crtUserGroup + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}
	
}
