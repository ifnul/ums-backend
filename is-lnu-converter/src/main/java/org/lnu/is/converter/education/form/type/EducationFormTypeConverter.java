package org.lnu.is.converter.education.form.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.education.form.type.EducationFormTypeResource;

/**
 * Edu Form Type Converter.
 * @author ivanursul
 *
 */
@Converter("eduFormTypeConverter")
public class EducationFormTypeConverter extends AbstractConverter<EducationFormType, EducationFormTypeResource> {

	@Override
	public EducationFormTypeResource convert(final EducationFormType source, final EducationFormTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public EducationFormTypeResource convert(final EducationFormType source) {
		return convert(source, new EducationFormTypeResource());
	}

}
