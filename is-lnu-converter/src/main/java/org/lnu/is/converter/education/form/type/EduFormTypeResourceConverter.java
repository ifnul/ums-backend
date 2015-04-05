package org.lnu.is.converter.education.form.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

/**
 * Edu Form Type Resorce Converter.
 * @author ivanursul
 *
 */
@Converter("eduFormTypeResourceConverter")
public class EduFormTypeResourceConverter extends AbstractConverter<EduFormTypeResource, EducationFormType> {

	@Override
	public EducationFormType convert(final EduFormTypeResource source, final EducationFormType target) {
		
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public EducationFormType convert(final EduFormTypeResource source) {
		return convert(source, new EducationFormType());
	}

}
