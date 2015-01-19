package org.lnu.is.converter.marriedtype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.resource.marriedtype.MarriedTypeResource;

/**
 * Converter from MarriedTypeResource to MarriedType.
 * @author Bohdan
 *
 */
@ResourceConverter("marriedTypeResourceConverter")
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
