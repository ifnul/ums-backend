package org.lnu.is.domain.person.entrant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Person Entrant Auto View.
 * @author ivanursul
 *
 */
@Entity
@Table(name = "v_ob_person_entrant_auto")
public class PersonEntrantAuto {

	@Column(name = "person_sex_id")
	private int idPersonSex;
	
	@Column(name = "zno_pin")
	private int znoPin;
	
	@Column(name = "entrant_document_awart_type_id")
	private int idEntrantDocumentsAwardType;
	
	@Column(name = "allow_process_personal_date")
	private int allowProcessedPersonalData;

	@Column(name = "zno_numbers")
	private String znoNumbers;
	
	@Column(name = "zno_date_get")
    private String znoDateGet;
	
	@Column(name = "attestat_series")
    private String attestatSeries;
	
	@Column(name = "attestat_number")
    private String attestatNumber;
	
	@Column(name = "attestat_date")
    private String attestatDate;
	
	@Column(name = "attestat_value")
    private String attestatValue;
	
	@Column(name = "passport_series")
    private String pasportSeries;
	
	@Column(name = "passport_number")
    private String pasportNumber;
	
	@Column(name = "passport_issued")
    private String pasportIssued;
	
	@Column(name = "passport_date")
    private String pasportDate;
	
	@Column(name = "birth_cerificate_series")
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
	
	@Column(name = "father")
    private String father;
	
	@Column(name = "mother")
    private String mother;
	
	@Column(name = "father_phone")
    private String fatherPhones;
	
	@Column(name = "mother_phone")
    private String motherPhones;
	
	@Column(name = "birthplace")
    private String birthplace;
	
	@Column(name = "languages_studied")
    private String languagesAreStudied;
    
	public int getIdPersonSex() {
		return idPersonSex;
	}
	public void setIdPersonSex(final int idPersonSex) {
		this.idPersonSex = idPersonSex;
	}
	public int getZnoPin() {
		return znoPin;
	}
	public void setZnoPin(final int znoPin) {
		this.znoPin = znoPin;
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
	public String getZnoNumbers() {
		return znoNumbers;
	}
	public void setZnoNumbers(final String znoNumbers) {
		this.znoNumbers = znoNumbers;
	}
	public String getZnoDateGet() {
		return znoDateGet;
	}
	public void setZnoDateGet(final String znoDateGet) {
		this.znoDateGet = znoDateGet;
	}
	public String getAttestatSeries() {
		return attestatSeries;
	}
	public void setAttestatSeries(final String attestatSeries) {
		this.attestatSeries = attestatSeries;
	}
	public String getAttestatNumber() {
		return attestatNumber;
	}
	public void setAttestatNumber(final String attestatNumber) {
		this.attestatNumber = attestatNumber;
	}
	public String getAttestatDate() {
		return attestatDate;
	}
	public void setAttestatDate(final String attestatDate) {
		this.attestatDate = attestatDate;
	}
	public String getAttestatValue() {
		return attestatValue;
	}
	public void setAttestatValue(final String attestatValue) {
		this.attestatValue = attestatValue;
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
		result = prime * result + allowProcessedPersonalData;
		result = prime * result
				+ ((attestatDate == null) ? 0 : attestatDate.hashCode());
		result = prime * result
				+ ((attestatNumber == null) ? 0 : attestatNumber.hashCode());
		result = prime * result
				+ ((attestatSeries == null) ? 0 : attestatSeries.hashCode());
		result = prime * result
				+ ((attestatValue == null) ? 0 : attestatValue.hashCode());
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
				+ ((birthplace == null) ? 0 : birthplace.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((father == null) ? 0 : father.hashCode());
		result = prime * result
				+ ((fatherPhones == null) ? 0 : fatherPhones.hashCode());
		result = prime * result + ((icq == null) ? 0 : icq.hashCode());
		result = prime * result + idEntrantDocumentsAwardType;
		result = prime * result + idPersonSex;
		result = prime * result
				+ ((kodeSchool == null) ? 0 : kodeSchool.hashCode());
		result = prime
				* result
				+ ((languagesAreStudied == null) ? 0 : languagesAreStudied
						.hashCode());
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
		result = prime * result + ((skype == null) ? 0 : skype.hashCode());
		result = prime * result
				+ ((znoDateGet == null) ? 0 : znoDateGet.hashCode());
		result = prime * result
				+ ((znoNumbers == null) ? 0 : znoNumbers.hashCode());
		result = prime * result + znoPin;
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
		PersonEntrantAuto other = (PersonEntrantAuto) obj;
		if (allowProcessedPersonalData != other.allowProcessedPersonalData) {
			return false;
		}
		if (attestatDate == null) {
			if (other.attestatDate != null) {
				return false;
			}
		} else if (!attestatDate.equals(other.attestatDate)) {
			return false;
		}
		if (attestatNumber == null) {
			if (other.attestatNumber != null) {
				return false;
			}
		} else if (!attestatNumber.equals(other.attestatNumber)) {
			return false;
		}
		if (attestatSeries == null) {
			if (other.attestatSeries != null) {
				return false;
			}
		} else if (!attestatSeries.equals(other.attestatSeries)) {
			return false;
		}
		if (attestatValue == null) {
			if (other.attestatValue != null) {
				return false;
			}
		} else if (!attestatValue.equals(other.attestatValue)) {
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
		if (icq == null) {
			if (other.icq != null) {
				return false;
			}
		} else if (!icq.equals(other.icq)) {
			return false;
		}
		if (idEntrantDocumentsAwardType != other.idEntrantDocumentsAwardType) {
			return false;
		}
		if (idPersonSex != other.idPersonSex) {
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
		if (skype == null) {
			if (other.skype != null) {
				return false;
			}
		} else if (!skype.equals(other.skype)) {
			return false;
		}
		if (znoDateGet == null) {
			if (other.znoDateGet != null) {
				return false;
			}
		} else if (!znoDateGet.equals(other.znoDateGet)) {
			return false;
		}
		if (znoNumbers == null) {
			if (other.znoNumbers != null) {
				return false;
			}
		} else if (!znoNumbers.equals(other.znoNumbers)) {
			return false;
		}
		if (znoPin != other.znoPin) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "PersonEntrantAuto [idPersonSex=" + idPersonSex + ", znoPin="
				+ znoPin + ", idEntrantDocumentsAwardType="
				+ idEntrantDocumentsAwardType + ", allowProcessedPersonalData="
				+ allowProcessedPersonalData + ", znoNumbers=" + znoNumbers
				+ ", znoDateGet=" + znoDateGet + ", attestatSeries="
				+ attestatSeries + ", attestatNumber=" + attestatNumber
				+ ", attestatDate=" + attestatDate + ", attestatValue="
				+ attestatValue + ", pasportSeries=" + pasportSeries
				+ ", pasportNumber=" + pasportNumber + ", pasportIssued="
				+ pasportIssued + ", pasportDate=" + pasportDate
				+ ", birthCertificateSeries=" + birthCertificateSeries
				+ ", birthCertificateNumber=" + birthCertificateNumber
				+ ", birthCertificateDate=" + birthCertificateDate
				+ ", kodeSchool=" + kodeSchool + ", phone=" + phone
				+ ", mobile=" + mobile + ", email=" + email + ", skype="
				+ skype + ", icq=" + icq + ", father=" + father + ", mother="
				+ mother + ", fatherPhones=" + fatherPhones + ", motherPhones="
				+ motherPhones + ", birthplace=" + birthplace
				+ ", languagesAreStudied=" + languagesAreStudied + "]";
	}
	
}
