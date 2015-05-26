package org.lnu.is.converter.enrolment.enrolment.subject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.Enrolment;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.domain.enrolment.subject.EnrolmentSubject;
import org.lnu.is.domain.person.enrolment.subject.PersonEnrolmentSubject;
import org.lnu.is.resource.enrolment.enrolment.subject.EnrolmentEnrolmentSubjectResource;

/**
 * Enrolment Enrolment Subject Resource Converter.
 * @author illay
 *
 */
@Converter("enrolmentEnrolmentSubjectResourceConverter")
public class EnrolmentEnrolmentSubjectResourceConverter	extends	AbstractConverter<EnrolmentEnrolmentSubjectResource, EnrolmentEnrolmentSubject> {

    @Override
    public EnrolmentEnrolmentSubject convert(final EnrolmentEnrolmentSubjectResource source, final EnrolmentEnrolmentSubject target) {
	target.setId(source.getId());
	target.setMark(source.getMark());
	if (source.getEnrolmentId() != null) {
	    Enrolment enrolment = new Enrolment();
	    enrolment.setId(source.getEnrolmentId());
	    
	    target.setEnrolment(enrolment);
	}
	
	if (source.getEnrolmentSubjectId() != null) {
	    EnrolmentSubject enrolmentSubject = new EnrolmentSubject();
	    enrolmentSubject.setId(source.getEnrolmentSubjectId());
	    
	    target.setEnrolmentSubject(enrolmentSubject);
	}
	
	if (source.getPersonEnrolmentSubjectId() != null) {
	    PersonEnrolmentSubject personEnrolmentSubject = new PersonEnrolmentSubject();
	    personEnrolmentSubject.setId(source.getPersonEnrolmentSubjectId());
	    
	    target.setPersonEnrolmentSubject(personEnrolmentSubject);
	}
	return target;
    }

    @Override
    public EnrolmentEnrolmentSubject convert(final EnrolmentEnrolmentSubjectResource source) {
	return convert(source, new EnrolmentEnrolmentSubject());
    }

}
