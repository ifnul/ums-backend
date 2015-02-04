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

public class PublicActivityAwardConverterTest {

	private PublicActivityAwardConverter unit = new PublicActivityAwardConverter();
	
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

		PublicActivityAward source = new PublicActivityAward();
		source.setId(id);
		source.setPublicActivity(publicActivity);
		source.setEnrolmentSubject(enrolmentSubject);
		source.setAwardName(awardname);
		source.setBonus(bonus);
		source.setBegDate(begDate);
		source.setEndDate(endDate);

		PublicActivityAwardResource expected = new PublicActivityAwardResource();
		expected.setId(id);
		expected.setPublicActivityId(publicActivityId);
		expected.setEnrolmentSubjectId(enrolmentSubjectId);
		expected.setAwardName(awardname);
		expected.setBonus(bonus);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		
		// When
		PublicActivityAwardResource actual = unit.convert(source);

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
		
		PublicActivityAward source = new PublicActivityAward();
		source.setId(id);
		source.setPublicActivity(publicActivity);
		source.setEnrolmentSubject(enrolmentSubject);
		source.setAwardName(awardname);
		source.setBonus(bonus);
		source.setBegDate(begDate);
		source.setEndDate(endDate);
		List<PublicActivityAward> sources = Arrays.asList(source);
		
		PublicActivityAwardResource expected = new PublicActivityAwardResource();
		expected.setId(id);
		expected.setPublicActivityId(publicActivityId);
		expected.setEnrolmentSubjectId(enrolmentSubjectId);
		expected.setAwardName(awardname);
		expected.setBonus(bonus);
		expected.setBegDate(begDate);
		expected.setEndDate(endDate);
		List<PublicActivityAwardResource> expecteds = Arrays.asList(expected);
		
		// When
		List<PublicActivityAwardResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}

	@Test
	public void testConvertWithEmptyFiedls() throws Exception {
		// Given
		PublicActivityAward source = new PublicActivityAward();
		PublicActivityAwardResource expected = new PublicActivityAwardResource();
		
		// When
		PublicActivityAwardResource actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
