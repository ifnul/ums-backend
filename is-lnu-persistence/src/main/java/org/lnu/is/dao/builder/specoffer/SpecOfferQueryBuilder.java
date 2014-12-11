package org.lnu.is.dao.builder.specoffer;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.dao.builder.QueryBuilder;
import org.lnu.is.domain.specoffer.SpecOffer;

/**
 * Spec Offer Query Builder.
 * @author ivanursul
 *
 */
@QBuilder("specOfferQueryBuilder")
public class SpecOfferQueryBuilder implements QueryBuilder<SpecOffer> {

	private static final String QUERY = "SELECT s FROM SpecOffer s %s";

	private static final String PARENT_CONDITION = "s.parent = :parent ";
	private static final String SPECIALTY_CONDITION = "s.specialty = :specialty ";
	private static final String DEPARTMENT_CONDITION = "s.department = :department ";
	private static final String TIMEPERIOD_CONDITION = "s.timePeriod = :timePeriod ";
	private static final String EDUFORMTYPE_CONDITION = "s.eduFormType = :eduFormType ";
	private static final String SPECOFFERTYPE_CONDITION = "s.specOfferType :specOfferType ";
	private static final String DOCSERIES_CONDITION = "s.docSeries LIKE CONCAT('%',:docSeries,'%') ";
	private static final String DOCNUM_CONDITION = "s.docNum LIKE CONCAT('%',:docNum,'%') ";
	private static final String LICCOUNT_CONDITION = "s.licCount = :licCount ";
	private static final String STATECOUNT_CONDITION = "s.stateCount = :stateCount ";
	private static final String BEGDATE_CONDITION = "t.begDate <= :begDate ";
	private static final String ENDDATE_CONDITION = "t.endDate >= :endDate";
	
	@Override
	public String build(final SpecOffer context) {
		
		String query = BaseQueryBuilder.getInstance(QUERY)
				.where()
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
				.build();
		
		return query;
	}

}
