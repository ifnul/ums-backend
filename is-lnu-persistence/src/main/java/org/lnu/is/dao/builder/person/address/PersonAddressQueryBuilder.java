package org.lnu.is.dao.builder.person.address;

import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.person.PersonAddress;
import org.lnu.is.queries.Queries;
import org.springframework.stereotype.Component;

/**
 * Person Address Query Builder.
 * @author ivanursul
 *
 */
@Component("personAddressQueryBuilder")
public class PersonAddressQueryBuilder implements QueryBuilder<PersonAddress> {
	private static final String QUERY_NAME = "PersonAddressQueryBuilder";
	private static final String QUERY = "SELECT p FROM PersonAddress p %s";

	private static final String PERSON_CONDITION = "p.person = :person ";
	private static final String ADRESS_TYPE_CONDITION = "p.addressType = :addressType ";
	private static final String ADMINUNIT_CONDITION = "p.adminUnit = :adminUnit ";
	private static final String STREETTYPE_CONDITION = "p.streetType =:streetType ";
	private static final String ASSET_CONDITION = "p.asset = :asset ";
	private static final String ZIPCODE_CONDITION = "p.zipCode LIKE CONCAT('%',:zipCode,'%') ";
	private static final String STREET_CONDITION = "p.street LIKE CONCAT('%',:street,'%') ";
	private static final String HOUSE_CONDITION = "p.house LIKE CONCAT('%',:house,'%') ";
	private static final String APARTMENT_CONDITION = "p.apartment LIKE CONCAT('%',:apartment,'%') ";
	private static final String BEGDATE_CONDITION = "p.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "p.endDate >= :endDate";
	
	@Override
	public Queries build(final PersonAddress context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(PERSON_CONDITION, context.getPerson())
				.addOrCondition(ADRESS_TYPE_CONDITION, context.getAddressType())
				.addOrCondition(ADMINUNIT_CONDITION, context.getAdminUnit())
				.addOrCondition(STREETTYPE_CONDITION, context.getStreetType())
				.addOrCondition(ASSET_CONDITION, context.getAsset())
				.addOrCondition(ZIPCODE_CONDITION, context.getZipCode())
				.addOrCondition(STREET_CONDITION, context.getStreet())
				.addOrCondition(HOUSE_CONDITION, context.getHouse())
				.addOrCondition(APARTMENT_CONDITION, context.getApartment())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.build();
		
		return new Queries(QUERY_NAME, query);
	}

}
