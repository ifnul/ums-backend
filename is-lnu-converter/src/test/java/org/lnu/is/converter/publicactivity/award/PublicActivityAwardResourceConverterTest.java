package org.lnu.is.converter.publicactivity.award;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.publicactivity.PublicActivity;
import org.lnu.is.domain.publicactivity.PublicActivityAward;
import org.lnu.is.resource.publicactivity.award.PublicActivityAwardResource;

public class PublicActivityAwardResourceConverterTest {

	private PublicActivityAwardResourceConverter unit = new PublicActivityAwardResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
		Long publicActivityId = 2L;
		PublicActivity publicActivity = new PublicActivity();
		publicActivity.setId(publicActivityId);
		
		Long enrolmentSubjectId = 3L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		String awardname = "award name";
		Double bonus = 2.1;
		Date begDate = new Date();
		Date endDate = new Date();

		PublicActivityAward expected = new PublicActivityAward();
		expected.setId(id);
		expected.setPublicActivity(publicActivity);
		expected.setEnrolmentSubject(enrolmentSubject);
		expected.setAwardName(awardname);
		expected.setBonus(bonus);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);

		PublicActivityAwardResource source = new PublicActivityAwardResource();
		source.setId(id);
		source.setPublicActivityId(publicActivityId);
		source.setEnrolmentSubjectId(enrolmentSubjectId);
		source.setAwardName(awardname);
		source.setBonus(bonus);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		
		// When
		PublicActivityAward actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
		Long id = 1L;
		Long publicActivityId = 2L;
		PublicActivity publicActivity = new PublicActivity();
		publicActivity.setId(publicActivityId);
		
		Long enrolmentSubjectId = 3L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		String awardname = "award name";
		Double bonus = 2.1;
		Date begDate = new Date();
		Date endDate = new Date();
		
		PublicActivityAward expected = new PublicActivityAward();
		expected.setId(id);
		expected.setPublicActivity(publicActivity);
		expected.setEnrolmentSubject(enrolmentSubject);
		expected.setAwardName(awardname);
		expected.setBonus(bonus);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		List<PublicActivityAward> expecteds = Arrays.asList(expected);
		
		PublicActivityAwardResource source = new PublicActivityAwardResource();
		source.setId(id);
		source.setPublicActivityId(publicActivityId);
		source.setEnrolmentSubjectId(enrolmentSubjectId);
		source.setAwardName(awardname);
		source.setBonus(bonus);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		List<PublicActivityAwardResource> sources = Arrays.asList(source);
		
		// When
		List<PublicActivityAward> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertWithEmptyFiedls() throws Exception {
		// Given
		PublicActivityAward expected = new PublicActivityAward();
		PublicActivityAwardResource source = new PublicActivityAwardResource();
		
		// When
		PublicActivityAward actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
