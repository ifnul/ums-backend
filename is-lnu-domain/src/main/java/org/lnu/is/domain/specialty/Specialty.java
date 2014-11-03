package org.lnu.is.domain.specialty;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.specialtype.SpecialtyType;

/**
 * Entity, that describes specialty table.
 *
 */
@Entity
@Table(name = "q_ob_specialty")
public class Specialty extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "specialtytype_id")
	private SpecialtyType specialtyType;

	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Specialty parent;
	
	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "cipher")
	private String cipher;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;

	public SpecialtyType getSpecialtyType() {
		return specialtyType;
	}

	public void setSpecialtyType(final SpecialtyType specialtyType) {
		this.specialtyType = specialtyType;
	}

	public Specialty getParent() {
		return parent;
	}

	public void setParent(final Specialty parent) {
		this.parent = parent;
	}

	public String getAbbrName() {
		return abbrName;
	}

	public void setAbbrName(final String abbrName) {
		this.abbrName = abbrName;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getCipher() {
		return cipher;
	}

	public void setCipher(final String cipher) {
		this.cipher = cipher;
	}

	public Date getBegDate() {
		return new Date(begDate.getTime());
	}

	public void setBegDate(final Date begDate) {
		this.begDate = new Date(begDate.getTime());
	}

	public Date getEndDate() {
		return new Date(endDate.getTime());
	}

	public void setEndDate(final Date endDate) {
		this.endDate = new Date(endDate.getTime());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((cipher == null) ? 0 : cipher.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
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
		Specialty other = (Specialty) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (cipher == null) {
			if (other.cipher != null) {
				return false;
			}
		} else if (!cipher.equals(other.cipher)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
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
		return "Specialty [abbrName=" + abbrName + ", name=" + name
				+ ", cipher=" + cipher + ", begDate=" + begDate + ", endDate="
				+ endDate + "]";
	}
	
}
