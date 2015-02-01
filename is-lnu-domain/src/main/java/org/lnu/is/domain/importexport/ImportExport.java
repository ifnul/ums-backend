package org.lnu.is.domain.importexport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.LG;
import org.lnu.is.domain.InformationModel;

/**
 * Import Export entity.
 * @author ivanursul
 *
 */
@LG
@Entity
@Table(name = "q_lg_importexport")
public class ImportExport extends InformationModel {
	private static final long serialVersionUID = 1L;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "invnum")
	private String invNum;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "clientos")
	private String clientos;
	
	@Column(name = "clientname")
	private String clientName;
	
	@Column(name = "clientversion")
	private String clientVersion;
	
	@Column(name = "clientip")
	private String clientIp;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getInvNum() {
		return invNum;
	}

	public void setInvNum(final String invNum) {
		this.invNum = invNum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getClientos() {
		return clientos;
	}

	public void setClientos(final String clientos) {
		this.clientos = clientos;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(final String clientName) {
		this.clientName = clientName;
	}
	
	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(final String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(final String clientVersion) {
		this.clientVersion = clientVersion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result
				+ ((clientIp == null) ? 0 : clientIp.hashCode());
		result = prime * result
				+ ((clientVersion == null) ? 0 : clientVersion.hashCode());
		result = prime * result
				+ ((clientos == null) ? 0 : clientos.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((invNum == null) ? 0 : invNum.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ImportExport other = (ImportExport) obj;
		if (clientName == null) {
			if (other.clientName != null) {
				return false;
			}
		} else if (!clientName.equals(other.clientName)) {
			return false;
		}
		if (clientIp == null) {
			if (other.clientIp != null) {
				return false;
			}
		} else if (!clientIp.equals(other.clientIp)) {
			return false;
		}
		if (clientVersion == null) {
			if (other.clientVersion != null) {
				return false;
			}
		} else if (!clientVersion.equals(other.clientVersion)) {
			return false;
		}
		if (clientos == null) {
			if (other.clientos != null) {
				return false;
			}
		} else if (!clientos.equals(other.clientos)) {
			return false;
		}
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (invNum == null) {
			if (other.invNum != null) {
				return false;
			}
		} else if (!invNum.equals(other.invNum)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ImportExport [name=" + name + ", invNum=" + invNum + ", description="
				+ description + ", clientos=" + clientos + ", clientName="
				+ clientName + ", clientVersion=" + clientVersion
				+ ", clientIp=" + clientIp + "]";
	}
	
}
