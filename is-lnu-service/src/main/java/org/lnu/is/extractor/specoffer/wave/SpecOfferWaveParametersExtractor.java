package org.lnu.is.extractor.specoffer.wave;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Spec Offer Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specOfferWaveParametersExtractor")
public class SpecOfferWaveParametersExtractor extends AbstractParametersExtractor<SpecOfferWave> {

	@Resource(name = "specOfferDao")
	private Dao<SpecOffer, SpecOffer, Long> specOfferDao;
	
	@Resource(name = "waveTypeDao")
	private Dao<WaveType, WaveType, Long> waveTypeDao;
	
	@Override
	protected Map<String, Object> getParameters(final SpecOfferWave entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getSpecOffer(), specOfferDao, "specOffer", parameters);
		addParameter(entity.getWaveType(), waveTypeDao, "waveType", parameters);

		addParameter(entity.getLicCount(), "licCount", parameters);
		addParameter(entity.getStateCount(), "stateCount", parameters);
		addParameter(entity.getBenefitCount(), "benefitCount", parameters);
		addParameter(entity.getTargetCount(), "targetCount", parameters);
		addParameter(entity.getBeginDate(), "beginDate", parameters);
		addParameter(entity.getEndDate(), "endDate", parameters);
		
		return parameters;
	}

}
