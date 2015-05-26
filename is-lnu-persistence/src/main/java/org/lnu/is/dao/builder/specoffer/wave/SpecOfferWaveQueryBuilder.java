package org.lnu.is.dao.builder.specoffer.wave;

import org.lnu.is.dao.annotations.QBuilder;
import org.lnu.is.dao.builder.AbstractQueryBuilder;
import org.lnu.is.dao.builder.BaseQueryBuilder;
import org.lnu.is.domain.specoffer.SpecOfferWave;

/**
 * Query Builder for SpecOfferWave.
 * @author ivanursul
 *
 */
@QBuilder("specOfferWaveQueryBuilder")
public class SpecOfferWaveQueryBuilder extends AbstractQueryBuilder<SpecOfferWave> {
	private static final String SPECOFFER_CONDITION = "e.specOffer = :specOffer ";
	private static final String WAVETYPE_CONDITION = "e.waveType = :waveType ";
	private static final String LICCOUNT_CONDITION = "e.licCount =:licCount ";
	private static final String STATECOUNT_CONDITION = "e.stateCount =:stateCount ";
	private static final String BENEFITCOUNT_CONDITION = "e.benefitCount =:benefitCount ";
	private static final String TARGETCOUNT_CONDITION = "e.targetCount =:targetCount ";
	private static final String BEGINDATE_CONDITION = "e.beginDate >=:beginDate ";
	private static final String ENDDATE_CONDITION = "e.endDate <=:endDate ";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecOfferWave e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOfferWave context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addAndCondition(SPECOFFER_CONDITION, context.getSpecOffer())
					.addAndCondition(WAVETYPE_CONDITION, context.getWaveType())
					.addAndCondition(LICCOUNT_CONDITION, context.getLicCount())
					.addAndCondition(STATECOUNT_CONDITION, context.getStateCount())
					.addAndCondition(BENEFITCOUNT_CONDITION, context.getBenefitCount())
					.addAndCondition(TARGETCOUNT_CONDITION, context.getTargetCount())
					.addAndCondition(BEGINDATE_CONDITION, context.getBeginDate())
					.addAndCondition(ENDDATE_CONDITION, context.getEndDate())
				.closeBracket();
	}

}
