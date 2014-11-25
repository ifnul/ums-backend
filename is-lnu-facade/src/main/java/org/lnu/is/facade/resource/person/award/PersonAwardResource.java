package org.lnu.is.facade.resource.person.award;

import java.text.MessageFormat;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Person Award Resource.
 * @author ivanursul
 *
 */
public class PersonAwardResource extends ApiResource {

	private Long personId;
	
	private Long personPaperId;
	
	private Long publicActivityAwardId;
	
	private Double bonus;
	
	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/awards/{1}", personId, getId());
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getPersonPaperId() {
		return personPaperId;
	}

	public void setPersonPaperId(final Long personPaperId) {
		this.personPaperId = personPaperId;
	}

	public Long getPublicActivityAwardId() {
		return publicActivityAwardId;
	}

	public void setPublicActivityAwardId(final Long publicActivityAwardId) {
		this.publicActivityAwardId = publicActivityAwardId;
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
		result = prime * result
				+ ((personId == null) ? 0 : personId.hashCode());
		result = prime * result
				+ ((personPaperId == null) ? 0 : personPaperId.hashCode());
		result = prime
				* result
				+ ((publicActivityAwardId == null) ? 0 : publicActivityAwardId
						.hashCode());
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
		PersonAwardResource other = (PersonAwardResource) obj;
		if (bonus == null) {
			if (other.bonus != null) {
				return false;
			}
		} else if (!bonus.equals(other.bonus)) {
			return false;
		}
		if (personId == null) {
			if (other.personId != null) {
				return false;
			}
		} else if (!personId.equals(other.personId)) {
			return false;
		}
		if (personPaperId == null) {
			if (other.personPaperId != null) {
				return false;
			}
		} else if (!personPaperId.equals(other.personPaperId)) {
			return false;
		}
		if (publicActivityAwardId == null) {
			if (other.publicActivityAwardId != null) {
				return false;
			}
		} else if (!publicActivityAwardId.equals(other.publicActivityAwardId)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonAwardResource [personId=" + personId + ", personPaperId="
				+ personPaperId + ", publicActivityAwardId="
				+ publicActivityAwardId + ", bonus=" + bonus + "]";
	}

}
