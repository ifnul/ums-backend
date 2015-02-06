package org.lnu.is.converter.person.enrolmentsubject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonEnrolmentSubject;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.resource.person.enrolmentsubject.PersonEnrolmentSubjectResource;

public class PersonEnrolmentSubjectConverterTest {

	private PersonEnrolmentSubjectConverter unit = new PersonEnrolmentSubjectConverter();

	@Test
	public void testConvert() throws Exception {
		// Given
		Long id = 1L;
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

		PersonEnrolmentSubject source = new PersonEnrolmentSubject();
		source.setId(id);
		source.setMark(mark);
		source.setPerson(person);
		source.setPersonPaper(personPaper);
		source.setEnrolmentSubject(enrolmentSubject);

		PersonEnrolmentSubjectResource expected = new PersonEnrolmentSubjectResource();
		expected.setId(id);
		expected.setPersonId(personId);
		expected.setPersonPaperId(personPaperId);
		expected.setEnrolmentSubjectId(enrolmentSubjectId);
		expected.setMark(mark);

		// When
		PersonEnrolmentSubjectResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Long id = 1L;
		Double mark = 5.0;

		PersonEnrolmentSubject source = new PersonEnrolmentSubject();
		source.setId(id);
		source.setMark(mark);

		PersonEnrolmentSubjectResource expected = new PersonEnrolmentSubjectResource();
		expected.setId(id);
		expected.setMark(mark);

		// When
		PersonEnrolmentSubjectResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}

	@Test
	public void testConvertWithEmptyFields() throws Exception {
		// Given
		PersonEnrolmentSubject source = new PersonEnrolmentSubject();

		PersonEnrolmentSubjectResource expected = new PersonEnrolmentSubjectResource();

		// When
		PersonEnrolmentSubjectResource actual = unit.convert(source);

		// Then
		assertEquals(expected, actual);
	}
}
