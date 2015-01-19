package org.lnu.is.dao.builder.specoffer;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecOffer;

/**
 * Spec Offer Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferQueryBuilder")
public class SpecOfferQueryBuilder extends AbstractQueryBuilder<SpecOffer> {
	private static final String PARENT_CONDITION = "e.parent = :parent ";
	private static final String SPECIALTY_CONDITION = "e.specialty = :specialty ";
	private static final String DEPARTMENT_CONDITION = "e.department = :department ";
	private static final String TIMEPERIOD_CONDITION = "e.timePeriod = :timePeriod ";
	private static final String EDUFORMTYPE_CONDITION = "e.eduFormType = :eduFormType ";
	private static final String SPECOFFERTYPE_CONDITION = "e.specOfferType :specOfferType ";
	private static final String DOCSERIES_CONDITION = "e.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "e.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String LICCOUNT_CONDITION = "e.licCount = :licCount ";
	private static final String STATECOUNT_CONDITION = "e.stateCount = :stateCount ";
	private static final String BEGDATE_CONDITION = "e.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "e.endDate >= :endDate";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecOffer e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOffer context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
				.addOrCondition(PARENT_CONDITION, context.getParent())
				.addOrCondition(SPECIALTY_CONDITION, context.getSpecialty())
				.addOrCondition(DEPARTMENT_CONDITION, context.getDepartment())
				.addOrCondition(TIMEPERIOD_CONDITION, context.getTimePeriod())
				.addOrCondition(EDUFORMTYPE_CONDITION, context.getEduFormType())
				.addOrCondition(SPECOFFERTYPE_CONDITION, context.getSpecOfferType())
				.addOrCondition(DOCSERIES_CONDITION, context.getDocSeries())
				.addOrCondition(DOCNUM_CONDITION, context.getDocNum())
				.addOrCondition(LICCOUNT_CONDITION, context.getLicCount())
				.addOrCondition(STATECOUNT_CONDITION, context.getStateCount())
				.addOrCondition(BEGDATE_CONDITION, context.getBegDate())
				.addOrCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
