package org.lnu.is.converter.enrolment.enrolment.subject;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.resource.enrolment.enrolment.subject.EnrolmentEnrolmentSubjectResource;

public class EnrolmentEnrolmentSubjectResourceConverterTest {

	private EnrolmentEnrolmentSubjectResourceConverter unit = new EnrolmentEnrolmentSubjectResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Long enrolmentId = 1L;
		
		Enrolment enrolment= new Enrolment();
		enrolment.setId(enrolmentId);
		
		Long enrolmentSubjectId = 2L;
		
		EnrolmentSubject enrolmentSubject=new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);
		
		Long personEnrolmentSubjectId = 3L;
		
		PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
		personEnrolmentSubject.setId(personEnrolmentSubjectId);
		
		Double mark = 1.2;
		
		EnrolmentEnrolmentSubjectResource source = new EnrolmentEnrolmentSubjectResource();
		source.setEnrolmentId(enrolmentId);
		source.setEnrolmentSubjectId(enrolmentSubjectId);
		source.setPersonEnrolmentSubjectId(personEnrolmentSubjectId);
		source.setMark(mark);

		EnrolmentEnrolmentSubject expected = new EnrolmentEnrolmentSubject();
		expected.setEnrolment(enrolment);
		expected.setEnrolmentSubject(enrolmentSubject);
		expected.setPersonEnrolmentSubject(personEnrolmentSubject);
		expected.setMark(mark);
		
		// When
		EnrolmentEnrolmentSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
	    	Double mark = 1.2;
		
		EnrolmentEnrolmentSubject expected = new EnrolmentEnrolmentSubject();
		expected.setMark(mark);

		EnrolmentEnrolmentSubjectResource source = new EnrolmentEnrolmentSubjectResource();
		source.setMark(mark);
		
		// When
		EnrolmentEnrolmentSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);

	}
	
	@Test
	public void testConvertAll() throws Exception {
		// Given
	 	Long enrolmentId = 1L;
	 		
	 	Enrolment enrolment= new Enrolment();
	 	enrolment.setId(enrolmentId);
	 		
	 	Long enrolmentSubjectId = 2L;
	 		
	 	EnrolmentSubject enrolmentSubject=new EnrolmentSubject();
	 	enrolmentSubject.setId(enrolmentSubjectId);
	 	
	 	Long personEnrolmentSubjectId = 3L;
	 		
	 	PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
	 	personEnrolmentSubject.setId(personEnrolmentSubjectId);
	 	
	 	Double mark = 1.2;
	 	
	 	EnrolmentEnrolmentSubjectResource expected = new EnrolmentEnrolmentSubjectResource();
	 	expected.setEnrolmentId(enrolmentId);
	 	expected.setEnrolmentSubjectId(enrolmentSubjectId);
	 	expected.setPersonEnrolmentSubjectId(personEnrolmentSubjectId);
	 	expected.setMark(mark);

	 	EnrolmentEnrolmentSubject source = new EnrolmentEnrolmentSubject();
 		source.setEnrolment(enrolment);
	 	source.setEnrolmentSubject(enrolmentSubject);
	 	source.setPersonEnrolmentSubject(personEnrolmentSubject);
	 	source.setMark(mark);
	 	
	 	Double mark1 = 1.2;
	 		
	 	EnrolmentEnrolmentSubjectResource expected1 = new EnrolmentEnrolmentSubjectResource();
	 	expected1.setMark(mark1);

	 	EnrolmentEnrolmentSubject source1 = new EnrolmentEnrolmentSubject();
	 	source1.setMark(mark1);
	 		
		List<EnrolmentEnrolmentSubject> expecteds = Arrays.asList(source,source1);
		
		List<EnrolmentEnrolmentSubjectResource> sources =Arrays.asList(expected,expected1);
		// When
		List<EnrolmentEnrolmentSubject> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
