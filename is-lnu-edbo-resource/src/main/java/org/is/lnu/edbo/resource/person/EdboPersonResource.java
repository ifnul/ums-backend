package org.is.lnu.edbo.resource.person;

import java.io.Serializable;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Resource for storing resource.
 * @author ivanursul
 *
 */
public class EdboPersonResource implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPerson;
    private int resident;
    private int idPersonName;
    private int idPersonSex;
    private int idLanguage;
    private int idPersonDocumentPasp;
    private int idPersonDocumentAtestat;
    private int idPersonTypeDict;
    
    private XMLGregorianCalendar birthday;
    private XMLGregorianCalendar personNameDateBegin;
    private XMLGregorianCalendar personNameDateEnd;
    private XMLGregorianCalendar pasportDate;
    private XMLGregorianCalendar atestatDate;

    private String personCodeU;
    private String lastName;
    private String firstName;
    private String middleName;
    private String fio;
    private String pasportSeries;
    private String pasportNumber;
    private String pasportIssued;
    private String atestatSeries;
    private String atestatNumber;
    private String personSexName;
    private String personTypeName;
    private String father;
    private String mother;
    private String fatherPhones;
    private String motherPhones;
    private String birthplace;
    private String languagesAreStudied;
    
	public int getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(final int idPerson) {
		this.idPerson = idPerson;
	}
	public int getResident() {
		return resident;
	}
	public void setResident(final int resident) {
		this.resident = resident;
	}
	public int getIdPersonName() {
		return idPersonName;
	}
	public void setIdPersonName(final int idPersonName) {
		this.idPersonName = idPersonName;
	}
	public int getIdPersonSex() {
		return idPersonSex;
	}
	public void setIdPersonSex(final int idPersonSex) {
		this.idPersonSex = idPersonSex;
	}
	public int getIdLanguage() {
		return idLanguage;
	}
	public void setIdLanguage(final int idLanguage) {
		this.idLanguage = idLanguage;
	}
	public int getIdPersonDocumentPasp() {
		return idPersonDocumentPasp;
	}
	public void setIdPersonDocumentPasp(final int idPersonDocumentPasp) {
		this.idPersonDocumentPasp = idPersonDocumentPasp;
	}
	public int getIdPersonDocumentAtestat() {
		return idPersonDocumentAtestat;
	}
	public void setIdPersonDocumentAtestat(final int idPersonDocumentAtestat) {
		this.idPersonDocumentAtestat = idPersonDocumentAtestat;
	}
	public int getIdPersonTypeDict() {
		return idPersonTypeDict;
	}
	public void setIdPersonTypeDict(final int idPersonTypeDict) {
		this.idPersonTypeDict = idPersonTypeDict;
	}
	public XMLGregorianCalendar getBirthday() {
		return birthday;
	}
	public void setBirthday(final XMLGregorianCalendar birthday) {
		this.birthday = birthday;
	}
	public XMLGregorianCalendar getPersonNameDateBegin() {
		return personNameDateBegin;
	}
	public void setPersonNameDateBegin(final XMLGregorianCalendar personNameDateBegin) {
		this.personNameDateBegin = personNameDateBegin;
	}
	public XMLGregorianCalendar getPersonNameDateEnd() {
		return personNameDateEnd;
	}
	public void setPersonNameDateEnd(final XMLGregorianCalendar personNameDateEnd) {
		this.personNameDateEnd = personNameDateEnd;
	}
	public XMLGregorianCalendar getPasportDate() {
		return pasportDate;
	}
	public void setPasportDate(final XMLGregorianCalendar pasportDate) {
		this.pasportDate = pasportDate;
	}
	public XMLGregorianCalendar getAtestatDate() {
		return atestatDate;
	}
	public void setAtestatDate(final XMLGregorianCalendar atestatDate) {
		this.atestatDate = atestatDate;
	}
	public String getPersonCodeU() {
		return personCodeU;
	}
	public void setPersonCodeU(final String personCodeU) {
		this.personCodeU = personCodeU;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(final String fio) {
		this.fio = fio;
	}
	public String getPasportSeries() {
		return pasportSeries;
	}
	public void setPasportSeries(final String pasportSeries) {
		this.pasportSeries = pasportSeries;
	}
	public String getPasportNumber() {
		return pasportNumber;
	}
	public void setPasportNumber(final String pasportNumber) {
		this.pasportNumber = pasportNumber;
	}
	public String getPasportIssued() {
		return pasportIssued;
	}
	public void setPasportIssued(final String pasportIssued) {
		this.pasportIssued = pasportIssued;
	}
	public String getAtestatSeries() {
		return atestatSeries;
	}
	public void setAtestatSeries(final String atestatSeries) {
		this.atestatSeries = atestatSeries;
	}
	public String getAtestatNumber() {
		return atestatNumber;
	}
	public void setAtestatNumber(final String atestatNumber) {
		this.atestatNumber = atestatNumber;
	}
	public String getPersonSexName() {
		return personSexName;
	}
	public void setPersonSexName(final String personSexName) {
		this.personSexName = personSexName;
	}
	public String getPersonTypeName() {
		return personTypeName;
	}
	public void setPersonTypeName(final String personTypeName) {
		this.personTypeName = personTypeName;
	}
	public String getFather() {
		return father;
	}
	public void setFather(final String father) {
		this.father = father;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(final String mother) {
		this.mother = mother;
	}
	public String getFatherPhones() {
		return fatherPhones;
	}
	public void setFatherPhones(final String fatherPhones) {
		this.fatherPhones = fatherPhones;
	}
	public String getMotherPhones() {
		return motherPhones;
	}
	public void setMotherPhones(final String motherPhones) {
		this.motherPhones = motherPhones;
	}
	public String getBirthplace() {
		return birthplace;
	}
	public void setBirthplace(final String birthplace) {
		this.birthplace = birthplace;
	}
	public String getLanguagesAreStudied() {
		return languagesAreStudied;
	}
	public void setLanguagesAreStudied(final String languagesAreStudied) {
		this.languagesAreStudied = languagesAreStudied;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((atestatDate == null) ? 0 : atestatDate.hashCode());
		result = prime * result
				+ ((atestatNumber == null) ? 0 : atestatNumber.hashCode());
		result = prime * result
				+ ((atestatSeries == null) ? 0 : atestatSeries.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result
				+ ((birthplace == null) ? 0 : birthplace.hashCode());
		result = prime * result + ((father == null) ? 0 : father.hashCode());
		result = prime * result
				+ ((fatherPhones == null) ? 0 : fatherPhones.hashCode());
		result = prime * result + ((fio == null) ? 0 : fio.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + idLanguage;
		result = prime * result + idPerson;
		result = prime * result + idPersonDocumentAtestat;
		result = prime * result + idPersonDocumentPasp;
		result = prime * result + idPersonName;
		result = prime * result + idPersonSex;
		result = prime * result + idPersonTypeDict;
		result = prime
				* result
				+ ((languagesAreStudied == null) ? 0 : languagesAreStudied
						.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mother == null) ? 0 : mother.hashCode());
		result = prime * result
				+ ((motherPhones == null) ? 0 : motherPhones.hashCode());
		result = prime * result
				+ ((pasportDate == null) ? 0 : pasportDate.hashCode());
		result = prime * result
				+ ((pasportIssued == null) ? 0 : pasportIssued.hashCode());
		result = prime * result
				+ ((pasportNumber == null) ? 0 : pasportNumber.hashCode());
		result = prime * result
				+ ((pasportSeries == null) ? 0 : pasportSeries.hashCode());
		result = prime * result
				+ ((personCodeU == null) ? 0 : personCodeU.hashCode());
		result = prime
				* result
				+ ((personNameDateBegin == null) ? 0 : personNameDateBegin
						.hashCode());
		result = prime
				* result
				+ ((personNameDateEnd == null) ? 0 : personNameDateEnd
						.hashCode());
		result = prime * result
				+ ((personSexName == null) ? 0 : personSexName.hashCode());
		result = prime * result
				+ ((personTypeName == null) ? 0 : personTypeName.hashCode());
		result = prime * result + resident;
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
		EdboPersonResource other = (EdboPersonResource) obj;
		if (atestatDate == null) {
			if (other.atestatDate != null) {
				return false;
			}
		} else if (!atestatDate.equals(other.atestatDate)) {
			return false;
		}
		if (atestatNumber == null) {
			if (other.atestatNumber != null) {
				return false;
			}
		} else if (!atestatNumber.equals(other.atestatNumber)) {
			return false;
		}
		if (atestatSeries == null) {
			if (other.atestatSeries != null) {
				return false;
			}
		} else if (!atestatSeries.equals(other.atestatSeries)) {
			return false;
		}
		if (birthday == null) {
			if (other.birthday != null) {
				return false;
			}
		} else if (!birthday.equals(other.birthday)) {
			return false;
		}
		if (birthplace == null) {
			if (other.birthplace != null) {
				return false;
			}
		} else if (!birthplace.equals(other.birthplace)) {
			return false;
		}
		if (father == null) {
			if (other.father != null) {
				return false;
			}
		} else if (!father.equals(other.father)) {
			return false;
		}
		if (fatherPhones == null) {
			if (other.fatherPhones != null) {
				return false;
			}
		} else if (!fatherPhones.equals(other.fatherPhones)) {
			return false;
		}
		if (fio == null) {
			if (other.fio != null) {
				return false;
			}
		} else if (!fio.equals(other.fio)) {
			return false;
		}
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (idLanguage != other.idLanguage) {
			return false;
		}
		if (idPerson != other.idPerson) {
			return false;
		}
		if (idPersonDocumentAtestat != other.idPersonDocumentAtestat) {
			return false;
		}
		if (idPersonDocumentPasp != other.idPersonDocumentPasp) {
			return false;
		}
		if (idPersonName != other.idPersonName) {
			return false;
		}
		if (idPersonSex != other.idPersonSex) {
			return false;
		}
		if (idPersonTypeDict != other.idPersonTypeDict) {
			return false;
		}
		if (languagesAreStudied == null) {
			if (other.languagesAreStudied != null) {
				return false;
			}
		} else if (!languagesAreStudied.equals(other.languagesAreStudied)) {
			return false;
		}
		if (lastName == null) {
			if (other.lastName != null) {
				return false;
			}
		} else if (!lastName.equals(other.lastName)) {
			return false;
		}
		if (middleName == null) {
			if (other.middleName != null) {
				return false;
			}
		} else if (!middleName.equals(other.middleName)) {
			return false;
		}
		if (mother == null) {
			if (other.mother != null) {
				return false;
			}
		} else if (!mother.equals(other.mother)) {
			return false;
		}
		if (motherPhones == null) {
			if (other.motherPhones != null) {
				return false;
			}
		} else if (!motherPhones.equals(other.motherPhones)) {
			return false;
		}
		if (pasportDate == null) {
			if (other.pasportDate != null) {
				return false;
			}
		} else if (!pasportDate.equals(other.pasportDate)) {
			return false;
		}
		if (pasportIssued == null) {
			if (other.pasportIssued != null) {
				return false;
			}
		} else if (!pasportIssued.equals(other.pasportIssued)) {
			return false;
		}
		if (pasportNumber == null) {
			if (other.pasportNumber != null) {
				return false;
			}
		} else if (!pasportNumber.equals(other.pasportNumber)) {
			return false;
		}
		if (pasportSeries == null) {
			if (other.pasportSeries != null) {
				return false;
			}
		} else if (!pasportSeries.equals(other.pasportSeries)) {
			return false;
		}
		if (personCodeU == null) {
			if (other.personCodeU != null) {
				return false;
			}
		} else if (!personCodeU.equals(other.personCodeU)) {
			return false;
		}
		if (personNameDateBegin == null) {
			if (other.personNameDateBegin != null) {
				return false;
			}
		} else if (!personNameDateBegin.equals(other.personNameDateBegin)) {
			return false;
		}
		if (personNameDateEnd == null) {
			if (other.personNameDateEnd != null) {
				return false;
			}
		} else if (!personNameDateEnd.equals(other.personNameDateEnd)) {
			return false;
		}
		if (personSexName == null) {
			if (other.personSexName != null) {
				return false;
			}
		} else if (!personSexName.equals(other.personSexName)) {
			return false;
		}
		if (personTypeName == null) {
			if (other.personTypeName != null) {
				return false;
			}
		} else if (!personTypeName.equals(other.personTypeName)) {
			return false;
		}
		if (resident != other.resident) {
			return false;
		}
		return true;
	}
	@Override
	public String toString() {
		return "EdboPersonResource [idPerson=" + idPerson + ", resident="
				+ resident + ", idPersonName=" + idPersonName
				+ ", idPersonSex=" + idPersonSex + ", idLanguage=" + idLanguage
				+ ", idPersonDocumentPasp=" + idPersonDocumentPasp
				+ ", idPersonDocumentAtestat=" + idPersonDocumentAtestat
				+ ", idPersonTypeDict=" + idPersonTypeDict + ", birthday="
				+ birthday + ", personNameDateBegin=" + personNameDateBegin
				+ ", personNameDateEnd=" + personNameDateEnd + ", pasportDate="
				+ pasportDate + ", atestatDate=" + atestatDate
				+ ", personCodeU=" + personCodeU + ", lastName=" + lastName
				+ ", firstName=" + firstName + ", middleName=" + middleName
				+ ", fio=" + fio + ", pasportSeries=" + pasportSeries
				+ ", pasportNumber=" + pasportNumber + ", pasportIssued="
				+ pasportIssued + ", atestatSeries=" + atestatSeries
				+ ", atestatNumber=" + atestatNumber + ", personSexName="
				+ personSexName + ", personTypeName=" + personTypeName
				+ ", father=" + father + ", mother=" + mother
				+ ", fatherPhones=" + fatherPhones + ", motherPhones="
				+ motherPhones + ", birthplace=" + birthplace
				+ ", languagesAreStudied=" + languagesAreStudied + "]";
	}
	
}
