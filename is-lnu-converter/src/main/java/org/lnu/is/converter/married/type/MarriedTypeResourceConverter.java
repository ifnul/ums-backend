package org.lnu.is.converter.married.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.married.type.MarriedType;
import org.lnu.is.resource.married.type.MarriedTypeResource;

/**
 * Converter from MarriedTypeResource to MarriedType.
 * @author Bohdan
 *
 */
@Converter("marriedTypeResourceConverter")
public class MarriedTypeResourceConverter extends AbstractConverter<MarriedTypeResource, MarriedType> {

	@Override
	public MarriedType convert(final MarriedTypeResource source, final MarriedType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public MarriedType convert(final MarriedTypeResource source) {
		return convert(source, new MarriedType());
	}

}
