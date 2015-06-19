package org.lnu.is.multysearch.person;

import org.lnu.is.domain.admin.unit.AdminUnit;
import org.lnu.is.domain.gender.type.GenderType;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.type.PersonType;
import org.lnu.is.multysearch.MultiSearchModel;

import java.util.Date;
import java.util.List;

/**
 * Person entity.
 * @author ivanursul
 *
 */
public class PersonList extends MultiSearchModel {
	
	private List<Person> parents;

	private List<PersonType> personTypes;

	private List<GenderType> genderTypes;

	private List<MarriedType> marriedTypes;

	private List<AdminUnit> citizenCountries;

	private List<String> names;
	
	private List<String> firstNames;
	
	private List<String> fatherNames;
	
	private List<String> surnames;
	
	private List<String> photos;
	
	private List<String> docSeries;
	
	private List<String> docNums;
	
	private List<String> identifiers;

	private List<String> birthPlaces;

	private Integer resident;

	private Date begDate;

	private Date endDate;

	private Integer isMilitary;

	private Integer isHostel;

	public List<PersonType> getPersonTypes() {
	    return personTypes;
	}

	public void setPersonTypes(final List<PersonType> personTypes) {
	    this.personTypes = personTypes;
	}

	public List<GenderType> getGenderTypes() {
	    return genderTypes;
	}

	public void setGenderTypes(final List<GenderType> genderTypes) {
	    this.genderTypes = genderTypes;
	}

	public List<MarriedType> getMarriedTypes() {
	    return marriedTypes;
	}

	public void setMarriedTypes(final List<MarriedType> marriedTypes) {
	    this.marriedTypes = marriedTypes;
	}

	public List<AdminUnit> getCitizenCountries() {
	    return citizenCountries;
	}

	public void setCitizenCountries(final List<AdminUnit> citizenCountries) {
	    this.citizenCountries = citizenCountries;
	}

	public List<Person> getParents() {
	    return parents;
	}

	public void setParents(final List<Person> parents) {
	    this.parents = parents;
	}

	public List<String> getNames() {
	    return names;
	}

	public void setNames(final List<String> names) {
	    this.names = names;
	}

	public List<String> getFirstNames() {
	    return firstNames;
	}

	public void setFirstNames(final List<String> firstNames) {
	    this.firstNames = firstNames;
	}

	public List<String> getFatherNames() {
	    return fatherNames;
	}

	public void setFatherNames(final List<String> fatherNames) {
	    this.fatherNames = fatherNames;
	}

	public List<String> getSurnames() {
	    return surnames;
	}

	public void setSurnames(final List<String> surnames) {
	    this.surnames = surnames;
	}

	public List<String> getPhotos() {
	    return photos;
	}

	public void setPhotos(final List<String> photos) {
	    this.photos = photos;
	}

	public List<String> getDocSeries() {
	    return docSeries;
	}

	public void setDocSeries(final List<String> docSeries) {
	    this.docSeries = docSeries;
	}

	public List<String> getDocNums() {
	    return docNums;
	}

	public void setDocNums(final List<String> docNums) {
	    this.docNums = docNums;
	}

	public List<String> getIdentifiers() {
	    return identifiers;
	}

	public void setIdentifiers(final List<String> identifiers) {
	    this.identifiers = identifiers;
	}

	public Integer getResident() {
	    return resident;
	}

	public void setResident(final Integer resident) {
	    this.resident = resident;
	}

	public List<String> getBirthPlace() {
	    return birthPlaces;
	}

	public void setBirthPlaces(final List<String> birthPlaces) {
	    this.birthPlaces = birthPlaces;
	}

	public Date getBegDate() {
	    return begDate;
	}

	public void setBegDate(final Date begDate) {
	    this.begDate = begDate;
	}

	public Date getEndDate() {
	    return endDate;
	}

	public void setEndDate(final Date endDate) {
	    this.endDate = endDate;
	}

	public Integer getIsMilitary() {
	    return isMilitary;
	}

	public void setIsMilitary(final Integer isMilitary) {
	    this.isMilitary = isMilitary;
	}

	public Integer getIsHostel() {
	    return isHostel;
	}

	public void setIsHostel(final Integer isHostel) {
	    this.isHostel = isHostel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((birthPlaces == null) ? 0 : birthPlaces.hashCode());
		result = prime * result + ((docNums == null) ? 0 : docNums.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((fatherNames == null) ? 0 : fatherNames.hashCode());
		result = prime * result
				+ ((firstNames == null) ? 0 : firstNames.hashCode());
		result = prime * result
				+ ((identifiers == null) ? 0 : identifiers.hashCode());
		result = prime * result
				+ ((isHostel == null) ? 0 : isHostel.hashCode());
		result = prime * result
				+ ((isMilitary == null) ? 0 : isMilitary.hashCode());
		result = prime * result + ((names == null) ? 0 : names.hashCode());
		result = prime * result + ((photos == null) ? 0 : photos.hashCode());
		result = prime * result
				+ ((resident == null) ? 0 : resident.hashCode());
		result = prime * result + ((surnames == null) ? 0 : surnames.hashCode());
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
		PersonList other = (PersonList) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (birthPlaces == null) {
			if (other.birthPlaces != null) {
				return false;
			}
		} else if (!birthPlaces.equals(other.birthPlaces)) {
			return false;
		}
		if (docNums == null) {
			if (other.docNums != null) {
				return false;
			}
		} else if (!docNums.equals(other.docNums)) {
			return false;
		}
		if (docSeries == null) {
			if (other.docSeries != null) {
				return false;
			}
		} else if (!docSeries.equals(other.docSeries)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (fatherNames == null) {
			if (other.fatherNames != null) {
				return false;
			}
		} else if (!fatherNames.equals(other.fatherNames)) {
			return false;
		}
		if (firstNames == null) {
			if (other.firstNames != null) {
				return false;
			}
		} else if (!firstNames.equals(other.firstNames)) {
			return false;
		}
		if (identifiers == null) {
			if (other.identifiers != null) {
				return false;
			}
		} else if (!identifiers.equals(other.identifiers)) {
			return false;
		}
		if (isHostel == null) {
			if (other.isHostel != null) {
				return false;
			}
		} else if (!isHostel.equals(other.isHostel)) {
			return false;
		}
		if (isMilitary == null) {
			if (other.isMilitary != null) {
				return false;
			}
		} else if (!isMilitary.equals(other.isMilitary)) {
			return false;
		}
		if (names == null) {
			if (other.names != null) {
				return false;
			}
		} else if (!names.equals(other.names)) {
			return false;
		}
		if (photos == null) {
			if (other.photos != null) {
				return false;
			}
		} else if (!photos.equals(other.photos)) {
			return false;
		}
		if (resident == null) {
			if (other.resident != null) {
				return false;
			}
		} else if (!resident.equals(other.resident)) {
			return false;
		}
		if (surnames == null) {
			if (other.surnames != null) {
				return false;
			}
		} else if (!surnames.equals(other.surnames)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Person [names=" + names + ", firstNames=" + firstNames
				+ ", fatherNames=" + fatherNames + ", surnames=" + surnames
				+ ", photos=" + photos + ", docSeries=" + docSeries + ", docNums="
				+ docNums + ", identifiers=" + identifiers + ", resident="
				+ resident + ", birthPlaces=" + birthPlaces + ", begDate="
				+ begDate + ", endDate=" + endDate + ", isMilitary="
				+ isMilitary + ", isHostel=" + isHostel + "]";
	}

}
