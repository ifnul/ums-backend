package org.lnu.is.facade.converter.enrolmentsubject;

import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.enrolmentsubject.EnrolmentSubjectResource;

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
