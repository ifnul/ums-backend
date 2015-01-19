package org.lnu.is.converter.partner;

import org.lnu.is.annotations.ResourceConverter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.resource.partner.PartnerResource;

/**
 * Partner converter.
 * @author ivanursul
 *
 */
@ResourceConverter("partnerConverter")
public class PartnerConverter extends AbstractConverter<Partner, PartnerResource> {

	@Override
	public PartnerResource convert(final Partner source, final PartnerResource target) {
		
		target.setAbbrName(source.getAbbrName());
		target.setBegDate(source.getBegDate());
		target.setEmail(source.getEmail());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setManager(source.getManager());
		target.setName(source.getName());
		target.setPhone(source.getPhone());
		target.setId(source.getId());
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		return target;
	}

	@Override
	public PartnerResource convert(final Partner source) {
		return convert(source, new PartnerResource());
	}

}
