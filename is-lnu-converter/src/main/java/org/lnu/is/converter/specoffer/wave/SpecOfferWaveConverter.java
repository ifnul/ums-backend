package org.lnu.is.converter.specoffer.wave;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.resource.specoffer.subject.wave.SpecOfferWaveResource;

/**
 * Converter, that converts from Entity to Resource.
 * @author ivanursul
 *
 */
@Converter("specOfferWaveConverter")
public class SpecOfferWaveConverter extends AbstractConverter<SpecOfferWave, SpecOfferWaveResource> {

	@Override
	public SpecOfferWaveResource convert(final SpecOfferWave source, final SpecOfferWaveResource target) {

		target.setId(source.getId());
		target.setLicCount(source.getLicCount());
		target.setStateCount(source.getStateCount());
		target.setBenefitCount(source.getBenefitCount());
		target.setTargetCount(source.getTargetCount());
		
		if (source.getSpecOffer() != null) {
			target.setSpecOfferId(source.getSpecOffer().getId());
		}
		
		if (source.getWaveType() != null) {
			target.setWaveTypeId(source.getWaveType().getId());
		}
		
		return target;
	}

	@Override
	public SpecOfferWaveResource convert(final SpecOfferWave source) {
		return convert(source, new SpecOfferWaveResource());
	}

}
