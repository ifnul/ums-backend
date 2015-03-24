package org.lnu.is.dao.builder.person.address;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.person.address.PersonAddress;

/**
 * Person Address Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("personAddressQueryBuilder")
public class PersonAddressQueryBuilder extends AbstractQueryBuilder<PersonAddress> {
	private static final String PERSON_CONDITION = "e.person = :person ";
	private static final String ADRESS_TYPE_CONDITION = "e.addressType = :addressType ";
	private static final String ADMINUNIT_CONDITION = "e.adminUnit = :adminUnit ";
	private static final String STREETTYPE_CONDITION = "e.streetType =:streetType ";
	private static final String ASSET_CONDITION = "e.asset = :asset ";
	private static final String ZIPCODE_CONDITION = "e.zipCode LIKE CONCAT('%',:zipCode,'%') ";
	private static final String STREET_CONDITION = "e.street LIKE CONCAT('%',:street,'%') ";
	private static final String HOUSE_CONDITION = "e.house LIKE CONCAT('%',:house,'%') ";
	private static final String APARTMENT_CONDITION = "e.apartment LIKE CONCAT('%',:apartment,'%') ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM PersonAddress e %s";
	}

	@Override
	protected BaseQueryBuilder build(final PersonAddress context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(PERSON_CONDITION, context.getPerson())
					.addAndCondition(ADRESS_TYPE_CONDITION, context.getAddressType())
					.addAndCondition(ADMINUNIT_CONDITION, context.getAdminUnit())
					.addAndCondition(STREETTYPE_CONDITION, context.getStreetType())
					.addAndCondition(ASSET_CONDITION, context.getAsset())
					.addAndCondition(ZIPCODE_CONDITION, context.getZipCode())
					.addAndCondition(STREET_CONDITION, context.getStreet())
					.addAndCondition(HOUSE_CONDITION, context.getHouse())
					.addAndCondition(APARTMENT_CONDITION, context.getApartment())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
