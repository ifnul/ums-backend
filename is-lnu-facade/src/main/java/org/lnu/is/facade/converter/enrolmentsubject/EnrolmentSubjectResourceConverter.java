package org.lnu.is.facade.converter.enrolmentsubject;

import org.lnu.is.domain.enrolmentsubject.EnrolmentSubject;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.enrolmentsubject.EnrolmentSubjectResource;

/**
 * Enrolment Subject Resource Converter.
 * @author ivanursul
 *
 */
@Converter("enrolmentSubjectResourceConverter")
public class EnrolmentSubjectResourceConverter extends AbstractConverter<EnrolmentSubjectResource, EnrolmentSubject> {

	@Override
	public EnrolmentSubject convert(final EnrolmentSubjectResource source, final EnrolmentSubject target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setIsTesting(source.getIsTesting());
		
		if (source.getParentId() != null) {
			EnrolmentSubject parent = new EnrolmentSubject();
			parent.setId(source.getParentId());
			
			target.setParent(parent);
		}
		
		return target;
	}

	@Override
	public EnrolmentSubject convert(final EnrolmentSubjectResource source) {
		return convert(source, new EnrolmentSubject());
	}

}
