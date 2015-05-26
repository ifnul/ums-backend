package org.lnu.is.converter.enrolment.status;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.status.EnrolmentStatus;
import org.lnu.is.domain.enrolment.status.type.EnrolmentStatusType;
import org.lnu.is.domain.specoffer.SpecOfferWave;
import org.lnu.is.resource.enrolment.status.EnrolmentStatusResource;

public class EnrolmentStatusResourceConverterTest {

	private EnrolmentStatusResourceConverter unit = new EnrolmentStatusResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
	    	Integer isContract = 1;
	    	Integer isState = 1;
	    	
		Long enrolmentId = 1L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long specOfferWaveId = 2L;
		SpecOfferWave specOfferWave = new SpecOfferWave();
		specOfferWave.setId(specOfferWaveId);
		
		Long enrolmentStatusTypeId = 3L;
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		enrolmentStatusType.setId(enrolmentStatusTypeId);
		
		EnrolmentStatus expected = new EnrolmentStatus();
		expected.setEnrolment(enrolment);
		expected.setSpecOfferWave(specOfferWave);
		expected.setEnrolmentStatusType(enrolmentStatusType);
		expected.setIsContract(isContract);
		expected.setIsState(isState);

		EnrolmentStatusResource source = new EnrolmentStatusResource();
		source.setEnrolmentId(enrolmentId);
		source.setSpecOfferWaveId(specOfferWaveId);
		source.setEnrolmentStatusTypeId(enrolmentStatusTypeId);
		source.setIsContract(isContract);
		source.setIsState(isState);
		
		// When
		EnrolmentStatus actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		EnrolmentStatus expected = new EnrolmentStatus();
		EnrolmentStatusResource source = new EnrolmentStatusResource();
		
		// When
		EnrolmentStatus actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long enrolmentId = 1L;
		Enrolment enrolment = new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long specOfferWaveId = 2L;
		SpecOfferWave specOfferWave = new SpecOfferWave();
		specOfferWave.setId(specOfferWaveId);
		
		Long enrolmentStatusTypeId = 3L;
		EnrolmentStatusType enrolmentStatusType = new EnrolmentStatusType();
		enrolmentStatusType.setId(enrolmentStatusTypeId);
		
		EnrolmentStatus expected = new EnrolmentStatus();
		expected.setEnrolment(enrolment);
		expected.setSpecOfferWave(specOfferWave);
		expected.setEnrolmentStatusType(enrolmentStatusType);
		List<EnrolmentStatus> expecteds = Arrays.asList(expected);
		
		EnrolmentStatusResource source = new EnrolmentStatusResource();
		source.setEnrolmentId(enrolmentId);
		source.setSpecOfferWaveId(specOfferWaveId);
		source.setEnrolmentStatusTypeId(enrolmentStatusTypeId);
		List<EnrolmentStatusResource> sources = Arrays.asList(source);
		
		// When
		List<EnrolmentStatus> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
