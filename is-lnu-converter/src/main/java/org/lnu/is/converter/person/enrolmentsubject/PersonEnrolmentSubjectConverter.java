package org.lnu.is.converter.person.enrolmentsubject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.person.PersonEnrolmentSubject;
import org.lnu.is.resource.person.enrolmentsubject.PersonEnrolmentSubjectResource;

/**
 * Enrolment Subject Converter.
 * 
 * @author kushnir
 *
 */
@Converter("personEnrolmentSubjectConverter")
public class PersonEnrolmentSubjectConverter extends AbstractConverter<PersonEnrolmentSubject, PersonEnrolmentSubjectResource> {

	@Override
	public PersonEnrolmentSubjectResource convert(final PersonEnrolmentSubject source, final PersonEnrolmentSubjectResource target) {
		target.setMark(source.getMark());
		target.setId(source.getId());

		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}

		if (source.getPersonPaper() != null) {
			target.setPersonPaperId(source.getPersonPaper().getId());
		}

		if (source.getEnrolmentSubject() != null) {
			target.setEnrolmentSubjectId(source.getEnrolmentSubject().getId());
		}

		return target;
	}

	@Override
	public PersonEnrolmentSubjectResource convert(final PersonEnrolmentSubject source) {
		return convert(source, new PersonEnrolmentSubjectResource());
	}

}
