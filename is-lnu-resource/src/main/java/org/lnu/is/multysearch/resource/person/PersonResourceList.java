package org.lnu.is.multysearch.resource.person;

import java.util.Date;
import java.util.List;

import org.lnu.is.annotation.CrudableResource;
import org.lnu.is.multysearch.resource.ApiMultySearchResource;

/**
 * Resource for person.
 * @author ivanursul
 *
 */
@CrudableResource
public class PersonResourceList extends ApiMultySearchResource {

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
	
	private List<Integer> resident;
	
	private List<String> birthPlace;
	
	private List<Date> begDate;
	
	private List<Date> endDate;
	
	private List<Integer> isMilitary;
	
	private List<Integer> isHostel;

	@Override
	public String getRootUri() {
		return "/persons";
	}
	
	public List<Long> getParentId() {
	    return parentId;
	}

	public void setParentId(List<Long> parentId) {
	    this.parentId = parentId;
	}

	public List<Long> getPersonTypeId() {
	    return personTypeId;
	}

	public void setPersonTypeId(List<Long> personTypeId) {
	    this.personTypeId = personTypeId;
	}

	public List<Long> getGenderTypeId() {
	    return genderTypeId;
	}

	public void setGenderTypeId(List<Long> genderTypeId) {
	    this.genderTypeId = genderTypeId;
	}

	public List<Long> getMarriedTypeId() {
	    return marriedTypeId;
	}

	public void setMarriedTypeId(List<Long> marriedTypeId) {
	    this.marriedTypeId = marriedTypeId;
	}

	public List<Long> getCitizenCountryId() {
	    return citizenCountryId;
	}

	public void setCitizenCountryId(List<Long> citizenCountryId) {
	    this.citizenCountryId = citizenCountryId;
	}

	public List<String> getName() {
	    return name;
	}

	public void setName(List<String> name) {
	    this.name = name;
	}

	public List<String> getFirstName() {
	    return firstName;
	}

	public void setFirstName(List<String> firstName) {
	    this.firstName = firstName;
	}

	public List<String> getFatherName() {
	    return fatherName;
	}

	public void setFatherName(List<String> fatherName) {
	    this.fatherName = fatherName;
	}

	public List<String> getSurname() {
	    return surname;
	}

	public void setSurname(List<String> surname) {
	    this.surname = surname;
	}

	public List<String> getPhoto() {
	    return photo;
	}

	public void setPhoto(List<String> photo) {
	    this.photo = photo;
	}

	public List<String> getDocSeries() {
	    return docSeries;
	}

	public void setDocSeries(List<String> docSeries) {
	    this.docSeries = docSeries;
	}

	public List<String> getDocNum() {
	    return docNum;
	}

	public void setDocNum(List<String> docNum) {
	    this.docNum = docNum;
	}

	public List<String> getIdentifier() {
	    return identifier;
	}

	public void setIdentifier(List<String> identifier) {
	    this.identifier = identifier;
	}

	public List<Integer> getResident() {
	    return resident;
	}

	public void setResident(List<Integer> resident) {
	    this.resident = resident;
	}

	public List<String> getBirthPlace() {
	    return birthPlace;
	}

	public void setBirthPlace(List<String> birthPlace) {
	    this.birthPlace = birthPlace;
	}

	public List<Date> getBegDate() {
	    return begDate;
	}

	public void setBegDate(List<Date> begDate) {
	    this.begDate = begDate;
	}

	public List<Date> getEndDate() {
	    return endDate;
	}

	public void setEndDate(List<Date> endDate) {
	    this.endDate = endDate;
	}

	public List<Integer> getIsMilitary() {
	    return isMilitary;
	}

	public void setIsMilitary(List<Integer> isMilitary) {
	    this.isMilitary = isMilitary;
	}

	public List<Integer> getIsHostel() {
	    return isHostel;
	}

	public void setIsHostel(List<Integer> isHostel) {
	    this.isHostel = isHostel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime
				* result
				+ ((citizenCountryId == null) ? 0 : citizenCountryId.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((genderTypeId == null) ? 0 : genderTypeId.hashCode());
		result = prime * result
				+ ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result
				+ ((isHostel == null) ? 0 : isHostel.hashCode());
		result = prime * result
				+ ((isMilitary == null) ? 0 : isMilitary.hashCode());
		result = prime * result
				+ ((marriedTypeId == null) ? 0 : marriedTypeId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((parentId == null) ? 0 : parentId.hashCode());
		result = prime * result
				+ ((personTypeId == null) ? 0 : personTypeId.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
		result = prime * result
				+ ((resident == null) ? 0 : resident.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PersonResourceList other = (PersonResourceList) obj;
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (birthPlace == null) {
			if (other.birthPlace != null) {
				return false;
			}
		} else if (!birthPlace.equals(other.birthPlace)) {
			return false;
		}
		if (citizenCountryId == null) {
			if (other.citizenCountryId != null) {
				return false;
			}
		} else if (!citizenCountryId.equals(other.citizenCountryId)) {
			return false;
		}
		if (docNum == null) {
			if (other.docNum != null) {
				return false;
			}
		} else if (!docNum.equals(other.docNum)) {
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
		if (fatherName == null) {
			if (other.fatherName != null) {
				return false;
			}
		} else if (!fatherName.equals(other.fatherName)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (genderTypeId == null) {
			if (other.genderTypeId != null) {
				return false;
			}
		} else if (!genderTypeId.equals(other.genderTypeId)) {
			return false;
		}
		if (identifier == null) {
			if (other.identifier != null) {
				return false;
			}
		} else if (!identifier.equals(other.identifier)) {
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
		if (marriedTypeId == null) {
			if (other.marriedTypeId != null) {
				return false;
			}
		} else if (!marriedTypeId.equals(other.marriedTypeId)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (parentId == null) {
			if (other.parentId != null) {
				return false;
			}
		} else if (!parentId.equals(other.parentId)) {
			return false;
		}
		if (personTypeId == null) {
			if (other.personTypeId != null) {
				return false;
			}
		} else if (!personTypeId.equals(other.personTypeId)) {
			return false;
		}
		if (photo == null) {
			if (other.photo != null) {
				return false;
			}
		} else if (!photo.equals(other.photo)) {
			return false;
		}
		if (resident == null) {
			if (other.resident != null) {
				return false;
			}
		} else if (!resident.equals(other.resident)) {
			return false;
		}
		if (surname == null) {
			if (other.surname != null) {
				return false;
			}
		} else if (!surname.equals(other.surname)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonResource [personTypeId=" + personTypeId
				+ ", name=" + name + ", firstName=" + firstName
				+ ", fatherName=" + fatherName + ", surname=" + surname
				+ ", photo=" + photo + ", genderTypeId=" + genderTypeId
				+ ", marriedTypeId=" + marriedTypeId + ", citizenCountryId="
				+ citizenCountryId + ", parentId=" + parentId + ", docSeries="
				+ docSeries + ", docNum=" + docNum + ", identifier="
				+ identifier + ", resident=" + resident + ", birthPlace="
				+ birthPlace + ", begDate=" + begDate + ", endDate=" + endDate
				+ ", isMilitary=" + isMilitary + ", isHostel=" + isHostel + "]";
	}

}
