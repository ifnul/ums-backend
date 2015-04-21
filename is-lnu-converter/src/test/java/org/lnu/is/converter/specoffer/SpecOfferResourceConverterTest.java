package org.lnu.is.converter.specoffer;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.education.form.type.EducationFormType;
import org.lnu.is.domain.specialty.Specialty;
import org.lnu.is.domain.specoffer.SpecOffer;
import org.lnu.is.domain.specoffer.SpecOfferType;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.resource.specoffer.SpecOfferResource;

public class SpecOfferResourceConverterTest {

	private SpecOfferResourceConverter unit = new SpecOfferResourceConverter();
	
	@Test
	public void testConvert() throws Exception {
		// Given
		Date begDate = new Date();
		Department department = new Department();
		Long departmentId = 1L;
		department.setId(departmentId);
		String docNum = "doc num";
		String docSeries = "doc series";
		Date endDate = new Date();
		
		Long educationFormTypeId = 2L;
		EducationFormType eduFormType = new EducationFormType();
		eduFormType.setId(educationFormTypeId);

		Long id = 1L;
		Integer licCount = 223;
		
		Long parentId = 45L;
		SpecOffer parent = new SpecOffer();
		parent.setId(parentId);
		
		Long specialtyId = 4L;
		Specialty specialty = new Specialty();
		specialty.setId(specialtyId);

		Long specOfferTypeId = 5L;
		SpecOfferType specOfferType = new SpecOfferType();
		specOfferType.setId(specOfferTypeId);
		
		Integer stateCount = 34;
		Long timePeriodId = 5L;
		TimePeriod timePeriod = new TimePeriod();
		timePeriod.setId(timePeriodId);
		
		Long timePeriodCourseId = 6L;
		TimePeriod timePeriodCourse = new TimePeriod();
		timePeriodCourse.setId(timePeriodCourseId);
		
		SpecOffer expected = new SpecOffer();
		expected.setBegDate(begDate);
		expected.setDepartment(department);
		expected.setDocNum(docNum);
		expected.setDocSeries(docSeries);
		expected.setEducationFormType(eduFormType);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setLicCount(licCount);
		expected.setParent(parent);
		expected.setSpecialty(specialty);
		expected.setSpecOfferType(specOfferType);
		expected.setStateCount(stateCount);
		expected.setTimePeriod(timePeriod);
		expected.setTimePeriodCourse(timePeriodCourse);

		SpecOfferResource source = new SpecOfferResource();
		source.setBegDate(begDate);
		source.setDepartmentId(departmentId);
		source.setDocNum(docNum);
		source.setDocSeries(docSeries);
		source.setEndDate(endDate);
		source.setId(id);
		source.setLicCount(licCount);
		source.setSpecialtyId(specialtyId);
		source.setSpecofferTypeId(specOfferTypeId);
		source.setStateCount(stateCount);
		source.setTimePeriodId(timePeriodId);
		source.setEducationFormTypeId(educationFormTypeId);
		source.setTimePeriodCourseId(timePeriodCourseId);
		
		// When
		SpecOffer actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testConvertWithNoRelations() throws Exception {
		// Given
		Date begDate = new Date();
		String docNum = "doc num";
		String docSeries = "doc series";
		Date endDate = new Date();
		Long id = 1L;
		Integer licCount = 223;
		Integer stateCount = 34;
		
		SpecOffer expected = new SpecOffer();
		expected.setBegDate(begDate);
		expected.setDocNum(docNum);
		expected.setDocSeries(docSeries);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setLicCount(licCount);
		expected.setStateCount(stateCount);
		
		SpecOfferResource source = new SpecOfferResource();
		source.setBegDate(begDate);
		source.setDocNum(docNum);
		source.setDocSeries(docSeries);
		source.setEndDate(endDate);
		source.setId(id);
		source.setLicCount(licCount);
		source.setStateCount(stateCount);
		
		// When
		SpecOffer actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
