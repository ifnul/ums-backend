package org.lnu.is.converter.benefit.type;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.resource.benefit.type.BenefitTypeResource;

/**
 * Benefit Type Converter.
 * @author ivanursul
 *
 */
@Converter("benefitTypeConverter")
public class BenefitTypeConverter extends AbstractConverter<BenefitType, BenefitTypeResource> {

	@Override
	public BenefitTypeResource convert(final BenefitType source, final BenefitTypeResource target) {
		
		target.setName(source.getName());
		target.setPriority(source.getPriority());
		target.setId(source.getId());
		
		return target;
	}

	@Override
	public BenefitTypeResource convert(final BenefitType source) {
		return convert(source, new BenefitTypeResource());
	}

}
