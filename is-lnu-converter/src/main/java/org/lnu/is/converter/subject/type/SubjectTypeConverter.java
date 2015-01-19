package org.lnu.is.converter.subject.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.subject.SubjectType;
import org.lnu.is.resource.subject.type.SubjectTypeResource;

/**
 * SubjectType converter.
 * @author ivanursul
 *
 */
@Converter("subjectTypeConverter")
public class SubjectTypeConverter extends AbstractConverter<SubjectType, SubjectTypeResource> {

	@Override
	public SubjectTypeResource convert(final SubjectType source, final SubjectTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public SubjectTypeResource convert(final SubjectType source) {
		return convert(source, new SubjectTypeResource());
	}

}
