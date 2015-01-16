package org.lnu.is.converter.education.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.resource.education.type.EducationTypeResource;

/**
 * Education Type Converter.
 * @author ivanursul
 *
 */
@Converter("educationTypeConverter")
public class EducationTypeConverter extends AbstractConverter<EducationType, EducationTypeResource> {

	@Override
	public EducationTypeResource convert(final EducationType source, final EducationTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());
		
		return target;
	}

	@Override
	public EducationTypeResource convert(final EducationType source) {
		return convert(source, new EducationTypeResource());
	}

}
