package org.lnu.is.converter.addresstype;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.resource.addresstype.AddressTypeResource;

/**
 * Address Type Converter.
 * 
 * @author ROMA
 * 
 */
@ResourceConverter("addressTypeConverter")
public class AddressTypeConverter extends
		AbstractConverter<AddressType, AddressTypeResource> {

	@Override
	public AddressTypeResource convert(final AddressType source,
			final AddressTypeResource target) {

		target.setId(source.getId());
		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public AddressTypeResource convert(final AddressType source) {
		return convert(source, new AddressTypeResource());
	}

}
