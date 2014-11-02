package org.lnu.is.facade.converter.specoffer;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;

/**
 * Converter, that converts from Entity to Resource.
 * @author ivanursul
 *
 */
@Converter("specOfferConverter")
public class SpecOfferConverter extends AbstractConverter<SpecOffer, SpecOfferResource> {

	@Override
	public SpecOfferResource convert(final SpecOffer source, final SpecOfferResource target) {
		
		target.setBegDate(source.getBegDate());
		target.setDepartmentId(source.getDepartment().getId());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEduFormTypeId(source.getEduFormType().getId());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setLicCount(source.getLicCount());
		target.setNote(source.getNote());
		target.setSpecialtyId(source.getSpecialty().getId());
		target.setSpecofferTypeId(source.getSpecOfferType().getId());
		target.setStateCount(source.getStateCount());
		target.setTimePeriodId(source.getTimePeriod().getId());
		
		return target;
	}

	@Override
	public SpecOfferResource convert(final SpecOffer source) {
		return convert(source, new SpecOfferResource());
	}

}
