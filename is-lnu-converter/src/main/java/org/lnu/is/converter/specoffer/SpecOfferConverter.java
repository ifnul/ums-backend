package org.lnu.is.converter.specoffer;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.resource.specoffer.SpecOfferResource;

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
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setLicCount(source.getLicCount());
		target.setNote(source.getNote());
		target.setStateCount(source.getStateCount());

		if (source.getDepartment() != null) {
			target.setDepartmentId(source.getDepartment().getId());
		}
		
		if (source.getEducationFormType() != null) {
			target.setEducationFormTypeId(source.getEducationFormType().getId());
		}
		
		if (source.getSpecialty() != null) {
			target.setSpecialtyId(source.getSpecialty().getId());
		}
		
		if (source.getSpecOfferType() != null) {
			target.setSpecofferTypeId(source.getSpecOfferType().getId());
		}
		
		if (source.getTimePeriod() != null) {
			target.setTimePeriodId(source.getTimePeriod().getId());
		}
		
		if (source.getTimePeriodCourse() != null) {
			target.setTimePeriodCourseId(source.getTimePeriodCourse().getId());
		}
		
		return target;
	}

	@Override
	public SpecOfferResource convert(final SpecOffer source) {
		return convert(source, new SpecOfferResource());
	}

}
