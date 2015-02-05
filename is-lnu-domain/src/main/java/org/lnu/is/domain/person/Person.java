package org.lnu.is.domain.person;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OB;
import org.lnu.is.domain.InformationModel;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.gendertype.GenderType;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.domain.person.contact.PersonContact;

/**
 * Person entity.
 * @author ivanursul
 *
 */
@OB
@Entity
@Table(name = "q_ob_person")
public class Person extends InformationModel {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "persontype_id")
	private PersonType personType;
	
	@ManyToOne
	@JoinColumn(name = "gendertype_id")
	private GenderType genderType;
	
	@ManyToOne
	@JoinColumn(name = "marriedtype_id")
	private MarriedType marriedType;
	
	@ManyToOne
	@JoinColumn(name = "citizencountry_id")
	private AdminUnit citizenCountry;
	 
	@ManyToOne
	@JoinColumn(name = "parent_id")
	private Person parent;

	@OneToMany(mappedBy = "person")
	private List<PersonAddress> adresses;
	
	@OneToMany(mappedBy = "person")
	private List<PersonAward> awards;

	@OneToMany(mappedBy = "person")
	private List<PersonContact> contacts;
	
	@OneToMany(mappedBy = "person")
	private List<PersonEducation> educations;
	
	@OneToMany(mappedBy = "person")
	private List<PersonEnrolmentSubject> enrolmentSubjects;
	
	@OneToMany(mappedBy = "person")
	private List<PersonFamily> families;
	
	@OneToMany(mappedBy = "person")
	private List<PersonLanguage> languages;
	
	@OneToMany(mappedBy = "person")
	private List<PersonName> names;
	
	@OneToMany(mappedBy = "person")
	private List<PersonPaper> papers;
	
	@OneToMany(mappedBy = "person")
	private List<PersonPension> pensions;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "fathername")
	private String fatherName;
	
	@Column(name = "surname")
	private String surname;
	
	@Column(name = "photo")
	private String photo;
	
	@Column(name = "docseries")
	private String docSeries;
	
	@Column(name = "docnum")
	private String docNum;
	
	@Column(name = "identifier")
	private String identifier;
	
	@Column(name = "resident")
	private Integer resident;
	
	@Column(name = "birthplace")
	private String birthPlace;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@Column(name = "ismilitary")
	private Integer isMilitary;
	
	@Column(name = "ishostel")
	private Integer isHostel;

	public PersonType getPersonType() {
		return personType;
	}

	public void setPersonType(final PersonType personType) {
		this.personType = personType;
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

	public Person getParent() {
		return parent;
	}

	public void setParent(final Person parent) {
		this.parent = parent;
	}

	public String getDocSeries() {
		return docSeries;
	}

	public void setDocSeries(final String docSeries) {
		this.docSeries = docSeries;
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

	public Integer getResident() {
		return resident;
	}

	public void setResident(final Integer resident) {
		this.resident = resident;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(final String birthPlace) {
		this.birthPlace = birthPlace;
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

	public List<PersonAddress> getAdresses() {
		return adresses;
	}

	public void setAdresses(final List<PersonAddress> adresses) {
		this.adresses = adresses;
	}

	public List<PersonAward> getAwards() {
		return awards;
	}

	public void setAwards(final List<PersonAward> awards) {
		this.awards = awards;
	}

	public List<PersonContact> getContacts() {
		return contacts;
	}

	public void setContacts(final List<PersonContact> contacts) {
		this.contacts = contacts;
	}

	public List<PersonEducation> getEducations() {
		return educations;
	}

	public void setEducations(final List<PersonEducation> educations) {
		this.educations = educations;
	}

	public List<PersonEnrolmentSubject> getEnrolmentSubjects() {
		return enrolmentSubjects;
	}

	public void setEnrolmentSubjects(final List<PersonEnrolmentSubject> enrolmentSubjects) {
		this.enrolmentSubjects = enrolmentSubjects;
	}

	public List<PersonFamily> getFamilies() {
		return families;
	}

	public void setFamilies(final List<PersonFamily> families) {
		this.families = families;
	}

	public List<PersonLanguage> getLanguages() {
		return languages;
	}

	public void setLanguages(final List<PersonLanguage> languages) {
		this.languages = languages;
	}

	public List<PersonName> getNames() {
		return names;
	}

	public void setNames(final List<PersonName> names) {
		this.names = names;
	}

	public List<PersonPaper> getPapers() {
		return papers;
	}

	public void setPapers(final List<PersonPaper> papers) {
		this.papers = papers;
	}

	public List<PersonPension> getPensions() {
		return pensions;
	}

	public void setPensions(final List<PersonPension> pensions) {
		this.pensions = pensions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result
				+ ((birthPlace == null) ? 0 : birthPlace.hashCode());
		result = prime * result + ((docNum == null) ? 0 : docNum.hashCode());
		result = prime * result
				+ ((docSeries == null) ? 0 : docSeries.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result
				+ ((fatherName == null) ? 0 : fatherName.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((identifier == null) ? 0 : identifier.hashCode());
		result = prime * result
				+ ((isHostel == null) ? 0 : isHostel.hashCode());
		result = prime * result
				+ ((isMilitary == null) ? 0 : isMilitary.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Person other = (Person) obj;
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
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
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
		return "Person [name=" + name + ", firstName=" + firstName
				+ ", fatherName=" + fatherName + ", surname=" + surname
				+ ", photo=" + photo + ", docSeries=" + docSeries + ", docNum="
				+ docNum + ", identifier=" + identifier + ", resident="
				+ resident + ", birthPlace=" + birthPlace + ", begDate="
				+ begDate + ", endDate=" + endDate + ", isMilitary="
				+ isMilitary + ", isHostel=" + isHostel + "]";
	}

}
