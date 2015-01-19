package org.lnu.is.converter.degree.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.degree.DegreeType;
import org.lnu.is.resource.degree.type.DegreeTypeResource;

/**
 * Degree Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("degreeTypeResourceConverter")
public class DegreeTypeResourceConverter extends AbstractConverter<DegreeTypeResource, DegreeType> {

	@Override
	public DegreeType convert(final DegreeTypeResource source, final DegreeType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public DegreeType convert(final DegreeTypeResource source) {
		return convert(source, new DegreeType());
	}
}
