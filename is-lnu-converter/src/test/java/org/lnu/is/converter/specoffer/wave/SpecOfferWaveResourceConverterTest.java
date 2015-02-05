package org.lnu.is.converter.specoffer.wave;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.specoffer.subject.wave.SpecOfferWaveResource;

public class SpecOfferWaveResourceConverterTest {

	private SpecOfferWaveResourceConverter unit = new SpecOfferWaveResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Integer licCount = 1;
		Integer stateCount = 2;
		Integer benefitCount = 3;
		Integer targetCount = 4;
		Long specOfferId = 3L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		Long waveTypeId = 2L;
		WaveType waveType = new WaveType();
		waveType.setId(waveTypeId);

		SpecOfferWaveResource source = new SpecOfferWaveResource();
		source.setLicCount(licCount);
		source.setStateCount(stateCount);
		source.setBenefitCount(benefitCount);
		source.setTargetCount(targetCount);
		source.setSpecOfferId(specOfferId);
		source.setWaveTypeId(waveTypeId);

		SpecOfferWave expected = new SpecOfferWave();
		expected.setLicCount(licCount);
		expected.setStateCount(stateCount);
		expected.setBenefitCount(benefitCount);
		expected.setTargetCount(targetCount);
		expected.setSpecOffer(specOffer);
		expected.setWaveType(waveType);
		
		// When
		SpecOfferWave actual = unit.convert(source);

		// Thena
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertAll() throws Exception {
		// Given
		Integer licCount = 1;
		Integer stateCount = 2;
		Integer benefitCount = 3;
		Integer targetCount = 4;
		Long specOfferId = 3L;
		SpecOffer specOffer = new SpecOffer();
		specOffer.setId(specOfferId);
		Long waveTypeId = 2L;
		WaveType waveType = new WaveType();
		waveType.setId(waveTypeId);
		
		SpecOfferWaveResource source = new SpecOfferWaveResource();
		source.setLicCount(licCount);
		source.setStateCount(stateCount);
		source.setBenefitCount(benefitCount);
		source.setTargetCount(targetCount);
		source.setSpecOfferId(specOfferId);
		source.setWaveTypeId(waveTypeId);
		List<SpecOfferWaveResource> sources = Arrays.asList(source);
		
		SpecOfferWave expected = new SpecOfferWave();
		expected.setLicCount(licCount);
		expected.setStateCount(stateCount);
		expected.setBenefitCount(benefitCount);
		expected.setTargetCount(targetCount);
		expected.setSpecOffer(specOffer);
		expected.setWaveType(waveType);
		List<SpecOfferWave> expecteds = Arrays.asList(expected);
		
		// When
		List<SpecOfferWave> actuals = unit.convertAll(sources);
		
		// Thena
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		SpecOfferWaveResource source = new SpecOfferWaveResource();
		SpecOfferWave expected = new SpecOfferWave();
		
		// When
		SpecOfferWave actual = unit.convert(source);
		
		// Thena
		assertEquals(expected, actual);
	}
	
}
