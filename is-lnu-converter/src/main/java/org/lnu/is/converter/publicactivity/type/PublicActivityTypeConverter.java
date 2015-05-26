package org.lnu.is.converter.publicactivity.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.publicactivity.PublicActivityType;
import org.lnu.is.resource.publicactivity.type.PublicActivityTypeResource;

/**
 * Converter from PublicActivityType to PublicActivityTypeResource.
 * @author ivan	ursul
 *
 */
@Converter("publicActivityTypeConverter")
public class PublicActivityTypeConverter extends AbstractConverter<PublicActivityType, PublicActivityTypeResource> {

	@Override
	public PublicActivityTypeResource convert(final PublicActivityType source, final PublicActivityTypeResource target) {
		
		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public PublicActivityTypeResource convert(final PublicActivityType source) {
		return convert(source, new PublicActivityTypeResource());
	}

}
