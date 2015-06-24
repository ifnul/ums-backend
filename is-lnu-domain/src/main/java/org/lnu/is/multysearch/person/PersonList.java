package org.lnu.is.multysearch.person;

import org.apache.commons.lang3.builder.ToStringBuilder;
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

	// Single fields
	private Person parent;
	private PersonType personType;
	private GenderType genderType;
	private MarriedType marriedType;
	private AdminUnit citizenCountry;

	private String name;
	private String firstName;
	private String fatherName;
	private String surname;
	private String photo;
	private String docNum;
	private String identifier;
	private String birthPlace;

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

	public Person getParent() {
		return parent;
	}

	public void setParent(final Person parent) {
		this.parent = parent;
	}

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(final PersonType personType) {
		this.personType = personType;
	}

	public GenderType getGenderType() {
		return genderType;
	}

	public void setGenderType(final GenderType genderType) {
		this.genderType = genderType;
	}

	public MarriedType getMarriedType() {
		return marriedType;
	}

	public void setMarriedType(final MarriedType marriedType) {
		this.marriedType = marriedType;
	}

	public AdminUnit getCitizenCountry() {
		return citizenCountry;
	}

	public void setCitizenCountry(final AdminUnit citizenCountry) {
		this.citizenCountry = citizenCountry;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(final String fatherName) {
		this.fatherName = fatherName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(final String photo) {
		this.photo = photo;
	}

	public String getDocNum() {
		return docNum;
	}

	public void setDocNum(final String docNum) {
		this.docNum = docNum;
	}

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(final String identifier) {
		this.identifier = identifier;
	}

	public void setBirthPlace(final String birthPlace) {
		this.birthPlace = birthPlace;
	}

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

		if (parent != null ? !parent.equals(that.parent) : that.parent != null) {
			return false;
		}
		if (personType != null ? !personType.equals(that.personType) : that.personType != null) {
			return false;
		}
		if (genderType != null ? !genderType.equals(that.genderType) : that.genderType != null) {
			return false;
		}
		if (marriedType != null ? !marriedType.equals(that.marriedType) : that.marriedType != null) {
			return false;
		}
		if (citizenCountry != null ? !citizenCountry.equals(that.citizenCountry) : that.citizenCountry != null) {
			return false;
		}
		if (name != null ? !name.equals(that.name) : that.name != null) {
			return false;
		}
		if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) {
			return false;
		}
		if (fatherName != null ? !fatherName.equals(that.fatherName) : that.fatherName != null) {
			return false;
		}
		if (surname != null ? !surname.equals(that.surname) : that.surname != null) {
			return false;
		}
		if (photo != null ? !photo.equals(that.photo) : that.photo != null) {
			return false;
		}
		if (docNum != null ? !docNum.equals(that.docNum) : that.docNum != null) {
			return false;
		}
		if (identifier != null ? !identifier.equals(that.identifier) : that.identifier != null) {
			return false;
		}
		if (birthPlace != null ? !birthPlace.equals(that.birthPlace) : that.birthPlace != null) {
			return false;
		}
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
		result = 31 * result + (parent != null ? parent.hashCode() : 0);
		result = 31 * result + (personType != null ? personType.hashCode() : 0);
		result = 31 * result + (genderType != null ? genderType.hashCode() : 0);
		result = 31 * result + (marriedType != null ? marriedType.hashCode() : 0);
		result = 31 * result + (citizenCountry != null ? citizenCountry.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (photo != null ? photo.hashCode() : 0);
		result = 31 * result + (docNum != null ? docNum.hashCode() : 0);
		result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
		result = 31 * result + (birthPlace != null ? birthPlace.hashCode() : 0);
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
		return new ToStringBuilder(this)
				.append("parent", parent)
				.append("personType", personType)
				.append("genderType", genderType)
				.append("marriedType", marriedType)
				.append("citizenCountry", citizenCountry)
				.append("name", name)
				.append("firstName", firstName)
				.append("fatherName", fatherName)
				.append("surname", surname)
				.append("photo", photo)
				.append("docNum", docNum)
				.append("identifier", identifier)
				.append("birthPlace", birthPlace)
				.append("parents", parents)
				.append("personTypes", personTypes)
				.append("genderTypes", genderTypes)
				.append("marriedTypes", marriedTypes)
				.append("citizenCountries", citizenCountries)
				.append("names", names)
				.append("firstNames", firstNames)
				.append("fatherNames", fatherNames)
				.append("surnames", surnames)
				.append("photos", photos)
				.append("docSeries", docSeries)
				.append("docNums", docNums)
				.append("identifiers", identifiers)
				.append("birthPlaces", birthPlaces)
				.append("resident", resident)
				.append("begDate", begDate)
				.append("endDate", endDate)
				.append("isMilitary", isMilitary)
				.append("isHostel", isHostel)
				.toString();
	}
}
