package org.lnu.is.converter.subject.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.type.SubjectTypeResource;

/**
 * SubjectType resource converter.
 * @author ivanursul
 *
 */
@Converter("subjectTypeResourceConverter")
public class SubjectTypeResourceConverter extends AbstractConverter<SubjectTypeResource, SubjectType> {

	@Override
	public SubjectType convert(final SubjectTypeResource source, final SubjectType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public SubjectType convert(final SubjectTypeResource source) {
		return convert(source, new SubjectType());
	}

}
