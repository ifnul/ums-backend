package org.lnu.is.facade.converter.benefit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.benefit.BenefitResource;

/**
 * Converter for benefit.
 * @author ivanursul
 *
 */
@Converter("benefitConverter")
public class BenefitConverter extends AbstractConverter<Benefit, BenefitResource> {

	@Override
	public BenefitResource convert(final Benefit source, final BenefitResource target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setDescription(source.getDescription());
		
		if (source.getParent() != null) {
			target.setParentId(source.getParent().getId());
		}
		
		if (source.getBenefitType() != null) {
			target.setBenefitTypeId(source.getBenefitType().getId());
		}
		
		return target;
	}

	@Override
	public BenefitResource convert(final Benefit source) {
		return convert(source, new BenefitResource());
	}

}
