package org.lnu.is.domain.subject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.domain.Model;
import org.lnu.is.domain.subjecttype.SubjectType;

/**
 * Subject entity.
 * 
 * @author kushnir
 *
 */
@Entity
@Table(name = "q_ob_subject")
public class Subject extends Model {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "subjecttype_id")
	private SubjectType subjectType;

	@Column(name = "name")
	private String name;

	public SubjectType getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(final SubjectType subjectType) {
		this.subjectType = subjectType;
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
		Subject other = (Subject) obj;
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
		return "Subject [name=" + name + "]";
	}

}
