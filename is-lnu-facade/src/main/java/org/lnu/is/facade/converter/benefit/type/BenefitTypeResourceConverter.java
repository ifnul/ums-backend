package org.lnu.is.facade.converter.benefit.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.benefit.type.BenefitTypeResource;

/**
 * Benefit type resource converter.
 * @author ivanursul
 *
 */
@Converter("benefitTypeResourceConverter")
public class BenefitTypeResourceConverter extends AbstractConverter<BenefitTypeResource, BenefitType> {

	@Override
	public BenefitType convert(final BenefitTypeResource source, final BenefitType target) {
		
		target.setName(source.getName());
		target.setPriority(source.getPriority());
		
		return target;
	}

	@Override
	public BenefitType convert(final BenefitTypeResource source) {
		return convert(source, new BenefitType());
	}

}
