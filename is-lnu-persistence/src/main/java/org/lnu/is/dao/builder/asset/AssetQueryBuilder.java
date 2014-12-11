package org.lnu.is.dao.builder.asset;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.asset.Asset;

/**
 * Asset Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("assetQueryBuilder")
public class AssetQueryBuilder implements QueryBuilder<Asset> {

	private static final String QUERY = "SELECT a FROM Asset a %s";

	private static final String NAME_CONDITION = "a.name LIKE CONCAT('%',:name,'%') ";
	private static final String DESCRIPTION_CONDITION = "a.description LIKE CONCAT('%',:description,'%') ";
	private static final String PARENT_CONDITION = "a.parent = :parent ";
	private static final String ORDER_CONDITION = "a.order = :order ";
	private static final String BEGDATE_CONDITION = "a.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "a.endDate >= :endDate ";
	private static final String PRODDATE_CONDITION = "a.prodDate = :prodDate ";
	private static final String SERIALNUM_CONDITION = "a.serialNum = :serialNum ";
	private static final String INVNUM_CONDITION = "a.invNum = :invNum ";
	private static final String PARTNER_CONDITION = "a.partner = :partner ";
	private static final String EMPLOYEE_CONDITION = "a.employee = :employee ";
	private static final String DEPARTMENT_CONDITION = "a.department = :department ";
	private static final String ASSETSTATUS_CONDITION = "a.assetStatus = :assetStatus ";
	private static final String ASSETSTATE_CONDITION = "a.assetState = :assetState ";
	private static final String ASSETTYPE_CONDITION = "a.assetType = :assetType ";

	@Override
	public String build(final Asset context) {
		
	String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
				.addOrCondition(DESCRIPTION_CONDITION, context.getDescription())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.addOrCondition(PRODDATE_CONDITION, context.getProdDate())
				.addOrCondition(SERIALNUM_CONDITION, context.getSerialNum())
				.addOrCondition(INVNUM_CONDITION, context.getInvNum())
				.addOrCondition(NAME_CONDITION, context.getName())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(ORDER_CONDITION, context.getOrder())
				.addOrCondition(PARTNER_CONDITION, context.getPartner())
				.addOrCondition(EMPLOYEE_CONDITION, context.getEmployee())
				.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
				.addOrCondition(ASSETSTATUS_CONDITION, context.getAssetStatus())
				.addOrCondition(ASSETSTATE_CONDITION, context.getAssetState())
				.addOrCondition(ASSETTYPE_CONDITION, context.getAssetType())
				.build();
		
		return query;
	}

}
