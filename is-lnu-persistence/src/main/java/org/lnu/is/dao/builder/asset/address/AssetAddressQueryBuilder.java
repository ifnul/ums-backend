package org.lnu.is.dao.builder.asset.address;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.asset.address.AssetAddress;

/**
 * AssetAddress Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("assetAddressQueryBuilder")
public class AssetAddressQueryBuilder extends AbstractQueryBuilder<AssetAddress> {

	private static final String ADMINUNIT_CONDITION = "e.adminUnit = :adminUnit ";
	private static final String ASSET_CONDITION = "e.asset = :asset ";
	private static final String ADDRESSTYPE_CONDITION = "e.addressType = :addressType ";
	private static final String STREETTYPE_CONDITION = "e.streetType = :streetType ";

	private static final String ZIPCODE_CONDITION = "e.zipCode LIKE CONCAT('%',:zipCode,'%') ";
	private static final String STREET_CONDITION = "e.street LIKE CONCAT('%',:street,'%') ";
	private static final String HOUSE_CONDITION = "e.house LIKE CONCAT('%',:house,'%') ";
	private static final String APARTMENT_CONDITION = "e.apartment LIKE CONCAT('%',:apartment,'%') ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM AssetAddress e %s";
	}

	@Override
	protected BaseQueryBuilder build(final AssetAddress context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(ADMINUNIT_CONDITION, context.getAdminUnit())
					.addOrCondition(ASSET_CONDITION, context.getAsset())
					.addOrCondition(ADDRESSTYPE_CONDITION, context.getAddressType())
					.addOrCondition(STREETTYPE_CONDITION, context.getStreetType())
					.addOrCondition(ZIPCODE_CONDITION, context.getZipCode())
					.addOrCondition(STREET_CONDITION, context.getStreet())
					.addOrCondition(HOUSE_CONDITION, context.getHouse())
					.addOrCondition(APARTMENT_CONDITION, context.getApartment())
				.closeBracket();
	}

}
