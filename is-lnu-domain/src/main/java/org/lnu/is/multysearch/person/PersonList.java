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

	// Multi search fields
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

	public List<String> getBirthPlaces() {
		return birthPlaces;
	}

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
	public boolean equals(final Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		if (!super.equals(o)) {
			return false;
		}

		PersonList that = (PersonList) o;
		if (parents != null ? !parents.equals(that.parents) : that.parents != null) {
			return false;
		}
		if (personTypes != null ? !personTypes.equals(that.personTypes) : that.personTypes != null) {
			return false;
		}
		if (genderTypes != null ? !genderTypes.equals(that.genderTypes) : that.genderTypes != null) {
			return false;
		}
		if (marriedTypes != null ? !marriedTypes.equals(that.marriedTypes) : that.marriedTypes != null) {
			return false;
		}
		if (citizenCountries != null ? !citizenCountries.equals(that.citizenCountries) : that.citizenCountries != null) {
			return false;
		}
		if (names != null ? !names.equals(that.names) : that.names != null) {
			return false;
		}
		if (firstNames != null ? !firstNames.equals(that.firstNames) : that.firstNames != null) {
			return false;
		}
		if (fatherNames != null ? !fatherNames.equals(that.fatherNames) : that.fatherNames != null) {
			return false;
		}
		if (surnames != null ? !surnames.equals(that.surnames) : that.surnames != null) {
			return false;
		}
		if (photos != null ? !photos.equals(that.photos) : that.photos != null) {
			return false;
		}
		if (docSeries != null ? !docSeries.equals(that.docSeries) : that.docSeries != null) {
			return false;
		}
		if (docNums != null ? !docNums.equals(that.docNums) : that.docNums != null) {
			return false;
		}
		if (identifiers != null ? !identifiers.equals(that.identifiers) : that.identifiers != null) {
			return false;
		}
		if (birthPlaces != null ? !birthPlaces.equals(that.birthPlaces) : that.birthPlaces != null) {
			return false;
		}
		if (resident != null ? !resident.equals(that.resident) : that.resident != null) {
			return false;
		}
		if (begDate != null ? !begDate.equals(that.begDate) : that.begDate != null) {
			return false;
		}
		if (endDate != null ? !endDate.equals(that.endDate) : that.endDate != null) {
			return false;
		}
		if (isMilitary != null ? !isMilitary.equals(that.isMilitary) : that.isMilitary != null) {
			return false;
		}
		return !(isHostel != null ? !isHostel.equals(that.isHostel) : that.isHostel != null);

	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + (parents != null ? parents.hashCode() : 0);
		result = 31 * result + (personTypes != null ? personTypes.hashCode() : 0);
		result = 31 * result + (genderTypes != null ? genderTypes.hashCode() : 0);
		result = 31 * result + (marriedTypes != null ? marriedTypes.hashCode() : 0);
		result = 31 * result + (citizenCountries != null ? citizenCountries.hashCode() : 0);
		result = 31 * result + (names != null ? names.hashCode() : 0);
		result = 31 * result + (firstNames != null ? firstNames.hashCode() : 0);
		result = 31 * result + (fatherNames != null ? fatherNames.hashCode() : 0);
		result = 31 * result + (surnames != null ? surnames.hashCode() : 0);
		result = 31 * result + (photos != null ? photos.hashCode() : 0);
		result = 31 * result + (docSeries != null ? docSeries.hashCode() : 0);
		result = 31 * result + (docNums != null ? docNums.hashCode() : 0);
		result = 31 * result + (identifiers != null ? identifiers.hashCode() : 0);
		result = 31 * result + (birthPlaces != null ? birthPlaces.hashCode() : 0);
		result = 31 * result + (resident != null ? resident.hashCode() : 0);
		result = 31 * result + (begDate != null ? begDate.hashCode() : 0);
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		result = 31 * result + (isMilitary != null ? isMilitary.hashCode() : 0);
		result = 31 * result + (isHostel != null ? isHostel.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("PersonList{");
		sb.append("parents=").append(parents);
		sb.append(", personTypes=").append(personTypes);
		sb.append(", genderTypes=").append(genderTypes);
		sb.append(", marriedTypes=").append(marriedTypes);
		sb.append(", citizenCountries=").append(citizenCountries);
		sb.append(", names=").append(names);
		sb.append(", firstNames=").append(firstNames);
		sb.append(", fatherNames=").append(fatherNames);
		sb.append(", surnames=").append(surnames);
		sb.append(", photos=").append(photos);
		sb.append(", docSeries=").append(docSeries);
		sb.append(", docNums=").append(docNums);
		sb.append(", identifiers=").append(identifiers);
		sb.append(", birthPlaces=").append(birthPlaces);
		sb.append(", resident=").append(resident);
		sb.append(", begDate=").append(begDate);
		sb.append(", endDate=").append(endDate);
		sb.append(", isMilitary=").append(isMilitary);
		sb.append(", isHostel=").append(isHostel);
		sb.append('}');
		return sb.toString();
	}
}
