package org.lnu.is.domain.benefit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.RF;
import org.lnu.is.domain.InformationModel;

/**
 * Benefit type entity.
 * @author ivanursul
 *
 */
@RF
@Entity
@Table(name = "q_rf_benefittype")
public class BenefitType extends InformationModel {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;
	
	@Column(name = "priority")
	private Integer priority;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(final Integer priority) {
		this.priority = priority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((priority == null) ? 0 : priority.hashCode());
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
		BenefitType other = (BenefitType) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (priority == null) {
			if (other.priority != null) {
				return false;
			}
		} else if (!priority.equals(other.priority)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "BenefitType [name=" + name + ", priority=" + priority + "]";
	}
	
}
