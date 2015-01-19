package org.lnu.is.converter.subject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.resource.subject.SubjectResource;

/**
 * Subject converter.
 * @author ivanursul
 *
 */
@Converter("subjectConverter")
public class SubjectConverter extends AbstractConverter<Subject, SubjectResource> {

	@Override
	public SubjectResource convert(final Subject source, final SubjectResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		
		if (source.getSubjectType() != null) {
			target.setSubjectTypeId(source.getSubjectType().getId());
		}
		
		return target;
	}

	@Override
	public SubjectResource convert(final Subject source) {
		return convert(source, new SubjectResource());
	}

}
