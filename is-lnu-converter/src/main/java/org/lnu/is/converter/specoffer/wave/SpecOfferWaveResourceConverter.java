package org.lnu.is.converter.specoffer.wave;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.specoffer.subject.wave.SpecOfferWaveResource;

/**
 * Converter, that convert from Resource to Entity.
 * @author ivanursul
 *
 */
@Converter("specOfferWaveResourceConverter")
public class SpecOfferWaveResourceConverter extends AbstractConverter<SpecOfferWaveResource, SpecOfferWave> {

	@Override
	public SpecOfferWave convert(final SpecOfferWaveResource source, final SpecOfferWave target) {

		target.setLicCount(source.getLicCount());
		target.setStateCount(source.getStateCount());
		target.setBenefitCount(source.getBenefitCount());
		target.setTargetCount(source.getTargetCount());
		
		if (source.getSpecOfferId() != null) {
			SpecOffer specOffer = new SpecOffer();
			specOffer.setId(source.getSpecOfferId());
			target.setSpecOffer(specOffer);
		}
		
		if (source.getWaveTypeId() != null) {
			WaveType waveType = new WaveType();
			waveType.setId(source.getWaveTypeId());
			target.setWaveType(waveType);
		}
		
		return target;
	}

	@Override
	public SpecOfferWave convert(final SpecOfferWaveResource source) {
		return convert(source, new SpecOfferWave());
	}

}
