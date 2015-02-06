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
	private static final String LICCOUNT_CONDITION = "e.licCount =:licCount";
	private static final String STATECOUNT_CONDITION = "e.stateCount =:stateCount";
	private static final String BENEFITCOUNT_CONDITION = "e.benefitCount =:benefitCount";
	private static final String TARGETCOUNT_CONDITION = "e.targetCount =:targetCount";

	@Override
	protected String getBaseQuery() {
		return "SELECT e FROM SpecOfferWave e %s";
	}

	@Override
	protected BaseQueryBuilder build(final SpecOfferWave context, final BaseQueryBuilder builder) {
		return builder
				.where()
				.openBracket()
					.addOrCondition(SPECOFFER_CONDITION, context.getSpecOffer())
					.addOrCondition(WAVETYPE_CONDITION, context.getWaveType())
					.addOrCondition(LICCOUNT_CONDITION, context.getLicCount())
					.addOrCondition(STATECOUNT_CONDITION, context.getStateCount())
					.addOrCondition(BENEFITCOUNT_CONDITION, context.getBenefitCount())
					.addOrCondition(TARGETCOUNT_CONDITION, context.getTargetCount())
				.closeBracket();
	}

}
