package org.lnu.is.converter.contact.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.contacttype.ContactType;
import org.lnu.is.resource.contact.type.ContactTypeResource;

/**
 * Contact Type Resource Converter.
 * 
 * @author ivanursul
 *
 */
@Converter("contactTypeResourceConverter")
public class ContactTypeResourceConverter extends AbstractConverter<ContactTypeResource, ContactType> {

	@Override
	public ContactType convert(final ContactTypeResource source, final ContactType target) {

		target.setName(source.getName());
		target.setAbbrName(source.getAbbrName());

		return target;
	}

	@Override
	public ContactType convert(final ContactTypeResource source) {
		return convert(source, new ContactType());
	}
}
