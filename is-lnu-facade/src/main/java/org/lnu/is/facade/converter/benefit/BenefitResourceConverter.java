package org.lnu.is.facade.converter.benefit;

import org.lnu.is.annotations.Converter;
import org.lnu.is.domain.benefit.Benefit;
import org.lnu.is.domain.benefit.BenefitType;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.resource.benefit.BenefitResource;

/**
 * Benefit resource converter.
 * @author ivanursul
 *
 */
@Converter("benefitResourceConverter")
public class BenefitResourceConverter extends AbstractConverter<BenefitResource, Benefit> {

	@Override
	public Benefit convert(final BenefitResource source, final Benefit target) {
		
		target.setId(source.getId());
		target.setAbbrName(source.getAbbrName());
		target.setName(source.getName());
		target.setBegDate(source.getBegDate());
		target.setEndDate(source.getEndDate());
		target.setDescription(source.getDescription());
		
		if (source.getParentId() != null) {
			Benefit parent = new Benefit();
			parent.setId(source.getParentId());
			target.setParent(parent);
		}
		
		if (source.getBenefitTypeId() != null) {
			BenefitType benefitType = new BenefitType();
			benefitType.setId(source.getBenefitTypeId());
			target.setBenefitType(benefitType);
		}
		
		return target;
	}

	@Override
	public Benefit convert(final BenefitResource source) {
		return convert(source, new Benefit());
	}

}
