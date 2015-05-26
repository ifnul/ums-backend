package org.lnu.is.converter.person.enrolment.subject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.converter.person.enrolment.subject.PersonEnrolmentSubjectResourceConverter;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.domain.person.paper.PersonPaper;
import org.lnu.is.resource.person.enrolment.subject.PersonEnrolmentSubjectResource;

public class PersonEnrolmentSubjectResourceConverterTest {
	private PersonEnrolmentSubjectResourceConverter unit = new PersonEnrolmentSubjectResourceConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		Double mark = 5.0;

		Long personId = 2L;
		Person person = new Person();
		person.setId(personId);

		Long personPaperId = 3L;
		PersonPaper personPaper = new PersonPaper();
		personPaper.setId(personPaperId);

		Long enrolmentSubjectId = 4L;
		EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
		enrolmentSubject.setId(enrolmentSubjectId);

		PersonEnrolmentSubjectResource source = new PersonEnrolmentSubjectResource();
		source.setPersonId(personId);
		source.setPersonPaperId(personPaperId);
		source.setEnrolmentSubjectId(enrolmentSubjectId);
		source.setMark(mark);

		PersonEnrolmentSubject expected = new PersonEnrolmentSubject();
		expected.setMark(mark);
		expected.setPerson(person);
		expected.setPersonPaper(personPaper);
		expected.setEnrolmentSubject(enrolmentSubject);

		// When
		PersonEnrolmentSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Double mark = 5.0;

		PersonEnrolmentSubjectResource source = new PersonEnrolmentSubjectResource();
		source.setMark(mark);

		PersonEnrolmentSubject expected = new PersonEnrolmentSubject();
		expected.setMark(mark);

		// When
		PersonEnrolmentSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonEnrolmentSubjectResource source = new PersonEnrolmentSubjectResource();

		PersonEnrolmentSubject expected = new PersonEnrolmentSubject();

		// When
		PersonEnrolmentSubject actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
