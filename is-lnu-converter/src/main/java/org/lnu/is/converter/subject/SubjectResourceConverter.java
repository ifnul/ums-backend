package org.lnu.is.converter.subject;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.subject.Subject;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.SubjectResource;

/**
 * Subject resource converter.
 * @author ivanursul
 *
 */
@Converter("subjectResourceConverter")
public class SubjectResourceConverter extends AbstractConverter<SubjectResource, Subject> {

	@Override
	public Subject convert(final SubjectResource source, final Subject target) {
		
		target.setName(source.getName());
		
		if (source.getSubjectTypeId() != null) {
			SubjectType subjectType = new SubjectType();
			subjectType.setId(source.getSubjectTypeId());
			target.setSubjectType(subjectType);
		}

		return target;
	}

	@Override
	public Subject convert(final SubjectResource source) {
		return convert(source, new Subject());
	}

}
