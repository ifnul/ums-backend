package org.lnu.is.converter.salary.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.salary.type.SalaryType;
import org.lnu.is.resource.salary.type.SalaryTypeResource;

/**
 * SalaryType converter.
 * @author ivanursul
 *
 */
@Converter("salaryTypeConverter")
public class SalaryTypeConverter extends AbstractConverter<SalaryType, SalaryTypeResource> {

	@Override
	public SalaryTypeResource convert(final SalaryType source, final SalaryTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public SalaryTypeResource convert(final SalaryType source) {
		return convert(source, new SalaryTypeResource());
	}

}
