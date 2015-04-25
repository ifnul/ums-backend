package org.lnu.is.dao.builder.enrolment.status;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
/**
 * Enrolment Status query builder.
 * @author ivanursul
 *
 */
@QBuilder("enrolmentStatusQueryBuilder")
public class EnrolmentStatusQueryBuilder extends AbstractQueryBuilder<EnrolmentStatus> {
	private static final String ENROLMENT_CONDITION = "e.enrolment = :enrolment ";
	private static final String SPECOFFERWAVE_CONDITION = "e.specOfferWave =:specOfferWave ";
	private static final String ENROLMENTSTATUSTYPE_CONDITION = "e.enrolmentStatusType =:enrolmentStatusType ";
	private static final String ISCONTRACT_CONDITION = "e.isContract =:isContract ";
	private static final String ISSTATE_CONDITION = "e.isState =:isState ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM EnrolmentStatus e %s";
	}


	@Override
	protected BaseQueryBuilder build(final EnrolmentStatus context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(ENROLMENT_CONDITION, context.getEnrolment())
					.addAndCondition(SPECOFFERWAVE_CONDITION, context.getSpecOfferWave())
					.addAndCondition(ENROLMENTSTATUSTYPE_CONDITION, context.getEnrolmentStatusType())
					.addAndCondition(ISCONTRACT_CONDITION, context.getIsContract())
					.addAndCondition(ISSTATE_CONDITION, context.getIsState())
				.closeBracket();
	}

}
