package org.lnu.is.domain.person.entrant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.lnu.is.domain.View;

/**
 * Person Entrant View.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "v_ob_person_entrant")
public class PersonEntrant extends View {

	@Column(name = "resident")
    private int resident;
	
	@Column(name = "birthday")
    private String birthday;
	
	@Column(name = "person_sex_id")
    private int idPersonSex;
	
	@Column(name = "firstname")
    private String firstName;
	
	@Column(name = "middlename")
    private String middleName;
	
	@Column(name = "lastname")
    private String lastName;
	
	@Column(name = "koatuuCode")
    private String koatuuCode;
	
	@Column(name = "street_type_id")
    private int idStreetType;
	
	@Column(name = "adress")
    private String adress;
	
	@Column(name = "home_number")
    private String homeNumber;
	
	@Column(name = "entrant_document_series")
    private String entrantDocumentSeries;
	
	@Column(name = "entrant_document_number")
    private String entrantDocumentNumber;
	
	@Column(name = "entrant_document_date")
    private String entrantDocumentDate;
	
	@Column(name = "entrant_document_value")
    private String entrantDocumentValue;
	
	@Column(name = "passport_series")
    private String pasportSeries;
	
	@Column(name = "passport_number")
    private String pasportNumber;
	
	@Column(name = "passport_issued")
    private String pasportIssued;
	
	@Column(name = "passport_date")
    private String pasportDate;
	
	@Column(name = "birth_certificate_series")
    private String birthCertificateSeries;
	
	@Column(name = "birth_certificate_number")
    private String birthCertificateNumber;
	
	@Column(name = "birth_cerificate_date")
    private String birthCertificateDate;
	
	@Column(name = "kode_school")
    private String kodeSchool;
	
	@Column(name = "phone")
    private String phone;
	
	@Column(name = "mobile")
    private String mobile;
	
	@Column(name = "email")
    private String email;
	
	@Column(name = "skype")
    private String skype;
	
	@Column(name = "icq")
    private String icq;
	
	@Column(name = "is_foreign_entrant_document")
    private int isForeinghEntrantDocumet;
	
	@Column(name = "is_not_check_attestat")
    private int isNotCheckAttestat;
	
	@Column(name = "entrant_document_type_id")
    private int idEntrantDocumnetType;
	
	@Column(name = "entrant_document_university_code")
    private String entrantDocumnetUniversityKode;
	
	@Column(name = "father")
    private String father;
	
	@Column(name = "mother")
    private String mother;
	
	@Column(name = "father_phones")
    private String fatherPhones;
	
	@Column(name = "mother_phones")
    private String motherPhones;
	
	@Column(name = "post_index")
    private String postIndex;
	
	@Column(name = "birthplace")
    private String birthplace;
	
	@Column(name = "language_are_studied")
    private String languagesAreStudied;
	
	@Column(name = "entrant_docuement_issued")
    private String entrantDocumentIssued;
	
	@Column(name = "entrant_document_award_type_id")
    private int idEntrantDocumentsAwardType;
	
	@Column(name = "allow_process_personal_date")
    private int allowProcessedPersonalData;
	
	@Column(name = "posvidka_series")
    private String posvidkaSeries;
	
	@Column(name = "posvidka_number")
    private String posvidkaNumber;
	
	@Column(name = "posvidka_issued")
    private String posvidkaIssued;
	
	@Column(name = "posvidka_date")
    private String posvidkaDate;
	
	@Column(name = "country_id")
    private int idCountry;
    
	public int getResident() {
		return resident;
	}
	
	public void setResident(final int resident) {
		this.resident = resident;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(final String birthday) {
		this.birthday = birthday;
	}
	
	public int getIdPersonSex() {
		return idPersonSex;
	}
	
	public void setIdPersonSex(final int idPersonSex) {
		this.idPersonSex = idPersonSex;
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
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}
	
	public String getKoatuuCode() {
		return koatuuCode;
	}
	
	public void setKoatuuCode(final String koatuuCode) {
		this.koatuuCode = koatuuCode;
	}
	
	public int getIdStreetType() {
		return idStreetType;
	}
	
	public void setIdStreetType(final int idStreetType) {
		this.idStreetType = idStreetType;
	}
	
	public String getAdress() {
		return adress;
	}
	
	public void setAdress(final String adress) {
		this.adress = adress;
	}
	
	public String getHomeNumber() {
		return homeNumber;
	}
	
	public void setHomeNumber(final String homeNumber) {
		this.homeNumber = homeNumber;
	}
	
	public String getEntrantDocumentSeries() {
		return entrantDocumentSeries;
	}
	
	public void setEntrantDocumentSeries(final String entrantDocumentSeries) {
		this.entrantDocumentSeries = entrantDocumentSeries;
	}
	
	public String getEntrantDocumentNumber() {
		return entrantDocumentNumber;
	}
	
	public void setEntrantDocumentNumber(final String entrantDocumentNumber) {
		this.entrantDocumentNumber = entrantDocumentNumber;
	}
	
	public String getEntrantDocumentDate() {
		return entrantDocumentDate;
	}
	
	public void setEntrantDocumentDate(final String entrantDocumentDate) {
		this.entrantDocumentDate = entrantDocumentDate;
	}
	
	public String getEntrantDocumentValue() {
		return entrantDocumentValue;
	}
	
	public void setEntrantDocumentValue(final String entrantDocumentValue) {
		this.entrantDocumentValue = entrantDocumentValue;
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
	
	public String getPasportDate() {
		return pasportDate;
	}
	
	public void setPasportDate(final String pasportDate) {
		this.pasportDate = pasportDate;
	}
	
	public String getBirthCertificateSeries() {
		return birthCertificateSeries;
	}
	
	public void setBirthCertificateSeries(final String birthCertificateSeries) {
		this.birthCertificateSeries = birthCertificateSeries;
	}
	
	public String getBirthCertificateNumber() {
		return birthCertificateNumber;
	}
	
	public void setBirthCertificateNumber(final String birthCertificateNumber) {
		this.birthCertificateNumber = birthCertificateNumber;
	}
	
	public String getBirthCertificateDate() {
		return birthCertificateDate;
	}
	
	public void setBirthCertificateDate(final String birthCertificateDate) {
		this.birthCertificateDate = birthCertificateDate;
	}
	
	public String getKodeSchool() {
		return kodeSchool;
	}
	
	public void setKodeSchool(final String kodeSchool) {
		this.kodeSchool = kodeSchool;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(final String phone) {
		this.phone = phone;
	}
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(final String mobile) {
		this.mobile = mobile;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(final String email) {
		this.email = email;
	}
	
	public String getSkype() {
		return skype;
	}
	public void setSkype(final String skype) {
		this.skype = skype;
	}
	public String getIcq() {
		return icq;
	}
	public void setIcq(final String icq) {
		this.icq = icq;
	}
	public int getIsForeinghEntrantDocumet() {
		return isForeinghEntrantDocumet;
	}
	public void setIsForeinghEntrantDocumet(final int isForeinghEntrantDocumet) {
		this.isForeinghEntrantDocumet = isForeinghEntrantDocumet;
	}
	public int getIsNotCheckAttestat() {
		return isNotCheckAttestat;
	}
	public void setIsNotCheckAttestat(final int isNotCheckAttestat) {
		this.isNotCheckAttestat = isNotCheckAttestat;
	}
	public int getIdEntrantDocumnetType() {
		return idEntrantDocumnetType;
	}
	public void setIdEntrantDocumnetType(final int idEntrantDocumnetType) {
		this.idEntrantDocumnetType = idEntrantDocumnetType;
	}
	public String getEntrantDocumnetUniversityKode() {
		return entrantDocumnetUniversityKode;
	}
	public void setEntrantDocumnetUniversityKode(
			final String entrantDocumnetUniversityKode) {
		this.entrantDocumnetUniversityKode = entrantDocumnetUniversityKode;
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
	public String getPostIndex() {
		return postIndex;
	}
	public void setPostIndex(final String postIndex) {
		this.postIndex = postIndex;
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
	public String getEntrantDocumentIssued() {
		return entrantDocumentIssued;
	}
	public void setEntrantDocumentIssued(final String entrantDocumentIssued) {
		this.entrantDocumentIssued = entrantDocumentIssued;
	}
	public int getIdEntrantDocumentsAwardType() {
		return idEntrantDocumentsAwardType;
	}
	public void setIdEntrantDocumentsAwardType(final int idEntrantDocumentsAwardType) {
		this.idEntrantDocumentsAwardType = idEntrantDocumentsAwardType;
	}
	public int getAllowProcessedPersonalData() {
		return allowProcessedPersonalData;
	}
	public void setAllowProcessedPersonalData(final int allowProcessedPersonalData) {
		this.allowProcessedPersonalData = allowProcessedPersonalData;
	}
	public String getPosvidkaSeries() {
		return posvidkaSeries;
	}
	public void setPosvidkaSeries(final String posvidkaSeries) {
		this.posvidkaSeries = posvidkaSeries;
	}
	public String getPosvidkaNumber() {
		return posvidkaNumber;
	}
	public void setPosvidkaNumber(final String posvidkaNumber) {
		this.posvidkaNumber = posvidkaNumber;
	}
	public String getPosvidkaIssued() {
		return posvidkaIssued;
	}
	public void setPosvidkaIssued(final String posvidkaIssued) {
		this.posvidkaIssued = posvidkaIssued;
	}
	public String getPosvidkaDate() {
		return posvidkaDate;
	}
	public void setPosvidkaDate(final String posvidkaDate) {
		this.posvidkaDate = posvidkaDate;
	}
	public int getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(final int idCountry) {
		this.idCountry = idCountry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((adress == null) ? 0 : adress.hashCode());
		result = prime * result + allowProcessedPersonalData;
		result = prime
				* result
				+ ((birthCertificateDate == null) ? 0 : birthCertificateDate
						.hashCode());
		result = prime
				* result
				+ ((birthCertificateNumber == null) ? 0
						: birthCertificateNumber.hashCode());
		result = prime
				* result
				+ ((birthCertificateSeries == null) ? 0
						: birthCertificateSeries.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result
				+ ((birthplace == null) ? 0 : birthplace.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime
				* result
				+ ((entrantDocumentDate == null) ? 0 : entrantDocumentDate
						.hashCode());
		result = prime
				* result
				+ ((entrantDocumentIssued == null) ? 0 : entrantDocumentIssued
						.hashCode());
		result = prime
				* result
				+ ((entrantDocumentNumber == null) ? 0 : entrantDocumentNumber
						.hashCode());
		result = prime
				* result
				+ ((entrantDocumentSeries == null) ? 0 : entrantDocumentSeries
						.hashCode());
		result = prime
				* result
				+ ((entrantDocumentValue == null) ? 0 : entrantDocumentValue
						.hashCode());
		result = prime
				* result
				+ ((entrantDocumnetUniversityKode == null) ? 0
						: entrantDocumnetUniversityKode.hashCode());
		result = prime * result + ((father == null) ? 0 : father.hashCode());
		result = prime * result
				+ ((fatherPhones == null) ? 0 : fatherPhones.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result
				+ ((homeNumber == null) ? 0 : homeNumber.hashCode());
		result = prime * result + ((icq == null) ? 0 : icq.hashCode());
		result = prime * result + idCountry;
		result = prime * result + idEntrantDocumentsAwardType;
		result = prime * result + idEntrantDocumnetType;
		result = prime * result + idPersonSex;
		result = prime * result + idStreetType;
		result = prime * result + isForeinghEntrantDocumet;
		result = prime * result + isNotCheckAttestat;
		result = prime * result
				+ ((koatuuCode == null) ? 0 : koatuuCode.hashCode());
		result = prime * result
				+ ((kodeSchool == null) ? 0 : kodeSchool.hashCode());
		result = prime
				* result
				+ ((languagesAreStudied == null) ? 0 : languagesAreStudied
						.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result
				+ ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
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
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result
				+ ((postIndex == null) ? 0 : postIndex.hashCode());
		result = prime * result
				+ ((posvidkaDate == null) ? 0 : posvidkaDate.hashCode());
		result = prime * result
				+ ((posvidkaIssued == null) ? 0 : posvidkaIssued.hashCode());
		result = prime * result
				+ ((posvidkaNumber == null) ? 0 : posvidkaNumber.hashCode());
		result = prime * result
				+ ((posvidkaSeries == null) ? 0 : posvidkaSeries.hashCode());
		result = prime * result + resident;
		result = prime * result + ((skype == null) ? 0 : skype.hashCode());
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
		PersonEntrant other = (PersonEntrant) obj;
		if (adress == null) {
			if (other.adress != null) {
				return false;
			}
		} else if (!adress.equals(other.adress)) {
			return false;
		}
		if (allowProcessedPersonalData != other.allowProcessedPersonalData) {
			return false;
		}
		if (birthCertificateDate == null) {
			if (other.birthCertificateDate != null) {
				return false;
			}
		} else if (!birthCertificateDate.equals(other.birthCertificateDate)) {
			return false;
		}
		if (birthCertificateNumber == null) {
			if (other.birthCertificateNumber != null) {
				return false;
			}
		} else if (!birthCertificateNumber.equals(other.birthCertificateNumber)) {
			return false;
		}
		if (birthCertificateSeries == null) {
			if (other.birthCertificateSeries != null) {
				return false;
			}
		} else if (!birthCertificateSeries.equals(other.birthCertificateSeries)) {
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
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (entrantDocumentDate == null) {
			if (other.entrantDocumentDate != null) {
				return false;
			}
		} else if (!entrantDocumentDate.equals(other.entrantDocumentDate)) {
			return false;
		}
		if (entrantDocumentIssued == null) {
			if (other.entrantDocumentIssued != null) {
				return false;
			}
		} else if (!entrantDocumentIssued.equals(other.entrantDocumentIssued)) {
			return false;
		}
		if (entrantDocumentNumber == null) {
			if (other.entrantDocumentNumber != null) {
				return false;
			}
		} else if (!entrantDocumentNumber.equals(other.entrantDocumentNumber)) {
			return false;
		}
		if (entrantDocumentSeries == null) {
			if (other.entrantDocumentSeries != null) {
				return false;
			}
		} else if (!entrantDocumentSeries.equals(other.entrantDocumentSeries)) {
			return false;
		}
		if (entrantDocumentValue == null) {
			if (other.entrantDocumentValue != null) {
				return false;
			}
		} else if (!entrantDocumentValue.equals(other.entrantDocumentValue)) {
			return false;
		}
		if (entrantDocumnetUniversityKode == null) {
			if (other.entrantDocumnetUniversityKode != null) {
				return false;
			}
		} else if (!entrantDocumnetUniversityKode
				.equals(other.entrantDocumnetUniversityKode)) {
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
		if (firstName == null) {
			if (other.firstName != null) {
				return false;
			}
		} else if (!firstName.equals(other.firstName)) {
			return false;
		}
		if (homeNumber == null) {
			if (other.homeNumber != null) {
				return false;
			}
		} else if (!homeNumber.equals(other.homeNumber)) {
			return false;
		}
		if (icq == null) {
			if (other.icq != null) {
				return false;
			}
		} else if (!icq.equals(other.icq)) {
			return false;
		}
		if (idCountry != other.idCountry) {
			return false;
		}
		if (idEntrantDocumentsAwardType != other.idEntrantDocumentsAwardType) {
			return false;
		}
		if (idEntrantDocumnetType != other.idEntrantDocumnetType) {
			return false;
		}
		if (idPersonSex != other.idPersonSex) {
			return false;
		}
		if (idStreetType != other.idStreetType) {
			return false;
		}
		if (isForeinghEntrantDocumet != other.isForeinghEntrantDocumet) {
			return false;
		}
		if (isNotCheckAttestat != other.isNotCheckAttestat) {
			return false;
		}
		if (koatuuCode == null) {
			if (other.koatuuCode != null) {
				return false;
			}
		} else if (!koatuuCode.equals(other.koatuuCode)) {
			return false;
		}
		if (kodeSchool == null) {
			if (other.kodeSchool != null) {
				return false;
			}
		} else if (!kodeSchool.equals(other.kodeSchool)) {
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
		if (mobile == null) {
			if (other.mobile != null) {
				return false;
			}
		} else if (!mobile.equals(other.mobile)) {
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
		if (phone == null) {
			if (other.phone != null) {
				return false;
			}
		} else if (!phone.equals(other.phone)) {
			return false;
		}
		if (postIndex == null) {
			if (other.postIndex != null) {
				return false;
			}
		} else if (!postIndex.equals(other.postIndex)) {
			return false;
		}
		if (posvidkaDate == null) {
			if (other.posvidkaDate != null) {
				return false;
			}
		} else if (!posvidkaDate.equals(other.posvidkaDate)) {
			return false;
		}
		if (posvidkaIssued == null) {
			if (other.posvidkaIssued != null) {
				return false;
			}
		} else if (!posvidkaIssued.equals(other.posvidkaIssued)) {
			return false;
		}
		if (posvidkaNumber == null) {
			if (other.posvidkaNumber != null) {
				return false;
			}
		} else if (!posvidkaNumber.equals(other.posvidkaNumber)) {
			return false;
		}
		if (posvidkaSeries == null) {
			if (other.posvidkaSeries != null) {
				return false;
			}
		} else if (!posvidkaSeries.equals(other.posvidkaSeries)) {
			return false;
		}
		if (resident != other.resident) {
			return false;
		}
		if (skype == null) {
			if (other.skype != null) {
				return false;
			}
		} else if (!skype.equals(other.skype)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonEntrant [resident=" + resident + ", birthday=" + birthday
				+ ", idPersonSex=" + idPersonSex + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", koatuuCode=" + koatuuCode + ", idStreetType="
				+ idStreetType + ", adress=" + adress + ", homeNumber="
				+ homeNumber + ", entrantDocumentSeries="
				+ entrantDocumentSeries + ", entrantDocumentNumber="
				+ entrantDocumentNumber + ", entrantDocumentDate="
				+ entrantDocumentDate + ", entrantDocumentValue="
				+ entrantDocumentValue + ", pasportSeries=" + pasportSeries
				+ ", pasportNumber=" + pasportNumber + ", pasportIssued="
				+ pasportIssued + ", pasportDate=" + pasportDate
				+ ", birthCertificateSeries=" + birthCertificateSeries
				+ ", birthCertificateNumber=" + birthCertificateNumber
				+ ", birthCertificateDate=" + birthCertificateDate
				+ ", kodeSchool=" + kodeSchool + ", phone=" + phone
				+ ", mobile=" + mobile + ", email=" + email + ", skype="
				+ skype + ", icq=" + icq + ", isForeinghEntrantDocumet="
				+ isForeinghEntrantDocumet + ", isNotCheckAttestat="
				+ isNotCheckAttestat + ", idEntrantDocumnetType="
				+ idEntrantDocumnetType + ", entrantDocumnetUniversityKode="
				+ entrantDocumnetUniversityKode + ", father=" + father
				+ ", mother=" + mother + ", fatherPhones=" + fatherPhones
				+ ", motherPhones=" + motherPhones + ", postIndex=" + postIndex
				+ ", birthplace=" + birthplace + ", languagesAreStudied="
				+ languagesAreStudied + ", entrantDocumentIssued="
				+ entrantDocumentIssued + ", idEntrantDocumentsAwardType="
				+ idEntrantDocumentsAwardType + ", allowProcessedPersonalData="
				+ allowProcessedPersonalData + ", posvidkaSeries="
				+ posvidkaSeries + ", posvidkaNumber=" + posvidkaNumber
				+ ", posvidkaIssued=" + posvidkaIssued + ", posvidkaDate="
				+ posvidkaDate + ", idCountry=" + idCountry + "]";
	}
	
}
