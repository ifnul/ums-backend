package org.lnu.is.converter.publicactivity.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.resource.publicactivity.type.PublicActivityTypeResource;

/**
 * Converter from PublicActivityTypeResource to PublicActivityType.
 * @author Bohdan
 *
 */
@Converter("publicActivityTypeResourceConverter")
public class PublicActivityTypeResourceConverter extends AbstractConverter<PublicActivityTypeResource, PublicActivityType> {

	@Override
	public PublicActivityType convert(final PublicActivityTypeResource source, final PublicActivityType target) {
		
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public PublicActivityType convert(final PublicActivityTypeResource source) {
		return convert(source, new PublicActivityType());
	}

}
