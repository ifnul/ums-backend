package org.lnu.is.facade.resource.person.address;

import java.text.MessageFormat;
import java.util.Date;

import org.lnu.is.facade.resource.ApiResource;

/**
 * Person Address resource.
 * @author ivanursul
 *
 */
public class PersonAddressResource extends ApiResource {

	private Long personId;

	private Long addressTypeId;
	
	private Long adminUnitId;

	private Long streetTypeId;

	private Long assetId;

	private String zipCode;
	
	private String street;
	
	private String house;
	
	private String apartment;
	
	private Date begDate;
	
	private Date endDate;

	@Override
	public String getUri() {
		return MessageFormat.format("/persons/{0}/addresses/{1}", personId, getId());
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(final Long personId) {
		this.personId = personId;
	}

	public Long getAddressTypeId() {
		return addressTypeId;
	}

	public void setAddressTypeId(final Long addressTypeId) {
		this.addressTypeId = addressTypeId;
	}

	public Long getAdminUnitId() {
		return adminUnitId;
	}

	public void setAdminUnitId(final Long adminUnitId) {
		this.adminUnitId = adminUnitId;
	}

	public Long getStreetTypeId() {
		return streetTypeId;
	}

	public void setStreetTypeId(final Long streetTypeId) {
		this.streetTypeId = streetTypeId;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(final Long assetId) {
		this.assetId = assetId;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(final String zipCode) {
		this.zipCode = zipCode;
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

	@Override
	public String toString() {
		return "PersonAddressResource [personId=" + personId
				+ ", addressTypeId=" + addressTypeId + ", adminUnitId="
				+ adminUnitId + ", streetTypeId=" + streetTypeId + ", assetId="
				+ assetId + ", zipCode=" + zipCode + ", street=" + street
				+ ", house=" + house + ", apartment=" + apartment
				+ ", begDate=" + begDate + ", endDate=" + endDate + "]";
	}

}
