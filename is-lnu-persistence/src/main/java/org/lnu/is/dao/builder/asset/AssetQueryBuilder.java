package org.lnu.is.dao.builder.asset;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.asset.Asset;

/**
 * Asset Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("assetQueryBuilder")
public class AssetQueryBuilder extends AbstractQueryBuilder<Asset> {
	private static final String NAME_CONDITION = "e.name LIKE CONCAT('%',:name,'%') ";
	private static final String DESCRIPTION_CONDITION = "e.description LIKE CONCAT('%',:description,'%') ";
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String ORDER_CONDITION = "e.order = :order ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate ";
	private static final String PRODDATE_CONDITION = "e.prodDate = :prodDate ";
	private static final String SERIALNUM_CONDITION = "e.serialNum = :serialNum ";
	private static final String INVNUM_CONDITION = "e.invNum = :invNum ";
	private static final String PARTNER_CONDITION = "e.partner = :partner ";
	private static final String EMPLOYEE_CONDITION = "e.employee = :employee ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String ASSETSTATUS_CONDITION = "e.assetStatus = :assetStatus ";
	private static final String ASSETSTATE_CONDITION = "e.assetState = :assetState ";
	private static final String ASSETTYPE_CONDITION = "e.assetType = :assetType ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Asset e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Asset context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
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
				.closeBracket();
	}

}
