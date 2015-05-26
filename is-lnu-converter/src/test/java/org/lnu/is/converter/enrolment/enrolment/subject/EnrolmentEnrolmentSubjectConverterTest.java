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

public class EnrolmentEnrolmentSubjectConverterTest {

	private EnrolmentEnrolmentSubjectConverter unit = new EnrolmentEnrolmentSubjectConverter();
	
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
		
		// When
		EnrolmentEnrolmentSubjectResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
	    	Double mark = 1.2;
		
		EnrolmentEnrolmentSubjectResource expected = new EnrolmentEnrolmentSubjectResource();
		expected.setMark(mark);

		EnrolmentEnrolmentSubject source = new EnrolmentEnrolmentSubject();
		source.setMark(mark);
		
		// When
		EnrolmentEnrolmentSubjectResource actual = unit.convert(source);

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
	 		
		List<EnrolmentEnrolmentSubject> sources = Arrays.asList(source,source1);
		
		List<EnrolmentEnrolmentSubjectResource> expecteds =Arrays.asList(expected,expected1);
		// When
		List<EnrolmentEnrolmentSubjectResource> actuals = unit.convertAll(sources);
		
		// Then
		assertEquals(expecteds, actuals);
	}
}
