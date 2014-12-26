package org.lnu.is.facade.converter.specoffer;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.lnu.is.domain.department.Department;
import org.lnu.is.domain.eduformtype.EduFormType;
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
		
		Long eduFormTypeId = 2L;
		EduFormType eduFormType = new EduFormType();
		eduFormType.setId(eduFormTypeId);

		Long id = 1L;
		Integer licCount = 223;
		String note = "soem notes";

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
		
		SpecOffer expected = new SpecOffer();
		expected.setBegDate(begDate);
		expected.setDepartment(department);
		expected.setDocNum(docNum);
		expected.setDocSeries(docSeries);
		expected.setEduFormType(eduFormType);
		expected.setEndDate(endDate);
		expected.setId(id);
		expected.setLicCount(licCount);
		expected.setNote(note);
		expected.setParent(parent);
		expected.setSpecialty(specialty);
		expected.setSpecOfferType(specOfferType);
		expected.setStateCount(stateCount);
		expected.setTimePeriod(timePeriod);

		SpecOfferResource source = new SpecOfferResource();
		source.setBegDate(begDate);
		source.setDepartmentId(departmentId);
		source.setDocNum(docNum);
		source.setDocSeries(docSeries);
		source.setEndDate(endDate);
		source.setId(id);
		source.setLicCount(licCount);
		source.setNote(note);
		source.setSpecialtyId(specialtyId);
		source.setSpecofferTypeId(specOfferTypeId);
		source.setStateCount(stateCount);
		source.setTimePeriodId(timePeriodId);
		
		// When
		SpecOffer actual = unit.convert(source);
		
		// Then
		assertEquals(expected, actual);
	}
}
