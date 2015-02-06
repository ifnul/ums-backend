package org.lnu.is.converter.person.enrolmentsubject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.Person;
import org.lnu.is.domain.person.PersonEnrolmentSubject;
import org.lnu.is.domain.person.PersonPaper;
import org.lnu.is.resource.person.enrolmentsubject.PersonEnrolmentSubjectResource;

/**
 * Person Enrolment Subject Resource Converter.
 * 
 * @author kushnir
 *
 */
@Converter("personEnrolmentSubjectResourceConverter")
public class PersonEnrolmentSubjectResourceConverter extends AbstractConverter<PersonEnrolmentSubjectResource, PersonEnrolmentSubject> {

	@Override
	public PersonEnrolmentSubject convert(final PersonEnrolmentSubjectResource source, final PersonEnrolmentSubject target) {
		target.setMark(source.getMark());

		if (source.getPersonId() != null) {
			Person person = new Person();
			person.setId(source.getPersonId());
			target.setPerson(person);
		}

		if (source.getPersonPaperId() != null) {
			PersonPaper personPaper = new PersonPaper();
			personPaper.setId(source.getPersonId());
			target.setPersonPaper(personPaper);
		}

		if (source.getEnrolmentSubjectId() != null) {
			EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
			enrolmentSubject.setId(source.getEnrolmentSubjectId());
			target.setEnrolmentSubject(enrolmentSubject);
		}

		return target;
	}

	@Override
	public PersonEnrolmentSubject convert(final PersonEnrolmentSubjectResource source) {
		return convert(source, new PersonEnrolmentSubject());
	}

}
