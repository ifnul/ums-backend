package org.lnu.is.dao.builder.specoffer.wave;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.domain.wave.type.WaveType;

public class SpecOfferWaveQueryBuilderTest {

	private SpecOfferWaveQueryBuilder unit = new SpecOfferWaveQueryBuilder();
	
	private Boolean active = true;
	private Boolean security = true;
	
	@Before
	public void setup() {
		unit.setActive(active);
		unit.setSecurity(security);
	}

	@Test
	public void testBuild() throws Exception {
		// Given
		SpecOfferWave context = new SpecOfferWave();

		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledSecurityConstraint() throws Exception {
		// Given
		unit.setSecurity(false);
		SpecOfferWave context = new SpecOfferWave();
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE e.status=:status ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledStatusConstraint() throws Exception {
		// Given
		unit.setActive(false);
		SpecOfferWave context = new SpecOfferWave();
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		SpecOfferWave context = new SpecOfferWave();
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParameters() throws Exception {
		// Given
		SpecOffer specOffer = new SpecOffer();
		WaveType waveType = new WaveType();
		Integer licCount = 1;
		Integer stateCount = 2;
		Integer targetCount = 3;
		Integer benefitCount = 4;
		
		SpecOfferWave context = new SpecOfferWave();
		context.setSpecOffer(specOffer);
		context.setWaveType(waveType);
		context.setLicCount(licCount);
		context.setStateCount(stateCount);
		context.setTargetCount(targetCount);
		context.setBenefitCount(benefitCount);
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE ( e.specOffer = :specOffer OR e.waveType = :waveType OR e.licCount =:licCountOR e.stateCount =:stateCountOR e.benefitCount =:benefitCountOR e.targetCount =:targetCount) AND e.status=:status AND e.crtUserGroup IN (:userGroups) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
	
	@Test
	public void testBuildEmptyParametersWithDisabledDefaultConstraints() throws Exception {
		// Given
		unit.setActive(false);
		unit.setSecurity(false);
		
		SpecOffer specOffer = new SpecOffer();
		WaveType waveType = new WaveType();
		Integer licCount = 1;
		Integer stateCount = 2;
		Integer targetCount = 3;
		Integer benefitCount = 4;
		
		SpecOfferWave context = new SpecOfferWave();
		context.setSpecOffer(specOffer);
		context.setWaveType(waveType);
		context.setLicCount(licCount);
		context.setStateCount(stateCount);
		context.setTargetCount(targetCount);
		context.setBenefitCount(benefitCount);
		
		String expectedQuery = "SELECT e FROM SpecOfferWave e WHERE ( e.specOffer = :specOffer OR e.waveType = :waveType OR e.licCount =:licCountOR e.stateCount =:stateCountOR e.benefitCount =:benefitCountOR e.targetCount =:targetCount) ";
		
		// When
		String actualQuery = unit.build(context);
		
		// Then
		assertEquals(expectedQuery, actualQuery);
	}
}
