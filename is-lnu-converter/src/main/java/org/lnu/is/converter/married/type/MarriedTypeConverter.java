package org.lnu.is.converter.married.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.resource.married.type.MarriedTypeResource;

/**
 * Converter from MarriedType to MarriedTypeResource.
 * @author Bohdan
 *
 */
@Converter("marriedTypeConverter")
public class MarriedTypeConverter extends AbstractConverter<MarriedType, MarriedTypeResource> {

	@Override
	public MarriedTypeResource convert(final MarriedType source, final MarriedTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public MarriedTypeResource convert(final MarriedType source) {
		return convert(source, new MarriedTypeResource());
	}

}
