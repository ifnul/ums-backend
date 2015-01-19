package org.lnu.is.converter.addresstype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.resource.addresstype.AddressTypeResource;

/**
 * Address Type Resource Converter.
 * 
 * @author ROMA
 *
 */
@ResourceConverter("addressTypeResourceConverter")
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
