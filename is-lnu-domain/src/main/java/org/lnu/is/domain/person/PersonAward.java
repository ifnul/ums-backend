package org.lnu.is.domain.person;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
/**
 * Person Award entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_personaward")
public class PersonAward extends InformationModel {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "personpaper_id")
	private PersonPaper personPaper;
	
	@ManyToOne
	@JoinColumn(name = "publicactivityaward_id")
	private PublicActivityAward publicActivityAward;
	
	@Column(name = "bonus")
	private Double bonus;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public PersonPaper getPersonPaper() {
		return personPaper;
	}

	public void setPersonPaper(final PersonPaper personPaper) {
		this.personPaper = personPaper;
	}

	public PublicActivityAward getPublicActivityAward() {
		return publicActivityAward;
	}

	public void setPublicActivityAward(final PublicActivityAward publicActivityAward) {
		this.publicActivityAward = publicActivityAward;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(final Double bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bonus == null) ? 0 : bonus.hashCode());
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
		PersonAward other = (PersonAward) obj;
		if (bonus == null) {
			if (other.bonus != null) {
				return false;
			}
		} else if (!bonus.equals(other.bonus)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PublicActivityAward [bonus=" + bonus + "]";
	}
}
