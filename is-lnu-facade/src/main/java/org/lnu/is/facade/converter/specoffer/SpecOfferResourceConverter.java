package org.lnu.is.facade.converter.specoffer;

import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.eduformtype.EduFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffertype.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.facade.annotations.Converter;
import org.lnu.is.facade.converter.AbstractConverter;
import org.lnu.is.facade.resource.specoffer.SpecOfferResource;

/**
 * Converter, that convert from Resource to Entity.
 * @author ivanursul
 *
 */
@Converter("specOfferResourceConverter")
public class SpecOfferResourceConverter extends AbstractConverter<SpecOfferResource, SpecOffer> {

	@Override
	public SpecOffer convert(final SpecOfferResource source, final SpecOffer target) {
		
		if (source.getDepartmentId() != null) {
			Department department = new Department();
			department.setId(source.getDepartmentId());

			target.setDepartment(department);
		}
		
		if (source.getEduFormTypeId() != null) {
			EduFormType eduFormType = new EduFormType();
			eduFormType.setId(source.getEduFormTypeId());
		
			target.setEduFormType(eduFormType);
		}
		
		if (source.getSpecialtyId() != null) {
			Specialty specialty = new Specialty();
			specialty.setId(source.getSpecialtyId());

			target.setSpecialty(specialty);
		}

		if (source.getSpecofferTypeId() != null) {
			SpecOfferType specOfferType = new SpecOfferType();
			specOfferType.setId(source.getSpecofferTypeId());

			target.setSpecOfferType(specOfferType);
		}

		if (source.getTimePeriodId() != null) {
			TimePeriod timePeriod = new TimePeriod();
			timePeriod.setId(source.getTimePeriodId());
			
			target.setTimePeriod(timePeriod);
		}
		
		target.setBegDate(source.getBegDate());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());
		target.setId(source.getId());
		target.setLicCount(source.getLicCount());
		target.setNote(source.getNote());
		target.setStateCount(source.getStateCount());
		
		return target;
	}

	@Override
	public SpecOffer convert(final SpecOfferResource source) {
		return convert(source, new SpecOffer());
	}

}
