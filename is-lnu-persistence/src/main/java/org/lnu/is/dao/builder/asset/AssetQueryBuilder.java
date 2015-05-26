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
					.addAndCondition(DESCRIPTION_CONDITION, context.getDescription())
					.addAndCondition(BEGDATE_CONDITION, context.getBegDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
					.addAndCondition(PRODDATE_CONDITION, context.getProdDate())
					.addAndCondition(SERIALNUM_CONDITION, context.getSerialNum())
					.addAndCondition(INVNUM_CONDITION, context.getInvNum())
					.addAndCondition(NAME_CONDITION, context.getName())
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(ORDER_CONDITION, context.getOrder())
					.addAndCondition(PARTNER_CONDITION, context.getPartner())
					.addAndCondition(EMPLOYEE_CONDITION, context.getEmployee())
					.addAndCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addAndCondition(ASSETSTATUS_CONDITION, context.getAssetStatus())
					.addAndCondition(ASSETSTATE_CONDITION, context.getAssetState())
					.addAndCondition(ASSETTYPE_CONDITION, context.getAssetType())
				.closeBracket();
	}

}
