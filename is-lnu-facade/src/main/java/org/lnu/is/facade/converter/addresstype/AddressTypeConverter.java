package org.lnu.is.facade.converter.addresstype;

import org.lnu.is.domain.addresstype.AddressType;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.addresstype.AddressTypeResource;

/**
 * Address Type Converter.
 * 
 * @author ROMA
 * 
 */
@Converter("addressTypeConverter")
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
