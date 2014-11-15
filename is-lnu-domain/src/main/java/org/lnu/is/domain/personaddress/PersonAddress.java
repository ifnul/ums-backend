package org.lnu.is.domain.personaddress;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.lnu.is.annotation.dbtable.OD;
import org.lnu.is.domain.Model;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.domain.adminunit.AdminUnit;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.streettype.StreetType;
/**
 * Person Address entity.
 * @author illay
 *
 */
@OD
@Entity
@Table(name = "q_od_personaddress")
public class PersonAddress extends Model {

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	
	@ManyToOne
	@JoinColumn(name = "addresstype_id")
	private AddressType addressType;
	
	@Column(name = "zipcode")
	private String zipCode;
	
	@ManyToOne
	@JoinColumn(name = "adminunit_id")
	private AdminUnit adminUnit;
	
	@ManyToOne
	@JoinColumn(name = "streettype_id")
	private StreetType streetType;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "house")
	private String house;
	
	@Column(name = "apartment")
	private String apartment;
	
	@Column(name = "begdate")
	private Date begDate;
	
	@Column(name = "enddate")
	private Date endDate;
	
	@ManyToOne
	@JoinColumn(name = "asset_id")
	private Asset asset;

	public Person getPerson() {
		return person;
	}

	public void setPerson(final Person person) {
		this.person = person;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(final AddressType addressType) {
		this.addressType = addressType;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
	}

	public AdminUnit getAdminUnit() {
		return adminUnit;
	}

	public void setAdminUnit(final AdminUnit adminUnit) {
		this.adminUnit = adminUnit;
	}

	public StreetType getStreetType() {
		return streetType;
	}

	public void setStreetType(final StreetType streetType) {
		this.streetType = streetType;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(final String street) {
		this.street = street;
	}

	public String getHouse() {
		return house;
	}

	public void setHouse(final String house) {
		this.house = house;
	}

	public String getApartment() {
		return apartment;
	}

	public void setApartment(final String apartment) {
		this.apartment = apartment;
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

	public Asset getAsset() {
		return asset;
	}

	public void setAsset(final Asset asset) {
		this.asset = asset;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((apartment == null) ? 0 : apartment.hashCode());
		result = prime * result + ((begDate == null) ? 0 : begDate.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((house == null) ? 0 : house.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
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
		PersonAddress other = (PersonAddress) obj;
		if (apartment == null) {
			if (other.apartment != null) {
				return false;
			}
		} else if (!apartment.equals(other.apartment)) {
			return false;
		}
		if (begDate == null) {
			if (other.begDate != null) {
				return false;
			}
		} else if (!begDate.equals(other.begDate)) {
			return false;
		}
		if (endDate == null) {
			if (other.endDate != null) {
				return false;
			}
		} else if (!endDate.equals(other.endDate)) {
			return false;
		}
		if (house == null) {
			if (other.house != null) {
				return false;
			}
		} else if (!house.equals(other.house)) {
			return false;
		}
		if (street == null) {
			if (other.street != null) {
				return false;
			}
		} else if (!street.equals(other.street)) {
			return false;
		}
		if (zipCode == null) {
			if (other.zipCode != null) {
				return false;
			}
		} else if (!zipCode.equals(other.zipCode)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "PersonAddress [zipCode=" + zipCode + ", street=" + street
				+ ", house=" + house + ", apartment=" + apartment
				+ ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}
	
}
