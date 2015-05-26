package org.lnu.is.converter.street.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.street.type.StreetType;
import org.lnu.is.resource.street.type.StreetTypeResource;

/**
 * StreetType converter.
 * @author ivanursul
 *
 */
@Converter("streetTypeConverter")
public class StreetTypeConverter extends AbstractConverter<StreetType, StreetTypeResource> {

	@Override
	public StreetTypeResource convert(final StreetType source, final StreetTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public StreetTypeResource convert(final StreetType source) {
		return convert(source, new StreetTypeResource());
	}

}
