package org.lnu.is.facade.converter.marriedtype;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.marriedtype.MarriedType;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.marriedtype.MarriedTypeResource;

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
