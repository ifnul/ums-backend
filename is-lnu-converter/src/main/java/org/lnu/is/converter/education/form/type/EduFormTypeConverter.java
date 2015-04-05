package org.lnu.is.converter.education.form.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.resource.eduformtype.EduFormTypeResource;

/**
 * Edu Form Type Converter.
 * @author ivanursul
 *
 */
@Converter("eduFormTypeConverter")
public class EduFormTypeConverter extends AbstractConverter<EducationFormType, EduFormTypeResource> {

	@Override
	public EduFormTypeResource convert(final EducationFormType source, final EduFormTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		
		return target;
	}

	@Override
	public EduFormTypeResource convert(final EducationFormType source) {
		return convert(source, new EduFormTypeResource());
	}

}
