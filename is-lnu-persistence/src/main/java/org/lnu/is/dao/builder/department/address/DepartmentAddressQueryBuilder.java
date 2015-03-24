package org.lnu.is.dao.builder.department.address;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.department.address.DepartmentAddress;

/**
 * DepartmentAddressQueryBuilder.
 * @author ivanursul
 *
 */
@QBuilder("departmentAddressQueryBuilder")
public class DepartmentAddressQueryBuilder extends AbstractQueryBuilder<DepartmentAddress> {
	
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String ADDRESSTYPE_CONDITION = "e.addressType = :addressType ";
	private static final String ADMINUNIT_CONDITION = "e.adminUnit = :adminUnit ";
	private static final String STREETTYPE_CONDITION = "e.streetType = :streetType ";
	
	private static final String ZIPCODE_CONDITION = "e.zipCode LIKE CONCAT('%',:zipCode,'%') ";
	private static final String STREET_CONIDITON = "e.street LIKE CONCAT('%',:street,'%') ";
	private static final String HOUSE_CONDITION = "e.house LIKE CONCAT('%',:house,'%') ";
	private static final String APARTMENT_CONDITION = "e.apartment LIKE CONCAT('%',:apartment,'%') ";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM DepartmentAddress e %s";
	}

	@Override
	protected BaseQueryBuilder build(final DepartmentAddress context, final BaseQueryBuilder builder) {
		return builder	
				.where()
				.openBracket()
					.addAndCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addAndCondition(ADDRESSTYPE_CONDITION, context.getAddressType())
					.addAndCondition(ADMINUNIT_CONDITION, context.getAdminUnit())
					.addAndCondition(STREETTYPE_CONDITION, context.getStreetType())
					.addAndCondition(ZIPCODE_CONDITION, context.getZipCode())
					.addAndCondition(STREET_CONIDITON, context.getStreet())
					.addAndCondition(HOUSE_CONDITION, context.getHouse())
					.addAndCondition(APARTMENT_CONDITION, context.getApartment())
				.closeBracket();
	}

}
