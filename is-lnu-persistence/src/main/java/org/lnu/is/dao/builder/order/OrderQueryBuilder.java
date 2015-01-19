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

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM Order e %s";
	}

	@Override
	protected BaseQueryBuilder build(final Order context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.addOrCondition(ORDERTYPE_CONDITION, context.getOrderType())
				.addOrCondition(EMPLOYEE_CONDITION, context.getEmployee())
				.addOrCondition(ASSET_CONDITION, context.getAsset())
				.addOrCondition(PARTNER_CONDITION, context.getPartner())
				.addOrCondition(OPTYPE_CONDITION, context.getOpType())
				.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
				.addOrCondition(REASON_CONDITION, context.getReason())
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(REASONTEXT_CONDITION, context.getReasonText())
				.addOrCondition(DOCSERIES_CONDITION, context.getDocSeries())
				.addOrCondition(DOCNUM_CONDITION, context.getDocNum())
				.addOrCondition(DOCDATE_CONDITION, context.getDocDate())
				.addOrCondition(DOCISSUED_CONDITION, context.getDocIssued())
				.addOrCondition(EVDATE_CONDITION, context.getEvDate());
	}
}
