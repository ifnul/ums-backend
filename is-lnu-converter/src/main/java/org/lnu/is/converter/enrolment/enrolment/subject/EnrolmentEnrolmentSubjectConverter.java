package org.lnu.is.converter.enrolment.enrolment.subject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.enrolment.subject.EnrolmentEnrolmentSubject;
import org.lnu.is.resource.enrolment.enrolment.subject.EnrolmentEnrolmentSubjectResource;

/**
 * Enrolment Enrolment Subject Converter.
 * @author illay
 *
 */
@Converter("enrolmentEnrolmentSubjectConverter")
public class EnrolmentEnrolmentSubjectConverter extends AbstractConverter<EnrolmentEnrolmentSubject, EnrolmentEnrolmentSubjectResource> {

    @Override
    public EnrolmentEnrolmentSubjectResource convert(
	    final EnrolmentEnrolmentSubject source,
	    final EnrolmentEnrolmentSubjectResource target) {
	target.setId(source.getId());
	target.setMark(source.getMark());
	if (source.getEnrolment() != null) {
	    target.setEnrolmentId(source.getEnrolment().getId());
	}
	
	if (source.getEnrolmentSubject() != null) {
	    target.setEnrolmentSubjectId(source.getEnrolmentSubject().getId());
	}
	
	if (source.getPersonEnrolmentSubject() != null) {
	    target.setPersonEnrolmentSubjectId(source.getPersonEnrolmentSubject().getId());
	}
	return target;
    }

    @Override
    public EnrolmentEnrolmentSubjectResource convert(
	    final EnrolmentEnrolmentSubject source) {
	return convert(source, new EnrolmentEnrolmentSubjectResource());
    }

}
