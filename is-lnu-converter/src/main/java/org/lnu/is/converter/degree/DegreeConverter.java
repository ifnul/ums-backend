package org.lnu.is.converter.degree;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.degree.Degree;
import org.lnu.is.resource.degree.DegreeResource;

/**
 * Degree  Converter.
 * 
 * @author ivanursul
 * 
 */
@Converter("degreeConverter")
public class DegreeConverter extends AbstractConverter<Degree, DegreeResource> {

	@Override
	public DegreeResource convert(final Degree source, final DegreeResource target) {

		target.setId(source.getId());
		
		if (source.getPerson() != null) {
			target.setPersonId(source.getPerson().getId());
		}
		
		if (source.getDegreeType() != null) {
			target.setDegreeTypeId(source.getDegreeType().getId());
		}

		return target;
	}

	@Override
	public DegreeResource convert(final Degree source) {
		return convert(source, new DegreeResource());
	}

}
