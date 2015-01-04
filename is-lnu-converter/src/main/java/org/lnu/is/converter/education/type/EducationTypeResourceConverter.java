package org.lnu.is.converter.education.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.educationtype.EducationType;
import org.lnu.is.resource.education.type.EducationTypeResource;

/**
 * Edu Form Type Resorce Converter.
 * @author ivanursul
 *
 */
@Converter("educationTypeResourceConverter")
public class EducationTypeResourceConverter extends AbstractConverter<EducationTypeResource, EducationType> {

	@Override
	public EducationType convert(final EducationTypeResource source, final EducationType target) {
		
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public EducationType convert(final EducationTypeResource source) {
		return convert(source, new EducationType());
	}

}
