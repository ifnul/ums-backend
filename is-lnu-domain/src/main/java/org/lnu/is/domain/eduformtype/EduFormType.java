package org.lnu.is.domain.eduformtype;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.Model;

/**
 * Entity, that describes eduformtype table.
 *
 */
@RF
@Entity
@Table(name = "q_rf_eduformtype")
public class EduFormType extends Model {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

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
		EduFormType other = (EduFormType) obj;
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
		return "EduFormType [name=" + name + "]";
	}
	
}
