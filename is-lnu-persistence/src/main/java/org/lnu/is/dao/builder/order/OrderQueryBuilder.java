package org.lnu.is.dao.builder.order;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.order.Order;

/**
 * Order Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("orderQueryBuilder")
public class OrderQueryBuilder implements QueryBuilder<Order> {

	private static final String QUERY = "SELECT o FROM Order o %s";

	private static final String PARENT_CONDITION = "o.parent = :parent ";
	
	private static final String ORDERTYPE_CONDITION = "o.orderType = :orderType ";
	private static final String EMPLOYEE_CONDITION = "o.employee = :employee ";
	private static final String ASSET_CONDITION = "o.asset = :asset ";
	private static final String PARTNER_CONDITION = "o.partner = :partner ";
	private static final String OPTYPE_CONDITION = "o.opType = :opType ";
	private static final String DEPARTMENT_CONDITION = "o.department = :department ";
	private static final String REASON_CONDITION = "o.reason = :reason ";
	private static final String REASONTEXT_CONDITION = "o.reasonText LIKE CONCAT('%',:reasonText,'%') ";
	private static final String DOCDATE_CONDITION = "o.docDate = :docDate ";
	private static final String DOCNUM_CONDITION = "o.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String DOCSERIES_CONDITION = "o.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCISSUED_CONDITION = "o.docIssued LIKE CONCAT('%',:docIssued,'%') ";
	private static final String EVDATE_CONDITION = "o.evDate = :evDate ";
	
	@Override
	public String build(final Order context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
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
				.addOrCondition(EVDATE_CONDITION, context.getEvDate())
				.build();
		
		return query;
	}
}
