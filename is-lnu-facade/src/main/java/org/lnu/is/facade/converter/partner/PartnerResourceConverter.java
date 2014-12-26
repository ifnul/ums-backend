package org.lnu.is.facade.converter.partner;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.partner.PartnerResource;

/**
 * Partner resource converter.
 * @author ivanursul
 *
 */
@Converter("partnerResourceConverter")
public class PartnerResourceConverter extends AbstractConverter<PartnerResource, Partner> {

	@Override
	public Partner convert(final PartnerResource source, final Partner target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setEmail(source.getEmail());
		target.setEndDate(source.getEndDate());
		target.setManager(source.getManager());
		target.setName(source.getName());
		target.setPhone(source.getPhone());
		
		if (source.getParentId() != null) {
			Partner parent = new Partner();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		return target;
	}

	@Override
	public Partner convert(final PartnerResource source) {
		return convert(source, new Partner());
	}

}
