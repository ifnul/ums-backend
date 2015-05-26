package org.lnu.is.converter.address.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.address.type.AddressType;
import org.lnu.is.resource.address.type.AddressTypeResource;

/**
 * Address Type Resource Converter.
 * 
 * @author ROMA
 *
 */
@Converter("addressTypeResourceConverter")
public class AddressTypeResourceConverter extends
		AbstractConverter<AddressTypeResource, AddressType> {

	@Override
	public AddressType convert(final AddressTypeResource source,
			final AddressType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public AddressType convert(final AddressTypeResource source) {
		return convert(source, new AddressType());
	}
}
