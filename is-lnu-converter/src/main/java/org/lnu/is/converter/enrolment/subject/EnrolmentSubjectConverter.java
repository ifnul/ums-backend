package org.lnu.is.converter.enrolment.subject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.enrolment.EnrolmentSubject;
import org.lnu.is.resource.enrolment.subject.EnrolmentSubjectResource;

/**
 * Enrolment Subject Converter.
 * @author ivanursul
 *
 */
@Converter("enrolmentSubjectConverter")
public class EnrolmentSubjectConverter extends AbstractConverter<EnrolmentSubject, EnrolmentSubjectResource> {

	@Override
	public EnrolmentSubjectResource convert(final EnrolmentSubject source, final EnrolmentSubjectResource target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setIsTesting(source.getIsTesting());
		target.setName(source.getName());
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		return target;
	}

	@Override
	public EnrolmentSubjectResource convert(final EnrolmentSubject source) {
		return convert(source, new EnrolmentSubjectResource());
	}

}
