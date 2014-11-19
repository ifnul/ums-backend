package org.lnu.is.domain.specoffer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.specialty.SpecialtyType;

/**
 * Entity, that describes type of specoffer.
 * @author ivanursul
 *
 */
@RF
@Entity
@Table(name = "q_rf_specoffertype")
public class SpecOfferType extends Model {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "specialtytype_id")
	private SpecialtyType specialtyType;
	
	@Column(name = "abbrname")
	private String abbrName;
	
	@Column(name = "name")
	private String name;

	public SpecialtyType getSpecialtyType() {
		return specialtyType;
	}

	public void setSpecialtyType(final SpecialtyType specialType) {
		this.specialtyType = specialType;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((abbrName == null) ? 0 : abbrName.hashCode());
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
		SpecOfferType other = (SpecOfferType) obj;
		if (abbrName == null) {
			if (other.abbrName != null) {
				return false;
			}
		} else if (!abbrName.equals(other.abbrName)) {
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
		return "SpecOfferType [abbrName=" + abbrName + ", name=" + name + "]";
	}

}
