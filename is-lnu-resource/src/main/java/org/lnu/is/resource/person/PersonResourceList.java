package org.lnu.is.resource.person;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.resource.MultiSearchResource;

import java.util.Date;
import java.util.List;

/**
 * Resource for person.
 * @author ivanursul
 *
 */
@CrudableResource
public class PersonResourceList extends MultiSearchResource {

	private List<Long> parentId;
	private List<Long> personTypeId;
	private List<Long> genderTypeId;
	private List<Long> marriedTypeId;
	private List<Long> citizenCountryId;
	private List<String> name;
	private List<String> firstName;
	private List<String> fatherName;
	private List<String> surname;
	private List<String> photo;
	private List<String> docSeries;
	private List<String> docNum;
	private List<String> identifier;
	private List<String> birthPlace;

	private Integer resident;
	private Date begDate;
	private Date endDate;
	private Integer isMilitary;
	private Integer isHostel;

	@Override
	public String getRootUri() {
		return "/persons";
	}

	public List<Long> getParentId() {
		return parentId;
	}

	public void setParentId(final List<Long> parentId) {
		this.parentId = parentId;
	}

	public List<Long> getPersonTypeId() {
		return personTypeId;
	}

	public void setPersonTypeId(final List<Long> personTypeId) {
		this.personTypeId = personTypeId;
	}

	public List<Long> getGenderTypeId() {
		return genderTypeId;
	}

	public void setGenderTypeId(final List<Long> genderTypeId) {
		this.genderTypeId = genderTypeId;
	}

	public List<Long> getMarriedTypeId() {
		return marriedTypeId;
	}

	public void setMarriedTypeId(final List<Long> marriedTypeId) {
		this.marriedTypeId = marriedTypeId;
	}

	public List<Long> getCitizenCountryId() {
		return citizenCountryId;
	}

	public void setCitizenCountryId(final List<Long> citizenCountryId) {
		this.citizenCountryId = citizenCountryId;
	}

	public List<String> getName() {
		return name;
	}

	public void setName(final List<String> name) {
		this.name = name;
	}

	public List<String> getFirstName() {
		return firstName;
	}

	public void setFirstName(final List<String> firstName) {
		this.firstName = firstName;
	}

	public List<String> getFatherName() {
		return fatherName;
	}

	public void setFatherName(final List<String> fatherName) {
		this.fatherName = fatherName;
	}

	public List<String> getSurname() {
		return surname;
	}

	public void setSurname(final List<String> surname) {
		this.surname = surname;
	}

	public List<String> getPhoto() {
		return photo;
	}

	public void setPhoto(final List<String> photo) {
		this.photo = photo;
	}

	public List<String> getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(final List<String> docSeries) {
		this.docSeries = docSeries;
	}

	public List<String> getDocNum() {
		return docNum;
	}

	public void setDocNum(final List<String> docNum) {
		this.docNum = docNum;
	}

	public List<String> getIdentifier() {
		return identifier;
	}

	public void setIdentifier(final List<String> identifier) {
		this.identifier = identifier;
	}

	public List<String> getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(final List<String> birthPlace) {
		this.birthPlace = birthPlace;
	}

	public Integer getResident() {
		return resident;
	}

	public void setResident(final Integer resident) {
		this.resident = resident;
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

		PersonResourceList that = (PersonResourceList) o;

		if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) {
			return false;
		}
		if (personTypeId != null ? !personTypeId.equals(that.personTypeId) : that.personTypeId != null) {
			return false;
		}
		if (genderTypeId != null ? !genderTypeId.equals(that.genderTypeId) : that.genderTypeId != null) {
			return false;
		}
		if (marriedTypeId != null ? !marriedTypeId.equals(that.marriedTypeId) : that.marriedTypeId != null) {
			return false;
		}
		if (citizenCountryId != null ? !citizenCountryId.equals(that.citizenCountryId) : that.citizenCountryId != null) {
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
		if (docSeries != null ? !docSeries.equals(that.docSeries) : that.docSeries != null) {
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
		result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
		result = 31 * result + (personTypeId != null ? personTypeId.hashCode() : 0);
		result = 31 * result + (genderTypeId != null ? genderTypeId.hashCode() : 0);
		result = 31 * result + (marriedTypeId != null ? marriedTypeId.hashCode() : 0);
		result = 31 * result + (citizenCountryId != null ? citizenCountryId.hashCode() : 0);
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
		result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
		result = 31 * result + (surname != null ? surname.hashCode() : 0);
		result = 31 * result + (photo != null ? photo.hashCode() : 0);
		result = 31 * result + (docSeries != null ? docSeries.hashCode() : 0);
		result = 31 * result + (docNum != null ? docNum.hashCode() : 0);
		result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
		result = 31 * result + (birthPlace != null ? birthPlace.hashCode() : 0);
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
				.append("parentId", parentId)
				.append("personTypeId", personTypeId)
				.append("genderTypeId", genderTypeId)
				.append("marriedTypeId", marriedTypeId)
				.append("citizenCountryId", citizenCountryId)
				.append("name", name)
				.append("firstName", firstName)
				.append("fatherName", fatherName)
				.append("surname", surname)
				.append("photo", photo)
				.append("docSeries", docSeries)
				.append("docNum", docNum)
				.append("identifier", identifier)
				.append("birthPlace", birthPlace)
				.append("resident", resident)
				.append("begDate", begDate)
				.append("endDate", endDate)
				.append("isMilitary", isMilitary)
				.append("isHostel", isHostel)
				.toString();
	}
}
