package org.lnu.is.converter.degree.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.degree.type.DegreeType;
import org.lnu.is.resource.degree.type.DegreeTypeResource;

/**
 * Degree Type Converter.
 * 
 * @author ivanursul
 * 
 */
@Converter("degreeTypeConverter")
public class DegreeTypeConverter extends AbstractConverter<DegreeType, DegreeTypeResource> {

	@Override
	public DegreeTypeResource convert(final DegreeType source, final DegreeTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public DegreeTypeResource convert(final DegreeType source) {
		return convert(source, new DegreeTypeResource());
	}

}
