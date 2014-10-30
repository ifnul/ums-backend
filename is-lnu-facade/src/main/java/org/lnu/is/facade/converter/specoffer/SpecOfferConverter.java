package org.lnu.is.facade.converter.specoffer;

import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resources.specoffer.SpecOfferResource;
import org.springframework.stereotype.Component;

/**
 * Converter, that converts from Entity to Resource.
 * @author ivanursul
 *
 */
@Component("specOfferConverter")
public class SpecOfferConverter extends AbstractConverter<SpecOffer, SpecOfferResource> {

	@Override
	public SpecOfferResource convert(final SpecOffer source, final SpecOfferResource target) {
		
		target.setActual(source.getActual());
		target.setBegDate(source.getBegDate());
		target.setDepartmentId(source.getDepartment().getId());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEduFormTypeId(source.getEduFormType().getId());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setLicCount(source.getLicCount());
		target.setNote(source.getNote());
		target.setStatus(source.getStatus());
		target.setSpecialtyId(source.getSpecialty().getId());
		target.setSpecofferTypeId(source.getSpecOfferType().getId());
		target.setStateCount(source.getStateCount());
		target.setTimePeriodId(source.getTimePeriod().getId());
		target.setUapp(source.getUapp());
		target.setUid(source.getUid());
		target.setUtid(source.getUtid());
		
		return target;
	}

	@Override
	public SpecOfferResource convert(final SpecOffer source) {
		return convert(source, new SpecOfferResource());
	}

}
