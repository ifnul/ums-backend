package org.lnu.is.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Second layer model, with additional identifier fields.
 * @author ivanursul
 *
 */
@MappedSuperclass
public abstract class InformationModel extends EntityModel implements Serializable {
    private static final long serialVersionUID = 1L;

	@Column(name = "uid")
	private Long uid;
	
	@Column(name = "utid")
	private String utid;
	
	@Column(name = "uapp")
	private String uapp;

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
		InformationModel other = (InformationModel) obj;
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
		return "InformationModel [uid=" + uid + ", utid=" + utid + ", uapp="
				+ uapp + "]";
	}

}
