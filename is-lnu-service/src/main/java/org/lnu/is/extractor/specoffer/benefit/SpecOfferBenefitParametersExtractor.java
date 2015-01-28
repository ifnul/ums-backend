package org.lnu.is.extractor.specoffer.benefit;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferBenefit;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Spec Offer Benefit Parameters Extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("specOfferBenefitParametersExtractor")
public class SpecOfferBenefitParametersExtractor extends AbstractParametersExtractor<SpecOfferBenefit> {

	@Resource(name = "specOfferDao")
	private Dao<SpecOffer, Long> specOfferDao;
	
	@Resource(name = "benefitDao")
	private Dao<Benefit, Long> benefitDao;
	
	@Override
	public Map<String, Object> getParameters(final SpecOfferBenefit entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getSpecOffer(), specOfferDao, "specOffer", parameters);
		addParameter(entity.getBenefit(), benefitDao, "benefit", parameters);
		
		return parameters;
	}

}
