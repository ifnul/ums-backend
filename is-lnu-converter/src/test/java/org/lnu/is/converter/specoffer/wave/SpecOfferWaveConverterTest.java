package org.lnu.is.converter.specoffer.wave;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.domain.wave.type.WaveType;
import org.lnu.is.resource.specoffer.wave.SpecOfferWaveResource;

public class SpecOfferWaveConverterTest {

	private SpecOfferWaveConverter unit = new SpecOfferWaveConverter();
	
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
		Date begDate = new Date();
		Date endDate = new Date();
		
		SpecOfferWaveResource expected = new SpecOfferWaveResource();
		expected.setLicCount(licCount);
		expected.setStateCount(stateCount);
		expected.setBenefitCount(benefitCount);
		expected.setTargetCount(targetCount);
		expected.setSpecOfferId(specOfferId);
		expected.setWaveTypeId(waveTypeId);
		expected.setBeginDate(begDate);
		expected.setEndDate(endDate);

		SpecOfferWave source = new SpecOfferWave();
		source.setLicCount(licCount);
		source.setStateCount(stateCount);
		source.setBenefitCount(benefitCount);
		source.setTargetCount(targetCount);
		source.setSpecOffer(specOffer);
		source.setWaveType(waveType);
		source.setBeginDate(begDate);
		source.setEndDate(endDate);
		
		// When
		SpecOfferWaveResource actual = unit.convert(source);

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
		
		SpecOfferWaveResource expected = new SpecOfferWaveResource();
		expected.setLicCount(licCount);
		expected.setStateCount(stateCount);
		expected.setBenefitCount(benefitCount);
		expected.setTargetCount(targetCount);
		expected.setSpecOfferId(specOfferId);
		expected.setWaveTypeId(waveTypeId);
		List<SpecOfferWaveResource> expecteds = Arrays.asList(expected);
		
		SpecOfferWave source = new SpecOfferWave();
		source.setLicCount(licCount);
		source.setStateCount(stateCount);
		source.setBenefitCount(benefitCount);
		source.setTargetCount(targetCount);
		source.setSpecOffer(specOffer);
		source.setWaveType(waveType);
		List<SpecOfferWave> sources = Arrays.asList(source);
		
		// When
		List<SpecOfferWaveResource> actuals = unit.convertAll(sources);
		
		// Thena
		assertEquals(expecteds, actuals);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		SpecOfferWaveResource expected = new SpecOfferWaveResource();
		SpecOfferWave source = new SpecOfferWave();
		
		// When
		SpecOfferWaveResource actual = unit.convert(source);
		
		// Thena
		assertEquals(expected, actual);
	}
	
}
