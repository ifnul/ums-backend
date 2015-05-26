package org.lnu.is.converter.salary.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.salary.type.SalaryType;
import org.lnu.is.resource.salary.type.SalaryTypeResource;

/**
 * SalaryType resource converter.
 * @author ivanursul
 *
 */
@Converter("salaryTypeResourceConverter")
public class SalaryTypeResourceConverter extends AbstractConverter<SalaryTypeResource, SalaryType> {

	@Override
	public SalaryType convert(final SalaryTypeResource source, final SalaryType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public SalaryType convert(final SalaryTypeResource source) {
		return convert(source, new SalaryType());
	}

}
