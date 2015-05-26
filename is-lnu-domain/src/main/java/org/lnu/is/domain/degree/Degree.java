package org.lnu.is.domain.degree;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.domain.person.Person;

/**
 * Degree entity.
 * 
 * @author kushnir
 *
 */
@OB
@Entity
@Table(name = "q_ob_degree")
public class Degree extends InformationModel {
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;

	@ManyToOne
	@JoinColumn(name = "degreetype_id")
	private DegreeType degreeType;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public DegreeType getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(final DegreeType degreeType) {
		this.degreeType = degreeType;
	}
}
