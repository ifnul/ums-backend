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

public class EnrolmentStatusConverterTest {

	private EnrolmentStatusConverter unit = new EnrolmentStatusConverter();
	
	@Test
	public void testConvert() throws Exception {
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
		
		EnrolmentStatus source = new EnrolmentStatus();
		source.setEnrolment(enrolment);
		source.setSpecOfferWave(specOfferWave);
		source.setEnrolmentStatusType(enrolmentStatusType);

		EnrolmentStatusResource expected = new EnrolmentStatusResource();
		expected.setEnrolmentId(enrolmentId);
		expected.setSpecOfferWaveId(specOfferWaveId);
		expected.setEnrolmentStatusTypeId(enrolmentStatusTypeId);
		
		// When
		EnrolmentStatusResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		EnrolmentStatus source = new EnrolmentStatus();
		EnrolmentStatusResource expected = new EnrolmentStatusResource();
		
		// When
		EnrolmentStatusResource actual = unit.convert(source);
		
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
		
		EnrolmentStatus source = new EnrolmentStatus();
		source.setEnrolment(enrolment);
		source.setSpecOfferWave(specOfferWave);
		source.setEnrolmentStatusType(enrolmentStatusType);
		List<EnrolmentStatus> sources = Arrays.asList(source);
		
		EnrolmentStatusResource expected = new EnrolmentStatusResource();
		expected.setEnrolmentId(enrolmentId);
		expected.setSpecOfferWaveId(specOfferWaveId);
		expected.setEnrolmentStatusTypeId(enrolmentStatusTypeId);
		List<EnrolmentStatusResource> expecteds = Arrays.asList(expected);
		
		// When
		List<EnrolmentStatusResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
