package org.lnu.is.converter.education.form.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.education.form.type.EducationFormTypeResource;

/**
 * Edu Form Type Resorce Converter.
 * @author ivanursul
 *
 */
@Converter("eduFormTypeResourceConverter")
public class EducationFormTypeResourceConverter extends AbstractConverter<EducationFormTypeResource, EducationFormType> {

	@Override
	public EducationFormType convert(final EducationFormTypeResource source, final EducationFormType target) {
		
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public EducationFormType convert(final EducationFormTypeResource source) {
		return convert(source, new EducationFormType());
	}

}
