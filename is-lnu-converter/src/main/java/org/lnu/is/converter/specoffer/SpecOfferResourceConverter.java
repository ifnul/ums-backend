package org.lnu.is.converter.specoffer;

import org.lnu.is.annotations.Converter;
import org.lnu.is.converter.AbstractConverter;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.specoffer.SpecOfferResource;

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
		
		if (source.getEducationFormTypeId() != null) {
			EducationFormType eduFormType = new EducationFormType();
			eduFormType.setId(source.getEducationFormTypeId());
		
			target.setEducationFormType(eduFormType);
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
		
		if (source.getTimePeriodCourseId() != null) {
			TimePeriod timePeriodCourse = new TimePeriod();
			timePeriodCourse.setId(source.getTimePeriodCourseId());
			
			target.setTimePeriodCourse(timePeriodCourse);
		}
		
		target.setBegDate(source.getBegDate());
		target.setDocNum(source.getDocNum());
		target.setDocSeries(source.getDocSeries());
		target.setEndDate(source.getEndDate());
		target.setLicCount(source.getLicCount());
		target.setStateCount(source.getStateCount());
		target.setDuration(source.getDuration());
		
		return target;
	}

	@Override
	public SpecOffer convert(final SpecOfferResource source) {
		return convert(source, new SpecOffer());
	}

}
