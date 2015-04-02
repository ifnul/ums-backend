package org.lnu.is.dao.builder.order;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.order.Order;

/**
 * Order Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("orderQueryBuilder")
public class OrderQueryBuilder extends AbstractQueryBuilder<Order> {

	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String ORDERTYPE_CONDITION = "e.orderType = :orderType ";
	private static final String EMPLOYEE_CONDITION = "e.employee = :employee ";
	private static final String ASSET_CONDITION = "e.asset = :asset ";
	private static final String PARTNER_CONDITION = "e.partner = :partner ";
	private static final String OPTYPE_CONDITION = "e.opType = :opType ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String REASON_CONDITION = "e.reason = :reason ";
	private static final String REASONTEXT_CONDITION = "e.reasonText LIKE CONCAT('%',:reasonText,'%') ";
	private static final String DOCDATE_CONDITION = "e.docDate = :docDate ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCISSUED_CONDITION = "e.docIssued LIKE CONCAT('%',:docIssued,'%') ";
	private static final String EVDATE_CONDITION = "e.evDate = :evDate ";
	private static final String TITLE_CONDITION = "e.title = :title ";
	private static final String DESCRIPTION_CONDITION = "e.description = :description";
	private static final String TIMEPERIOD_CONDITION = "e.timePeriod = :timePeriod";
	
	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Order e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Order context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(ORDERTYPE_CONDITION, context.getOrderType())
					.addAndCondition(EMPLOYEE_CONDITION, context.getEmployee())
					.addAndCondition(ASSET_CONDITION, context.getAsset())
					.addAndCondition(PARTNER_CONDITION, context.getPartner())
					.addAndCondition(OPTYPE_CONDITION, context.getOpType())
					.addAndCondition(DEPARTMENT_CONDITION, context.getDepartment())
					.addAndCondition(REASON_CONDITION, context.getReason())
					.addAndCondition(PARENT_CONDITION, context.getParent())
					.addAndCondition(REASONTEXT_CONDITION, context.getReasonText())
					.addAndCondition(DOCSERIES_CONDITION, context.getDocSeries())
					.addAndCondition(DOCNUM_CONDITION, context.getDocNum())
					.addAndCondition(DOCDATE_CONDITION, context.getDocDate())
					.addAndCondition(DOCISSUED_CONDITION, context.getDocIssued())
					.addAndCondition(EVDATE_CONDITION, context.getEvDate())
					.addAndCondition(TITLE_CONDITION, context.getTitle())
					.addAndCondition(DESCRIPTION_CONDITION, context.getDescription())
					.addAndCondition(TIMEPERIOD_CONDITION, context.getTimePeriod())
				.closeBracket();
	}
}
